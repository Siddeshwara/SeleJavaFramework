package testng_retry_failedCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailedCases {

	@Test
	public void check1() {
		System.out.println("Test 1");
	}

	@Test
	public void check2() {

		System.out.println("Test 2");
		//int i = 1 / 0;
	}

	@Test(retryAnalyzer = testng_retry_failedCases.RetryTests.class)
	public void check3() {

		System.out.println("Test 2");
		Assert.assertTrue(false);
		
	}
}
