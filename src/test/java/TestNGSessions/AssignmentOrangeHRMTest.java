package TestNGSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import SeleniumSessions.ElementsUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOrangeHRMTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	}
	
	
	@Test(priority = 1)
	public void titleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test(priority = 2)
	public void urlTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertTrue(actualUrl.contains("orange"));
	}
	
	@Test(priority = 3)
	public void headerTest() {
		List<WebElement> headerList = driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-left default-nav']/li/a"));
		Assert.assertEquals(headerList.size(), 6,"The header navigation contains 6 links");
	}
	
	@Test(priority = 4)
	public void formRegisterTest() {
		
		ElementsUtil ele = new ElementsUtil(driver);
		
		By link = By.id("Form_submitForm_subdomain");
		By fName = By.id("Form_submitForm_FirstName");
		By lName = By.id("Form_submitForm_LastName");
		By eMail = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By noOfEmployees = By.id("Form_submitForm_NoOfEmployees");
		By companyName = By.id("Form_submitForm_Industry");
		By industry = By.id("Form_submitForm_Industry");
		By contact = By.id("Form_submitForm_Contact");
		By country = By.id("Form_submitForm_Country");
	
		
		
		
		ele.doSendKeys(link, "Oshawa");
		ele.doSendKeys(fName, "Test");
		ele.doSendKeys(lName, "Test");
		ele.doSendKeys(eMail, "test@gmail.com");
		ele.doSendKeys(jobTitle, "Tester");
		ele.doSelectByVisibleText(noOfEmployees, "0 - 10");
		ele.doSendKeys(companyName, "IBM");
		ele.doSelectByVisibleText(industry, "Education");
		ele.doSendKeys(contact, "123456789");
		ele.doSelectByVisibleText(country, "Albania");
		
		}
	
	@Test(priority = 5)
	public void privacyPolicyTest() {
		ElementsUtil ele = new ElementsUtil(driver);
		
		By privacyPolicy = By.xpath("//div[@class='Actions']//a");
		Assert.assertTrue(ele.getElement(privacyPolicy).isDisplayed());
		ele.doClick(privacyPolicy);
		System.out.println(driver.getTitle());
		Assert.assertTrue((driver.getTitle()).contains("Orange"));   ;
		
	}
	
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	

}
