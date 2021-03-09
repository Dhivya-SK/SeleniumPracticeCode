package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	
	//If any of the test depends on the previous method, then by giving dependsOnMethods
	// we can avoid all the tests failing. In case the first one fails all other dependent
	// methods will be skipped.
	
	//We avoid this dependsOnMethods in framework as this will create problem if tests are
	// are run in parallel. 
	
	@Test
	public void loginTest() {
		System.out.println("Login test......");
		int i = 9/0;
	}
	
	@Test(priority = 1)
	public void searchTest() {
		System.out.println("Search test....");
	}
	
	@Test(dependsOnMethods = "loginTest",priority = 2)
	public void paymentTest() {
		System.out.println("Payment.......");
	}

}
