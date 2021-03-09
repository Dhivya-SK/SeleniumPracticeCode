package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(4000);
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).perform();
//		
		
		By mainMenu =By.id("ctl00_HyperLinkLogin");
		//By subMenu = By.className("SpiceClub Members");
		
		doMoveToElement(mainMenu);
		Thread.sleep(4000);
		//doMoveToElement(subMenu);
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Member Login")).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//Move to main menu
	public static void doMoveToElement(By locator) {
		Actions actions = new Actions(driver);
		actions.moveToElement(getElement(locator)).perform();
		
	}
	
	//Move to main menu and then sub menu
	public static void doMoveToElement(By locator1, By locator2) {
		Actions actions = new Actions(driver);
		actions.moveToElement(getElement(locator1)).perform();
		actions.moveToElement(getElement(locator2)).perform();
		
	}
	
	//Move to main menu and then sub menu
		public static void doMoveToElement(By locator1, By locator2,By locator3) {
			Actions actions = new Actions(driver);
			actions.moveToElement(getElement(locator1)).perform();
			actions.moveToElement(getElement(locator2)).perform();
			getElement(locator3).click();
			
		}
	
	
	
	
	

}
