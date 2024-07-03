package appHook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.HomePage;

public class AppHookAmazon {

	@Before
	public void launchBrowser() throws IOException {
		
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\confi.properties";
		FileInputStream fis= new FileInputStream(path);
		prop.load(fis);		
		String browssername = prop.getProperty("browerName");	
		DriverFactory nf= new DriverFactory();
		WebDriver driver = nf.initBrowser(browssername);
		driver.manage().window().maximize();
				
//		HomePage hm = new HomePage(driver);
//		hm.getTitle();
	}
	
	@After(order=2)
	public void failedScenarioScreenShot(Scenario sce) {
		
		if(sce.isFailed()) {
		String scenarioName = sce.getName();
		String name = scenarioName.replaceAll(" ","");     // screen shot name me space aa sakta haii isliye
		TakesScreenshot ts = (TakesScreenshot)DriverFactory.getDriver();
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		
		sce.attach(source, "image/png", name);
		}
		
	}
	
	@After(order=1)
	public void tearDown() {
		
		WebDriver driver = DriverFactory.getDriver();
		driver.quit();
		
	}
	
}
