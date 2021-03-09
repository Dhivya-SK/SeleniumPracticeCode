package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		
		// StaleElementReference Exception  occurs when the page is refreshed and when page is refreshed the DOM gets refreshed. So the web Element
		// created initially before refresh will not work.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement userName = driver.findElement(By.id("input-email"));
		userName.sendKeys("Test");
		//userName.clear();
		
		driver.navigate().refresh();
		
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document
		
		// To resolve this StaleElement Ref Exception we have to create the webElement once again after the dom refresh
		
		userName = driver.findElement(By.id("input-email"));
		userName.sendKeys("DhivyaK");
		
	
		
		
		

	}

}
