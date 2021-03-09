package TestNGSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	
	@Parameters("chrome")
	@BeforeTest
	public void setUp(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		
		}
		else if(browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass valid browser");
		}
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
