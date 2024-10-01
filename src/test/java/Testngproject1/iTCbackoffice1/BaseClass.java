package Testngproject1.iTCbackoffice1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static ChromeDriver driver;
    @BeforeTest
	public void setup()
	{
    	  ChromeOptions options = new ChromeOptions();
          options.addArguments("--use-fake-ui-for-media-stream");
          options.addArguments("--disable-notifications");
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		    //  driver = new ChromeDriver();
			// WebDriverManager.chromedriver().setup();
//          WebDriverManager.chromedriver().setup();
//          driver = new ChromeDriver(options);
	      driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("https://www.coasecure.com/");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreenshot() throws IOException
	{    
		
		File src =   driver.getScreenshotAs(OutputType.FILE);
		File target = new File(".//Screenshotss//Home.png");
		FileUtils.copyFile(src, target);
	/*	
		TakesScreenshot srcshot =  ((TakesScreenshot)WebDriver);
		File srcshotfile = srcshot.getScreenshotAs(OutputType.FILE);
		File destinationpath = new File("");
		FileUtils.copyFile(srcshotfile, destinationpath)
		*/
		
		
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
}
