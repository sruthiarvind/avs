package com.skyscanner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", monochrome = true, dryRun = false)
public class CukesTest {

}
