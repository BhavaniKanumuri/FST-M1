package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//Activity1 Runner file
/*@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity1_1"
)


//Activity2 Runner file
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tag = "@activity1_2"
)

//Activity3 Runner file
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SmokeTest",
	    strict = true
)

//Activity4 Runner file
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tag = "@activity2_4"
)

//Activity5 Runner file
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@activity2_5"
)

//Activity6 Runner file to generate a pretty report
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SimpleAlert",
	    plugin = {"pretty"},
	    monochrome = true
)

//Activity6 Runner file to generate an html report
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SmokeTest",
	    plugin = {"html: test-reports"},
	    monochrome = true
)
*/

//Activity6 Runner file to generate a json report
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SimpleAlert",
	    plugin = {"json: test-reports/json-report.json"},
	    monochrome = true
)


public class ActivitiesRunner {

}