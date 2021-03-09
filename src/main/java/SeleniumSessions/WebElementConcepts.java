package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) {

		 

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		String userId = "test@gmail.com";
//		String url = "https://classic.crmpro.com/";
		String url = "https://demo.opencart.com/index.php?route=account/login";
//		String url = "https://freshworks.com";
		
		driver.get(url);
		
		// First approach
		//First:
		//----------------------------------------------------------------------------
		//id: is always unique
		
//		driver.findElement(By.id("input-email")).sendKeys("kdhivya@xyz.com");
//		driver.findElement(By.id("input-password")).sendKeys("123456");
	
		//second approach - Using the webelements for reusability
		
//		WebElement userName = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		userName.sendKeys("kdhivya@xyz.com");
//		password.sendKeys("12345");
//		
//		userName.sendKeys("anu@xyz.com");
//		password.sendKeys("134762");
//		
		//third approach -- By locators
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
		
//		WebElement userName = driver.findElement(emailId);
//		WebElement passwrd = driver.findElement(password);
//		
//		userName.sendKeys("kdhivya@xyz.com");
//		passwrd.sendKeys("12345");
		
		// 4th approach - creating a generic method for webElement
		
//		getElement(emailId).sendKeys("kdhivya@xyz.com");;
//		getElement(password).sendKeys("12345");
		
		//5th approach - creating a generic method for send keys
		
//		doSendKeys(emailId,"kdhivya@xyz.com");
//		doSendKeys(password, "12345");
		
		//Second:
		//name: is not an unique attribute
//			driver.findElement(By.name("email")).sendKeys("kdhivya@xyz.com");
			
		//Third:
		//Class name: Classname is not recommended if it is not unique)
		//If you find any unique class name , you can use it.
		
		//Fourth:
		// Xpath : it is a locator , not an attribute. It is the address of an element in the HTML dom.
		
//		driver.findElement(By.xpath("//input[@id ='input-email']")).sendKeys("kdhivya@xyz.com");
		//driver.close();
		
		//Fifth:
		// CSS selector: Cascade style sheet.
		// CSS is also a locator , not an attribute.
//		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys(userId);
//		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
		
		//sixth:
		//linkText : it is only for links.
		//For all the links html tag is "a" - anchor tag.
//		driver.findElement(By.linkText("Login")).click();
		
		//seventh:
		//partialLinkText: it is also only for links.
		//For all the links html tag is "a" tag.
		
//		driver.findElement(By.partialLinkText("About")).click();
		
		//Eighth:
		//tagName: It is used to get the text of headers and paragraphs in a web page.
//		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value = 'Login' and @type ='submit']");
		
		doSendKeys(emailId,"kdhivya@xyz.com");
		doSendKeys(password,"test12345");
		doClick(loginBtn);
		}
	
	//*[@id="input-email"]
		
		
		
	// 4th approach - creating a generic method for webElement 
	
	public static WebElement getElement(By locator) {
		
		 return driver.findElement(locator);

	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

}
	

	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}

}
