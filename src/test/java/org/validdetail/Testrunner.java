package org.validdetail;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/ScenarioOutline.feature", dryRun = false, monochrome = true, tags = "@user1", glue = "org.validdetail", plugin = {
		"html:target", "target:cucumber-reports/cucumber.json" })
public class Testrunner {

}
