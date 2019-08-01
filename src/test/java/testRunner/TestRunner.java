package testRunner;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src\\main\\java\\Features\\cucu.feature"},
				 glue= {"stepDefinations"})

public class TestRunner  extends AbstractTestNGCucumberTests
{

}
