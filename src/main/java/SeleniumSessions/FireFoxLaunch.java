package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "T:\\Selenium Learning\\Downloads\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.quit();
	}

}
