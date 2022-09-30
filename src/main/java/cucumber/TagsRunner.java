package cucumber;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
			//	features="src/main/java/Tagsexample.feature",
		features="src/main/java",
glue={"cucumber"},
tags="@irctclogin and @irctcsearch or @loginhrm")

public class TagsRunner extends io.cucumber.testng.AbstractTestNGCucumberTests {

}
