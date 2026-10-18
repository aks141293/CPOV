package Module_1_CPOV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCA_SNI_Page
{
	//POM Class 2
	
	//Verifying the Search By Functionality
	
    @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']") private WebElement AcceptCookiePopup;
    
    @FindBy(xpath="//img[@title='Go Certified Pre-Owned Vehicle']") private WebElement GoCPOV;
    
    @FindBy(xpath="//img[@title='Certified Pre-Owned Vehicle']") private WebElement CPOV;
    
    @FindBy(xpath="//img[@title='Go Certified Pre-Owned Vehicle']") private WebElement GoCPOVAgain;
    
    //Verifying the ZipCode Functionality
    
   @FindBy(xpath="//a[@title='Change Zipcode']") private WebElement ZipCode;
   
   @FindBy(xpath="(//input[@id='selectedZipCode'])[1]") private WebElement ClearZipCode;
   
   @FindBy(xpath="(//input[@id='selectedZipCode'])[1]") private WebElement EnterZipCode;
   
   @FindBy(xpath="//span[text()='UPDATE']") private WebElement UpdateZipCode;
   
   //Verifying the SortBy filter Validations
   
   @FindBy(xpath="//button[@id='partial_matches_btn']") private WebElement PartialMatches;
   
   @FindBy(xpath="//button[@id='exact_matches_btn']") private WebElement ExcatMatches;
   
   @FindBy(xpath="//select[@id='sort_by']") private WebElement SortBy;
   
   @FindBy(xpath="//option[@value='1']") private WebElement SortByValue1;
   
   @FindBy(xpath="//option[@value='2']") private WebElement SortByValue2;
   
   @FindBy(xpath="//option[@value='3']") private WebElement SortByValue3;
   
   //Verify the Dealer Section
   
   @FindBy(xpath="(//div[@class='c-accordion__entry-header-icon-wrapper'])[1]") private WebElement OpenDealer;
   
   @FindBy(xpath="//div[@class='see-all']") private WebElement ShowAllDealer;
   
   @FindBy(xpath="//div[@class='see-less']") private WebElement ShowLessDealer;
   
   @FindBy(xpath="(//span[@class='checkmark'])[3]") private WebElement CheckDealerCheckBox;
   
   @FindBy(xpath="(//span[@class='checkmark'])[3]") private WebElement UncheckDealerCheckBox;
   
   //Verify Year Section
   
   @FindBy(xpath="(//div[@class='c-accordion__entry-header-icon-wrapper'])[2]") private WebElement OpenYear;
   
   @FindBy(xpath="(//span[@class='radiomark'])[1]") private WebElement YearValue1;
   
   @FindBy(xpath="(//span[@class='radiomark'])[2]") private WebElement YearValue2;
   
   @FindBy(xpath="(//span[@class='radiomark'])[3]") private WebElement YearValue3;
   
   @FindBy(xpath="(//div[@class='c-accordion__entry-header-icon-wrapper'])[2]") private WebElement CloseYear;
   
   //Verify the Drive and Reset Filter Button
   
   @FindBy(xpath="//span[text()='DRIVE']") private WebElement OpenDriveSection;
   
   @FindBy(xpath="//span[text()='DRIVE']") private WebElement CloseDriveSection;
   
   @FindBy(xpath="(//a[@class='reset-link'])[1]") private WebElement ResetFilter;
   
   @FindBy(xpath="(//span[text()='CONTINUE SHOPPING'])[1]") private WebElement CONTINUESHOPPING;
   
    
    
    public FCA_SNI_Page(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void AcceptTheCookie()
    {
    	AcceptCookiePopup.click();
    }
    
    public void ClickOnGoCPOV()
    {
    	GoCPOV.click();
    }
    
    public void ClickOnCPOV()
    {
    	CPOV.click();
    }
    
    public void ClickOnGoCPOVAgain()
    {
    	GoCPOVAgain.click();
    }
    
    public void ClickOnZipCodeTextBox()
    {
    	ZipCode.click();
    }
    
    public void ClearTheZipCode()
    {
    	ClearZipCode.clear();
    }
    
    public void EnterTheZipCode()
    {
    	EnterZipCode.sendKeys("33765");
    }
    
    public void UpdateTheZipCode()
    {
    	UpdateZipCode.click();
    }
    
    public void ClickOnPartialMatches()
    {
    	PartialMatches.click();
    }
    
    public void ClickOnExactMatches()
    {
    	ExcatMatches.click();
    }
    
    public void ClickOnSortBy()
    {
    	SortBy.click();
    }
    
    public void ClickOnSortByValue1()
    {
    	SortByValue1.click();
    }
    
    public void ClickOnSortByValue2()
    {
    	SortByValue2.click();
    }
    
    public void ClickOnSortByValue3()
    {
    	SortByValue3.click();
    }
    
    public void ClickOnOpenDealer()
    {
    	OpenDealer.click();
    }
    
    public void ClickOnShowAllDealer()
    {
    	ShowAllDealer.click();
    }
    
    public void ClickOnShowLessDealer()
    {
    	ShowLessDealer.click();
    }
    
    public void ClickOnCheckDealerCheckBox()
    {
    	CheckDealerCheckBox.click();
    }
    
    public void ClickOnUncheckDealerCheckBox()
    {
    	UncheckDealerCheckBox.click();
    }
    
    public void ClickOnOpenYear()
    {
    	OpenYear.click();
    }
    
    public void ClickOnYearValue1()
    {
    	YearValue1.click();
    }
    
    public void ClickOnYearValue2()
    {
    	YearValue2.click();
    }
    
    public void ClickOnYearValue3()
    {
    	YearValue3.click();
    }

    public void ClickOnCloseYear()
    {
    	CloseYear.click();
    }
    
    public void ClickOnOpenDriveSection()
    {
    	OpenDriveSection.click();
    }
    
    public void ClickOnCloseDriveSection()
    {
    	CloseDriveSection.click();
    }
    
    public void ClickOnResetFilter()
    {
    	ResetFilter.click();
    }
    
    public void ClickOnContinueShopping()
    {
    	CONTINUESHOPPING.click();
    }
    
     
}
