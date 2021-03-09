package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//If the requirement is to run the same test method for particular number of times,
	// invocationCount keyword can be used and the script will be run for number of times.
	
	@Test(invocationCount = 10)
	public void loginTest() {
		System.out.println("Login test......");
	
	}

}
