package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/SBILOGIN.feature",glue= {"stepdefinitions"},
plugin = {"pretty","usage:target/usages","summary","html:target/cucumber-html-report",
	    "junit:target/cucumber-junit-report/allcukes.xml", "json:target/cucumber-report.json",
	    "json:target/cucumber.json", "usage:target/cucumber-usage.json"},
         monochrome=true
    )

public class Runnerfile 
{

}


