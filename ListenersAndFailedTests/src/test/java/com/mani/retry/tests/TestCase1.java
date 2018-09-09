package com.mani.retry.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mani.retry.base.BaseTest;
import com.mani.retry.utils.AppConstants;

public class TestCase1 extends BaseTest {

	@Test
	public void allBrowsers(){

		driver.get(AppConstants.URL_PATH);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(or.getProperty("GOOGLE_HOME_SEARCH_KEY"))).sendKeys("Selenium Webdriver");
		
	}
}
