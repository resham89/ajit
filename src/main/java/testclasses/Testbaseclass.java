package testclasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Testbaseclass {
		
	
WebDriver driver;
@Parameters("brousername")
@BeforeMethod
public void setUp(String brousername)
{
	if(brousername.equals("chrome"))
	{
		
	System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");

	 driver=new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver","./drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
     driver.get("https://www.lemonade.com/");
		driver.manage().window().maximize();

		
		
		
	
}





@AfterMethod
public void tearDown()
{
//	driver.close();
}
	 
}
 










