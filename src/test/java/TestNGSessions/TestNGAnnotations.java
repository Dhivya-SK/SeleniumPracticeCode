package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//Global pre condition
	//TC01 -->Pre conditions --> test steps --> actual vs expected --> post conditions
	//TC02--Pre conditions --> test steps --> actual vs expected --> post conditions
	//TC003 -Pre conditions --> test steps --> actual vs expected --> post conditions
	//Global post condition
	
	
	@BeforeSuite
	public void createUser() {
		System.out.println("BS --- Create user");
	}
	
	@BeforeTest
	public void connectDB() {
		System.out.println("BT --- Connect the DB");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC --- Launch the browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM --- login to app");
	}
	
	//By default the tests will be executed in alphabetical order
	//To execute in an order priority keyword can be given along with the number
	
	@Test(priority = 1)
	public void searchTest() {
		System.out.println("Search test......");
	}
	
	@Test(priority = 3)
	public void addToCart() {
		System.out.println("Add to cart....");
	}
	
	@Test(priority = 2)
	public void paymentTest() {
		System.out.println("Payment.......");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM ---  logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC --- Close the browser");
	}
	
	@AfterTest
	public void disconnectDB() {
		System.out.println("AT --- Disconnect the DB");
	}
	
	@AfterSuite
	public void deleteUser() {
		System.out.println("AS --- Delete the User");
	}
}
