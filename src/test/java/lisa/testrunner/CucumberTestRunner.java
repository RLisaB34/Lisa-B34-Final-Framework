package lisa.testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//for reports
@CucumberOptions(
		plugin = { "json:./target/cucumber.json" },
		features = { "./src/test/resources/LogInOnlineBanking.feature" },
		glue = { "lisa.generic" },  //package name
		tags = "@Smoke"
		//monochrome = true, 
		//dryRun = false,
		
		)


public class CucumberTestRunner extends AbstractTestNGCucumberTests{

	//hook cucumber with testng 
	
	@BeforeTest
	public void setup() {
		
	}
	
	@Test 
	public void test1() {
		
	}
	
	@AfterTest
	public void tearDown() {
		
	}
	
}
