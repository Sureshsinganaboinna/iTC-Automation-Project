package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;


Run All 
public class CallforwardingSettings {
	
	Webdriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--use-fake-ui-for-media-stream");
      options.addArguments("--disable-notifications");
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver(options);

      driver.get("https://www.coasecure.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
	        
  }

  @Test 
  public void f() {
	  
	  driver.findElement(By.id("divSettings")).click();
	   Thread.sleep(2000);
	  driver.findElement(By.id("lnkUserSettings")).click();
	   Thread.sleep(2000);
  }
  
  @AfterClass
  public void afterClass() {
  }

}
