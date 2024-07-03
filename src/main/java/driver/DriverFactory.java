package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	static WebDriver driver ;
	static WebDriverManager d;
	
	public  WebDriver initBrowser(String broweserName) {
		
		if (broweserName.equalsIgnoreCase("edge")) {
			d.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (broweserName.equalsIgnoreCase("firefox")) {
			d.firefoxdriver().setup();
			driver = new FirefoxDriver();	
			}
		else if (broweserName.equalsIgnoreCase("chrome")) {
			d.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.manage().deleteAllCookies();
			}
		
//		else {
//			System.out.println("entered brower name was not valid, it should be chrome, firefox, edge  ");
//		}
		return driver;
		
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
