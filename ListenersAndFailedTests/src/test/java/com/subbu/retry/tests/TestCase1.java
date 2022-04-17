package com.subbu.retry.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.subbu.retry.base.BaseTest;
import com.subbu.retry.utils.AppConstants;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class TestCase1 extends BaseTest {

	@Test
	public void allBrowsers(){

		driver.get(AppConstants.URL_PATH);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(or.getProperty("GOOGLE_SEARCHS"))).sendKeys("Selenium Latest Version");
		
	}
}
