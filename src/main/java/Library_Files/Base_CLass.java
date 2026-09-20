package Library_Files;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Module_1_CPOV.FCA_Home_Page;
import Module_1_CPOV.FCA_SNI_Page;
import Module_1_CPOV.FCA_VDP_Page;

public class Base_CLass
{
   
   public WebDriver driver;
   
   public FCA_Home_Page H1;
   
   public FCA_SNI_Page S1;
   
   public FCA_VDP_Page v1;
   
   public Logger logger;
   
   @Parameters("browserName")
   
   @BeforeClass
   public void OpenBrowser(String browserName)
   {
	   if(browserName.equals("Chrome")) 
	   {
		   driver=new ChromeDriver();
	   }
	   else if(browserName.equals("Edge"))
	   {
		   driver=new EdgeDriver();
	   }
	   else if(browserName.equals("Firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   logger=LogManager.getLogger(this.getClass());
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	   driver.navigate().to("https://www.fcacertified.com/");
	   
   }
   
    
   @AfterClass
   public void CloseBrowser()
   {
	   driver.quit();
   }
}
