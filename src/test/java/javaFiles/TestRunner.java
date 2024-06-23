package javaFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (dryRun = false,glue = {"StepDefFiles","javaFiles","Common"},features = {"src/test/resources/features"},plugin = {"pretty","html:target/cucumber_reports/reports.html","json:target/cucumber_reports/reportjson.json","junit:target/cucumber_reports/xmlreports.xml"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
