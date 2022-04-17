package com.subbu.retry.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class RetryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annonation, Class testClass, Constructor testConstructor, Method testmethod) {
		annonation.setRetryAnalyzer(RetryTestRunner.class);

	}

}
