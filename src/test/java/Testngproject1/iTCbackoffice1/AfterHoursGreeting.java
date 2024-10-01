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

public class AfterHoursGreeting {
	static WebDriver driver;
 
  @BeforeClass
  public <TakeScreenshot> void beforeClass() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--use-fake-ui-for-media-stream");
      options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64\\chromedriver.exe");
	    //  driver = new ChromeDriver();
	  ChromeDriver   driver = new ChromeDriver(options);

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
  public void recordingWithMic() throws Exception {
	  
	  driver.findElement(By.id("divSettings")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkGreetings")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkSTGreeting")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkRecordWithMic")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkRecordWithMic")).click();
	  WebElement logo = driver.findElement(By.id("btnStartRecording"));  // Replace with the actual ID or other locator of your logo

      // Verify that the logo is visible on the page
      Assert.assertTrue(logo.isDisplayed(), "Recording should be visible on the page");
      
      String  extresult = "Click above to start recording";
      String Actualresult = driver.findElement(By.xpath("//*[contains(text(),' Click above to start recording')]")).getText();
      Assert.assertEquals(Actualresult, extresult);
      
      Thread.sleep(3000);
      
      driver.findElement(By.id("btnStartRecording")).click();
      Thread.sleep(10000);
      
      driver.findElement(By.id("btnStopRecording")).click();
      Thread.sleep(3000);
      
      String  extresult1 = "Listen to recorded greeting";
      String Actualresult1 = driver.findElement(By.xpath("//*[contains(text(),'Listen to recorded greeting')]")).getText();
      Assert.assertEquals(Actualresult1, extresult1);
      
      // Find the button element by its locator (for example, by id, class name, etc.)
      WebElement buttonElement = driver.findElement(By.xpath("//button[@id='btnUploadRTCGreet']"));
      
      // Check if the button is enabled
      boolean isEnabled = buttonElement.isEnabled();
      
      // Assert that the button is enabled
      Assert.assertTrue(isEnabled, "Button is not enabled");
      
  WebElement buttonElement1 = driver.findElement(By.xpath("//button[@id='btnRedo']"));
      
      // Check if the button is enabled
      boolean isEnabled1 = buttonElement1.isEnabled();
      
      // Assert that the button is enabled
      Assert.assertTrue(isEnabled1, "Button is not enabled");
      WebElement audio2 = driver.findElement(By.id("audio2"));  // Replace with the actual ID or other locator of your logo

      // Verify that the logo is visible on the page
      Assert.assertTrue(audio2.isDisplayed(), "Recording should be visible on the page");
      Thread.sleep(5000);
      
      
      driver.findElement(By.xpath("//button[@id='btnUploadRTCGreet']")).click();
      
      String ExpectedSTstatus = "Congratulations! Your new main greeting has been uploaded.";
      String ActualStstatus = driver.findElement(By.xpath("//h1[contains(text(),'Congratulations! Your new main greeting has been uploaded.')]")).getText();
      Assert.assertEquals(ActualStstatus, ExpectedSTstatus);
      
      
      
      
  }
  
  @AfterClass
  public void textToSpeechafterConverted() throws InterruptedException {
	  
	   String ExpectedSTstatus = "Listen to Converted Greeting";
	      String ActualStstatus = driver.findElement(By.xpath("//*[contains(text(),'Listen to Converted Greeting')]")).getText();
	      Assert.assertEquals(ActualStstatus, ExpectedSTstatus);
	      
	      WebElement audio2 = driver.findElement(By.id("TTSConvertedGreet"));  // Replace with the actual ID or other locator of your logo

	      // Verify that the logo is visible on the page
	      Assert.assertTrue(audio2.isDisplayed(), "Recording should be visible on the page");
	      Thread.sleep(5000);
	      
	      String ExpectedActivateTTS = "Activate TTS Greeting";
	      String ActualActivateTTS = driver.findElement(By.xpath("//*[contains(text(),'Listen to Converted Greeting')]")).getText();
	      Assert.assertEquals(ExpectedActivateTTS, ActualActivateTTS);
	      
	      // Find the checkbox element by its locator (for example, by id, class name, etc.)
	        WebElement checkboxElement = driver.findElement(By.id("chkactive"));
	        // Check if the checkbox is enabled
	        checkboxElement.click();
	        Thread.sleep(3000);
	        boolean isEnabled = checkboxElement.isEnabled();
	        // Assert that the checkbox is enabled
	        Assert.assertTrue(isEnabled, "Checkbox is not enabled");
	      
	        WebElement savebutton = driver.findElement(By.id("btnTexttoSpeechSave"));
	        // Check if the button is enabled
	        boolean isEnabled1 = savebutton.isEnabled();
	        // Assert that the button is enabled
	        Assert.assertTrue(isEnabled1, "Button is not enabled");
	        Thread.sleep(3000);
	        String ExpectedTTSstatus = "Congratulations! Your new Text-to-speech main greeting has been activated.";
	        String ActualTTSStatus = driver.findElement(By.xpath("//h1[contains(text(),'Congratulations! Your new Text-to-speech main greeting has been activated.')]")).getText();
	        Assert.assertEquals(ActualTTSStatus, ExpectedTTSstatus);
	      
	  
  }

}
