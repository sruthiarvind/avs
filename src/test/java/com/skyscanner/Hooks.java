package com.skyscanner;

import java.io.IOException;

import com.skyscanner.resources.Pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseMain main;

	private Scenario _scanrio;

	@Before
	public void setUp(Scenario scenario) throws IOException {
		this._scanrio = scenario;
		main = new BaseMain();
		main.openBrowser();
		Pages.LOG.info("Running scenario : " + _scanrio.getName());
	}

	@After
	public void tearDown() {
		main.closeBrowser();
		if (_scanrio.isFailed()) {
			Pages.LOG.error("OOPS some thing wrong " + System.lineSeparator());
		} else {
			Pages.LOG.info("Scenario passed " + System.lineSeparator());
		}
	}

}
