package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions( 
		features ="src/test/resurces/features/login_codefios.feature",
		 
		glue="steps",
		
		plugin={
			"pretty",
			"html:	target/reports/cucumber.html",
			"json:	target/reports/cucumber.json",
			"junit:	target/reports/cucumber.xml"
		}
		
		)
	

public class Login_TestRunner {

}
