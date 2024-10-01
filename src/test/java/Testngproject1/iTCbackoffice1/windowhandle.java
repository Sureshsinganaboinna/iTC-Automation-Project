package Testngproject1.iTCbackoffice1;

import java.io.File;

import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
   static ChromeDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (4)\\\\chromedriver-win64\\\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.coasecure.com/");
	      
	      String getparantwindowsuniquekey = driver.getWindowHandle();
	      System.out.println(getparantwindowsuniquekey);
	      Set<String> windowhandles = driver.getWindowHandles();
	      for(String windowhandle : windowhandles)
	      {
	    	  driver.switchTo().window(windowhandle);
	    	  System.out.println(windowhandle);
	    	  
	      }
	      
	      File ts = driver.getScreenshotAs(OutputType.FILE);
	      File tr = new File(".\\Screenshotss\\home.png");
	      FileUtils.copyFile(ts, tr);
	      
	      
   driver.close();
	}

}
