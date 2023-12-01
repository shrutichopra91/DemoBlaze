package runner;

import io.cucumber.testng.*;

@CucumberOptions(
features="src/test/java/features",
glue="stepDefinitions",
tags="@happy"
		)
public class BlazeTestNGRunner extends AbstractTestNGCucumberTests {
									   
}



