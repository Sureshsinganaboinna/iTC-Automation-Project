package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestSmsvalidatiion {
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
  
  @Test (priority = 1)
  public void testSmsUIValidation() throws InterruptedException
  {
	  //Test to check user is able to see Add SMS icon
	  WebElement AddSmsicon = driver.findElement(By.xpath("//img[@class='new-txt-icon']")); 
	     Assert.assertTrue(AddSmsicon.isDisplayed(), "Add SMS icon is not present on the page");
	     
	     //Test to check user is able to see the New Text
	     String actualresult = "New Text";
	       String Expectedresult = driver.findElement(By.xpath("//span[contains(text(),'New Text')]")).getText();
	       Assert.assertEquals(actualresult, Expectedresult); 
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[contains(text(),'New Text')]")).click();
	       
	       //Test to check user is able to see the New Message Panel after click on New SMS.
	       WebElement NewMessagePanel = driver.findElement(By.xpath("//img[@class='new-txt-icon']")); 
		     Assert.assertTrue(NewMessagePanel.isDisplayed(), "NewMessagePanel is not present on the page");
		      Thread.sleep(3000);
		    //Test to check user is able to NewMessage Text over the panel.
		     String actualresult1 = "New Message";
		     String Expectedresult1 = driver.findElement(By.xpath("//*[@id='divNewMessage']/span[1]")).getText();
		     Assert.assertEquals(actualresult1, Expectedresult1);
		     
		     //Test to check user is able to see the SMS close panel.
		     
		     WebElement SMSclosepanel = driver.findElement(By.xpath("//span[contains(@id,'divSMSclose')]")); 
		     Assert.assertTrue(SMSclosepanel.isDisplayed(), "SMSclosepanel is not present on the page");
		     
		     //Test to check user is able to see the Contact symbol
		     
		     WebElement Contactsymbol = driver.findElement(By.xpath("//img[@class='user_small']")); 
		     Assert.assertTrue(Contactsymbol.isDisplayed(), "Contactsymbol is not present on the page");
		     
		     //Test to check user is able to see "To" text over the SMSpanel.
		     WebElement Totext = driver.findElement(By.xpath("//span[contains(text(),'New Message')]")); 
		     Assert.assertTrue(Totext.isDisplayed(), "Totext is not present on the page");
		     
		     //Test to check user is able see "textbox" for entering number.
		     WebElement textbox = driver.findElement(By.id("txtToNumber")); 
		     Assert.assertTrue(textbox.isDisplayed(), "textbox is not present on the page");
		     
		     //Test to check user is able see "Textareabox" for entering message.
		     WebElement Textareabox = driver.findElement(By.xpath("//*[@id='txtMsgText']")); 
		     Assert.assertTrue(Textareabox.isDisplayed(), "textbox is not present on the page");
		     
		     //Test to check user is able to see the SMS send img
		     WebElement SMSsendimg = driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")); 
		     Assert.assertTrue(SMSsendimg.isDisplayed(), "SMSsendimg is not present on the page");
		     
		     //Test to check user is able to see Uploadfile image
		     WebElement Uploadfile = driver.findElement(By.xpath("//*[@for='FUUploadMMS']")); 
		     Assert.assertTrue(Uploadfile.isDisplayed(), "Uploadfile is not present on the page");
		     
		     //Test to check user is able to see the "480 of 480 characters remaining" text.
		     WebElement charactersremaining = driver.findElement(By.xpath("//*[@for='FUUploadMMS']")); 
		     Assert.assertTrue(charactersremaining.isDisplayed(), "480 of 480 characters remaining is not present on the page");
		     
		     //Test to check user is able to see the "Counted as 0 message(s)" text
		     
		     WebElement Countedasmessage = driver.findElement(By.xpath("//*[@for='FUUploadMMS']")); 
		     Assert.assertTrue(Countedasmessage.isDisplayed(), "Countedasmessage is not present on the page");		     
		     //Test to check user is able to close the SMS panel by click on SMS close symbol
		     WebElement SMSclosepanel1 = driver.findElement(By.xpath("//span[contains(@id,'divSMSclose')]")); 
		     SMSclosepanel1.click();
  }
@ Test (priority = 2)
  public void testSMSfunctionalitiesandValidations() throws InterruptedException
  {
	  //Test to check user is able to see the phonenumber validation after click on Send image button without entering number.
	driver.findElement(By.xpath("//span[contains(text(),'New Text')]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();
	   Thread.sleep(3000);
	   String expectedresult = "Enter Phone in xxxxxxxxxx or xxx-xxx-xxxx or (xxx) xxx-xxxx format.";
	   
	   String actualresult = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
	   
	   Assert.assertEquals(expectedresult, actualresult);
	   
	 
	//Test to check user is able to see the phonenumber validation after click on send image with entering lessthen 10 digits.
	   
	   driver.findElement(By.id("txtToNumber")).sendKeys("877");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();

	   Thread.sleep(3000);
	   String expectedresult1 = "Use one of these formats for phone number xxxxxxxxxx, xxx-xxx-xxxx, (xxx) xxx-xxxx.";
	   
	   String actualresult1 = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
	   
	   Assert.assertEquals(expectedresult1, actualresult1);  
	   driver.findElement(By.id("txtToNumber")).clear();
	   
	//Test to check user is able to see blank validation message when click on img sending button without entering message.
	   driver.findElement(By.id("txtToNumber")).sendKeys("8446247684");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();
	   Thread.sleep(3000);

	   String expectedresult2 = "You cannot send a blank message.";
	   
	   String actualresult2 = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
	   
	   Assert.assertEquals(expectedresult2, actualresult2); 
	   
	   driver.findElement(By.id("txtToNumber")).clear();
	   
	   //test to check user is able to see Message sent successfull validation after sent sms.
	   
	   driver.findElement(By.id("txtToNumber")).sendKeys("8446247684");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='txtMsgText']")).sendKeys("Testing SMS by suresh");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();
	   String expectedresult3 = "Message sent successfully.";
	   String actualresult3 = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
	   Assert.assertEquals(expectedresult3, actualresult3); 
	   Thread.sleep(3000);
	   
	   WebElement SMSclosepanel1 = driver.findElement(By.xpath("//span[contains(@id,'divSMSclose')]")); 
	     SMSclosepanel1.click();
	
  }
  
  
  @AfterClass
  public void afterClass() {
  }

}
