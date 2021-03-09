package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

		
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By firstName = By.id("Form_submitForm_FirstName");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(driver.findElement(firstName),"TEST").perform();
		
		
		//Actions sendkeys or click will move to the middle of the Webelement and click
		// on the webelement.
		//SendKeys or .click will not focus or move to the middle of the webElement ,
		// just once it sees the webelement, it will just enter or click on it.
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions actions = new Actions(driver);
		actions.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions actions = new Actions(driver);
		actions.sendKeys(getElement(locator), value).perform();
	}
}
