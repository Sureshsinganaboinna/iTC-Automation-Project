package Testngproject1.iTCbackoffice1;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestUploadingAudioFiles {
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
	      driver.findElement(By.id("divSettings")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("lnkGreetings")).click();
		  Thread.sleep(3000);
  }
  @Test
  public void testMaingreetingfunctionality() throws InterruptedException
  {
	  
	  
	  
	  driver.findElement(By.id("lnkSTGreeting")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkTextToSpeech")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkTextToSpeech")).click();
	  Thread.sleep(3000);
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnConvert")).click();
	  //Test to check user is able to see validation when click on convert button without enter text on textbox.
	  String Actualresult = "Please enter your Text-to-speech Main Greeting text before you click Convert...";
	  String Exptedresult = driver.findElement(By.xpath("//label[contains(text(),'Please enter your Text-to-speech Main Greeting text before you click Convert...')]")).getText();
	  Thread.sleep(3000);
	  Assert.assertEquals(Actualresult, Exptedresult);
	  
	   WebElement dropdown = driver.findElement(By.id("ddlVoiceList")); // Replace with actual dropdown ID
       Select select = new Select(dropdown);

       // Select an option by visible text
       select.selectByVisibleText("Ivy");
      
       // Validate if the selected option is the expected one
       
       Assert.assertEquals(select.getFirstSelectedOption().getText(), "Ivy");
       
       // Get all options from the dropdown
       List<WebElement> options = select.getOptions();

       // Check if expected options are present
       Assert.assertEquals(options.size(), 8); // Change 4 to expected option count

       // Verify the text of each option if needed
       for (WebElement option : options) {
            Assert.assertTrue(option.getText().equals("Ivy") 
            		|| option.getText().equals("Joanna") || option.getText().equals("Joey")
            		|| option.getText().equals("Kendra") || option.getText().equals("Kimberly") 
            		|| option.getText().equals("Matthew")|| option.getText().equals("Salli") || option.getText().equals("Justin"));
           // Add assertions for each expected option text
       }

       WebElement audioPlayer = driver.findElement(By.id("TTSSampleGreet")); // Replace with actual audio player ID
       Assert.assertTrue(audioPlayer.isDisplayed());
       
       
       
	  Thread.sleep(3000);
	  driver.findElement(By.id("TTSText")).sendKeys("We provide several products/services. If you were billed by COA Network and do not recognize our name, it is likely that you are using one of our products/services that is labeled by one of our large clients or a reseller. If you have questions about your bill or need to cancel your account, please contact us at CustomerCare@COANetwork.com or call 1-800-454-5930.");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnConvert")).click();
	  Thread.sleep(3000);
	  //Test to check user is able to see the (File conversion in progress.) content after click on convert with entered text.
	  String actual2 = "File conversion in progress.";
	  Thread.sleep(3000);
	  String Expect2 = driver.findElement(By.xpath("//span[contains(text(),'File conversion in progress.')]")).getText();
     Assert.assertEquals(actual2, Expect2); 
      
	  
	
  }
  
  @Test
  public void testUploadAudioFile() throws InterruptedException
  {
	  
	  driver.findElement(By.id("lnkUAGreeting")).click();
	  Thread.sleep(3000);
	  String filePath = "C:\\Users\\Singanaboina Suresh\\Documents\\Greetings\\UNAVAILABLE_EXT_0006.GRE.WAV";
	  Thread.sleep(3000);
	  driver.findElement(By.id("fupGreeting1")).sendKeys(filePath);
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnSave")).click();
  }

  @AfterClass
  public void afterClass() {
  }

}
