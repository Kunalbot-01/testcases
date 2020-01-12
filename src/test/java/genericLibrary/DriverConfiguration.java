package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DriverConfiguration {

	public DriverConfiguration(){
		
	}
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setupBrowser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeApplicationAndTriggerEmail(){
		driver.quit();
		MailUtility.sendPDFReportByGMail("FROM", "PASSWORD", "TO", "Automation execution report", "PFA");
	}
}
