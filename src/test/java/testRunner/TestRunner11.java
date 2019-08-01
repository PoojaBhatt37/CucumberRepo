package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\Features\\cucu.feature",
				 glue="stepDefinations",
				 dryRun=false)
public class TestRunner11 {
	
}

