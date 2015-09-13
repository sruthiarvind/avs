package com.skyscanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.skyscanner.resources.Pages;

public class BaseMain {

	static WebDriver driver;
	Properties properties;

	public WebDriver getDriver() {
		return driver;
	}

	public void openBrowser() throws IOException {
		properties = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/config/congiuration.properties");
		properties.load(file);
		String browser = properties.getProperty("Browser");
		Pages.LOG.info("Browser " + browser);

		if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		if (browser.equals("Chrome"))
			driver = new ChromeDriver();
		String url = properties.getProperty("URL");
		Pages.LOG.info("URL " + url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.quit();
	}

}
