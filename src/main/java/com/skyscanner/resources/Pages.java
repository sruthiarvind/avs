package com.skyscanner.resources;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.skyscanner.BaseMain;
import com.skyscanner.page_objects.HomePage;
import com.skyscanner.page_objects.ResultsPage;

public class Pages {
	public static WebDriver driver;
	public static Logger LOG = Logger.getLogger(Pages.class);

	static <T> T getPages(T page) {
		driver = new BaseMain().getDriver();
		PageFactory.initElements(driver, page);
		return page;
	}

	public static HomePage home() {
		HomePage page = new HomePage();
		return getPages(page);
	}

	public static ResultsPage results() {
		ResultsPage page = new ResultsPage();
		return getPages(page);
	}

}
