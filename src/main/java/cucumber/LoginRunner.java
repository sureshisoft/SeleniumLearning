package cucumber;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java",glue="cucumber",
monochrome=true,plugin={"pretty","html:report/cucumber-html-report.html"})
public class LoginRunner extends io.cucumber.testng.AbstractTestNGCucumberTests{
	
	
	
	

}
