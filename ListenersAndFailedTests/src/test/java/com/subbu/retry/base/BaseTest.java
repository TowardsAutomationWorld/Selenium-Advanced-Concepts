package com.subbu.retry.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.subbu.retry.utils.AppConstants;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class BaseTest {

	public WebDriver driver;
	public FileInputStream fis;
	public Properties or;

	@Parameters("retryBrowser")
	@BeforeTest
	public void browserLaunch(String testingBrowser) {
		if (testingBrowser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", AppConstants.FIREFOX_DRIVER_PATH);
			driver = new FirefoxDriver();

		} else if (testingBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", AppConstants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
		}
	}

	@BeforeTest
	public void prepoertyReadFile() throws IOException {
		fis = new FileInputStream(new File(AppConstants.OR_FILEPATH));
		or = new Properties();
		or.load(fis);

	}

}
