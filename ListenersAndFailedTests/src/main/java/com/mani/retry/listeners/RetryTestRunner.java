package com.mani.retry.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestRunner implements IRetryAnalyzer {

	int count = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult arg0) {
		if (count < retryLimit) {

			count++;
			return true;
		}

		return false;
	}

	// public static void main(String[] args) {
	//
	// TestNG retySuite = new TestNG();
	//
	// List<String> allFailedTests = new ArrayList<String>();
	// allFailedTests
	// .add("D:\\practice_workspace\\basics\\ListenersAndFailedTests\\test-output\\Suite\\testng-failed.xml");
	// retySuite.setTestSuites(allFailedTests);
	// retySuite.run();
	// }

}
