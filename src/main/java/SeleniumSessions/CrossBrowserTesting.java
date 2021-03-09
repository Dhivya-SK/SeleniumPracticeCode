package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
	 WebDriver driver = null;
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
		}
		else if( browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 
		}
		else {
			System.out.println("Please pass valid browser name");
		}
		
		String url = "https://www.youtube.com";
		driver.get(url);
		
		//Get the title
		String browserTitle = driver.getTitle();
		System.out.println("The browser title is " + browserTitle);
		
		//Get the current url
		String currentUrl = driver.getCurrentUrl();
		
		// Verify if the current url is same as passed url
		if(currentUrl.equals("https://www.youtube.com/")) {
			System.out.println("The current url is correct  " +currentUrl );
			
		}
		else {
			System.out.println("The url doesn't match " + currentUrl );
		}
		
		driver.close();


	}

}
