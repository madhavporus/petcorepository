package stepdefinitions;


import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/resources/logincreateorder.feature",				
		glue= {"stepdefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports","junit:target/junitXMLReports/Cucumber.xml"},
		monochrome = true,
		dryRun = true
		)


public class TestRunner {

}






