package testng_groups;

import org.testng.annotations.Test;


@Test(groups= {"AllTestsAtclassLevel"})
public class TestNgGroup {
	
	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println(" This is Test 1");
	}
	
	@Test(groups= {"regression","sanity"})
	public void test2() {
		System.out.println(" This is Test 2");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test3() {
		System.out.println(" This is Test 3");
	}
	
	@Test(groups= {"regression","sanity"})
	public void test4() {
		System.out.println(" This is Test 4");
	}
	
	@Test(groups= {"smoke","regression"})
	public void test5() {
		System.out.println(" This is Test 5");
	}
	
	@Test(groups= {"windows.regression"})
	public void test6() {
		System.out.println(" This is Test 6");
	}
	

	@Test(groups= {"linux.regression"})
	public void test7() {
		System.out.println(" This is Test 7");
	}
	

}
