package testng_ingnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Snippet {
	@Test(dependsOnGroups = {"expo.*"})	
	public void testA() {
		
		System.out.println("Test A");
	}
	
	@Ignore
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

