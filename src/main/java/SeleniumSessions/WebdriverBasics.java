package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "T:\\Selenium Learning\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome browser
		
		driver.get("https://www.google.ca/");//enter url
		
		String title = driver.getTitle();//get title
		
		if (title.equals("Google")) {
			System.out.println("The browser title is as expected "+title);
			
			
		}
		else {
			System.out.println("incorrect title " +  title);
			
		}
		
		driver.close();
		driver.quit();
	}

}
