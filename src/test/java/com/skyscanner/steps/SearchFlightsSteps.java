package com.skyscanner.steps;

import org.junit.Assert;

import com.skyscanner.resources.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFlightsSteps {

	@Given("^I am on homepage$")
	public void i_am_on_homepage() {
		Assert.assertTrue(Pages.home().isOnHomePage());
	}

	@When("^I seach for flight from \"(.*?)\" to \"(.*?)\"$")
	public void i_seach_for_flight_from_to(String origin, String destination) {
		Pages.home().selectFlightsTab().clickOnOneWay().enterOrigin(origin).enterDestination(destination)
				.selectDepartingDate();
	}

	@When("^I click on direct flight$")
	public void i_enter_click_on_direct_flight() {
		Pages.home().selectDirectFlight();
	}

	@When("^I click on search$")
	public void i_click_on_search() {
		Pages.home().clickOnSearchBtn();
	}

	@Then("^I see some related flight details$")
	public void i_see_some_related_flight_details() {
		Assert.assertTrue(Pages.results().isOnResultsPage());
	}
}
