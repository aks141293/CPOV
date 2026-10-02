package Utilities;

import java.io.File;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;

public class EmailReport {

    public static void sendReport(
            String reportPath,
            int total,
            int passed,
            int failed,
            int skipped,
            double passPercentage) {

        // =====================================================
        // EMAIL CONFIGURATION
        // =====================================================

        final String senderEmail ="adamhayden658@gmail.com";

        //final String senderPassword =System.getenv("Akash14@");
        
        final String senderPassword = "jqhc ehfg ywwc qhye";

        final String receiverEmail ="akash@tekzensys.com";
        
         // =====================================================
        // SMTP CONFIGURATION
        // =====================================================

        Properties properties = new Properties();

        properties.put("mail.smtp.host","smtp.gmail.com");

        properties.put("mail.smtp.port","587");

        properties.put("mail.smtp.auth","true");

        properties.put("mail.smtp.starttls.enable", "true");
        
       // properties.put("mail.smtp.ssl.protocols", "TLSv1.2");


        // =====================================================
        // CREATE EMAIL SESSION
        // =====================================================

        Session session =
                Session.getInstance(
                        properties,
                        new Authenticator() {

                            @Override
                            protected PasswordAuthentication
                            getPasswordAuthentication() {

                                return new PasswordAuthentication(
                                        senderEmail,
                                        senderPassword);
                            }
                        });


        try {

            // =================================================
            // CREATE EMAIL
            // =================================================

            Message message =
                    new MimeMessage(session);

            message.setFrom(
                    new InternetAddress(senderEmail));

            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(receiverEmail));

            message.setSubject(
                    "CPOV Smoke Test Execution Report");


            // =================================================
            // EMAIL BODY
            // =================================================

            MimeBodyPart messageBodyPart =
                    new MimeBodyPart();

            String emailBody =
                    "<html>"
                    + "<body>"

                    //+ "<h2>CPOV Production Smoke Test Execution Report</h2>"//

                    + "<p>Hi Team,</p>"

                    + "<p>"
                    + "Please find attached the latest "
                    + "CPOV RAM Automation Smoke Test Execution Report."
                    + "</p>"

                    + "<table border='1' cellpadding='8' "
                    + "cellspacing='0'>"

                    + "<tr>"
                    + "<th>Execution Details</th>"
                    + "<th>Result</th>"
                    + "</tr>"

                    + "<tr>"
                    + "<td>Total Test Cases</td>"
                    + "<td>" + total + "</td>"
                    + "</tr>"

                    + "<tr>"
                    + "<td>Passed</td>"
                    + "<td>" + passed + "</td>"
                    + "</tr>"

                    + "<tr>"
                    + "<td>Failed</td>"
                    + "<td>" + failed + "</td>"
                    + "</tr>"

                    + "<tr>"
                    + "<td>Skipped</td>"
                    + "<td>" + skipped + "</td>"
                    + "</tr>"

                    + "<tr>"
                    + "<td>Pass Percentage</td>"
                    + "<td>"
                    + String.format("%.2f", passPercentage)
                    + "%"
                    + "</td>"
                    + "</tr>"

                    + "</table>"

                    + "<br>"

                    + "<p>"
                    + "Please refer to the attached HTML report "
                    + "for detailed execution results."
                    + "</p>"

                    + "<p>Regards,<br>"
                    + "Akash Kumar</p>"

                    + "</body>"
                    + "</html>";

            messageBodyPart.setContent(
                    emailBody,
                    "text/html");


            // =================================================
            // ATTACH EXTENT REPORT
            // =================================================

            jakarta.mail.internet.MimeBodyPart attachmentPart =
                    new jakarta.mail.internet.MimeBodyPart();

            File reportFile =
                    new File(reportPath);

            if (!reportFile.exists()) {

                System.out.println(
                        "ERROR: Report file not found!");

                System.out.println(
                        "Report Path: " + reportPath);

                return;
            }

            attachmentPart.attachFile(
                    reportFile);

            attachmentPart.setFileName(
                    reportFile.getName());


            // =================================================
            // COMBINE EMAIL BODY + ATTACHMENT
            // =================================================

            jakarta.mail.internet.MimeMultipart multipart =
                    new jakarta.mail.internet.MimeMultipart();

            multipart.addBodyPart(
                    messageBodyPart);

            multipart.addBodyPart(
                    attachmentPart);

            message.setContent(
                    multipart);


            // =================================================
            // SEND EMAIL
            // =================================================

            Transport.send(message);

            System.out.println(
                    "==========================================");

            System.out.println(
                    "EMAIL SENT SUCCESSFULLY!");

            System.out.println(
                    "Report: " + reportFile.getName());

            System.out.println(
                    "==========================================");

        } catch (Exception e) {

            System.out.println(
                    "==========================================");

            System.out.println(
                    "FAILED TO SEND EMAIL");

            System.out.println(
                    "==========================================");

            e.printStackTrace();
        }
    }
}