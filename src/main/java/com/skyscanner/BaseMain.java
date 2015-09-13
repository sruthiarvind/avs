package com.skyscanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseMain {

	public BaseMain() {
		PageFactory.initElements(driver, this);
	}

	static WebDriver driver;
	Properties properties;

	public void openBrowser() throws IOException {
		properties = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/config/congiuration.properties");
		properties.load(file);
		String browser = properties.getProperty("Browser");
		if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		if (browser.equals("Chrome"))
			driver = new ChromeDriver();
		String url = properties.getProperty("URL");
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.quit();
	}

}
