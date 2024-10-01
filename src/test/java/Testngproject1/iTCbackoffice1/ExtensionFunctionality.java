package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.Select;

public class ExtensionFunctionality {
	WebDriver driver;
	
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver();

       driver.get("https://www.coasecure.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8775926263");  //(833)6322654
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");    //891929
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.id("divExtensions")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id='Masterbody']/div[10]/div")).click();
	      
  }
  @Test    (priority = 1) 
  public void testUIofextensionfunctionality() throws InterruptedException
  {
	  //Test to check user able to see Extensions word on the Extensions.aspx page or noot
	  String actual = "Extensions";
	  Thread.sleep(3000);
	  String Expect = driver.findElement(By.id("lnkExtAdd")).getText();
      Assert.assertEquals(actual, Expect); 
      //Test to check user able to see Addextension image ot not
      
      WebElement Addextimg = driver.findElement(By.id("imgExtAdd")); 
      Assert.assertTrue(Addextimg.isDisplayed(), "Addextimg should be visible on the page");
      
      //Test to check user able to see this content(Add New Extension).
      String actual1 = "Add New Extension";
	  Thread.sleep(3000);
	  String Expect1 = driver.findElement(By.xpath("//*[contains(text(),'Add New Extension')]")).getText();
      Assert.assertEquals(actual1, Expect1); 
      
      //Test to check user able to see the this content(Extension Number).
      String actual2 = "Extension Number";
	  Thread.sleep(3000);
	  String Expect2 = driver.findElement(By.xpath("//*[contains(text(),'Extension Number')]")).getText();
      Assert.assertEquals(actual2, Expect2); 
      
      //Test to check user able to see the extension text box field or not
      WebElement Exttxtboxfield = driver.findElement(By.id("txtExtensionNo")); 
      Assert.assertTrue(Exttxtboxfield.isDisplayed(), "Logo should be visible on the page");
      
      //Test to check user able to see the min amd max enter extension numbers content (1-9999)
      String actual3 = "(1-9999)";
	  Thread.sleep(3000);
	  String Expect3 = driver.findElement(By.xpath("//*[contains(text(),'(1-9999)')]")).getText();
      Assert.assertEquals(actual3, Expect3); 
      
      //Test to check user able to see Save and Cancel button or not.
      
      WebElement Savebutton = driver.findElement(By.id("btnSaveNewExt")); 
      Assert.assertTrue(Savebutton.isEnabled(), "Savebutton should be visible on the page");
      
      WebElement Cancelbutton = driver.findElement(By.id("btnSaveNewExt")); 
      Assert.assertTrue(Cancelbutton.isEnabled(), "Cancelbutton should be visible on the page");
      
      //Test to check user able to see the Informational ext info.
      
      WebElement Informational = driver.findElement(By.xpath("//*[@id='divTypeInfo']")); 
      Assert.assertTrue(Informational.isDisplayed(), "Informational ext info should be visible on the page");
     
      //Test to check user is able to see message taking ext information.
      
      WebElement MessageTakingextinfo = driver.findElement(By.xpath("//*[@id='divTypeMsgTaking']")); 
      Assert.assertTrue(MessageTakingextinfo.isDisplayed(), "Message Taking ext info should be visible on the page");
      
      //Test to check user is able to see standard(PBX) ext info

      WebElement PBXextinfo = driver.findElement(By.xpath("//*[@id='divTypePBX']")); 
      Assert.assertTrue(PBXextinfo.isDisplayed(), "PBXextinfo should be visible on the page");
      
      //Test to check user is able to see Department(ACD) ext info.
      

      WebElement ACDextinfo = driver.findElement(By.xpath("//*[@id='divTypeACD']")); 
      Assert.assertTrue(ACDextinfo.isDisplayed(), "PBXextinfo should be visible on the page");
      
  }
  
  //Creating informational Extension
  @Test  (priority = 3)
  public void testCreatingInfoext() throws InterruptedException {
	  driver.findElement(By.id("imgExtAdd")).click();
	  Thread.sleep(3000);
	  WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
	  Extensionnumber.sendKeys("44");
	  Thread.sleep(3000);
	 WebElement Displayname = driver.findElement(By.id("txtDispName"));
	  Thread.sleep(3000);
	 Displayname.sendKeys("Testing Informational ext");
	  Thread.sleep(3000);
	 WebElement Description = driver.findElement(By.id("txtExtGreetDesc"));
	  Thread.sleep(3000);
	 Description.sendKeys("Testing Description field of informational Extension");
	  Thread.sleep(3000);
	 driver.findElement(By.id("btnSaveNewExt")).click();
	
  }
  @Test (priority = 4)
  public void testAllvalidationofAddingExtensionnumberfields() throws InterruptedException

  {
	  //Test to check user is able to see the validation(Extension number is required.) if the user click on save button without enter extension number.
	  driver.findElement(By.id("imgExtAdd")).click();
	  Thread.sleep(3000);
	  String actual = "Extension number is required.";
	  Thread.sleep(3000);
      driver.findElement(By.id("btnSaveNewExt")).click();
	  Thread.sleep(3000);
	  String Expect = driver.findElement(By.xpath("//*[contains(text(),'Extension number is required.')]")).getText();
      Assert.assertEquals(actual, Expect); 
      //Test to check user is able to see this validation(extension name is required.) if the user click on save button without enter extension name.
      WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
	  Extensionnumber.sendKeys("11");
	  Thread.sleep(3000);
      String actualextensionname = "Extension name is required.";
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnSaveNewExt")).click();
	 String Expectextensionname = driver.findElement(By.xpath("//*[contains(text(),'Extension name is required.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualextensionname, Expectextensionname); 
      //Test to check user is able to see this validation(Follow-up text is required.) when the user click on save button without enter follow-up text
      WebElement Displayname = driver.findElement(By.id("txtDispName"));
	 Displayname.sendKeys("Testing Informational ext");
	 //Test to check whether toggle key is presence on the page or not
	 WebElement toggleKey = driver.findElement(By.xpath("//*[@id='divTxtbkhead']/div[2]/label")); 
     Assert.assertTrue(toggleKey.isDisplayed(), "Toggle key is not present on the page");
     
     WebElement clickontoggleKey = driver.findElement(By.xpath("//*[@id='divTxtbkhead']/div[2]/label")); 
     clickontoggleKey.click();
     Thread.sleep(3000);
	  driver.findElement(By.id("btnSaveNewExt")).click();
	  String Actualfollowuptextvalidation = "Follow-up text is required.";
	  String Expectedfollowuptextvalidation = driver.findElement(By.xpath("//*[contains(text(),'Follow-up text is required.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(Actualfollowuptextvalidation, Expectedfollowuptextvalidation);
	  
	 
	 
  }
  @Test (priority = 5)
  public void testAllvalidationofCreatingStandardextension() throws InterruptedException

  {
	  //Test to check user is able to see the validation(Extension number is required.) if the user click on save button without enter extension number.
	  driver.findElement(By.id("imgExtAdd")).click();
	  Thread.sleep(3000);
	  String actual = "Extension number is required.";
	  Thread.sleep(3000);
      driver.findElement(By.id("btnSaveNewExt")).click();
	  Thread.sleep(3000);
	  String Expect = driver.findElement(By.xpath("//*[contains(text(),'Extension number is required.')]")).getText();
      Assert.assertEquals(actual, Expect); 
      driver.findElement(By.xpath("//label[@for='rdbPBX']")).click();
      WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
	  Extensionnumber.sendKeys("111");
	  Thread.sleep(3000);
      //Test to check user is able to see this validation(First name required.) when the user click on save button without enter firstname.
      driver.findElement(By.id("btnNewPBXSave")).click();
      String actualresult = "First name required.";
      String expectedresult = driver.findElement(By.xpath("//*[contains(text(),'First name required.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult, expectedresult); 
 	 WebElement Firstname = driver.findElement(By.id("txtNewFirstName"));
 	 Firstname.sendKeys("Testing Standard");
      //Test to check user is able to see this validation(First name required.) when the user click on save button without enter lastname.
      driver.findElement(By.id("btnNewPBXSave")).click();
      String actualresult1 = "Last name required.";
      String expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Last name required.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult1, expectedresult1); 
      WebElement Lastname = driver.findElement(By.id("txtNewLastName"));
	  Lastname.sendKeys("Extension");
      
      //Test to check users is able to see this validation(Enter a 4 to 6 digit passcode.) when the user click on save button without enter passcode.
      driver.findElement(By.id("btnNewPBXSave")).click();
      String actualresult2 = "Enter a 4 to 6 digit passcode.";
      String expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult2, expectedresult2); 
      //Test to check user is able to see this validation(Enter a 4 to 6 digit passcode.) when the user click on save button with enter less then four digits passcode
      WebElement Passcode = driver.findElement(By.id("txtNewPBXPasscode"));
	  Passcode.sendKeys("55");
      driver.findElement(By.id("btnNewPBXSave")).click();
      String actualresult3 = "Enter a 4 to 6 digit passcode.";
      String expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult3, expectedresult3); 
      driver.findElement(By.id("txtNewPBXPasscode")).clear();
      WebElement Passcode9 = driver.findElement(By.id("txtNewPBXPasscode"));
	  Passcode9.sendKeys("6666");
      
      
      //Test to check user is able to see this validation(Passcode and confirm passcode should be same.) when the user click on save button without enter retypepasscode.
      driver.findElement(By.id("btnNewPBXSave")).click();
      String actualresult5 = "Passcode and confirm passcode should be same.";
      String expectedresult5 = driver.findElement(By.xpath("//*[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult5, expectedresult5); 
      //Test to check user is able to see this validation(Passcode and confirm passcode should be same.) when the user click on save button with enter wrong passcode.  
      WebElement RetypePasscode = driver.findElement(By.id("txtRetypePBXPasscode"));
	  RetypePasscode.sendKeys("5555");
	  String actualresult6 = "Passcode and confirm passcode should be same.";
      String expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult6, expectedresult6); 
      driver.findElement(By.id("txtRetypePBXPasscode")).clear();
      WebElement RetypePasscode1 = driver.findElement(By.id("txtRetypePBXPasscode"));
	  RetypePasscode1.sendKeys("6666");
	   driver.findElement(By.id("btnNewPBXSave")).click();
	   
	   WebElement linkElement = driver.findElement(By.partialLinkText("Login to"));

       // Verify if the link is displayed on the page
       Assert.assertTrue(linkElement.isDisplayed(), "Link is present on the page");
       
       WebElement AllowCallForwarding  = driver.findElement(By.xpath("//*[contains(text(),'Allow Call Forwarding ')]"));
       Assert.assertTrue(AllowCallForwarding.isDisplayed(), "AllowCallForwarding text is present on the page");
       
       WebElement toggleElement = driver.findElement(By.xpath("//*[@id='divCLForward']/label/div/div/label[1]"));
       Assert.assertTrue(toggleElement.isDisplayed(), "AllowCallForwarding Toggle is present on the page");
       
       WebElement toggleturnoff = driver.findElement(By.xpath("//*[@id='divCLForward']/label/div/div/label[1]"));
       toggleturnoff.click();
       Thread.sleep(3000);
       WebElement toggleturnon = driver.findElement(By.xpath("//*[@id='divCLForward']/label/div/div/label[2]"));
       toggleturnon.click();
       
       WebElement AllowOutboundCalls   = driver.findElement(By.xpath("//*[contains(text(),'Allow Outbound Calls ')]"));
       Assert.assertTrue(AllowOutboundCalls.isDisplayed(), "AllowOutboundCalls text is present on the page");
       
       WebElement toggleElement1 = driver.findElement(By.xpath("//*[@id='divOutboundCalls']/label/div/div/label[1]"));
       Assert.assertTrue(toggleElement1.isDisplayed(), "AllowOutboundCalls Toggle is present on the page");
       
       WebElement AllowOutboundCallstoggleturnoff = driver.findElement(By.xpath("//*[@id='divOutboundCalls']/label/div/div/label[1]"));
       AllowOutboundCallstoggleturnoff.click();
       Thread.sleep(3000);
       WebElement AllowOutboundCallstoggleturnon = driver.findElement(By.xpath("//*[@id='divOutboundCalls']/label/div/div/label[2]"));
       AllowOutboundCallstoggleturnon.click();
       
       WebElement AllowOutboundFaxing    = driver.findElement(By.xpath("//*[contains(text(),'Allow Outbound Faxing ')]"));
       Assert.assertTrue(AllowOutboundFaxing.isDisplayed(), "AllowOutboundFaxing text is present on the page");
       
       WebElement toggleElement2 = driver.findElement(By.xpath("//*[@id='divOutboundFax']/label/div/div/label[1]"));
       Assert.assertTrue(toggleElement2.isDisplayed(), "AllowOutboundFaxing Toggle is present on the page");
       
       WebElement AllowOutboundFaxingtoggleturnoff = driver.findElement(By.xpath("//*[@id='divOutboundFax']/label/div/div/label[1]"));
       AllowOutboundFaxingtoggleturnoff.click();
       Thread.sleep(3000);
       WebElement AllowOutboundFaxingtoggleturnon = driver.findElement(By.xpath("//*[@id='divOutboundFax']/label/div/div/label[2]"));
       AllowOutboundFaxingtoggleturnon.click();
       
       WebElement AllowVoicemailTranscription     = driver.findElement(By.xpath("//span[contains(text(),'Allow Voicemail Transcription')]"));
       Assert.assertTrue(AllowVoicemailTranscription.isDisplayed(), "AllowVoicemailTranscription text is present on the page");
      
       WebElement toggleElement3 = driver.findElement(By.xpath("//*[@id='divPBXVT']/label/div/div/label[1]"));
       Assert.assertTrue(toggleElement3.isDisplayed(), "AllowVoicemailTranscription Toggle is present on the page");
       
       WebElement AllowVoicemailTranscriptiontoggleturnoff = driver.findElement(By.xpath("//*[@id='divPBXVT']/label/div/div/label[1]"));
       AllowVoicemailTranscriptiontoggleturnoff.click();
       Thread.sleep(3000);
       WebElement AllowVoicemailTranscriptiontoggleturnon = driver.findElement(By.xpath("//*[@id='divPBXVT']/label/div/div/label[2]"));
       AllowVoicemailTranscriptiontoggleturnon.click();
       
       
       WebElement OwnerFirstname = driver.findElement(By.id("txtNewFirstName"));
       OwnerFirstname.clear();
       WebElement OwnerFirstname1 = driver.findElement(By.id("txtNewFirstName"));
       OwnerFirstname1.sendKeys("PBX");
       
       WebElement Ownerlastname = driver.findElement(By.id("txtNewFirstName"));
       Ownerlastname.clear();
       WebElement Ownerlastname2 = driver.findElement(By.id("txtNewFirstName"));
       Ownerlastname2.sendKeys("EXT");
       
       driver.findElement(By.id("btnPBXSave")).click();
       
       String actualresult8 = "PBX settings updated successfully.";
       String expectedresult8 = driver.findElement(By.xpath("//label[contains(text(),'PBX settings updated successfully.')]")).getText();
       Thread.sleep(3000);
       Assert.assertEquals(actualresult8, expectedresult8); 
       
       
	   WebElement Changepasscodelink = driver.findElement(By.id("spPBXChangePasscode"));
       Assert.assertTrue(Changepasscodelink.isDisplayed(), "Changepasscodelink is present on the page");
       
       WebElement Changepasscodelinkclick = driver.findElement(By.id("spPBXChangePasscode"));
       Changepasscodelinkclick.click();
       
       WebElement NewPasscode = driver.findElement(By.id("txtNewPasscode"));
       NewPasscode.sendKeys("");
       WebElement Save = driver.findElement(By.id("btnPassSave"));
       Save.click();
       
       String actualresult9 = "Passcode required.";
       String expectedresult9 = driver.findElement(By.xpath("//label[contains(text(),'Passcode required.')]")).getText();
       Thread.sleep(3000);
       Assert.assertEquals(actualresult9, expectedresult9); 
       
       WebElement NewPasscode1 = driver.findElement(By.id("txtNewPasscode"));
       NewPasscode1.sendKeys("22");
       WebElement Save1 = driver.findElement(By.id("btnPassSave"));
       Save1.click();
       String actualresult10 = "Enter a 4 to 6 digit passcode.";
       String expectedresult10 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
       Thread.sleep(3000);
       Assert.assertEquals(actualresult10, expectedresult10); 
       WebElement NewPasscode2 = driver.findElement(By.id("txtNewPasscode"));
       NewPasscode2.clear();
       
       WebElement NewPasscode3 = driver.findElement(By.id("txtNewPasscode"));
       NewPasscode3.sendKeys("8888");
       WebElement Save2 = driver.findElement(By.id("btnPassSave"));
       Save2.click();
       
       
       String actualresult11 = "Passcode and confirm passcode should be same.";
       String expectedresult11 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
       Thread.sleep(3000);
       Assert.assertEquals(actualresult11, expectedresult11); 
       
       WebElement RetypeNewPasscode = driver.findElement(By.id("txtRetypePasscode"));
       RetypeNewPasscode.sendKeys("22");
       WebElement Save3 = driver.findElement(By.id("btnPassSave"));
       Save3.click();
         

       String actualresult12 = "Passcode and confirm passcode should be same.";
       String expectedresult12 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
       Thread.sleep(3000);
       Assert.assertEquals(actualresult12, expectedresult12); 
       
       WebElement RetypeNewPasscode1 = driver.findElement(By.id("txtRetypePasscode"));
       RetypeNewPasscode1.clear();
       Thread.sleep(3000);

       WebElement RetypeNewPasscode2 = driver.findElement(By.id("txtRetypePasscode"));
       RetypeNewPasscode2.sendKeys("8888");
       
       WebElement Save4 = driver.findElement(By.id("btnPassSave"));
       Save4.click();
       Thread.sleep(3000);
       String actualresult13 = "Passcode updated successfully.";
       String expectedresult13 = driver.findElement(By.xpath("//label[contains(text(),'Passcode updated successfully.')]")).getText();
       Thread.sleep(3000);
       Assert.assertEquals(actualresult13, expectedresult13); 
   
  }
  @Test (priority = 8)
  public void testAllvalidationwithCreatingDeparmentExtension() throws InterruptedException
  {
	  //Test to check user is able to see the validation(Extension number is required.) if the user click on save button without enter extension number.
	  driver.findElement(By.id("imgExtAdd")).click();
	  Thread.sleep(3000);
	   driver.findElement(By.id("btnSaveNewExt")).click();
	  String actual = "Extension number is required.";
	  Thread.sleep(3000);
 
	  String Expect = driver.findElement(By.xpath("//*[contains(text(),'Extension number is required.')]")).getText();
      Assert.assertEquals(actual, Expect); 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//label[@for='rdbACD']")).click();
      Thread.sleep(3000);
    
    
      WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
	  Extensionnumber.sendKeys("0022");
	  Thread.sleep(3000);
      //Test to check user is able to see this validation(First name required.) when the user click on save button without enter firstname.
      driver.findElement(By.id("btnNewACDSave")).click();
      String actualresult = "Department name required.";
      String expectedresult = driver.findElement(By.xpath("//label[contains(text(),'Department name required.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult, expectedresult); 
      

      WebElement Departmentname = driver.findElement(By.id("txtDeptName"));
      Departmentname.sendKeys("Department ext");
      driver.findElement(By.id("btnNewACDSave")).click();
      
      
      WebElement CallDistributionType = driver.findElement(By.xpath("//label[@for='grpCallDistribution']"));
      Assert.assertTrue(CallDistributionType.isDisplayed(), "CallDistributionType text is present on the page");
      

	   WebElement RoundRobinRadiobutton = driver.findElement(By.xpath("//label[@for='rdbRoundRobin']"));
      Assert.assertTrue(RoundRobinRadiobutton.isEnabled(), "RoundRobinRadio button  is present on the page");
      

	   WebElement NextAvailableobutton = driver.findElement(By.xpath("//label[@for='rdbNxtAvailable']"));
      Assert.assertTrue(NextAvailableobutton.isEnabled(), "NextAvailableo button  is present on the page");
      
      String actualresult9 = "Enter a 4 to 6 digit passcode.";
      String expectedresult9 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult9, expectedresult9); 
      
      WebElement NewPasscode1 = driver.findElement(By.id("txtACDPass"));
      NewPasscode1.sendKeys("22");
      WebElement Save1 = driver.findElement(By.id("btnNewACDSave"));
      Save1.click();
      String actualresult10 = "Enter a 4 to 6 digit passcode.";
      String expectedresult10 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult10, expectedresult10); 
      
      WebElement NewPasscode2 = driver.findElement(By.id("txtACDPass"));
      NewPasscode2.clear();
      
      WebElement NewPasscode3 = driver.findElement(By.id("txtACDPass"));
      NewPasscode3.sendKeys("8888");
      
      WebElement Save2 = driver.findElement(By.id("btnNewACDSave"));
      Save2.click();
      
////////////
      
      String actualresult11 = "Passcode and confirm passcode should be same.";
      String expectedresult11 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult11, expectedresult11); 
      
      WebElement RetypeNewPasscode = driver.findElement(By.id("txtACDRetypePass"));
      RetypeNewPasscode.sendKeys("22");
      WebElement Save3 = driver.findElement(By.id("btnNewACDSave"));
      Save3.click();
        

      String actualresult12 = "Passcode and confirm passcode should be same.";
      String expectedresult12 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult12, expectedresult12); 
      
      WebElement RetypeNewPasscode1 = driver.findElement(By.id("txtACDRetypePass"));
      RetypeNewPasscode1.clear();
      Thread.sleep(3000);

      WebElement RetypeNewPasscode2 = driver.findElement(By.id("txtACDRetypePass"));
      RetypeNewPasscode2.sendKeys("8888");
      
      WebElement Save4 = driver.findElement(By.id("btnNewACDSave"));
      Save4.click();
      ///////////////
      WebElement linkElement = driver.findElement(By.partialLinkText("Login to"));

      // Verify if the link is displayed on the page
      Assert.assertTrue(linkElement.isDisplayed(), "Link is present on the page");
      
      
	   WebElement Changepasscodelink = driver.findElement(By.id("spACDChangePass"));
      Assert.assertTrue(Changepasscodelink.isDisplayed(), "Changepasscodelink is present on the page");
      
      WebElement Changepasscodelinkclick = driver.findElement(By.id("spACDChangePass"));
      Changepasscodelinkclick.click();
      
      WebElement NewPasscode = driver.findElement(By.id("txtACDNewPass"));
      NewPasscode.sendKeys("");
      WebElement Save = driver.findElement(By.id("btnSaveACDPass"));
      Save.click();
      
     String actualresult20 = "Passcode required.";
      String expectedresult20 = driver.findElement(By.xpath("//label[contains(text(),'Passcode required.')]")).getText();
     Thread.sleep(3000);
      Assert.assertEquals(actualresult20, expectedresult20); 
      
      WebElement NewPasscode21 = driver.findElement(By.id("txtACDNewPass"));
      NewPasscode21.sendKeys("22");
      WebElement Save11 = driver.findElement(By.id("btnSaveACDPass"));
      Save11.click();
      String actualresult22 = "Enter a 4 to 6 digit passcode.";
      String expectedresult23 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult22, expectedresult23); 
      WebElement NewPasscode24 = driver.findElement(By.id("txtACDNewPass"));
      NewPasscode24.clear();
      
      WebElement NewPasscode25 = driver.findElement(By.id("txtACDNewPass"));
      NewPasscode25.sendKeys("8888");
      WebElement Save12 = driver.findElement(By.id("btnSaveACDPass"));
      Save12.click();
      
      
      String actualresult24 = "Passcode and confirm passcode should be same.";
      String expectedresult24 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult24, expectedresult24); 
      
      WebElement RetypeNewPasscode11 = driver.findElement(By.id("txtACDNewRetypePass"));
      RetypeNewPasscode11.sendKeys("22");
      WebElement Save7 = driver.findElement(By.id("btnSaveACDPass"));
      Save7.click();
        

      String actualresult44 = "Passcode and confirm passcode should be same.";
      String expectedresult44 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult44, expectedresult44); 
      
      WebElement RetypeNewPasscode7 = driver.findElement(By.id("txtACDNewRetypePass"));
      RetypeNewPasscode7.clear();
      Thread.sleep(3000);

      WebElement RetypeNewPasscode8 = driver.findElement(By.id("txtACDNewRetypePass"));
      RetypeNewPasscode8.sendKeys("8888");
      
      WebElement Save9 = driver.findElement(By.id("btnSaveACDPass"));
      Save9.click();
      Thread.sleep(3000);
      String actualresult13 = "Passcode updated successfully.";
      String expectedresult13 = driver.findElement(By.xpath("//label[contains(text(),'Passcode updated successfully.')]")).getText();
      Thread.sleep(3000);
      Assert.assertEquals(actualresult13, expectedresult13); 
      
      
      WebElement NextAvailableobuttonclick = driver.findElement(By.xpath("//label[@for='rdbNxtAvailable']"));
      NextAvailableobuttonclick.click();
     
      WebElement AllowVoicemailTranscription  = driver.findElement(By.xpath("//label[@for='grpCallDistribution']"));
      Assert.assertTrue(AllowVoicemailTranscription.isDisplayed(), "AllowVoicemailTranscription text is present on the page");
      
      WebElement toggleElement1 = driver.findElement(By.xpath("//*[@id='divACDVT']/label[2]/div/div/label[1]"));
      Assert.assertTrue(toggleElement1.isDisplayed(), "AllowVoicemailTranscription Toggle is present on the page");
      
      WebElement AllowOutboundCallstoggleturnoff = driver.findElement(By.xpath("//*[@id='divACDVT']/label[2]/div/div/label[2]"));
      AllowOutboundCallstoggleturnoff.click();
      Thread.sleep(3000);
      WebElement AllowOutboundCallstoggleturnon = driver.findElement(By.xpath("//*[@id='divACDVT']/label[2]/div/div/label[1]"));
      AllowOutboundCallstoggleturnon.click();
      

      WebElement CallCenterOperators   = driver.findElement(By.xpath("//label[@for='grpCallDistribution']"));
      Assert.assertTrue(CallCenterOperators.isDisplayed(), "CallCenterOperators text is present on the page");
      
      WebElement AddQbutton   = driver.findElement(By.id("btnACDAddQ"));
      Assert.assertTrue(AddQbutton.isEnabled(), "AddQbutton button is present on the page");
      
      WebElement dropdownElement = null;
      try {
          dropdownElement = driver.findElement(By.id("ddlPBXExtList"));
      
      } catch (org.openqa.selenium.NoSuchElementException e) {
          // NoSuchElementException will be thrown if the element is not found
          // Handle the absence of the dropdown here if needed
    	  System.out.println("Dropdown is not present on the page.");
      }

      // Verify if the dropdown is present on the page
      Assert.assertNotNull(dropdownElement, "Dropdown is present on the page");
      
      // Create a Select object
      Select dropdown = new Select(dropdownElement);
      
    
      

      // Get all the options from the dropdown
      List<WebElement> options = dropdown.getOptions();
      Thread.sleep(3000);
      // Iterate through each option and perform actions/assertions
      for (WebElement option : options) {
    	  
    	
    	  Thread.sleep(3000);
          // Get the text of the option
          String optionText = option.getText();

          // Select the option
          dropdown.selectByVisibleText(optionText);

          // Perform actions/assertions on the selected option
          // Example assertion: Check if the option is selected
          boolean isSelected = option.isSelected();
          System.out.println("Option '" + optionText + "' is selected: " + isSelected);
          
          
          // You can perform other actions/assertions as needed
      }

      Thread.sleep(3000);
      driver.findElement(By.id("btnACDAddQ")).click();
      Thread.sleep(3000);
      driver.findElement(By.id("btnACDAddQ")).click();
      Thread.sleep(3000);
    
      WebElement Autorecordcalls  = driver.findElement(By.xpath("//label[contains(text(),'Auto-record calls')]"));
      Assert.assertTrue(Autorecordcalls.isDisplayed(), "Autorecordcalls text is present on the page");
      
      WebElement Autorecordcallstoogle = driver.findElement(By.xpath("//*[@id='divConfigACD']/div/div[1]/div[2]/label/div/div/label[2]"));
      Assert.assertTrue(Autorecordcallstoogle.isDisplayed(), "Autorecordcalls Toggle is present on the page");
      Thread.sleep(3000);
      WebElement Autorecordcallstoogletoggleturnoff = driver.findElement(By.xpath("//*[@id='divConfigACD']/div/div[1]/div[2]/label/div/div/label[2]"));
     Autorecordcallstoogletoggleturnoff.click();
//      Thread.sleep(3000);
//      WebElement Autorecordcallstoogletoggleturnon = driver.findElement(By.xpath("//*[@id='divConfigACD']/div/div[1]/div[2]/label/div/div/label[1]"));
//      Autorecordcallstoogletoggleturnon.click();
     
     String actual2 = "Record Every Number";
	  Thread.sleep(3000);
	  String Expect2 = driver.findElement(By.xpath("//*[contains(text(),'Record Every Number')]")).getText();
     Assert.assertEquals(actual2, Expect2); 
     
     //Test to check user able to see the extension text box field or not
     WebElement txtboxfield = driver.findElement(By.id("txtRecordCallFreq")); 
     Assert.assertTrue(txtboxfield.isDisplayed(), "Logo should be visible on the page");
     
     //Test to check user able to see the min amd max enter extension numbers content (1-9999)
     String actual3 = "call that...";
	  Thread.sleep(3000);
	  String Expect3 = driver.findElement(By.xpath("//*[contains(text(),'call that...')]")).getText();
     Assert.assertEquals(actual3, Expect3); 
      
     WebElement Atanytime = driver.findElement(By.xpath("//label[@for='rbRec24HrSchedule']"));
     Atanytime.click();
    
     WebElement Atanytimetxt  = driver.findElement(By.xpath("//label[@for='rbRec24HrSchedule']"));
     Assert.assertTrue(Atanytimetxt.isDisplayed(), "Atanytime text is present on the page");
     
     WebElement Betweenthehoursof  = driver.findElement(By.xpath("//label[@for='rbRecScheduleBetween']"));
     Assert.assertTrue(Betweenthehoursof.isDisplayed(), "Betweenthehoursof text and radio button is present on the page");
     
     WebElement comesintoCallCenter  = driver.findElement(By.xpath("//*[@id='divAutoCallSettings']/div[1]/div[2]"));
     Assert.assertTrue(comesintoCallCenter.isDisplayed(), "comesintoCallCenter text and radio button is present on the page");
     
     WebElement connectstooperators  = driver.findElement(By.xpath("//label[@for='rbForwardThroughACD']"));
     Assert.assertTrue(connectstooperators.isDisplayed(), "connectstooperators text and radio button is present on the page");
     
     WebElement Fromtime  = driver.findElement(By.xpath("//*[@id='divStarTime']"));
     Assert.assertTrue(Fromtime.isDisplayed(), "starttime text and radio button is present on the page");
     
     WebElement Totime  = driver.findElement(By.xpath("//*[@id='divEndTime']"));
     Assert.assertTrue(Totime.isDisplayed(), "Totime text and radio button is present on the page");
     
     WebElement Onthesedays   = driver.findElement(By.xpath("//*[@id='divScheduleDays']/span[1]"));
     Assert.assertTrue(Onthesedays.isDisplayed(), "Onthesedays text is present on the page");
     
     WebElement Sunday   = driver.findElement(By.xpath("//*[contains(text(),'SUN')]"));
     Assert.assertTrue(Sunday.isEnabled(), "Sunday is present on the page");
     
     
     WebElement Monday   = driver.findElement(By.xpath("//*[contains(text(),'MON')]"));
     Assert.assertTrue(Monday.isEnabled(), "Monday is present on the page");
     
     WebElement Tuesday   = driver.findElement(By.xpath("//*[contains(text(),'TUE')]"));
     Assert.assertTrue(Tuesday.isEnabled(), "Tuesday is present on the page");
     
     
     WebElement Wednesday   = driver.findElement(By.xpath("//*[contains(text(),'WED')]"));
     Assert.assertTrue(Wednesday.isEnabled(), "Wednesday is present on the page");
     
     WebElement Thursday   = driver.findElement(By.xpath("//*[contains(text(),'THU')]"));
     Assert.assertTrue(Thursday.isEnabled(), "Sunday is present on the page");
     
     
     WebElement Friday   = driver.findElement(By.xpath("//*[contains(text(),'FRI')]"));
     Assert.assertTrue(Friday.isEnabled(), "Friday is present on the page");
     
     WebElement Saturday   = driver.findElement(By.xpath("//*[contains(text(),'SAT')]"));
     Assert.assertTrue(Saturday.isEnabled(), "Saturday is present on the page");
	  Thread.sleep(3000);
     driver.findElement(By.id("aACDAccess")).click();
     
     String expectedURL = "https://backoffice.itelecenter.com/Inbox.aspx?ext=0022"; // Define your expected URL
     driver.get(expectedURL);

     // Get the actual URL
     String actualURL = driver.getCurrentUrl();

     // Verify if the actual URL matches the expected URL
     Assert.assertEquals(actualURL, expectedURL, "Actual URL doesn't match Expected URL");
     
     
     
     
  }
  //Creating Message Taking extension
  @Test   (priority = 2)
  public void testCreatingMessageTakingext() throws InterruptedException {
	  
	  driver.findElement(By.id("imgExtAdd")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//label[@for='rdbMsgTaking']")).click();
	  Thread.sleep(3000);
	  WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
	  Extensionnumber.sendKeys("66");
	  Thread.sleep(3000);
	 WebElement Displayname = driver.findElement(By.id("txtDispName"));
	  Thread.sleep(3000);
	 Displayname.sendKeys("Testing Message Taking ext");
	  Thread.sleep(3000);
	 WebElement Description = driver.findElement(By.id("txtExtGreetDesc"));
	  Thread.sleep(3000);
	 Description.sendKeys("Testing Description field of Message Taking Extension");
	  Thread.sleep(3000);
	 driver.findElement(By.id("btnSaveNewExt")).click();
	
  }
  @Test (priority = 6)
  public void testCreatingStandardExtension() throws InterruptedException {
	  
	  driver.findElement(By.id("imgExtAdd")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//label[@for='rdbPBX']")).click();
	  Thread.sleep(3000);
	  WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
	  Extensionnumber.sendKeys("12");
	  Thread.sleep(3000);
	 WebElement Description = driver.findElement(By.id("txtExtPBXDesc"));
	 Description.sendKeys("Testing Description field of Message Taking Extension");
	  Thread.sleep(3000);
	 WebElement Firstname = driver.findElement(By.id("txtNewFirstName"));
	 Firstname.sendKeys("Testing Standard");
	  Thread.sleep(3000);
	  WebElement Lastname = driver.findElement(By.id("txtNewLastName"));
	  Lastname.sendKeys("Extension");
	  WebElement Passcode = driver.findElement(By.id("txtNewPBXPasscode"));
	  Passcode.sendKeys("5555");
		  Thread.sleep(3000);
		  WebElement RetypePasscode = driver.findElement(By.id("txtRetypePBXPasscode"));
		  RetypePasscode.sendKeys("5555");
		  Thread.sleep(3000);
//		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
//		  Thread.sleep(3000);
		  
	 driver.findElement(By.id("btnNewPBXSave")).click();
	
  }
  @Test (priority = 7)
  public void testClicksoncreatedExtensions() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id='dgExtLists']/tbody/tr[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='dgExtLists']/tbody/tr[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='dgExtLists']/tbody/tr[3]")).click();
//	  Thread.sleep(3000);
//	  WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
//	  Extensionnumber.sendKeys("12");
//	  Thread.sleep(3000);
//	 WebElement Description = driver.findElement(By.id("txtExtPBXDesc"));
//	 Description.sendKeys("Testing Description field of Message Taking Extension");
//	  Thread.sleep(3000);
//	 WebElement Firstname = driver.findElement(By.id("txtNewFirstName"));
//	 Firstname.sendKeys("Testing Standard");
//	  Thread.sleep(3000);
  }

  @AfterMethod
  public void tearDown(ITestResult result) {
      if (result.getStatus() == ITestResult.FAILURE) {
          // Capturing screenshot code
          TakesScreenshot ts = (TakesScreenshot) driver;
          File source = ts.getScreenshotAs(OutputType.FILE);
          String dest = "C:\\Users\\Singanaboina Suresh\\Pictures" + result.getName() + ".png";
          File destination = new File(dest);

          try {
              FileUtils.copyFile(source, destination);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
