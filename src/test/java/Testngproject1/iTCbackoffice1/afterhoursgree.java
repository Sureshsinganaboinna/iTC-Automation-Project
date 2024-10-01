package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class afterhoursgree {
	static WebDriver driver;

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--use-fake-ui-for-media-stream");
      options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	    //  driver = new ChromeDriver();
	   driver = new ChromeDriver(options);

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
  public void f() throws InterruptedException {
	  
	     driver.findElement(By.id("divSettings")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("lnkGreetings")).click();
			  Thread.sleep(3000);
		  driver.findElement(By.id("lnkAHGreeting")).click();
		     Thread.sleep(3000);
		  String extreuslt = "Create an After-Hours Greeting";
		  String actresult = driver.findElement(By.xpath("//span[contains(text(),'Create an After-Hours Greeting')]")).getText();
		  Assert.assertEquals(extreuslt, actresult);
		     Thread.sleep(3000);
		  String extreuslt1 ="Tips for creating Greeting";
		  String actresult1 = driver.findElement(By.xpath("//*[contains(text(),'Tips for creating Greeting')]")).getText();
		  Assert.assertEquals(extreuslt1, actresult1);
		     Thread.sleep(3000);
		  String extreuslt11 = "We are open 24/7";
		  String actresult11 = driver.findElement(By.xpath("//*[contains(text(),'We are open 24/7')]")).getText();
		  Assert.assertEquals(extreuslt11, actresult11);
		     Thread.sleep(3000);
		  String extreuslt111 = "Note: Setting your schedule to 24/7 DOES NOT remove your After-Hours Greeting, but merely disables it.";
		  String actresult111 = driver.findElement(By.xpath("//*[@id='divContainerRight']/div[4]/div[2]/p")).getText();
		  Assert.assertEquals(extreuslt111, actresult111);
		     Thread.sleep(3000);
		  WebElement togglekey = driver.findElement(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label"));
	      boolean tooglekeyimageaft = togglekey.isDisplayed();
	      Assert.assertTrue(tooglekeyimageaft, "ImageApple is not displayed on the page.");
	      Thread.sleep(3000);
	      if(driver.findElements(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label/div[@class='toggle btn btn-primary']")).size()>0)
	      {	  
	    	  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label/div[@class='toggle btn btn-primary']")).click();
	    	  
	    	  
	    	  String extreuslt1111 = "My After-Hours Greeting";
			  String actresult1111 = driver.findElement(By.xpath("//*[contains(text(),'My After-Hours Greeting')]")).getText();
			  Assert.assertEquals(extreuslt1111, actresult1111);
			  
			  String extreuslt11111 = "You have not created any greeting yet";
			  String actresult11111 = driver.findElement(By.xpath("//*[contains(text(),'You have not created any greeting yet')]")).getText();
			  Assert.assertEquals(extreuslt11111, actresult11111);
			  
			  String extreuslt111111 = "Text-back is:";
			  String actresult111111 = driver.findElement(By.xpath("//*[contains(text(),'Text-back is:')]")).getText();
			  Assert.assertEquals(extreuslt111111, actresult111111);
			  
			  String extreuslt112 = "Follow-up text:";
			  String actresult112 = driver.findElement(By.xpath("//*[contains(text(),'We are open 24/7')]")).getText();
			  Assert.assertEquals(extreuslt112, actresult112);
	    	  
	    	  
	    	  
	    	  
	    	 
	      }
	      Thread.sleep(3000);
	      if(driver.findElements(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label/div[@class='toggle btn btn-default off']")).size()>0)
	      {	  
	    	  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label/div[@class='toggle btn btn-default off']")).click();
	    	 
	      }
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
