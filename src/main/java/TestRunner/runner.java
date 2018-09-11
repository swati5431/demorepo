package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = " /Users/swati.singh/officeworkspace/builder/src/main/java/featurefile/login.feature", //the path of the feature files
		glue={"stepdefinition"},
	format= {"pretty","html:test-output"},
	dryRun= false,
	monochrome= true,
	strict= true
	//tags= {"@Smoketest" , "~@Regressiontest"}
		
		
		)
public class runner {

}
