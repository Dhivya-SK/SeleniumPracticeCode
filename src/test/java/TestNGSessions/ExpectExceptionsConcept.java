package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectExceptionsConcept {
	
	// By providing the excepted exceptions in the method, the test will be passed.
	
	// This is useful when developer wants to perform unit test and deliberately wanted 
	// to see this error or it is used while giving demo to clients.
	
	// When the exception is not thrown, the test will fail.
	

	
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		System.out.println("Login test......");
		int i = 9/0;
	}
}
