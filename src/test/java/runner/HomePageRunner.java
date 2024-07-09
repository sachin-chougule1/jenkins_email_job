package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features= {"src\\test\\resources\\steps\\HomePag.feature"},
		features= {"src\\test\\resources\\steps\\HomePage.feature"},
		glue= {"stepsClasse","appHook"},
		publish= true,
		plugin= {"pretty"}
//		plugin= {"pretty","html:target/cucumber-report/failed.html"}
		
//		features= {"@target/failedfrom.txt"},    //to run failed scenario only neew rerun plugin
//		plugin= {"pretty","rerun:target/failedfrom.txt"}
		
		
		
		)
public class HomePageRunner extends AbstractTestNGCucumberTests{

}
