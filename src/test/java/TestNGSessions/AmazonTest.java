package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest{
	
	
	//By using enabled = false or by using @ignore annotation - We can ignore the specific test from executing 
	
	//To verify the actual result against the expected result we can use Assert method.
	
	
	

	
	@Test(priority = 1)
	public void getTitle() {
		driver.get("https://www.amazon.ca");
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

}
