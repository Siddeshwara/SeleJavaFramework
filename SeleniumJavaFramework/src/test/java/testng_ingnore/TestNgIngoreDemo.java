package testng_ingnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

// class level
//@Ignore
public class TestNgIngoreDemo {

	
	@Test(dependsOnGroups = {"expo.*"})	
	public void testA() {
		
		System.out.println("Test A");
	}

	@Test(priority = 1)
	public void testB() {
		
		System.out.println("Test B");
	}

	@Test(groups= {"expo1"})
	public void testC() {
		
		System.out.println("Test C");
	}


	@Test(groups= {"expo2"})
	public void testD() {
		
		System.out.println("Test D");
	}
}
