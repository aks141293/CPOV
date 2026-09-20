package Module_1_CPOV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCA_VDP_Page
{
	 @FindBy(xpath="//button[text()='close']") private WebElement InitialPopUp;
	 
	 @FindBy(xpath="//a[@id='tab_cash']") private  WebElement CashTab;
	 
	 @FindBy(xpath="(//div[@data-target='#testDriveFormPopup'])[2]") private WebElement OpenTestDrive;
	 
	 @FindBy(xpath="(//button[@class='close'])[3]") private WebElement CloseTestDrive;
	 
	 @FindBy(xpath="(//a[text()='Review Payment Options'])[2]") private WebElement OpenPaymentCalculator;
	 
	 @FindBy(xpath="//button[@id='contpop']") private WebElement Continue;
	 
	 @FindBy(xpath="(//button[text()='×'])[5]") private WebElement ClosePaymentCalculator;
	 
	 @FindBy(xpath="//a[@class='ore_tradeIn tradeIn tab']") private WebElement TradeIN;
	 
	 @FindBy(xpath="//a[@class='tab ore_serviceProtection serviceProtection']") private WebElement ServiceAndProtection;
	 
	 @FindBy(xpath="//a[@id='tab_review']") private WebElement DRS;
	 
	//@FindBy(xpath="(//button[text()='Submit to Dealer'])[5]") private WebElement SubmittoDealertext;
	 
	//Create a Constructor with access level Public
    public FCA_VDP_Page(WebDriver driver)
    {
	  PageFactory.initElements(driver, this);
    }
    
    public void ClickOnInitialPopUp()
    {
    	InitialPopUp.click();
    }
    
    public void ClickOnCashTab()
    {
    	CashTab.click();
    }
    
    public void ClickOnOpenTestDrive()
    {
    	OpenTestDrive.click();
    }
    
    public void ClickOnCloseTestDrive()
    {
    	CloseTestDrive.click();
    }
    
    public void ClickOnOpenPaymentCalculator()
    {
    	OpenPaymentCalculator.click();
    }
    
    public void ClickOnContinue()
    {
    	Continue.click();
    }
    
    public void ClickOnClosePaymentCalculator()
    {
    	ClosePaymentCalculator.click();
    }
    
    public void ClickOnTradeIN()
    {
    	TradeIN.click();
    }
    
    public void ClickOnServiceAndProtection()
    {
    	ServiceAndProtection.click();
    }
    
    public void ClickOnDRS()
    {
    	DRS.click();
    }
    
    
    
    
}
