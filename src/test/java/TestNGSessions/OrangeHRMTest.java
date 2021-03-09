package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {


	

	
	@Test(priority = 1)
	public void getTitle() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String actualTitle = driver.getTitle();
		System.out.println("The page title is " +actualTitle);
		Assert.assertEquals(actualTitle, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test(priority = 2)
	public void UrlTest() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("orange"));
		
	}
	
	@Test(priority = 3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector(".nav-logo")).isDisplayed());
	}
	

}
