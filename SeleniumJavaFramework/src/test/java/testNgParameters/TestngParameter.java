package testNgParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Parameters({"MyName", "Chel"})
public class TestngParameter {
	
	
	@Test	
	public void check(@Optional("No Paremeter") String name) {
		
		System.out.println("My name is : " + name);
	}

}
