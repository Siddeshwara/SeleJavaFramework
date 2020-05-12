package testNg_Dependency;

import org.testng.annotations.Test;

public class TestNgDependencies {

//@Test(dependsOnMethods = {"testB","testC" })
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

