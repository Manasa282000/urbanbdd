package com.urbanladderCucumber_BDD.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources"},glue={"com.urbanladderCucumber_BDD.StepDefinitions"},monochrome=true,dryRun=false,plugin= {"pretty","html:test-output"})
public class TestRunner {
	

}
