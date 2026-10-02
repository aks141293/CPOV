package Module_1_CPOV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCA_Home_Page 
{
	//POM Class 1
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']") private WebElement CookiePopup;
	
	@FindBy(xpath="//input[@id='selectedZipCode']") private WebElement ZipCode;
	
	@FindBy(xpath="//input[@id='selectedZipCode']") private WebElement EnterZipCode;
	
	@FindBy(xpath="(//img[@title='Alfa Romeo'])[3]") private WebElement BrandLogoAlfa;
	
	@FindBy(xpath="(//img[@title='Chrysler'])[3]") private WebElement BrandLogoChrysler;
	
	@FindBy(xpath="(//img[@title='Dodge'])[3]") private WebElement BrandLogoDodge;
	
	@FindBy(xpath="(//img[@title='Fiat'])[3]") private WebElement BrandLogoFiat;
	
	@FindBy(xpath="(//img[@title='Jeep'])[3]") private WebElement BrandLogoJeep;
	
	@FindBy(xpath="(//img[@title='Ram'])[3]") private WebElement BrandLogoRAM;
	
	@FindBy(xpath="//button[text()='Submit']") private WebElement SUBMIT;
	
	public FCA_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonCookiePopup()
	{
		CookiePopup.click();
	}
	
	public void ClickonZipCodeTextField()
	{
		ZipCode.click();
	}
	
	public void EnterTheZipCode()
	{
		EnterZipCode.sendKeys("90001");
	}
	
	public void ClickOnBrandLogos()
	{
		BrandLogoAlfa.click();
		BrandLogoChrysler.click();
		BrandLogoDodge.click();
		BrandLogoFiat.click();
		BrandLogoJeep.click();
		BrandLogoRAM.click();
	}
	
	public void ClickOnSubmitButton()
	{
		SUBMIT.click();
	}
	
	
}
