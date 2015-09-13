package com.skyscanner;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseMain main;

	@Before
	public void setUp() throws IOException {
		main = new BaseMain();
		main.openBrowser();
	}

	@After
	public void tearDown() {
		main.closeBrowser();
	}

}
