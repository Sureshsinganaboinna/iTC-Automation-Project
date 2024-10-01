package Testngproject1.iTCbackoffice1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakesScreenshot {
	public static WebDriver driver;
	
	public static void intialization() {
		 ChromeOptions options = new ChromeOptions();
	      options.addArguments("--use-fake-ui-for-media-stream");
	      options.addArguments("--disable-notifications");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	    //  driver = new ChromeDriver();
	      driver = new ChromeDriver(options);
//		  driver.manage().window().maximize();
	     driver.get("https://qa.coasecure.com/");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void failedTestCase()
	{
		WebDriver ts = driver;
		File	ts1 = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File target1 = new File(".//Screenshotss//Manu.png");
		try {
			FileUtils.copyFile(ts1, target1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
            
	}
	
	

}
