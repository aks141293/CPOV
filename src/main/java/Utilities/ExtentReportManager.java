package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;
    String reportName;
    String reportPath;

    @Override
    public void onStart(ITestContext context) {

        // Create current date with timestamp
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

        Date date = new Date();

        String currentDateTimeStamp = sdf.format(date);

        // Create report name
        reportName =
                "Test-Report-" + currentDateTimeStamp + ".html";

        // Create complete report path
        reportPath =
                new File(".\\Reports\\" + reportName)
                        .getAbsolutePath();

        // Create ExtentSparkReporter
        sparkReporter =
                new ExtentSparkReporter(reportPath);

        // Set report title
        sparkReporter.config()
                .setDocumentTitle("CPOV Automation Testing Report");

        // Set report name
        sparkReporter.config()
                .setReportName("Smoke Testing");

        // Set report theme
        sparkReporter.config()
                .setTheme(Theme.DARK);

        // Create ExtentReports object
        extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        // Set system information
        extent.setSystemInfo("Application", "CPOV");

        extent.setSystemInfo("Module", "RAM");

        extent.setSystemInfo("Environment", "Production");

        // Get browser name from TestNG XML
        String browserName =
                context.getCurrentXmlTest()
                        .getParameter("browserName");

        extent.setSystemInfo("Browser", browserName);

        System.out.println("==========================================");
        System.out.println("Extent Report Started");
        System.out.println("Report Path: " + reportPath);
        System.out.println("==========================================");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        // Create test entry
        test = extent.createTest(
                result.getTestClass().getName());

        test.log(
                Status.PASS,
                result.getName() + " - Test case is Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        // Create test entry
        test = extent.createTest(
                result.getTestClass().getName());

        test.log(
                Status.FAIL,
                result.getName() + " - Test case is Failed");

        // Log failure exception
        if (result.getThrowable() != null) {

            test.log(
                    Status.FAIL,
                    result.getThrowable());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        // Create test entry
        test = extent.createTest(
                result.getTestClass().getName());

        test.log(
                Status.SKIP,
                result.getName() + " - Test case is Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        // Get TestNG execution statistics
        int passed =
                context.getPassedTests().getAllResults().size();

        int failed =
                context.getFailedTests().getAllResults().size();

        int skipped =
                context.getSkippedTests().getAllResults().size();

        int total = passed + failed + skipped;

        // Calculate pass percentage
        double passPercentage = 0;

        if (total > 0) {
            passPercentage =
                    ((double) passed / total) * 100;
        }

        // Generate the Extent Report
        extent.flush();

        System.out.println("==========================================");
        System.out.println("Extent Report Generated Successfully");
        System.out.println("Report Path: " + reportPath);
        System.out.println("==========================================");

        // Send report through email
        EmailReport.sendReport(
                reportPath,
                total,
                passed,
                failed,
                skipped,
                passPercentage);
    }
}

















/*{

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;
    String reportName;

    @Override
    public void onStart(ITestContext context) {

        // Create current date with timestamp
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date date = new Date();
        String currentDateTimeStamp = sdf.format(date);

        // Create report name using current date and timestamp
        reportName = "Test-Report-" + currentDateTimeStamp + ".html";
        
        // Create ExtentSparkReporter
        sparkReporter = new ExtentSparkReporter(".\\Reports\\"+reportName);

        // Set report title
        sparkReporter.config().setDocumentTitle("CPOV Automation Testing Report");

        // Set report name
        sparkReporter.config().setReportName("Smoke Testing");

        // Set report theme
        sparkReporter.config().setTheme(Theme.DARK);

        // Create ExtentReports object
        extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        // Set system information
        extent.setSystemInfo("Application", "CPOV");

        extent.setSystemInfo("Module", "RAM");

        extent.setSystemInfo("Environment", "Production");

        // Get browser name from TestNG XML
        String BrowserName = context.getCurrentXmlTest().getParameter("browserName");

        extent.setSystemInfo("Browser", BrowserName);

    }

    @Override
    public void onTestSuccess(ITestResult result)
    {

        // Create test entry
        test = extent.createTest(result.getTestClass().getName());

        test.log(Status.PASS,result.getName() + " - Test case is Passed");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {

        // Create test entry
        test = extent.createTest(result.getTestClass().getName());

        test.log(Status.FAIL,result.getName() + " - Test case is Failed");
                
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {

        // Create test entry
        test = extent.createTest(result.getTestClass().getName());
        test.log(Status.SKIP,result.getName() + " - Test case is Skipped");
    }

    @Override
    public void onFinish(ITestContext context)
    {

        // Generate the Extent Report
        extent.flush();
        
        
    }
}*/