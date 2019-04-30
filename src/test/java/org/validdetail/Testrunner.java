package org.validdetail;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/ScenarioOutline.feature", monochrome = true, tags = "@smoke", glue = "org.validdetail", plugin = "html:target")
public class Testrunner {

}
