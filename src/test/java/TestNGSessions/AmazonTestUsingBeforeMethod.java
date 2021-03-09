package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestUsingBeforeMethod {
	
	//Preferred practice is to use Before method comparing to before test as for every test the browser will be launched 
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		
	}
	
	@Test(priority = 1)
	public void getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println("The page title is " +actualTitle);
		Assert.assertEquals(actualTitle, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	
	@Test(priority = 2)
	public void UrlTest() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("amazon"));
		
	}
	
	@Test(priority = 3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed());
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
