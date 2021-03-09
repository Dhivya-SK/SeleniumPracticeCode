package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicCRMTest extends BaseTest {
	
	
	
	
	
	@Test(priority = 1)
	public void getTitle() {
		driver.get("https://classic.crmpro.com/");
		String actualTitle = driver.getTitle();
		System.out.println("The page title is " +actualTitle);
		Assert.assertEquals(actualTitle, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority = 2)
	public void UrlTest() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("customer"));
		
	}
	
	@Test(priority = 3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='navbar-brand']/img")).isDisplayed());
	}
	
	

}
