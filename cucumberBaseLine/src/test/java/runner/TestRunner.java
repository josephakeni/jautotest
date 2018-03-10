package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "features", snippets = SnippetType.UNDERSCORE, glue = {
		"stepDefinition" }, monochrome = true)
public class TestRunner {

}
