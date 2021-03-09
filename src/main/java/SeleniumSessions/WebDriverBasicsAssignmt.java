package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicsAssignmt {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "T:\\Selenium Learning\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch the browser
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
