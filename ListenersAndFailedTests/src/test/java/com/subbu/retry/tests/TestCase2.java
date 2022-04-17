package com.subbu.retry.tests;


import org.testng.Assert;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class TestCase2 {

//	@Test(retryAnalyzer = listeners.RetryTestRunner.class)
	public void testCase2() {
		Assert.assertTrue(true);
	}

//	@Test(retryAnalyzer = listeners.RetryTestRunner.class)
	public void testCase21() {
		Assert.assertTrue(false);
	}

}
