package com.mani.retry.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

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
