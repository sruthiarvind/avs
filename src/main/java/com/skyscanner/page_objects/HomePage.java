package com.skyscanner.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resouces.Helpers;
import resouces.Pages;

public class HomePage extends Pages {
	@FindBy(id = "tab-flight-tab")
	private WebElement _flightsTab;

	@FindBy(id = "flight-type-one-way-label")
	private WebElement _oneWayRadioBtn;

	@FindBy(id = "flight-origin")
	private WebElement _originTxtBox;

	@FindBy(id = "flight-destination")
	private WebElement _destinationTxtBox;

	@FindBy(id = "search-button")
	private WebElement _searchBtn;

	@FindBy(id = "flight-departing")
	private WebElement _departingCalender;

	public HomePage selectFlightsTab() {
		_flightsTab.click();
		return this;
	}

	public HomePage clickOnOneWay() {
		_oneWayRadioBtn.click();
		return this;
	}

	public boolean isOnHomePage() {
		return new Helpers().getCurrentURL().endsWith("www.expedia.co.uk/");
	}

	public HomePage enterOrigin(String origin) {
		_originTxtBox.sendKeys(origin);
		driver.findElement(By.linkText(origin)).click();
		return this;
	}

	public HomePage enterDestination(String destination) {
		_destinationTxtBox.sendKeys(destination);
		driver.findElement(By.linkText(destination)).click();
		return this;
	}

	public ResultsPage clickOnSearchBtn() {
		_searchBtn.click();
		return Pages.results();
	}

	public HomePage selectDepartingDate() {
		_departingCalender.sendKeys(new Helpers().getCurrentDate());
		return this;
	}

}
