package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", 
								glue = {"stepDefinitions", "hooks"},
								dryRun = false,
								monochrome = true,
								tags = "@Background",
						    	plugin = {"html:Reports/WebReport", "json:Reports/jsonReport.json", "junit:Reports/xmlReport.xml"})
								
public class RunnerClass {

}
