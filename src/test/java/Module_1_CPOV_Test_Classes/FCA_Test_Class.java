package Module_1_CPOV_Test_Classes;

import org.testng.annotations.Test;

import Library_Files.Base_CLass;
import Module_1_CPOV.FCA_Home_Page;
import Module_1_CPOV.FCA_SNI_Page;
import Module_1_CPOV.FCA_VDP_Page;

public class FCA_Test_Class extends Base_CLass
{
	
	@Test(priority=1)
	public void VerifytheHomePage()
	{
	    logger.info("User Landed to FCA Certified Home Page");
		H1=new FCA_Home_Page(driver);
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
	
	
   @Test(priority=2)
   public void VerifytheSNIPage() throws InterruptedException
   {
	    S1=new FCA_SNI_Page(driver);
	    S1.AcceptTheCookie();
	    logger.info("User clicked on Cookie Popup ");
		S1.ClickOnGoCPOV();
		logger.info("User clicked on GoCPOV checkbox ");
		S1.ClickOnCPOV();
		logger.info("User clicked on CPOV checkbox ");
		S1.ClickOnGoCPOVAgain();
		logger.info("User clicked on GoCPOV checkbox ");
		S1.ClickOnZipCodeTextBox();
		logger.info("User clicked on ZipCode Text Box ");
		S1.ClearTheZipCode();
		logger.info("User cleared the ZipCode ");
		S1.EnterTheZipCode();
		logger.info("User clicked on Enter the Zip Code ");
		S1.UpdateTheZipCode();
		logger.info("User clicked on Update button to update the Zip Code ");
		S1.ClickOnPartialMatches();
		logger.info("User clicked on Partial Matches ");
		S1.ClickOnExactMatches();
		logger.info("User clicked on Exact Matches ");
		S1.ClickOnSortBy();
		logger.info("User clicked on SortBy functionality ");
		S1.ClickOnSortByValue1();
		logger.info("User selected value 1 ");
		S1.ClickOnSortByValue2();
		logger.info("User selected value 2 ");
		S1.ClickOnSortByValue3();
		logger.info("User selected value 3 ");
		S1.ClickOnOpenDealer();
		logger.info("User clicked on Open Dealer ");
		Thread.sleep(3000);
		S1.ClickOnShowAllDealer();
		logger.info("User clicked on Show All Dealer ");
		S1.ClickOnShowLessDealer();
		logger.info("User clicked on Show Less Dealer ");
		S1.ClickOnCheckDealerCheckBox();
		logger.info("User clicked on Dealer Checkbox ");
		S1.ClickOnUncheckDealerCheckBox();
		logger.info("User unchecked on Dealer Checkbox ");
		S1.ClickOnOpenYear();
		logger.info("User clicked on Open Year section ");
		Thread.sleep(3000);
		S1.ClickOnYearValue1();
		logger.info("User clicked on Value1 ");
		S1.ClickOnYearValue2();
		logger.info("User clicked on Value2 ");
		S1.ClickOnYearValue3();
		logger.info("User clicked on Value3 ");
		S1.ClickOnCloseYear();
		logger.info("User clicked on Close Year ");
		S1.ClickOnOpenDriveSection();
		logger.info("User clicked on OpenDrive section ");
		S1.ClickOnCloseDriveSection();
		logger.info("User clicked on CloseDrive section ");
		S1.ClickOnResetFilter();
		logger.info("User clicked on Reset Filter ");
		Thread.sleep(2000);
		S1.ClickOnContinueShopping();
		logger.info("User clicked on Continue Shopping ");
		logger.info("Redirected to VDP Page");
     }
	
     @Test(priority=3)
	 public void verfiytheVDP() throws InterruptedException
	 {
		v1=new FCA_VDP_Page(driver);
		v1.ClickOnInitialPopUp();
		logger.info("User closed on Initial PopUp ");
		v1.ClickOnCashTab();
		logger.info("User clicked on CASH TAB ");
		v1.ClickOnOpenTestDrive();
		logger.info("User clicked on OpenTest Drive section ");
		v1.ClickOnCloseTestDrive();
		logger.info("User clicked on CloseTest Drive section ");
		v1.ClickOnOpenPaymentCalculator();
		logger.info("User clicked on Payment Calculator section ");
		v1.ClickOnContinue();
		logger.info("User clicked on Continue ");
		Thread.sleep(3000);
		v1.ClickOnClosePaymentCalculator();
		logger.info("User clicked on Closed Payment Calculator section ");
		v1.ClickOnTradeIN();
		logger.info("User clicked on TradeIN section ");
		v1.ClickOnServiceAndProtection();
		logger.info("User clicked on Service & Protection section ");
		v1.ClickOnDRS();
		logger.info("User clicked on Delivery Review & Submit section ");
		logger.info("User Reached till DRS TAB");
	 }
	  
   }



