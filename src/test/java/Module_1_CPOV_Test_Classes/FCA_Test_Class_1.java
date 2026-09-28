package Module_1_CPOV_Test_Classes;

import org.testng.annotations.Test;
import Library_Files.Base_CLass;
import Module_1_CPOV.FCA_Home_Page;
import Module_1_CPOV.FCA_SNI_Page;
import Module_1_CPOV.FCA_VDP_Page;

public class FCA_Test_Class_1 extends Base_CLass
{
    
    // ============================================================
    // HOME PAGE TEST CASES
    // ============================================================

    @Test(priority = 1)
    public void VerifytheHomePage()
    {
        logger.info("User Landed to FCA Certified Home Page");

        H1 = new FCA_Home_Page(driver);

        H1.ClickonCookiePopup();
        logger.info("User clicked on Cookie Popup");

        H1.ClickonZipCodeTextField();
        logger.info("User clicked on Zip Code Field");

        H1.EnterTheZipCode();
        logger.info("User entered the Zip Code");

        H1.ClickOnBrandLogos();
        logger.info("User clicked on Brand Logos");

        H1.ClickOnSubmitButton();
        logger.info("User clicked on Submit Button");

        logger.info("Redirected to SNI Page");
    }


    // ============================================================
    // SNI PAGE TEST CASES
    // ============================================================

    @Test(priority = 2, dependsOnMethods = "VerifytheHomePage")
    public void VerifySNIPage()
    {
        S1 = new FCA_SNI_Page(driver);

        S1.AcceptTheCookie();

        logger.info("SNI Page loaded successfully");
    }


    @Test(priority = 3, dependsOnMethods = "VerifySNIPage")
    public void VerifyCPOVSelection()
    {
        S1.ClickOnGoCPOV();
        logger.info("User clicked on GoCPOV checkbox");

        S1.ClickOnCPOV();
        logger.info("User clicked on CPOV checkbox");

        S1.ClickOnGoCPOVAgain();
        logger.info("User clicked on GoCPOV again");
    }


    @Test(priority = 4, dependsOnMethods = "VerifySNIPage")
    public void VerifyZipCodeUpdate()
    {
        S1.ClickOnZipCodeTextBox();
        logger.info("User clicked on Zip Code Text Box");

        S1.ClearTheZipCode();
        logger.info("User cleared the Zip Code");

        S1.EnterTheZipCode();
        logger.info("User entered the Zip Code");

        S1.UpdateTheZipCode();
        logger.info("User updated the Zip Code");
    }


    @Test(priority = 5, dependsOnMethods = "VerifySNIPage")
    public void VerifyMatchFilters()
    {
        S1.ClickOnPartialMatches();
        logger.info("User clicked on Partial Matches");

        S1.ClickOnExactMatches();
        logger.info("User clicked on Exact Matches");
    }


    @Test(priority = 6, dependsOnMethods = "VerifySNIPage")
    public void VerifySortByFunctionality()
    {
        S1.ClickOnSortBy();
        logger.info("User clicked on Sort By");

        S1.ClickOnSortByValue1();
        logger.info("User selected Sort By Value 1");

        S1.ClickOnSortByValue2();
        logger.info("User selected Sort By Value 2");

        S1.ClickOnSortByValue3();
        logger.info("User selected Sort By Value 3");
    }


    @Test(priority = 7, dependsOnMethods = "VerifySNIPage")
    public void VerifyDealerFilter()
    {
        S1.ClickOnOpenDealer();
        logger.info("User opened Dealer section");

        S1.ClickOnShowAllDealer();
        logger.info("User clicked Show All Dealer");

        S1.ClickOnShowLessDealer();
        logger.info("User clicked Show Less Dealer");

        S1.ClickOnCheckDealerCheckBox();
        logger.info("User checked Dealer checkbox");

        S1.ClickOnUncheckDealerCheckBox();
        logger.info("User unchecked Dealer checkbox");
    }


    @Test(priority = 8, dependsOnMethods = "VerifySNIPage")
    public void VerifyYearFilter()
    {
        S1.ClickOnOpenYear();
        logger.info("User opened Year section");

        S1.ClickOnYearValue1();
        logger.info("User selected Year Value 1");

        S1.ClickOnYearValue2();
        logger.info("User selected Year Value 2");

        S1.ClickOnYearValue3();
        logger.info("User selected Year Value 3");

        S1.ClickOnCloseYear();
        logger.info("User closed Year section");
    }


    @Test(priority = 9, dependsOnMethods = "VerifySNIPage")
    public void VerifyDriveSection()
    {
        S1.ClickOnOpenDriveSection();
        logger.info("User opened Drive section");

        S1.ClickOnCloseDriveSection();
        logger.info("User closed Drive section");
    }


    @Test(priority = 10, dependsOnMethods = "VerifySNIPage")
    public void VerifyResetFilter()
    {
        S1.ClickOnResetFilter();
        logger.info("User clicked Reset Filter");
    }


    @Test(priority = 11, dependsOnMethods = "VerifySNIPage")
    public void VerifyContinueShopping()
    {
        S1.ClickOnContinueShopping();
        logger.info("User clicked Continue Shopping");

        logger.info("User redirected to VDP Page");
    }


    // ============================================================
    // VDP PAGE TEST CASES
    // ============================================================

    @Test(priority = 12, dependsOnMethods = "VerifyContinueShopping")
    public void VerifyVDPPage()
    {
        v1 = new FCA_VDP_Page(driver);

        v1.ClickOnInitialPopUp();
        logger.info("User closed Initial PopUp");
    }


    @Test(priority = 13, dependsOnMethods = "VerifyVDPPage")
    public void VerifyCashTab()
    {
        v1.ClickOnCashTab();
        logger.info("User clicked on CASH TAB");
    }


    @Test(priority = 14, dependsOnMethods = "VerifyVDPPage")
    public void VerifyTestDriveSection()
    {
        v1.ClickOnOpenTestDrive();
        logger.info("User opened Test Drive section");

        v1.ClickOnCloseTestDrive();
        logger.info("User closed Test Drive section");
    }


    @Test(priority = 15, dependsOnMethods = "VerifyVDPPage")
    public void VerifyPaymentCalculator()
    {
        v1.ClickOnOpenPaymentCalculator();
        logger.info("User opened Payment Calculator");

        v1.ClickOnContinue();
        logger.info("User clicked Continue");

        v1.ClickOnClosePaymentCalculator();
        logger.info("User closed Payment Calculator");
    }


    @Test(priority = 16, dependsOnMethods = "VerifyVDPPage")
    public void VerifyTradeIn()
    {
        v1.ClickOnTradeIN();
        logger.info("User clicked Trade In");
    }


    @Test(priority = 17, dependsOnMethods = "VerifyVDPPage")
    public void VerifyServiceAndProtection()
    {
        v1.ClickOnServiceAndProtection();
        logger.info("User clicked Service & Protection");
    }


    @Test(priority = 18, dependsOnMethods = "VerifyVDPPage")
    public void VerifyDeliveryReviewAndSubmit()
    {
        v1.ClickOnDRS();
        logger.info("User clicked Delivery Review & Submit");

        logger.info("User reached DRS tab");
    }
}