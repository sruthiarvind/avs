package com.skyscanner.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.skyscanner.resources.Pages;

public class ResultsPage extends Pages {

	@FindBy(className = "title-city-text")
	private WebElement _destinationTitleTxt;

	public boolean isOnResultsPage() {
		return _destinationTitleTxt.getText().matches("Select your departure to Hyderabad");
	}
}
