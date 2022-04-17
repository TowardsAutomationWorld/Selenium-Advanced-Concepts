package com.subbu.retry.listeners;

import java.util.ArrayList;
import java.util.List;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.TestNG;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

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

	public static void main(String[] args) {

		TestNG retySuite = new TestNG();

		List<String> failedTests = new ArrayList<String>();
		failedTests
				.add("./test-output/Suite/testng-failed.xml");
		retySuite.setTestSuites(failedTests);
		retySuite.run();

	}

}
