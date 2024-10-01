package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestCallings {
 WebDriver driver;

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	    //  driver = new ChromeDriver();
	      driver = new ChromeDriver();

      driver.get("https://www.coasecure.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");  //(833)6322654
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");    //891929
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
	      Thread.sleep(3000);
	      
  }
  
  @Test
  public void testItcCallings() throws InterruptedException {
	  driver.findElement(By.id("NewCallOuter")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='output']")).sendKeys("8446247684");
	  Thread.sleep(3000);
	  driver.findElement(By.id("callOnGreenBtn-Click")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[contains(@id,'clickKeypad')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='2']/div")).click();
	  Thread.sleep(30000);
	  driver.findElement(By.xpath("//*[@id='4']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id='6']")).click();
	  String Callingminutes =  driver.findElement(By.xpath("//*[contains(@id,'imgcallduration0')]")).getText();
	  
	 System.out.println(Callingminutes);
	 
	 
	 driver.findElement(By.id("callOnRedBtn-Click0")).click();
	 
	
  }
//*[contains(@id,'clickKeypad')]
  
//*[@id="2"]/div
  
//*[@id="4"]
  

  @AfterClass
  public void afterClass() {
	  
	  
	  
	  
	  
  }

}
