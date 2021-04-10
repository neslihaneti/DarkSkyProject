package com.darksky.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin is for reports
        plugin={"pretty","html:target/site/cucumber-pretty.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"com/darksky/stepdefinitions"},
        features = {"src/test/resources/features"},
        tags = "@homepage",
        //checking if the steps are defined or not
        dryRun = false,
        monochrome =true
)

public class TestRunner {
}
