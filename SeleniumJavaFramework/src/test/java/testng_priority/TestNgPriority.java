package testng_priority;

import org.testng.annotations.Test;

public class TestNgPriority {

// -1 is highest priority, then 0, 1, 2
	// it will consider alphabatical order if you do not specify any priority
	
	@Test(priority = 2)
	public void test1() {
		
		System.out.println("I am inside Test 1");
		
	}
	
	@Test(priority = -1)
	public void test2() {
		
		System.out.println("I am inside Test 2");
		
	}
	
	@Test(priority = 0)
	public void test3() {
		
		System.out.println("I am inside Test 3");
		
	}
}
