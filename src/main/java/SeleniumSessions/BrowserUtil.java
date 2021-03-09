package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	
	/**
	 * This method is used to initialize browser on the basis of provided browserName
	 * @param browserName
	 * @return This method returns a webDriver.
	 */
	

	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("The browser is launching....");
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
		
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Please pass valid browser name: "+browserName);
			break;
		}
		return driver;
	}
	
	/**
	 * This method is used to enter the url and launch
	 * @param url
	 */ 
	
	public void launchUrl(String url) {
		if(url.isEmpty()) {
			return;
		}
		
		driver.get(url);
	}
	
	/**
	 * This method is used to get the page title of the launched browser
	 * @return
	 * It returns the page title in String format
	 */ 
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	/**
	 * This method is used to get the current page url of the launched browser
	 * @return
	 * It returns the page url in String format
	 */ 
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method is used to quit the browser
	 */
	
	public void quitBrowser() {
		driver.quit();
		
	}
	
	/**
	 * This method is used to close the browser
	 */
	
	public void closeBrowser() {
		driver.close();
	}

}
