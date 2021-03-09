package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	
	//When priority is given, the execution will be based on the priority given
	//Negative priority can be given and accordingly it will be executed from lowest number
	//When two or more tests is given same priority , the execution will be based on
	// the alphabetical order.
	//
	
	//When few tests are given priority and when few are given without priority, then the 
	// execution will be based on non priority and then priority one's.
	
	// When the testNG is run without any test methods in it, the result will say no Tests run.
	
	
	
	
	@Test(priority = -1)
	public void d_Test() {
		System.out.println("D test......");
	}
	
	@Test(priority = 3)
	public void e_Test() {
		System.out.println("E Test....");
	}
	
	@Test(priority = 2)
	public void f_Test() {
		System.out.println("F Test.......");
	}
	
	@Test(priority = 4)
	public void a_Test() {
		System.out.println("A Test.......");
	}
	@Test(priority = 5)
	public void b_Test() {
		System.out.println("B Test.......");
	}
	
	@Test(priority = 6)
	public void c_Test() {
		System.out.println("C Test.......");
	}
}
