package com.skyscanner.page_objects;

import resouces.Helpers;

public class HomePage {
	public boolean isOnHomePage() {
		return new Helpers().getCurrentURL().endsWith("skyscanner.net/");
	}

}
