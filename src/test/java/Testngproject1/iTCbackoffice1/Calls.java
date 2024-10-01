package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.util.SystemPropertyUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class Calls {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--use-fake-ui-for-media-stream");
      options.addArguments("--disable-notifications");
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver(options);
      driver.get("https://www.coasecure.com/");
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");
	      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");
	      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
	      driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
  }

  @Test (priority = 42)
  public void callForwarding() throws InterruptedException {
	  
	  SoftAssert softAssert = new SoftAssert();
	  driver.findElement(By.id("divSettings")).click();
	  
	  driver.findElement(By.id("lnkCallForwarding")).click();
	  
	   
	   if(driver.findElements(By.xpath("//*[@id='divContainerRight']/div[2]/div[1]/label/div[@class = 'toggle btn btn-primary']")).size()>0)
	   {
		   driver.findElement(By.xpath("//*[@id='divContainerRight']/div[2]/div[1]/label/div[@class = 'toggle btn btn-primary']")) .click();
		  
		   String Actualresult = "Callforwarding settings Updated Successfully.";
		   String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
		   softAssert.assertEquals(Actualresult, Expectedresult);
		  
	   }
	   
	   if(driver.findElements(By.xpath("//*[@id='divContainerRight']/div[2]/div[1]/label/div[@class = 'toggle btn btn-default off']")).size()>0)
	   {
		   driver.findElement(By.xpath("//*[@id='divContainerRight']/div[2]/div[1]/label/div[@class = 'toggle btn btn-default off']")) .click();
		  
		   driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
		  
		   String Actualresult = "Updated Successfully";
		   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
		   softAssert.assertEquals(Actualresult, Expectedresult);
		  
		   String ActualResult = "Call Forwarding";
		   String ExpectedResult = driver.findElement(By.xpath("//span[contains(text(),'Call Forwarding')]")).getText();
		   softAssert.assertEquals(ExpectedResult, ActualResult);
		  
		   String ActualResult1 = "Call Forwarding for (877) 378-9517 is:";
		   String ExpectedResult1 = driver.findElement(By.xpath("//*[contains(text(),'Call Forwarding for (877) 378-9517 is:')]")).getText();
		   softAssert.assertEquals(ExpectedResult1, ActualResult1);
		  
		   String ActualResult11 = "Do Not Disturb is:";
		   String ExpectedResult11 = driver.findElement(By.xpath("//*[contains(text(),'Do Not Disturb is:')]")).getText();
		   softAssert.assertEquals(ExpectedResult11, ActualResult11);
		  
		   String ActualResult111 = "Call Forwarding Options";
		   String ExpectedResult111 = driver.findElement(By.xpath("//*[contains(text(),'Call Forwarding Options')]")).getText();
		   softAssert.assertEquals(ExpectedResult111, ActualResult111);
		  
		   String ActualResult1111 = "When Someone Calls";
		   String ExpectedResult1111 = driver.findElement(By.xpath("//*[contains(text(),'When Someone Calls')]")).getText();
		   softAssert.assertEquals(ExpectedResult1111, ActualResult1111);
		  
		   String ActualResult11111 = "Display ";
		   String ExpectedResult11111 = driver.findElement(By.xpath("//*[contains(text(),'Display ')]")).getText();
		   softAssert.assertEquals(ExpectedResult11111, ActualResult11111);
		  
		   String ActualResult111111 = "as Caller ID when I get a call forwarded to me ";
		   String ExpectedResult111111 = driver.findElement(By.xpath("//*[contains(text(),'as Caller ID when I get a call forwarded to me ')]")).getText();
		   softAssert.assertEquals(ExpectedResult111111, ActualResult111111);
		  
		   String ActualResult1111111 = "Call Forwarding Numbers and Schedules";
		   String ExpectedResult1111111 = driver.findElement(By.xpath("//*[contains(text(),'Call Forwarding Numbers and Schedules')]")).getText();
		   softAssert.assertEquals(ExpectedResult1111111, ActualResult1111111);
		  
		   String ActualResult11111111 = "On-Hold Music";
		   String ExpectedResult11111111 = driver.findElement(By.xpath("//*[contains(text(),'On-Hold Music')]")).getText();
		   softAssert.assertEquals(ExpectedResult11111111, ActualResult11111111);
		  
		   String ActualResult111111111 = "Softphone / Mobile App";
		   String ExpectedResult111111111 = driver.findElement(By.xpath("//*[contains(text(),'Softphone / Mobile App')]")).getText();
		   softAssert.assertEquals(ExpectedResult111111111, ActualResult111111111);
		   WebElement imageElement = driver.findElement(By.xpath("//a[@id='aCLSort1']/img[@src='Images/bars45.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageElement.isDisplayed(), "Image is displayed on the page");
		      WebElement imageedit = driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageedit.isDisplayed(), "Image is displayed on the page");
		  
		   String ActualResult1111111111 = "Call Forwarding Phone";
		   String ExpectedResult1111111111 = driver.findElement(By.xpath("//*[@id='divlblCLPhone2']")).getText();
		   softAssert.assertEquals(ExpectedResult1111111111, ActualResult1111111111);
		   WebElement imageElement1 = driver.findElement(By.xpath("//a[@id='aCLSort2']/img[@src='Images/bars45.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageElement1.isDisplayed(), "Image is displayed on the page");
		      WebElement imageedit1 = driver.findElement(By.xpath("//a[@id='aCLEdit2']/img[@src='Images/edit_icon_img.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageedit1.isDisplayed(), "Image is displayed on the page");
		  
		   String ActualResult11111111111 = "Call Forwarding Phone";
		   String ExpectedResult11111111111 = driver.findElement(By.xpath("//*[@id='divlblCLPhone3']")).getText();
		   softAssert.assertEquals(ExpectedResult11111111111, ActualResult11111111111);
		   WebElement imageElement2 = driver.findElement(By.xpath("//a[@id='aCLSort3']/img[@src='Images/bars45.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageElement2.isDisplayed(), "Image is displayed on the page");
		      WebElement imageedit2 = driver.findElement(By.xpath("//a[@id='aCLEdit3']/img[@src='Images/edit_icon_img.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageedit2.isDisplayed(), "Image is displayed on the page");
		  
		   String ActualResult111111111111 = "Call Forwarding Phone";
		   String ExpectedResult111111111111 = driver.findElement(By.xpath("//*[@id='divlblCLPhone4']")).getText();
		   softAssert.assertEquals(ExpectedResult111111111111, ActualResult111111111111);
		   WebElement imageElement4 = driver.findElement(By.xpath("//a[@id='aCLSort4']/img[@src='Images/bars45.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageElement4.isDisplayed(), "Image is displayed on the page");
		      WebElement imageedit4 = driver.findElement(By.xpath("//a[@id='aCLEdit4']/img[@src='Images/edit_icon_img.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageedit4.isDisplayed(), "Image is displayed on the page");
		      
		  
		   String ActualResult1111111111111 = "Call Forwarding Phone";
		   String ExpectedResult1111111111111 = driver.findElement(By.xpath("//*[@id='divlblCLPhone5']")).getText();
		   softAssert.assertEquals(ExpectedResult1111111111111, ActualResult1111111111111);
		   WebElement imageElement5 = driver.findElement(By.xpath("//a[@id='aCLSort5']/img[@src='Images/bars45.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageElement5.isDisplayed(), "Image is displayed on the page");
		      WebElement imageedit5 = driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageedit5.isDisplayed(), "Image is displayed on the page");
		  
		   String ActualResult11111111111111 = "Call Forwarding Phone";
		   String ExpectedResult11111111111111 = driver.findElement(By.xpath("//*[@id='divlblCLPhone6']")).getText();
		   softAssert.assertEquals(ExpectedResult11111111111111, ActualResult11111111111111);
		   WebElement imageElement6 = driver.findElement(By.xpath("//a[@id='aCLSort6']/img[@src='Images/bars45.png']"));
		      // Verify whether the image is displayeds
		      Assert.assertTrue(imageElement6.isDisplayed(), "Image is displayed on the page");
		      WebElement imageedit6 = driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']"));
		      // Verify whether the image is displayed
		      Assert.assertTrue(imageedit6.isDisplayed(), "Image is displayed on the page");
	   }
  }
  @Test (priority = 43)
  public void DonotDisturbToogles() throws InterruptedException
  {
	  SoftAssert softAssert = new SoftAssert();
	  
	   
		if(driver.findElements(By.xpath("//*[@id='divCLMain']/div[1]/div/div[1]/label/div[@class='toggle btn btn-primary']")).size()>0)
				{ 
		  String ActualResult = "Note:";
		   String ExpectedResult = driver.findElement(By.xpath("//*[@id='divlblCLPhone6']")).getText();
		   softAssert.assertEquals(ExpectedResult, ActualResult);
		  
	  
		  
	  String ExpectedResult2 = "All callers attempting to connect to you directly are currently hearing your Unavailable Greeting and going to voicemail.";
	  String ActualResult2 = driver.findElement(By.xpath("//*[contains(text(),'All callers attempting to connect to you directly are currently hearing your Unavailable Greeting and going to voicemail.')]")).getText();
	  softAssert.assertEquals(ActualResult2, ExpectedResult2);
	  
	 
	  driver.findElement(By.xpath("//*[@id='divCLMain']/div[1]/div/div[1]/label/div[@class='toggle btn btn-primary']")).click();
	 
	  
	  driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
	  
	   String Actualresult = "Updated Successfully";
	   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
	   softAssert.assertEquals(Actualresult, Expectedresult);
	  
	   driver.findElement(By.xpath("//*[@id='divCLMain']/div[1]/div/div[1]/label/div[@class='toggle btn btn-default off']"));
	   
		}
	  
	  if(driver.findElements(By.xpath("//*[@id='divCLMain']/div[1]/div/div[1]/label/div[@class='toggle btn btn-default off']")).size()>0)
	  {
		  driver.findElement(By.xpath("//*[@id='divCLMain']/div[1]/div/div[1]/label/div[@class='toggle btn btn-default off']")).click();
		 
		  driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
		  
		   String Actualresult = "Updated Successfully";
		   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
		   softAssert.assertEquals(Actualresult, Expectedresult);
		  
		   driver.findElement(By.xpath("//*[@id='divCLMain']/div[1]/div/div[1]/label/div[@class='toggle btn btn-primary']"));
		  
		   String ActualResult = "Note:";
		   String ExpectedResult = driver.findElement(By.xpath("//*[@id='divlblCLPhone6']")).getText();
		   softAssert.assertEquals(ExpectedResult, ActualResult);
		  
	  String ExpectedResult2 = "All callers attempting to connect to you directly are currently hearing your Unavailable Greeting and going to voicemail.";
	  String ActualResult2 = driver.findElement(By.xpath("//*[contains(text(),'All callers attempting to connect to you directly are currently hearing your Unavailable Greeting and going to voicemail.')]")).getText();
	  softAssert.assertEquals(ActualResult2, ExpectedResult2);
	  }
	  
  }
  
  @Test (priority = 44)
  public void someOneCallsDropDown() throws InterruptedException
  {
	
	  SoftAssert softAssert = new SoftAssert();
	
	   WebElement dropdown5 = driver.findElement(By.id("ddlDirectConnect"));
	    Select select = new Select(dropdown5);
	    String defaultSelectedOption = select.getFirstSelectedOption().getText();
	    softAssert.assertEquals(defaultSelectedOption, "Connect them directly to me without playing my main greeting");
	   
	    if(defaultSelectedOption.contains("Connect them directly to me without playing my main greeting"))
	    {
	   ////////////////////////////////////////////////////////////////////////////////
	  WebElement dropdown = driver.findElement(By.id("ddlDirectConnect")); // Replace "dropdown" with your dropdown element's ID
      // Get all options from the dropdown
      List<WebElement> options = dropdown.findElements(By.tagName("option"));
      // Actual count of options
      int actualCount = options.size();	
      System.out.println(actualCount);
      // Expected count of options
      int expectedCount = 2; // Change this to your expected count
      // Assert the count of options
      softAssert.assertEquals(actualCount, expectedCount, "Dropdown option count mismatch");
      /////////////////////////////////////////////////////////////////////////////////////
	  WebElement dropdown1 = driver.findElement(By.id("ddlDirectConnect"));
	  Select select1 = new Select(dropdown1);
	  select1.selectByVisibleText("Play my main greeting, then prompt them to press \"0\" to speak to me");
	   
	  String selectedOption = select1.getFirstSelectedOption().getText();
	 softAssert.assertEquals(selectedOption, "Play my main greeting, then prompt them to press \"0\" to speak to me");
	   
	    
	    driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
		  
		   String Actualresult = "Updated Successfully";
		   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
		   softAssert.assertEquals(Actualresult, Expectedresult);
		   
		    WebElement dropdown51 = driver.findElement(By.id("ddlDirectConnect"));
		    Select select2 = new Select(dropdown51);
		    String defaultSelectedOption1 = select2.getFirstSelectedOption().getText();
		    softAssert.assertEquals(defaultSelectedOption1, "Play my main greeting, then prompt them to press \"0\" to speak to me");
		   
	    
	    }
	    /////////////////////////////////
	    WebElement dropdown51 = driver.findElement(By.id("ddlDirectConnect"));
	    Select select1 = new Select(dropdown51);
	    String defaultSelectedOption1 = select1.getFirstSelectedOption().getText();
	    softAssert.assertEquals(defaultSelectedOption1, "Play my main greeting, then prompt them to press \"0\" to speak to me");
	   
	    if(defaultSelectedOption1.contains("Play my main greeting, then prompt them to press \"0\" to speak to me"))
	    {
	   ////////////////////////////////////////////////////////////////////////////////
	  WebElement dropdown = driver.findElement(By.id("ddlDirectConnect")); // Replace "dropdown" with your dropdown element's ID
      // Get all options from the dropdown
      List<WebElement> options = dropdown.findElements(By.tagName("option"));
      // Actual count of options
      int actualCount = options.size();	
      System.out.println(actualCount);
      // Expected count of options
      int expectedCount = 2; // Change this to your expected count
      // Assert the count of options
      softAssert.assertEquals(actualCount, expectedCount, "Dropdown option count mismatch");
      /////////////////////////////////////////////////////////////////////////////////////
	  WebElement dropdown1 = driver.findElement(By.id("ddlDirectConnect"));
	  Select select11 = new Select(dropdown1);
	  select11.selectByVisibleText("Connect them directly to me without playing my main greeting");
	   
	   
		 
	    driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
		  
		   String Actualresult = "Updated Successfully";
		   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
		   softAssert.assertEquals(Actualresult, Expectedresult);
		 
		  
	    }
	    
	    softAssert.assertAll();
  }
 
  @Test (priority = 45)
  public void displayTest() throws InterruptedException
  {
	  SoftAssert softAssert = new SoftAssert();
	
	
	 
	  WebElement dropdown5 = driver.findElement(By.id("ddlCallerDisply"));
	    Select select = new Select(dropdown5);
	    String defaultSelectedOption = select.getFirstSelectedOption().getText();
	    
	    if(defaultSelectedOption.contains("My iTeleCenter Number")) {
	    
	    softAssert.assertEquals(defaultSelectedOption, "My iTeleCenter Number");
	   
	   ////////////////////////////////////////////////////////////////////////////////
	  WebElement dropdown = driver.findElement(By.id("ddlCallerDisply")); // Replace "dropdown" with your dropdown element's ID
    // Get all options from the dropdown
    List<WebElement> options = dropdown.findElements(By.tagName("option"));
    // Actual count of options
    int actualCount = options.size();
    System.out.println(actualCount);
    // Expected count of options
    int expectedCount = 2; // Change this to your expected count
    // Assert the count of options
    softAssert.assertEquals(actualCount, expectedCount, "Dropdown option count mismatch");
    /////////////////////////////////////////////////////////////////////////////////////
	  WebElement dropdown1 = driver.findElement(By.id("ddlCallerDisply"));
	  Select select1 = new Select(dropdown1);
	    	 select1.selectByVisibleText("Caller's Number");
	 
	 
	  driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
	  
	   String Actualresult = "Updated Successfully";
	   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
	   softAssert.assertEquals(Actualresult, Expectedresult);
	   
	    WebElement dropdown3 = driver.findElement(By.id("ddlCallerDisply"));
		  Select select3 = new Select(dropdown3);
		    try {	
		  select3.selectByVisibleText("Caller's Number");
		  String selectedOption = select3.getFirstSelectedOption().getText();
    	  softAssert.assertEquals(selectedOption, "Caller's Number");
		    }
		    catch(StaleElementReferenceException e)
		    {
		    	WebElement dropdown4 = driver.findElement(By.id("ddlCallerDisply"));
				  Select select4 = new Select(dropdown4);
		    	select4.selectByVisibleText("Caller's Number");
		    	String selectedOption = select4.getFirstSelectedOption().getText();
		    	  softAssert.assertEquals(selectedOption, "Caller's Number");
		    }
		    	  
		
	    }
	    if(defaultSelectedOption.contains("Caller's Number")) {
		    
		    softAssert.assertEquals(defaultSelectedOption, "Caller's Number");
		   
		   ////////////////////////////////////////////////////////////////////////////////
		  WebElement dropdown = driver.findElement(By.id("ddlCallerDisply")); // Replace "dropdown" with your dropdown element's ID
	    // Get all options from the dropdown
	    List<WebElement> options = dropdown.findElements(By.tagName("option"));
	    // Actual count of options
	    int actualCount = options.size();
	    System.out.println(actualCount);
	    // Expected count of options
	    int expectedCount = 2; // Change this to your expected count
	    // Assert the count of options
	    softAssert.assertEquals(actualCount, expectedCount, "Dropdown option count mismatch");
	    /////////////////////////////////////////////////////////////////////////////////////
		  WebElement dropdown1 = driver.findElement(By.id("ddlCallerDisply"));
		  Select select1 = new Select(dropdown1);
		  select1.selectByVisibleText("My iTeleCenter Number");
		 
		  driver.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$btnCLSave']")).click();
		  
		   String Actualresult = "Updated Successfully";
		   String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
		   softAssert.assertEquals(Actualresult, Expectedresult);
		   
		
		    WebElement dropdown2 = driver.findElement(By.id("ddlCallerDisply"));
			  Select select2 = new Select(dropdown2);
			  try {
			  select2.selectByVisibleText("My iTeleCenter Number");
			  String selectedOption = select2.getFirstSelectedOption().getText();
			  softAssert.assertEquals(selectedOption, "My iTeleCenter Number");
			  
			  }
			  catch(StaleElementReferenceException e)
			  {
				    WebElement dropdown3 = driver.findElement(By.id("ddlCallerDisply"));
					  Select select3 = new Select(dropdown3);
				  select3.selectByVisibleText("My iTeleCenter Number");
				  String selectedOption = select3.getFirstSelectedOption().getText();
				  softAssert.assertEquals(selectedOption, "My iTeleCenter Number");
			  }
			 
		
	    }
	    
	    softAssert.assertAll();  
  }
  
  @Test (priority = 46)
  public void testCasesforuploadMp3Wav() throws InterruptedException
  {
	  
	  SoftAssert softAssert = new SoftAssert();
	 
	   driver.findElement(By.id("aChangeGreeting")).click();
	  String Expectedresult = "Default Audio";
	 
	  String Actualresult = driver.findElement(By.id("lnkDefaultAudio")).getText();
	  softAssert.assertEquals(Actualresult, Expectedresult);
	 
	  String Expectedresult1 = "Upload WAV/MP3";
	  String Actualresult1 = driver.findElement(By.id("lnkUploadAudio")).getText();
	  softAssert.assertEquals(Actualresult1, Expectedresult1);
	 
	  String Expectedresult11 = "Record On Phone";
	  String Actualresult11 = driver.findElement(By.id("lnkRecordOnPhone")).getText();
	  softAssert.assertEquals(Actualresult11, Expectedresult11);
	 
	  
	  driver.findElement(By.id("lnkUploadAudio")).click();
	 
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	  String Expectedresult111 = "Upload Audio File";
	  String Actualresult111 = driver.findElement(By.xpath("//*[contains(text(),'Upload Audio File')]")).getText();
	  softAssert.assertEquals(Actualresult111, Expectedresult111);
	 
	  
	  String Expectedresult1111 = "Note:";
	  String Actualresult1111 = driver.findElement(By.xpath("//*[@id='divUploadAudio']/div[3]/span")).getText();
	  softAssert.assertEquals(Actualresult1111, Expectedresult1111);
	 
	  String Expectedresult11111 = "Supported Formats: WAV/MP3";
	  String Actualresult11111 = driver.findElement(By.xpath("//*[contains(text(),'Supported Formats: WAV/MP3')]")).getText();
	  softAssert.assertEquals(Actualresult11111, Expectedresult11111);
	 
	  System.out.println(Actualresult11111);
	  
	  String Expectedresult111111 = "Note: Your new greeting may not be functional for a few minutes after uploading it.";
	  String Actualresult111111 = driver.findElement(By.xpath("//*[@id='divUploadAudio']/div[3]")).getText();
	  softAssert.assertEquals(Actualresult111111, Expectedresult111111);
	  
	  System.out.println(Actualresult111111);
	  
	  String Expectedresult1111111 = "Note: Please visit our Voice Studio (Greeting/Voice Studio ) for more recording options.";
	  String Actualresult1111111 = driver.findElement(By.xpath("//*[@id='divCLFOnHold']/div[5]")).getText();
	  softAssert.assertEquals(Actualresult1111111, Expectedresult1111111);
	 
	
	  
	  driver.findElement(By.id("btnOnHoldSave")).click();
	  String Actualresult2 = "Enter the path for the file you wish to upload in the Upload File text box or click the Browse button to find the file.";
	  String Expectedresult2 = driver.findElement(By.xpath("//label[contains(text(),'Enter the path for the file you wish to upload in the Upload File text box or click the Browse button to find the file.')]")).getText();
	  softAssert.assertEquals(Actualresult2, Expectedresult2);
	 
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	  driver.findElement(By.id("fupGreeting")).sendKeys("C:\\Users\\Singanaboina Suresh\\Documents\\Greetings\\Toofan-BGM.mp3");
	 
	  driver.findElement(By.id("btnOnHoldSave")).click();
	  String Actualresult22 = "Updated Successfully";
	  String Expectresult22 = driver.findElement(By.xpath("//label[contains(text(),'Updated Successfully')]")).getText();
	  softAssert.assertEquals(Actualresult22, Expectresult22);
	 
	   softAssert.assertAll();
  }
  
  @Test (priority = 47)
  public void callForwardRecordViaPhoneUI() throws InterruptedException
  {
	  SoftAssert softAssert = new SoftAssert();
	 
	 driver.findElement(By.id("aChangeGreeting")).click();
	 
	  driver.findElement(By.id("lnkRecordOnPhone")).click();
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	  String Actualresult6 = "I will record my On-Hold Message on the phone";
	  String Expectedresult6 = driver.findElement(By.xpath("//*[@id='divRecordOnPhone']/div[1][contains(text(),'I will record my On-Hold Message on the phone')]")).getText();
	  softAssert.assertEquals(Actualresult6, Expectedresult6);
	 
	  String Actualresult61 = "Call your iTeleCenter Number.";
	  String Expectedresult61 = driver.findElement(By.xpath("//*[@id='divRecordOnPhone']/div[2][contains(text(),'Call your iTeleCenter Number.')]")).getText();
	  softAssert.assertEquals(Actualresult61, Expectedresult61);
	 
	  String Actualresult611 = "At the Greeting press * and enter your 4 to 6 digit passcode.";
	  String Expectedresult611 = driver.findElement(By.xpath("//*[@id='divRecordOnPhone']/div[3][contains(text(),'At the Greeting press * and enter your 4 to 6 digit passcode. ')]")).getText();
	  softAssert.assertEquals(Actualresult611, Expectedresult611);
	 
	  String Actualresult6111 = "Follow these prompts:\n"
	  		+ "Press 4 to Modify your Configuration\n"
	  		+ "Press 6 to Manage your Call Forwarding\n"
	  		+ "Press 5 to Record your On-hold message";
	  String Expectedresult6111 = driver.findElement(By.xpath("//*[@id='divRecordOnPhone']/div[4]")).getText();
	  softAssert.assertEquals(Actualresult6111, Expectedresult6111);
	 
	 
	  String Expectedresult1111111 = "Note: Please visit our Voice Studio (Greeting/Voice Studio ) for more recording options.";
	  String Actualresult1111111 = driver.findElement(By.xpath("//*[@id='divCLFOnHold']/div[5]")).getText();
	  softAssert.assertEquals(Actualresult1111111, Expectedresult1111111);

	   softAssert.assertAll();
	   
  }
  
  @Test (priority = 48)
  public void callforwardDefaultAudio() throws InterruptedException
  {
	  SoftAssert softAssert = new SoftAssert();
	  driver.findElement(By.id("divSettings")).click();
	  
	  driver.findElement(By.id("lnkCallForwarding")).click();
	  
	  driver.findElement(By.id("aChangeGreeting")).click();
	  String Actualresult = "Select a On-Hold Audio";
	  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Select a On-Hold Audio')]")).getText();
	  softAssert.assertEquals(Actualresult, Expectedresult);
	 
	  String Expectedresult1111111 = "Note: Please visit our Voice Studio (Greeting/Voice Studio ) for more recording options.";
	  String Actualresult1111111 = driver.findElement(By.xpath("//*[@id='divCLFOnHold']/div[5]")).getText();
	  softAssert.assertEquals(Actualresult1111111, Expectedresult1111111);
	 
	  WebElement audioPlayer =  driver.findElement(By.id("aAudio"));
	  audioPlayer.isDisplayed();
	 
	  WebElement dropdown = driver.findElement(By.id("DDLPreRec"));
	  
	 
	  
	  List<WebElement> options = dropdown.findElements(By.tagName("option"));

	    // Actual count of options

	    int actualCount = options.size();
	    for (WebElement option : options){
	     
		   System.out.println(option.getText());
	   }
	  System.err.println(actualCount);
	 
	  Select select = new Select(driver.findElement(By.id("DDLPreRec")));
	 select.selectByVisibleText("Morning Seascape");
	 String selectedoption = select.getFirstSelectedOption().getText();
	 if(selectedoption.contains("Morning Seascape"))
	 {
		 Select select1 = new Select(driver.findElement(By.id("DDLPreRec")));
		 select1.selectByVisibleText("Ringtone");
		
		  driver.findElement(By.id("btnOnHoldSave")).click();
		 
		  String Actualresult1 = "Updated Successfully";
		  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Updated Successfully')]")).getText();
		  softAssert.assertEquals(Actualresult1, Expectedresult1);
		 
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
		try {
			  select1.selectByVisibleText("Ringtone");
			  String selectedOption = select1.getFirstSelectedOption().getText();
			  softAssert.assertEquals(selectedOption, "Ringtone");
		}
		catch(StaleElementReferenceException e)
		{
				 WebElement dropdown3 = driver.findElement(By.id("DDLPreRec"));
				  Select select3 = new Select(dropdown3);
			  select3.selectByVisibleText("Ringtone");
			  String selectedOption = select3.getFirstSelectedOption().getText();
			  softAssert.assertEquals(selectedOption, "Ringtone");
		}
		 
		  
	 }
	
	  Select select1 = new Select(driver.findElement(By.id("DDLPreRec")));
		 select1.selectByVisibleText("Ringtone");
		 String selectedoption1 = select1.getFirstSelectedOption().getText();
	 if(selectedoption1.contains("Ringtone"))
	 {
		 Select select11 = new Select(driver.findElement(By.id("DDLPreRec")));
		 select11.selectByVisibleText("Morning Seascape");
		
		  driver.findElement(By.id("btnOnHoldSave")).click();
		 
		  String Actualresult1 = "Updated Successfully";
		  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Updated Successfully')]")).getText();
		  softAssert.assertEquals(Actualresult1, Expectedresult1);
		 
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
			try {
				  select1.selectByVisibleText("Morning Seascape");
				  String selectedOption = select1.getFirstSelectedOption().getText();
				  softAssert.assertEquals(selectedOption, "Morning Seascape");
			}
			catch(StaleElementReferenceException e)
			{
					 WebElement dropdown3 = driver.findElement(By.id("DDLPreRec"));
					  Select select3 = new Select(dropdown3);
				  select3.selectByVisibleText("Morning Seascape");
				  String selectedOption = select3.getFirstSelectedOption().getText();
				  softAssert.assertEquals(selectedOption, "Morning Seascape");
			}
			 
		  
	 }
	 

	  
	  softAssert.assertAll();
  }
  
  @Test (priority = 49)
  public void editSoftphone() throws InterruptedException
  {
	  SoftAssert softAssert = new SoftAssert();
	  driver.findElement(By.id("divSettings")).click();
	  
	  driver.findElement(By.id("lnkCallForwarding")).click();
	  
	  
	  WebElement imageElement = driver.findElement(By.xpath("//a[@id='aCLSort1']/img[@src='Images/bars45.png']"));
      // Verify whether the image is displayed
      Assert.assertTrue(imageElement.isDisplayed(), "Image is displayed on the page");
      driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
	 
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
	  String Actualresult = "Dial me on number: N/A";
	  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Dial me on number: ')]")).getText();
      softAssert.assertEquals(Actualresult, Expectedresult);
         
      String Actualresult1 = "Dial me on number: N/A";
	  String Expectedresult1 = driver.findElement(By.xpath("//*[@id='Dialmeonnumber1']")).getText();
      softAssert.assertEquals(Actualresult1, Expectedresult1);
      
      String Actualresult11 = "Wait for me to answer for \n"
      		+ " \n"
      		+ "1 ring (6 sec.)\n"
      		+ " 2 rings (12 sec.)\n"
      		+ " 3 rings (18 sec.)\n"
      		+ " 4 rings (24 sec.)\n"
      		+ " 5 rings (30 sec.)\n"
      		+ " 6 rings (36 sec.)\n"
      		+ " 7 rings (42 sec.)\n"
      		+ " 8 rings (48 sec.)\n"
      		+ " 9 rings (54 sec.)\n"
      		+ " 10 rings (60 sec.)\n"
      		+ "before giving up";
	  String Expectedresult11 = driver.findElement(By.xpath("//*[@id='divCLEdit1']/div/div[1]/div[2]/*[contains(text(),'Wait for me to answer for')]")).getText();
      softAssert.assertEquals(Actualresult11, Expectedresult11);
      
      System.out.println(Expectedresult11);
      
      Select select = new Select(driver.findElement(By.id("ddlDisconnectTime1")));
      select.selectByVisibleText("3 rings (18 sec.)");
      
      String selectedoption = select.getFirstSelectedOption().getText();
 	 if(selectedoption.contains("3 rings (18 sec.)"))
 	 {
 		 Select select1 = new Select(driver.findElement(By.id("ddlDisconnectTime1")));
 		
 		 select1.selectByVisibleText("6 rings (36 sec.)");
 		  driver.findElement(By.id("btnSaveCLF1")).click();
 		 
 		  String Actualresult111 = "Callforwarding settings Updated Successfully.";
 		  String Expectedresult111 = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
 		  softAssert.assertEquals(Actualresult111, Expectedresult111);
 		 
 		 driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
 		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
 		try {
 			  select1.selectByVisibleText("6 rings (36 sec.)");
 			  String selectedOption = select1.getFirstSelectedOption().getText();
 			  softAssert.assertEquals(selectedOption, "6 rings (36 sec.)");
 		}
 		catch(StaleElementReferenceException e)
 		{
 				 WebElement dropdown3 = driver.findElement(By.id("ddlDisconnectTime1"));
 				  Select select3 = new Select(dropdown3);
 			  select3.selectByVisibleText("6 rings (36 sec.)");
 			  String selectedOption = select3.getFirstSelectedOption().getText();
 			  softAssert.assertEquals(selectedOption, "6 rings (36 sec.)");
 		}
 		 
 	 }
      
 	 Select select1 = new Select(driver.findElement(By.id("ddlDisconnectTime1")));
     select1.selectByVisibleText("6 rings (36 sec.)");
     String selectedoption1 = select1.getFirstSelectedOption().getText();
	 if(selectedoption1.contains("6 rings (36 sec.)"))
	 {
		 Select select11 = new Select(driver.findElement(By.id("ddlDisconnectTime1")));
		
		 select11.selectByVisibleText("3 rings (18 sec.)");
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
		  driver.findElement(By.id("btnSaveCLF1"));
		  String Actualresult111 = "Callforwarding settings Updated Successfully.";
		  String Expectedresult111 = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
		  softAssert.assertEquals(Actualresult111, Expectedresult111);
		 
			 driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
		try {
			  select11.selectByVisibleText("3 rings (18 sec.)");
			  String selectedOption = select11.getFirstSelectedOption().getText();
			  softAssert.assertEquals(selectedOption, "3 rings (18 sec.)");
		}
		catch(StaleElementReferenceException e)
		{
				 WebElement dropdown3 = driver.findElement(By.id("ddlDisconnectTime1"));
				  Select select3 = new Select(dropdown3);
			  select3.selectByVisibleText("3 rings (18 sec.)");
			  String selectedOption = select3.getFirstSelectedOption().getText();
			  softAssert.assertEquals(selectedOption, "3 rings (18 sec.)");
		}
	 }
	 
	  String Actualresult111 = "Prompt me to accept or reject each call:";
	  String Expectedresult111 = driver.findElement(By.xpath("//*[contains(text(),'Prompt me to accept or reject each call:')]")).getText();
	  softAssert.assertEquals(Actualresult111, Expectedresult111);
	  if(driver.findElements(By.xpath("//*[@id='divCLEdit1']/div/div[1]/div[3]/label/div[@class='toggle btn btn-default off']")).size()>0)
	  {
		  driver.findElement(By.xpath("//*[@id='divCLEdit1']/div/div[1]/div[3]/label/div[@class='toggle btn btn-default off']")).click();
		 
		  String Actualresult2 = "Prompt the caller to record their name:";
		  String Expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Prompt the caller to record their name:')]")).getText();
		  softAssert.assertEquals(Actualresult2, Expectedresult);
		  driver.findElement(By.xpath("//*[@id='divCLPrompt1']/label/div[@class='toggle btn btn-default off']")).click();
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-550)");
		 
		  driver.findElement(By.id("btnSaveCLF1")).click();
		  String Actualresult3 = "Callforwarding settings Updated Successfully.";
		  String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
		  softAssert.assertEquals(Actualresult3, Expectedresult3);
		 
		  driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
		 
		  driver.findElement(By.xpath("//*[@id='divCLPrompt1']/label/div[@class='toggle btn btn-primary']"));
	  }
	  if(driver.findElements(By.xpath("//*[@id='divCLEdit1']/div/div[1]/div[3]/label/div[@class='toggle btn btn-primary']")).size()>0)
	  {
		 
		  driver.findElement(By.xpath("//*[@id='divCLEdit1']/div/div[1]/div[3]/label/div[@class='toggle btn btn-primary']")).click();
		 
		  driver.findElement(By.id("btnSaveCLF1")).click();
		  String Actualresult3 = "Callforwarding settings Updated Successfully.";
		  String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
		  softAssert.assertEquals(Actualresult3, Expectedresult3);
		 
		  driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
		 
		  driver.findElement(By.xpath("//*[@id='divCLPrompt1']/label/div[@class='toggle btn btn-default off']"));
	  }
	  String Actualresult2 = "Call Recording:";
	  String Expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Call Recording:')]")).getText();
	  softAssert.assertEquals(Actualresult2, Expectedresult2);
	 
	  
	  if(driver.findElements(By.xpath("//*[@id='lblCLFRecord01']/div[@class='toggle btn btn-primary']")).size()>0)
	  {
		  driver.findElement(By.xpath("//*[@id='lblCLFRecord01']/div[@class='toggle btn btn-primary']")).click();
	  
	 
	  driver.findElement(By.id("btnSaveCLF1")).click();
	  String Actualresult3 = "Callforwarding settings Updated Successfully.";
	  String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
	  softAssert.assertEquals(Actualresult3, Expectedresult3);
	 
	  driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
	 
	  driver.findElement(By.xpath("//*[@id='lblCLFRecord01']/div[@class='toggle btn btn-default off']")).click();
	  
	  }
	  
	  if(driver.findElements(By.xpath("//*[@id='lblCLFRecord01']/div[@class='toggle btn btn-default off']")).size()>0)
	  {
		  driver.findElement(By.xpath("//*[@id='lblCLFRecord01']/div[@class='toggle btn btn-default off']")).click();
	  
	 
	  driver.findElement(By.id("btnSaveCLF1")).click();
	  String Actualresult3 = "Callforwarding settings Updated Successfully.";
	  String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Callforwarding settings Updated Successfully.')]")).getText();
	  softAssert.assertEquals(Actualresult3, Expectedresult3);
	 
	  driver.findElement(By.xpath("//a[@id='aCLEdit1']/img[@src='Images/edit_icon_img.png']")).click();
	 
	  driver.findElement(By.xpath("//*[@id='lblCLFRecord01']/div[@class='toggle btn btn-primary']")).click();
	  
	  }
	  String ActualCallforwardingschedule = "Call Forwarding Schedule:";
	  String ExpectedCallforwardingschedule = driver.findElement(By.xpath("//*[@id='divCLEdit1']/div/div[2]/div[1]/div")).getText();
	  softAssert.assertEquals(ActualCallforwardingschedule, ExpectedCallforwardingschedule);
	  
	  String ActualTimeZone = "Your time zone is (GMT-05:00) Eastern Time (US & Canada)";
	  String ExpectedTimezone = driver.findElement(By.xpath("//*[@id='spCL1TimeZone']")).getText();
	  softAssert.assertEquals(ActualTimeZone, ExpectedTimezone);
	 
	  if(driver.findElements(By.xpath("//*[@id='divCLEdit1']/div/div[2]/div[1]/label/div[@class='toggle btn btn-primary']")).size()>0)
	  {
		  driver.findElement(By.xpath("//*[@id='divCLEdit1']/div/div[2]/div[1]/label/div[@class='toggle btn btn-primary']")).click();
		 
          String ActualDays = "Select Working days\n"
          		+ "SUN\n"
          		+ "MON\n"
          		+ "TUE\n"
          		+ "WED\n"
          		+ "THU\n"
          		+ "FRI\n"
          		+ "SAT";
          String ExpectedeDays = driver.findElement(By.xpath("//*[@id='divCL1S1']/div[1]/div[1]")).getText();
          System.out.println(ExpectedeDays);
          softAssert.assertEquals(ActualDays, ExpectedeDays);

          String ActualFromTime = "From";
		  String ExpectedFromTime = driver.findElement(By.xpath("//*[@id='divStartCL1S1']/div[contains(text(),'From')]")).getText();
		  softAssert.assertEquals(ActualFromTime, ExpectedFromTime);
		  
		  Select select2 = new Select(driver.findElement(By.id("ddlStartHHCL1S1")));
		  select2.selectByVisibleText("5");
		  
		  String Actualresult55 = " 1\n"
		  		+ " 2\n"
		  		+ " 3\n"
		  		+ " 4\n"
		  		+ " 5\n"
		  		+ " 6\n"
		  		+ " 7\n"
		  		+ " 8\n"
		  		+ " 9\n"
		  		+ " 10\n"
		  		+ " 11\n"
		  		+ " 12";
		  String Expectresult = driver.findElement(By.id("ddlStartHHCL1S1")).getText();
		  System.out.println(Expectresult);
		  softAssert.assertEquals(Actualresult55, Expectresult);
		  
		  Select select55 = new Select(driver.findElement(By.id("ddlStartMMCL1S1")));
		  select55.selectByVisibleText("30");
		  
		  String Actualresult5 = " 00\n"
		  		+ " 15\n"
		  		+ " 30\n"
		  		+ " 45";
		  String Expectresult33 = driver.findElement(By.id("ddlStartMMCL1S1")).getText();
		  System.out.println(Expectresult33);
		  softAssert.assertEquals(Actualresult5, Expectresult33);
 
		  Select select5 = new Select(driver.findElement(By.id("ddlStartAMCL1S1")));
		  select5.selectByVisibleText("PM");
		  
		  String Actualresult53 = " AM\n"
		  		+ " PM";
		  String Expectresult53 = driver.findElement(By.id("ddlStartAMCL1S1")).getText();
		  System.out.println(Expectresult53);
		  softAssert.assertEquals(Actualresult53, Expectresult53);
		  
		  
		  String ActualFromTime1 = "To";
		  String ExpectedFromTime1 = driver.findElement(By.xpath("//*[@id='divEndCL1S1']/div[contains(text(),'To')]")).getText();
		  softAssert.assertEquals(ActualFromTime1, ExpectedFromTime1);
		  
		  Select select21 = new Select(driver.findElement(By.id("ddlEndHHCL1S1")));
		  select21.selectByVisibleText("8");
		  
		  String Actualresult551 = " 1\n"
		  		+ " 2\n"
		  		+ " 3\n"
		  		+ " 4\n"
		  		+ " 5\n"
		  		+ " 6\n"
		  		+ " 7\n"
		  		+ " 8\n"
		  		+ " 9\n"
		  		+ " 10\n"
		  		+ " 11\n"
		  		+ " 12";
		  String Expectresult1 = driver.findElement(By.id("ddlEndHHCL1S1")).getText();
		  System.out.println(Expectresult1);
		  softAssert.assertEquals(Actualresult551, Expectresult1);
		  
		  Select select551 = new Select(driver.findElement(By.id("ddlEndMMCL1S1")));
		  select551.selectByVisibleText("30");
		  
		  String Actualresult51 = " 00\n"
		  		+ " 15\n"
		  		+ " 30\n"
		  		+ " 45";
		  String Expectresult331 = driver.findElement(By.id("ddlEndMMCL1S1")).getText();
		  System.out.println(Expectresult331);
		  softAssert.assertEquals(Actualresult51, Expectresult331);
 
		  Select select51 = new Select(driver.findElement(By.id("ddlEndAMCL1S1")));
		  select51.selectByVisibleText("PM");
		  
		  String Actualresult531 = " AM\n"
		  		+ " PM";
		  String Expectresult531 = driver.findElement(By.id("ddlEndAMCL1S1")).getText();
		  System.out.println(Expectresult531);
		  softAssert.assertEquals(Actualresult531, Expectresult531);
		 
		  
		  Select select511 = new Select(driver.findElement(By.id("ddlEndAMCL1S1")));
		  select511.selectByVisibleText("AM");
		 
		  String Actualvalidation11 = "End time must be later than Start time.\n"
			  		+ "If you wish to cross the midnight boundary, set the End time for this item to be 12:00 AM, then add another schedule item with Start time of 12:00 AM and the desired End time.";
			  String Expectedvalidation11 = driver.findElement(By.xpath("//*[@id='divCL1S1Err']/span[contains(text(),'End time must be later than Start time.')]")).getText();
			  System.out.println(Expectedvalidation11);
			 
			  softAssert.assertEquals(Actualvalidation11, Expectedvalidation11);        
			  Select select5111 = new Select(driver.findElement(By.id("ddlEndAMCL1S1")));
			  select5111.selectByVisibleText("AM");
		     
		  Select select51111 = new Select(driver.findElement(By.id("ddlEndAMCL1S1")));
		  select51111.selectByVisibleText("PM");
		 
		  Select select211 = new Select(driver.findElement(By.id("ddlStartHHCL1S1")));
		  select211.selectByVisibleText("9");
		 
		  String Actualvalidation111 = "End time must be later than Start time.\n"
		  		+ "If you wish to cross the midnight boundary, set the End time for this item to be 12:00 AM, then add another schedule item with Start time of 12:00 AM and the desired End time.";
		  String Expectedvalidation111 = driver.findElement(By.xpath("//*[@id='divCL1S1Err']/span[contains(text(),'End time must be later than Start time.')]")).getText();
		  System.out.println(Expectedvalidation111);
		  softAssert.assertEquals(Actualvalidation111, Expectedvalidation111);
		
 	  }
	  
	  softAssert.assertAll();
  }
		  
  
  
  @AfterClass
  public void afterClass() {
  }

}
