package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class ParabankTestRunner 
{
	@CucumberOptions(

	        features = "src/test/resources/features",
	        glue = {"stepdefinitions", "hooks"},

	        plugin = {
	                "pretty",
	                "html:target/cucumber-report.html"
	        },

	        monochrome = true
	)

	public class TestRunner extends AbstractTestNGCucumberTests {

	}
}
