package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class QaItcBackoffice                   {
   public static WebDriver driver;
    
  @BeforeClass
  public void setup()  {
	  
		 ChromeOptions options = new ChromeOptions();
	      options.addArguments("--use-fake-ui-for-media-stream");
	      options.addArguments("--disable-notifications");
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	    //  driver = new ChromeDriver();
		// WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
	     driver.get("https://qanewbackoffice.itelecenter.com/login.aspx");
//	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
	  }
	
	  @Test (priority = 11)
	  public void testLogintoiTcBackoffice() throws InterruptedException
	  {
		  driver.findElement(By.xpath("//input[@name = 'txtPhone']")).sendKeys("8555158253");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'txtPasscode']")).sendKeys("2222");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'btnSubmit']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(@id,'Tools')]")).click();
	      
	  }
	  @Test (priority = 13)
	  public void testBarChat() throws InterruptedException {
		 
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("divByDateRangeView")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("txtDateFrom")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
	      Thread.sleep(1000);
		  driver.findElement(By.id("btnGetReport")).click();
	      Thread.sleep(10000);
	      
	      
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	      
		  WebElement barChart = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ReportViewer1_ReportViewer']")); // Change the locator strategy as needed
	      Thread.sleep(10000);
	     // barChart.isDisplayed();
	      
	      // softAssertion to check if the bar chart is displayed
	      softAssert.assertTrue(barChart.isDisplayed(), "Bar chart is not present on the page or not visible");
	      
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-750)");
	      softAssert.assertAll();
	  }
	  @Test (priority = 14)
	 public void testStatistics() throws InterruptedException {
		
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("lnkStatistics")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("txtDateFrom")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
	      Thread.sleep(1000);
		  driver.findElement(By.id("btnGetReport")).click();
	      Thread.sleep(10000);
	      
//	      WebElement barChartElement = driver.findElement(By.cssSelector(barChartSelector));
//	      softAssert.assertNotNull(barChartElement, "Bar chart is not present on the page");
	      
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	      
		  WebElement barChart = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ReportViewer1_ReportViewer']")); // Change the locator strategy as needed
	      Thread.sleep(10000);
	     // barChart.isDisplayed();
	      
	      // softAssertion to check if the bar chart is displayed
	      softAssert.assertTrue(barChart.isDisplayed(), "Bar chart is not present on the page or not visible");
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-750)");
	      softAssert.assertAll();
	      
	  }
	  @Test (priority = 15)
	 public void testCallDetail() throws InterruptedException {
		
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("lnkCallDetail")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("txtDateFrom")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
	      Thread.sleep(1000);
		  driver.findElement(By.id("btnGetReport")).click();
	      Thread.sleep(10000);
	    //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	      
		  WebElement barChart = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ReportViewer1_ReportViewer']")); // Change the locator strategy as needed
	      Thread.sleep(10000);
	     // barChart.isDisplayed();
	      
	      // softAssertion to check if the bar chart is displayed
	      softAssert.assertTrue(barChart.isDisplayed(), "Bar chart is not present on the page or not visible");
//	       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
//	       Thread.sleep(5000);sss
//		  WebElement barChart1 = driver.findElement(By.xpath("//*[@id='ReportViewer1']")); // Change the locator strategy as needed
//	      Thread.sleep(5000);
//	     // barChart.isDisplayed();
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	      Thread.sleep(3000);
//	      // softAssertion to check if the bar chart is displayed
//	      softAssert.assertTrue(barChart1.isDisplayed(), "Bar chart is not present on the page or not visible");
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	      softAssert.assertAll();
	  }
	  @Test(priority = 16)
	public void testTextByDateRange() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("lnkTextByDateRange")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("txtDateFrom")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[contains(text(),'Prev')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
	      Thread.sleep(1000);
		  driver.findElement(By.id("btnGetReport")).click();
	      Thread.sleep(10000);
	      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	      
		  WebElement barChart = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ReportViewer1_ReportViewer']")); // Change the locator strategy as needed
	      Thread.sleep(10000);
	     // barChart.isDisplayed();
	      
	      // softAssertion to check if the bar chart is displayed
	      softAssert.assertTrue(barChart.isDisplayed(), "Bar chart is not present on the page or not visible");
	      softAssert.assertAll();
	  }
	  @Test(priority = 12)
	  
	  public void testReportsContent() {
		  SoftAssert softAssert = new SoftAssert();
		  
		  //By Date Range And Extension content Verification
	  String actual3 = "Reports";
	  String expected3 = driver.findElement(By.xpath("//*[@id='divContainerRight']/div[1]")).getText();
	  
	  softAssert.assertEquals(actual3, expected3); 
	  String actual4 = "By Date Range And Extension";
	  String expected4 = driver.findElement(By.xpath("//*[@id='divByDateRange']/div[1]")).getText();
	  
	  softAssert.assertEquals(actual4, expected4); 
	  
	  String actual5 = "Provides call counts and basic call information filtered by extension dialed by the caller. The same call may appear in multiple reports if the caller dialed more than one extension during the course of the call.";
	  String expected5 = driver.findElement(By.xpath("//*[@id='divByDateRange']/div[2]")).getText();
	  
	  softAssert.assertEquals(actual5, expected5);
	  
	 
	  WebElement link = driver.findElement(By.id("divByDateRangeView"));  // Replace with the actual link text on your page
	  
	  softAssert.assertTrue(link.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
	  
	  //Statistics content Verification
	  String actual = "Statistics";
	  String expected = driver.findElement(By.xpath("//*[@id='divStatistics']/div[1]")).getText();
	  
	  softAssert.assertEquals(actual, expected); 

	  String actual01 = "Provides at-a-glance statistics of all calls received on your number. You can see how many callers left a voicemail, requested to connect to you directly, sent you a fax, etc. The statistics show separate information for main number and each extension that was dialed by any caller during your selected time period.";
	  String expected01 = driver.findElement(By.xpath("//*[@id='divStatistics']/div[2]")).getText();
	  
	  softAssert.assertEquals(actual01, expected01);
	  
	 
	  WebElement ViewReportbutton = driver.findElement(By.id("divStatisticsView"));  // Replace with the actual link text on your page
	  
	  softAssert.assertTrue(ViewReportbutton.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
	   
	//  Call Detail content Verification
	  String actual11 = "Call Detail";
	  String expected11 = driver.findElement(By.xpath("//*[@id='divCallDetail']/div[1]")).getText();
	  
	  softAssert.assertEquals(actual11, expected11); 

	  String actual02 = "Provides a step-by-step analysis of the actions of your caller while they were on the phone, including the exact time they have taken an action and the time they spent listening to a greeting or a menu, recording a voicemail, etc.";
	  String expected02 = driver.findElement(By.xpath("//*[@id='divCallDetail']/div[2]")).getText();
	  
	  softAssert.assertEquals(actual02, expected02);
	  
	 
	  WebElement ViewReportbutton03 = driver.findElement(By.id("divCallDetailView"));  // Replace with the actual link text on your page
	  
	  softAssert.assertTrue(ViewReportbutton03.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
	//Texts by Date Range content Verification
	  String actual12 = "Texts by Date Range";
	  String expected12 = driver.findElement(By.xpath("//*[@id='divTxtByDate']/div[1]")).getText();
	  
	  softAssert.assertEquals(actual12, expected12); 

	  String actual03 = "Provides details about SMS/Text message conversations within a given time period. Shows counts of individual text messages in each conversation (one message = up to 160 characters), as well as the total number of messages that have been processed by the system.";
	  String expected03 = driver.findElement(By.xpath("//*[@id='divTxtByDate']/div[2]")).getText();
	  
	  softAssert.assertEquals(actual03, expected03);
	  
	 
	  WebElement ViewReportbutton04 = driver.findElement(By.id("divTxtByDateView"));  // Replace with the actual link text on your page
	  
	  softAssert.assertTrue(ViewReportbutton04.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
	   softAssert.assertAll();
	  
	  }
	  //Extensions functionality test cases.
	  @Test    (priority = 17) 
	  public void testUIofextensionfunctionality() throws InterruptedException
	  {
		  SoftAssert softAssert = new SoftAssert();
		  
		  driver.findElement(By.id("divExtensions")).click();
	      Thread.sleep(5000);
//	      driver.findElement(By.xpath("//*[@id='Masterbody']/div[10]/div")).click();
//	      Thread.sleep(3000);
		  //Test to check user able to see Extensions word on the Extensions.aspx page or not
		  String actual = "Extensions";
		  Thread.sleep(3000);
		  String Expect = driver.findElement(By.id("lnkExtAdd")).getText();
	      softAssert.assertEquals(actual, Expect); 
	      //Test to check user able to see Addextension image ot not
	      
	      WebElement Addextimg = driver.findElement(By.id("imgExtAdd")); 
	      softAssert.assertTrue(Addextimg.isDisplayed(), "Addextimg should be visible on the page");
	      
	      //Test to check user able to see this content(Add New Extension).
	      String actual1 = "Add New Extension";
		  Thread.sleep(3000);
		  String Expect1 = driver.findElement(By.xpath("//*[contains(text(),'Add New Extension')]")).getText();
	      softAssert.assertEquals(actual1, Expect1); 
	      
	      //Test to check user able to see the this content(Extension Number).
	      String actual2 = "Extension Number";
		  Thread.sleep(3000);
		  String Expect2 = driver.findElement(By.xpath("//*[contains(text(),'Extension Number')]")).getText();
	      softAssert.assertEquals(actual2, Expect2); 
	      
	      //Test to check user able to see the extension text box field or not
	      WebElement Exttxtboxfield = driver.findElement(By.id("txtExtensionNo")); 
	      softAssert.assertTrue(Exttxtboxfield.isDisplayed(), "Logo should be visible on the page");
	      
	      //Test to check user able to see the min amd max enter extension numbers content (1-9999)
	      String actual3 = "(1-9999)";
		  Thread.sleep(3000);
		  String Expect3 = driver.findElement(By.xpath("//*[contains(text(),'(1-9999)')]")).getText();
	      softAssert.assertEquals(actual3, Expect3); 
	      
	      //Test to check user able to see Save and Cancel button or not.
	      
	      WebElement Savebutton = driver.findElement(By.id("btnSaveNewExt")); 
	      softAssert.assertTrue(Savebutton.isEnabled(), "Savebutton should be visible on the page");
	      
	      WebElement Cancelbutton = driver.findElement(By.id("btnSaveNewExt")); 
	      softAssert.assertTrue(Cancelbutton.isEnabled(), "Cancelbutton should be visible on the page");
	      
	      //Test to check user able to see the Informational ext info.
	      
	      WebElement Informational = driver.findElement(By.xpath("//*[@id='divTypeInfo']")); 
	      softAssert.assertTrue(Informational.isDisplayed(), "Informational ext info should be visible on the page");
	     
	      //Test to check user is able to see message taking ext information.
	      
	      WebElement MessageTakingextinfo = driver.findElement(By.xpath("//*[@id='divTypeMsgTaking']")); 
	      softAssert.assertTrue(MessageTakingextinfo.isDisplayed(), "Message Taking ext info should be visible on the page");
	      
	      //Test to check user is able to see standard(PBX) ext info

	      WebElement PBXextinfo = driver.findElement(By.xpath("//*[@id='divTypePBX']")); 
	      softAssert.assertTrue(PBXextinfo.isDisplayed(), "PBXextinfo should be visible on the page");
	      
	      //Test to check user is able to see Department(ACD) ext info.
	      

	      WebElement ACDextinfo = driver.findElement(By.xpath("//*[@id='divTypeACD']")); 
	      softAssert.assertTrue(ACDextinfo.isDisplayed(), "PBXextinfo should be visible on the page");
	      
	      softAssert.assertAll();
	  }
	//Creating Message Taking extension
	  @Test   (priority = 18)
	  public void testCreatingMessageTakingext() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
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
		  softAssert.assertAll();
	  }
	//Creating informational Extension
	  @Test  (priority = 19)
	  public void testCreatingInfoext() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
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
		  softAssert.assertAll();
		
	  }
	  @Test (priority = 20)
	  public void testAllvalidationofAddingExtensionnumberfields() throws InterruptedException

	  {
		  SoftAssert softAssert = new SoftAssert();
		  //Test to check user is able to see the validation(Extension number is required.) if the user click on save button without enter extension number.
		  driver.findElement(By.id("imgExtAdd")).click();
		  Thread.sleep(3000);
		  String actual = "Extension number is required.";
		  Thread.sleep(3000);
	      driver.findElement(By.id("btnSaveNewExt")).click();
		  Thread.sleep(3000);
		  String Expect = driver.findElement(By.xpath("//*[contains(text(),'Extension number is required.')]")).getText();
	      softAssert.assertEquals(actual, Expect); 
	      //Test to check user is able to see this validation(extension name is required.) if the user click on save button without enter extension name.
	      WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
		  Extensionnumber.sendKeys("11");
		  Thread.sleep(3000);
	      String actualextensionname = "Extension name is required.";
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnSaveNewExt")).click();
		 String Expectextensionname = driver.findElement(By.xpath("//*[contains(text(),'Extension name is required.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualextensionname, Expectextensionname); 
	      //Test to check user is able to see this validation(Follow-up text is required.) when the user click on save button without enter follow-up text
	      WebElement Displayname = driver.findElement(By.id("txtDispName"));
		 Displayname.sendKeys("Testing Informational ext");
		 //Test to check whether toggle key is presence on the page or not
		 WebElement toggleKey = driver.findElement(By.xpath("//*[@id='divTxtbkhead']/div[2]/label")); 
	     softAssert.assertTrue(toggleKey.isDisplayed(), "Toggle key is not present on the page");
	     
	     WebElement clickontoggleKey = driver.findElement(By.xpath("//*[@id='divTxtbkhead']/div[2]/label")); 
	     clickontoggleKey.click();
	     Thread.sleep(3000);
		  driver.findElement(By.id("btnSaveNewExt")).click();
		  String Actualfollowuptextvalidation = "Follow-up text is required.";
		  String Expectedfollowuptextvalidation = driver.findElement(By.xpath("//*[contains(text(),'Follow-up text is required.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(Actualfollowuptextvalidation, Expectedfollowuptextvalidation);
		  
	      softAssert.assertAll();
		 
	  }
	  @Test (priority = 21)
	  public void testAllvalidationofCreatingStandardextension() throws InterruptedException

	  {
		  SoftAssert softAssert = new SoftAssert();
		
		  //Test to check user is able to see the validation(Extension number is required.) if the user click on save button without enter extension number.
		  driver.findElement(By.id("imgExtAdd")).click();
		  Thread.sleep(3000);
		  String actual = "Extension number is required.";
		  Thread.sleep(3000);
	      driver.findElement(By.id("btnSaveNewExt")).click();
		  Thread.sleep(3000);
		  String Expect = driver.findElement(By.xpath("//*[contains(text(),'Extension number is required.')]")).getText();
	      softAssert.assertEquals(actual, Expect); 
	      driver.findElement(By.xpath("//label[@for='rdbPBX']")).click();
	      WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
		  Extensionnumber.sendKeys("111");
		  Thread.sleep(3000);
	      //Test to check user is able to see this validation(First name required.) when the user click on save button without enter firstname.
	      driver.findElement(By.id("btnNewPBXSave")).click();
	      String actualresult = "First name required.";
	      String expectedresult = driver.findElement(By.xpath("//*[contains(text(),'First name required.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult, expectedresult); 
	 	 WebElement Firstname = driver.findElement(By.id("txtNewFirstName"));
	 	 Firstname.sendKeys("Testing Standard");
	      //Test to check user is able to see this validation(First name required.) when the user click on save button without enter lastname.
	      driver.findElement(By.id("btnNewPBXSave")).click();
	      String actualresult1 = "Last name required.";
	      String expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Last name required.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult1, expectedresult1); 
	      WebElement Lastname = driver.findElement(By.id("txtNewLastName"));
		  Lastname.sendKeys("Extension");
	      
	      //Test to check users is able to see this validation(Enter a 4 to 6 digit passcode.) when the user click on save button without enter passcode.
	    //  driver.findElement(By.id("btnNewPBXSave")).click();
	      Actions act =  new Actions(driver);
	      act.moveToElement(driver.findElement(By.id("btnNewPBXSave"))).click().perform();
	      String actualresult2 = "Enter a 4 to 6 digit passcode.";
	      String expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult2, expectedresult2); 
	      //Test to check user is able to see this validation(Enter a 4 to 6 digit passcode.) when the user click on save button with enter less then four digits passcode
	      WebElement Passcode = driver.findElement(By.id("txtNewPBXPasscode"));
		  Passcode.sendKeys("55");
		  Thread.sleep(3000);
		  Actions act1 =  new Actions(driver);
	      act1.moveToElement(driver.findElement(By.id("btnNewPBXSave"))).click().perform();
	   //   driver.findElement(By.id("btnNewPBXSave")).click();
	      String actualresult3 = "Enter a 4 to 6 digit passcode.";
	      String expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult3, expectedresult3); 
	      driver.findElement(By.id("txtNewPBXPasscode")).clear();
	      WebElement Passcode9 = driver.findElement(By.id("txtNewPBXPasscode"));
		  Passcode9.sendKeys("6666");
	      
	      
	      //Test to check user is able to see this validation(Passcode and confirm passcode should be same.) when the user click on save button without enter retypepasscode.
		  Actions act12 =  new Actions(driver);
	      act12.moveToElement(driver.findElement(By.id("btnNewPBXSave"))).click().perform();
	      String actualresult5 = "Passcode and confirm passcode should be same.";
	      String expectedresult5 = driver.findElement(By.xpath("//*[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult5, expectedresult5); 
	      //Test to check user is able to see this validation(Passcode and confirm passcode should be same.) when the user click on save button with enter wrong passcode.  
	      WebElement RetypePasscode = driver.findElement(By.id("txtRetypePBXPasscode"));
		  RetypePasscode.sendKeys("5555");
		  String actualresult6 = "Passcode and confirm passcode should be same.";
	      String expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult6, expectedresult6); 
	      driver.findElement(By.id("txtRetypePBXPasscode")).clear();
	      WebElement RetypePasscode1 = driver.findElement(By.id("txtRetypePBXPasscode"));
		  RetypePasscode1.sendKeys("6666");
		  Actions act13 =  new Actions(driver);
	      act13.moveToElement(driver.findElement(By.id("btnNewPBXSave"))).click().perform();
		   
		   WebElement linkElement = driver.findElement(By.partialLinkText("Login to"));

	       // Verify if the link is displayed on the page
	       softAssert.assertTrue(linkElement.isDisplayed(), "Link is present on the page");
	       
	       WebElement AllowCallForwarding  = driver.findElement(By.xpath("//*[contains(text(),'Allow Call Forwarding ')]"));
	       softAssert.assertTrue(AllowCallForwarding.isDisplayed(), "AllowCallForwarding text is present on the page");
	       
	       WebElement toggleElement = driver.findElement(By.xpath("//*[@id='divCLForward']/label/div/div/label[1]"));
	       softAssert.assertTrue(toggleElement.isDisplayed(), "AllowCallForwarding Toggle is present on the page");
	       
	       WebElement toggleturnoff = driver.findElement(By.xpath("//*[@id='divCLForward']/label/div/div/label[1]"));
	       toggleturnoff.click();
	       Thread.sleep(3000);
	       WebElement toggleturnon = driver.findElement(By.xpath("//*[@id='divCLForward']/label/div/div/label[2]"));
	       toggleturnon.click();
	       
	       WebElement AllowOutboundCalls   = driver.findElement(By.xpath("//*[contains(text(),'Allow Outbound Calls ')]"));
	       softAssert.assertTrue(AllowOutboundCalls.isDisplayed(), "AllowOutboundCalls text is present on the page");
	       
	       WebElement toggleElement1 = driver.findElement(By.xpath("//*[@id='divOutboundCalls']/label/div/div/label[1]"));
	       softAssert.assertTrue(toggleElement1.isDisplayed(), "AllowOutboundCalls Toggle is present on the page");
	       
	       WebElement AllowOutboundCallstoggleturnoff = driver.findElement(By.xpath("//*[@id='divOutboundCalls']/label/div/div/label[1]"));
	       AllowOutboundCallstoggleturnoff.click();
	       Thread.sleep(3000);
	       WebElement AllowOutboundCallstoggleturnon = driver.findElement(By.xpath("//*[@id='divOutboundCalls']/label/div/div/label[2]"));
	       AllowOutboundCallstoggleturnon.click();
	       
	       WebElement AllowOutboundFaxing    = driver.findElement(By.xpath("//*[contains(text(),'Allow Outbound Faxing ')]"));
	       softAssert.assertTrue(AllowOutboundFaxing.isDisplayed(), "AllowOutboundFaxing text is present on the page");
	       
	       WebElement toggleElement2 = driver.findElement(By.xpath("//*[@id='divOutboundFax']/label/div/div/label[1]"));
	       softAssert.assertTrue(toggleElement2.isDisplayed(), "AllowOutboundFaxing Toggle is present on the page");
	       
	       WebElement AllowOutboundFaxingtoggleturnoff = driver.findElement(By.xpath("//*[@id='divOutboundFax']/label/div/div/label[1]"));
	       AllowOutboundFaxingtoggleturnoff.click();
	       Thread.sleep(3000);
	       WebElement AllowOutboundFaxingtoggleturnon = driver.findElement(By.xpath("//*[@id='divOutboundFax']/label/div/div/label[2]"));
	       AllowOutboundFaxingtoggleturnon.click();
	       
	       WebElement AllowVoicemailTranscription     = driver.findElement(By.xpath("//span[contains(text(),'Allow Voicemail Transcription')]"));
	       softAssert.assertTrue(AllowVoicemailTranscription.isDisplayed(), "AllowVoicemailTranscription text is present on the page");
	      
	       WebElement toggleElement3 = driver.findElement(By.xpath("//*[@id='divPBXVT']/label/div/div/label[1]"));
	       softAssert.assertTrue(toggleElement3.isDisplayed(), "AllowVoicemailTranscription Toggle is present on the page");
	       
	       WebElement AllowVoicemailTranscriptiontoggleturnoff = driver.findElement(By.xpath("//*[@id='divPBXVT']/label/div/div/label[1]"));
	       AllowVoicemailTranscriptiontoggleturnoff.click();
	       Thread.sleep(3000);
	       WebElement AllowVoicemailTranscriptiontoggleturnon = driver.findElement(By.xpath("//*[@id='divPBXVT']/label/div/div/label[2]"));
	       AllowVoicemailTranscriptiontoggleturnon.click();
	       
	       
	       WebElement OwnerFirstname = driver.findElement(By.id("txtNewFirstName"));
	       OwnerFirstname.clear();
	       WebElement OwnerFirstname1 = driver.findElement(By.id("txtNewFirstName"));
	       OwnerFirstname1.sendKeys("PBX");
	       Thread.sleep(3000);
	       WebElement Ownerlastname = driver.findElement(By.id("txtNewLastName"));
	       Ownerlastname.clear();
	       WebElement Ownerlastname2 = driver.findElement(By.id("txtNewLastName"));
	       Ownerlastname2.sendKeys("EXT");
	       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-750)");
	       Thread.sleep(3000);
	     //  driver.findElement(By.id("btnPBXSave")).click();
	       Actions act22 =  new Actions(driver);
	       act22.moveToElement(driver.findElement(By.id("btnPBXSave"))).click().perform();
	       Thread.sleep(3000);
	       String actualresult8 = "PBX settings updated successfully.";
	       String expectedresult8 = driver.findElement(By.xpath("//label[contains(text(),'PBX settings updated successfully.')]")).getText();
	       Thread.sleep(3000);
	       softAssert.assertEquals(actualresult8, expectedresult8); 
	       
	       
		   WebElement Changepasscodelink = driver.findElement(By.id("spPBXChangePasscode"));
	       softAssert.assertTrue(Changepasscodelink.isDisplayed(), "Changepasscodelink is present on the page");
	       
	       WebElement Changepasscodelinkclick = driver.findElement(By.id("spPBXChangePasscode"));
	       Changepasscodelinkclick.click();
	       
	       WebElement NewPasscode = driver.findElement(By.id("txtNewPasscode"));
	       NewPasscode.sendKeys("");
	       WebElement Save = driver.findElement(By.id("btnPassSave"));
	       Save.click();
	       
	       String actualresult9 = "Passcode required.";
	       String expectedresult9 = driver.findElement(By.xpath("//label[contains(text(),'Passcode required.')]")).getText();
	       Thread.sleep(3000);
	       softAssert.assertEquals(actualresult9, expectedresult9); 
	       
	       WebElement NewPasscode1 = driver.findElement(By.id("txtNewPasscode"));
	       NewPasscode1.sendKeys("22");
	       WebElement Save1 = driver.findElement(By.id("btnPassSave"));
	       Save1.click();
	       String actualresult10 = "Enter a 4 to 6 digit passcode.";
	       String expectedresult10 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	       Thread.sleep(3000);
	       softAssert.assertEquals(actualresult10, expectedresult10); 
	       WebElement NewPasscode2 = driver.findElement(By.id("txtNewPasscode"));
	       NewPasscode2.clear();
	       
	       WebElement NewPasscode3 = driver.findElement(By.id("txtNewPasscode"));
	       NewPasscode3.sendKeys("8888");
	       WebElement Save2 = driver.findElement(By.id("btnPassSave"));
	       Save2.click();
	       
	       
	       String actualresult11 = "Passcode and confirm passcode should be same.";
	       String expectedresult11 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	       Thread.sleep(3000);
	       softAssert.assertEquals(actualresult11, expectedresult11); 
	       
	       WebElement RetypeNewPasscode = driver.findElement(By.id("txtRetypePasscode"));
	       RetypeNewPasscode.sendKeys("22");
	       WebElement Save3 = driver.findElement(By.id("btnPassSave"));
	       Save3.click();
	         

	       String actualresult12 = "Passcode and confirm passcode should be same.";
	       String expectedresult12 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	       Thread.sleep(3000);
	       softAssert.assertEquals(actualresult12, expectedresult12); 
	       
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
	       softAssert.assertEquals(actualresult13, expectedresult13); 
	       softAssert.assertAll();
	  }
	  @Test (priority = 22)
	  public void testCreatingStandardExtension() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
		  
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
//			  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
//			  Thread.sleep(3000);
			  
			  Actions act1 =  new Actions(driver);
		      act1.moveToElement(driver.findElement(By.id("btnNewPBXSave"))).click().perform();
		  softAssert.assertAll();
	  }
	  @Test (priority = 23)
	  public void testClicksoncreatedExtensions() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.xpath("//*[@id='dgExtLists']/tbody/tr[1]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='dgExtLists']/tbody/tr[2]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='dgExtLists']/tbody/tr[3]")).click();
//		  Thread.sleep(3000);
//		  WebElement Extensionnumber = driver.findElement(By.id("txtExtensionNo"));
//		  Extensionnumber.sendKeys("12");
//		  Thread.sleep(3000);
//		 WebElement Description = driver.findElement(By.id("txtExtPBXDesc"));
//		 Description.sendKeys("Testing Description field of Message Taking Extension");
//		  Thread.sleep(3000);
//		 WebElement Firstname = driver.findElement(By.id("txtNewFirstName"));
//		 Firstname.sendKeys("Testing Standard");
//		  Thread.sleep(3000);
		  softAssert.assertAll();
	  }
	  @Test (priority = 24)
	  public void testAllvalidationwithCreatingDeparmentExtension() throws InterruptedException
	  {
		  SoftAssert softAssert = new SoftAssert();
		  //Test to check user is able to see the validation(Extension number is required.) if the user click on save button without enter extension number.
		  driver.findElement(By.id("imgExtAdd")).click();
		  Thread.sleep(3000);
		   driver.findElement(By.id("btnSaveNewExt")).click();
		  String actual = "Extension number is required.";
		  Thread.sleep(3000);
	 
		  String Expect = driver.findElement(By.xpath("//*[contains(text(),'Extension number is required.')]")).getText();
	      softAssert.assertEquals(actual, Expect); 
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
	      softAssert.assertEquals(actualresult, expectedresult); 
	      

	      WebElement Departmentname = driver.findElement(By.id("txtDeptName"));
	      Departmentname.sendKeys("Department ext");
	      driver.findElement(By.id("btnNewACDSave")).click();
	      
	      
	      WebElement CallDistributionType = driver.findElement(By.xpath("//label[@for='grpCallDistribution']"));
	      softAssert.assertTrue(CallDistributionType.isDisplayed(), "CallDistributionType text is present on the page");
	      

		   WebElement RoundRobinRadiobutton = driver.findElement(By.xpath("//label[@for='rdbRoundRobin']"));
	      softAssert.assertTrue(RoundRobinRadiobutton.isEnabled(), "RoundRobinRadio button  is present on the page");
	      

		   WebElement NextAvailableobutton = driver.findElement(By.xpath("//label[@for='rdbNxtAvailable']"));
	      softAssert.assertTrue(NextAvailableobutton.isEnabled(), "NextAvailableo button  is present on the page");
	      
	      String actualresult9 = "Enter a 4 to 6 digit passcode.";
	      String expectedresult9 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult9, expectedresult9); 
	      
	      WebElement NewPasscode1 = driver.findElement(By.id("txtACDPass"));
	      NewPasscode1.sendKeys("22");
	      WebElement Save1 = driver.findElement(By.id("btnNewACDSave"));
	      Save1.click();
	      String actualresult10 = "Enter a 4 to 6 digit passcode.";
	      String expectedresult10 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult10, expectedresult10); 
	      
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
	      softAssert.assertEquals(actualresult11, expectedresult11); 
	      
	      WebElement RetypeNewPasscode = driver.findElement(By.id("txtACDRetypePass"));
	      RetypeNewPasscode.sendKeys("22");
	      WebElement Save3 = driver.findElement(By.id("btnNewACDSave"));
	      Save3.click();
	        

	      String actualresult12 = "Passcode and confirm passcode should be same.";
	      String expectedresult12 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult12, expectedresult12); 
	      
	      WebElement RetypeNewPasscode1 = driver.findElement(By.id("txtACDRetypePass"));
	      RetypeNewPasscode1.clear();
	      Thread.sleep(3000);

	      WebElement RetypeNewPasscode2 = driver.findElement(By.id("txtACDRetypePass"));
	      RetypeNewPasscode2.sendKeys("8888");
	      
	      WebElement Save4 = driver.findElement(By.id("btnNewACDSave"));
	      Save4.click();
	      Thread.sleep(3000);
	      ///////////////
	      WebElement linkElement = driver.findElement(By.partialLinkText("Login to"));

	      // Verify if the link is displayed on the page
	      softAssert.assertTrue(linkElement.isDisplayed(), "Link is present on the page");
	      
	      
		   WebElement Changepasscodelink = driver.findElement(By.id("spACDChangePass"));
	      softAssert.assertTrue(Changepasscodelink.isDisplayed(), "Changepasscodelink is present on the page");
	      
	      WebElement Changepasscodelinkclick = driver.findElement(By.id("spACDChangePass"));
	      Changepasscodelinkclick.click();
	      
	      WebElement NewPasscode = driver.findElement(By.id("txtACDNewPass"));
	      NewPasscode.sendKeys("");
	      WebElement Save = driver.findElement(By.id("btnSaveACDPass"));
	      Save.click();
	      
	     String actualresult20 = "Passcode required.";
	      String expectedresult20 = driver.findElement(By.xpath("//label[contains(text(),'Passcode required.')]")).getText();
	     Thread.sleep(3000);
	      softAssert.assertEquals(actualresult20, expectedresult20); 
	      
	      WebElement NewPasscode21 = driver.findElement(By.id("txtACDNewPass"));
	      NewPasscode21.sendKeys("22");
	      WebElement Save11 = driver.findElement(By.id("btnSaveACDPass"));
	      Save11.click();
	      String actualresult22 = "Enter a 4 to 6 digit passcode.";
	      String expectedresult23 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult22, expectedresult23); 
	      WebElement NewPasscode24 = driver.findElement(By.id("txtACDNewPass"));
	      NewPasscode24.clear();
	      
	      WebElement NewPasscode25 = driver.findElement(By.id("txtACDNewPass"));
	      NewPasscode25.sendKeys("8888");
	      WebElement Save12 = driver.findElement(By.id("btnSaveACDPass"));
	      Save12.click();
	      
	      
	      String actualresult24 = "Passcode and confirm passcode should be same.";
	      String expectedresult24 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult24, expectedresult24); 
	      
	      WebElement RetypeNewPasscode11 = driver.findElement(By.id("txtACDNewRetypePass"));
	      RetypeNewPasscode11.sendKeys("22");
	      WebElement Save7 = driver.findElement(By.id("btnSaveACDPass"));
	      Save7.click();
	        

	      String actualresult44 = "Passcode and confirm passcode should be same.";
	      String expectedresult44 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	      Thread.sleep(3000);
	      softAssert.assertEquals(actualresult44, expectedresult44); 
	      
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
	      softAssert.assertEquals(actualresult13, expectedresult13); 
	      
	      
	      WebElement NextAvailableobuttonclick = driver.findElement(By.xpath("//label[@for='rdbNxtAvailable']"));
	      NextAvailableobuttonclick.click();
	     
	      WebElement AllowVoicemailTranscription  = driver.findElement(By.xpath("//label[@for='grpCallDistribution']"));
	      softAssert.assertTrue(AllowVoicemailTranscription.isDisplayed(), "AllowVoicemailTranscription text is present on the page");
	      
	      WebElement toggleElement1 = driver.findElement(By.xpath("//*[@id='divACDVT']/label[2]/div/div/label[1]"));
	      softAssert.assertTrue(toggleElement1.isDisplayed(), "AllowVoicemailTranscription Toggle is present on the page");
	      
	      WebElement AllowOutboundCallstoggleturnoff = driver.findElement(By.xpath("//*[@id='divACDVT']/label[2]/div/div/label[2]"));
	      AllowOutboundCallstoggleturnoff.click();
	      Thread.sleep(3000);
	      WebElement AllowOutboundCallstoggleturnon = driver.findElement(By.xpath("//*[@id='divACDVT']/label[2]/div/div/label[1]"));
	      AllowOutboundCallstoggleturnon.click();
	      

	      WebElement CallCenterOperators   = driver.findElement(By.xpath("//label[@for='grpCallDistribution']"));
	      softAssert.assertTrue(CallCenterOperators.isDisplayed(), "CallCenterOperators text is present on the page");
	      
	      WebElement AddQbutton   = driver.findElement(By.id("btnACDAddQ"));
	      softAssert.assertTrue(AddQbutton.isEnabled(), "AddQbutton button is present on the page");
	      
	      WebElement dropdownElement = null;
	      try {
	          dropdownElement = driver.findElement(By.id("ddlPBXExtList"));
	      
	      } catch (org.openqa.selenium.NoSuchElementException e) {
	          // NoSuchElementException will be thrown if the element is not found
	          // Handle the absence of the dropdown here if needed
	    	  System.out.println("Dropdown is not present on the page.");
	      }

	      // Verify if the dropdown is present on the page
	      softAssert.assertNotNull(dropdownElement, "Dropdown is present on the page");
	      
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

	      Thread.sleep(5000);
	      driver.findElement(By.id("btnACDAddQ")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.id("btnACDAddQ")).click();
	      Thread.sleep(3000);
	    
	      WebElement Autorecordcalls  = driver.findElement(By.xpath("//label[contains(text(),'Auto-record calls')]"));
	      softAssert.assertTrue(Autorecordcalls.isDisplayed(), "Autorecordcalls text is present on the page");
	      
	      WebElement Autorecordcallstoogle = driver.findElement(By.xpath("//*[@id='divConfigACD']/div/div[1]/div[2]/label/div/div/label[2]"));
	      softAssert.assertTrue(Autorecordcallstoogle.isDisplayed(), "Autorecordcalls Toggle is present on the page");
	      Thread.sleep(3000);
	      WebElement Autorecordcallstoogletoggleturnoff = driver.findElement(By.xpath("//*[@id='divConfigACD']/div/div[1]/div[2]/label/div/div/label[2]"));
	     Autorecordcallstoogletoggleturnoff.click();
	      Thread.sleep(3000);
//	      WebElement Autorecordcallstoogletoggleturnon = driver.findElement(By.xpath("//*[@id='divConfigACD']/div/div[1]/div[2]/label/div/div/label[1]"));
//	      Autorecordcallstoogletoggleturnon.click();
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	     
	     String actual2 = "Record Every Number";
		  Thread.sleep(3000);
		  String Expect2 = driver.findElement(By.xpath("//*[contains(text(),'Record Every Number')]")).getText();
	     softAssert.assertEquals(actual2, Expect2); 
	     
	     //Test to check user able to see the extension text box field or not
	     WebElement txtboxfield = driver.findElement(By.id("txtRecordCallFreq")); 
	     softAssert.assertTrue(txtboxfield.isDisplayed(), "Logo should be visible on the page");
	     
	     //Test to check user able to see the min amd max enter extension numbers content (1-9999)
	     String actual3 = "call that...";
		  Thread.sleep(3000);
		  String Expect3 = driver.findElement(By.xpath("//*[contains(text(),'call that...')]")).getText();
	     softAssert.assertEquals(actual3, Expect3); 
	      
	     WebElement Atanytime = driver.findElement(By.xpath("//label[@for='rbRec24HrSchedule']"));
	     Atanytime.click();
	    
	     WebElement Atanytimetxt  = driver.findElement(By.xpath("//label[@for='rbRec24HrSchedule']"));
	     softAssert.assertTrue(Atanytimetxt.isDisplayed(), "Atanytime text is present on the page");
	     
	     WebElement Betweenthehoursof  = driver.findElement(By.xpath("//label[@for='rbRecScheduleBetween']"));
	     softAssert.assertTrue(Betweenthehoursof.isDisplayed(), "Betweenthehoursof text and radio button is present on the page");
	     
	     WebElement comesintoCallCenter  = driver.findElement(By.xpath("//*[@id='divAutoCallSettings']/div[1]/div[2]"));
	     softAssert.assertTrue(comesintoCallCenter.isDisplayed(), "comesintoCallCenter text and radio button is present on the page");
	     
	     WebElement connectstooperators  = driver.findElement(By.xpath("//label[@for='rbForwardThroughACD']"));
	     softAssert.assertTrue(connectstooperators.isDisplayed(), "connectstooperators text and radio button is present on the page");
	     
	     WebElement Fromtime  = driver.findElement(By.xpath("//*[@id='divStarTime']"));
	     softAssert.assertTrue(Fromtime.isDisplayed(), "starttime text and radio button is present on the page");
	     
	     WebElement Totime  = driver.findElement(By.xpath("//*[@id='divEndTime']"));
	     softAssert.assertTrue(Totime.isDisplayed(), "Totime text and radio button is present on the page");
	     
	     WebElement Onthesedays   = driver.findElement(By.xpath("//*[@id='divScheduleDays']/span[1]"));
	     softAssert.assertTrue(Onthesedays.isDisplayed(), "Onthesedays text is present on the page");
	     
	     WebElement Sunday   = driver.findElement(By.xpath("//*[contains(text(),'SUN')]"));
	     softAssert.assertTrue(Sunday.isEnabled(), "Sunday is present on the page");
	     
	     
	     WebElement Monday   = driver.findElement(By.xpath("//*[contains(text(),'MON')]"));
	     softAssert.assertTrue(Monday.isEnabled(), "Monday is present on the page");
	     
	     WebElement Tuesday   = driver.findElement(By.xpath("//*[contains(text(),'TUE')]"));
	     softAssert.assertTrue(Tuesday.isEnabled(), "Tuesday is present on the page");
	     
	     
	     WebElement Wednesday   = driver.findElement(By.xpath("//*[contains(text(),'WED')]"));
	     softAssert.assertTrue(Wednesday.isEnabled(), "Wednesday is present on the page");
	     
	     WebElement Thursday   = driver.findElement(By.xpath("//*[contains(text(),'THU')]"));
	     softAssert.assertTrue(Thursday.isEnabled(), "Sunday is present on the page");
	     
	     
	     WebElement Friday   = driver.findElement(By.xpath("//*[contains(text(),'FRI')]"));
	     softAssert.assertTrue(Friday.isEnabled(), "Friday is present on the page");
	     
	     WebElement Saturday   = driver.findElement(By.xpath("//*[contains(text(),'SAT')]"));
	     softAssert.assertTrue(Saturday.isEnabled(), "Saturday is present on the page");
		  Thread.sleep(3000);
//	     driver.findElement(By.id("aACDAccess")).click();
//	     
//	     String expectedURL = "https://backoffice.itelecenter.com/Inbox.aspx?ext=0022"; // Define your expected URL
//	     driver.get(expectedURL);
	//
//	     // Get the actual URL
//	     String actualURL = driver.getCurrentUrl();
	//
//	     // Verify if the actual URL matches the expected URL
//	     softAssert.assertEquals(actualURL, expectedURL, "Actual URL doesn't match Expected URL");
		  softAssert.assertAll();
	  }
	  @Test  (priority = 25)
	  public void testUIofAddNewTextCcode() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();

	      driver.findElement(By.id("divTextCodes")).click();
		  Thread.sleep(3000);
		  if(driver.findElements(By.id("imgAddtxtCode")).size()>0)
		  {
			  driver.findElement(By.id("imgAddtxtCode")).click();
			  String Actualresult2 = "Text Code:";
			     String Expected2 =  driver.findElement(By.xpath("//*[contains(@for,'txtCode')]")).getText();
			     softAssert.assertEquals(Actualresult2, Expected2);
			     
			     WebElement Textcodefieldbox = driver.findElement(By.id("txtCode"));
			  	if(Textcodefieldbox.isDisplayed())
			  	{
			  		System.out.println("txtCode is Displayed");
			  	}
			  	else
			  	{
			  		System.out.println("txtCode is Not Displayed");
			  	}
			    WebElement TextcodeinfoImage = driver.findElement(By.id("a5"));
			 	if(TextcodeinfoImage.isDisplayed())
			 	{
			 		System.out.println("Info_icon is Displayed");
			 	}
			 	else
			 	{
			 		System.out.println("Info_icon is Not Displayed");
			 	}
			 	  String Actualresult5 = "Text-back is:";
			      String Expected5 =  driver.findElement(By.xpath("//*[contains(@for,'txtNewFirstName')]")).getText();
			      softAssert.assertEquals(Actualresult5, Expected5);
			      Thread.sleep(3000);
			      WebElement buttonElement = driver.findElement(By.xpath("//*[contains(@class,'btn btn-default active toggle-off')]"));

			        // Check if the element is enabled
			        boolean isButtonEnabled = buttonElement.isEnabled();

			        // softAssertion to verify if the element is enabled
			        softAssert.assertTrue(isButtonEnabled, "Submit button is not enabled");
			        
			        driver.findElement(By.xpath("//label[@class='checkbox-inline']")).click();
			  	  
			        String Expected = "Auto Reply:";
			  	  WebElement element = driver.findElement(By.xpath("//label[@for='autotxtReply']")); // Assuming the text is within the <body> tag

			        // Get the text from the element
			        String pageText = element.getText();
			        System.out.println(pageText);

			        // softAssert that the text is present on the page
			        softAssert.assertEquals(pageText, Expected);
			        WebElement AutotxtReply = driver.findElement(By.id("autotxtReply"));
			     	if(AutotxtReply.isDisplayed())
			     	{
			     		System.out.println("autotxtReply is Displayed");
			     	}
			     	else
			     	{
			     		System.out.println("autotxtReply is Not Displayed");
			     	}
			     	 String Actualresult6 = "480 of 480 characters remaining";
			         String Expected6 =  driver.findElement(By.xpath("//*[contains(@style,'margin-bottom: 10px; margin-left:13%; margin-top: 5px;')]")).getText();
			         softAssert.assertEquals(Actualresult6, Expected6);
			         
			         String Actualresult4 = "Counted as 0 message(s)\n"
			         		+ "\n"
			         		+ "Upto 400 total text messages on account per month are free. (2¢ per additional message)";
			         String Expected4 =  driver.findElement(By.xpath("//*[contains(@style,'margin-left: 13%; margin-top: 5px; margin-bottom: 10px;')]")).getText();
			         softAssert.assertEquals(Actualresult4, Expected4);
			     	
		  }
		   softAssert.assertAll();
	  }
	  @Test (priority = 26)
	  public void testCreateNewTextCode() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("imgAddtxtCode")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("btnSaveNewtxtCode")).click();

		  //Test to check user is able to see this validation(Please Enter Text Code.) when he does not enter textcode name in text code field and click on ssave button.  
		  String Actual = "Please Enter Text Code.";
		  String Expected4 =  driver.findElement(By.xpath("//*[contains(text(),'Please Enter Text Code.')]")).getText();
		  softAssert.assertEquals(Actual, Expected4);
		  Thread.sleep(2000);
		  driver.findElement(By.id("txtCode")).sendKeys("Code2");
		  Thread.sleep(2000);
		  //Test to check user is able to see this validation(Please On Text-back.) when he does not turn on Text-back tooglekey with entered textcode and click on save button. 
		  driver.findElement(By.id("btnSaveNewtxtCode")).click();
		  String Actual1 = "Please On Text-back.";
		  String Expected5 =  driver.findElement(By.xpath("//*[contains(text(),'Please On Text-back.')]")).getText();
		  softAssert.assertEquals(Actual1, Expected5);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[contains(@class,'checkbox-inline')]")).click();
		  //Test to check user is able to see this validation(Please Enter Auto Reply Text.) when he does not enter Auto replay msg
		  driver.findElement(By.id("btnSaveNewtxtCode")).click();
		  String Actual2 = "Please Enter Auto Reply Text.";
		  String Expected6 =  driver.findElement(By.xpath("//*[contains(text(),'Please Enter Auto Reply Text.')]")).getText();
		  softAssert.assertEquals(Actual2, Expected6);
		  //Test to check user is able to see successfull validation or not.
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//textarea[@id='autotxtReply']")).sendKeys("Testing Text codes");
		  Thread.sleep(2000);
		 WebElement test = driver.findElement(By.id("btnSaveNewtxtCode"));
		 test.click();
		
		
		 
		  /// Test to check user able see this validation(Text Code Updated successfully.) when he enter existed textcode.
//		  String Actual3 = "Text Code Updated successfully.";
//		  String Expected7 =  driver.findElement(By.xpath("//*[contains(text(),'Text Code Updated successfully.')]")).getText();
//		  softAssert.assertEquals(Actual3, Expected7);  
		   softAssert.assertAll();
	  }
	  @Test (priority = 27)
	  public void testSmsUIValidation() throws InterruptedException
	  {
		  SoftAssert softAssert = new SoftAssert();
		  
		  driver.findElement(By.id("divInbox")).click();
		     Thread.sleep(3000);
		  //Test to check user is able to see Add SMS icon
		  WebElement AddSmsicon = driver.findElement(By.xpath("//img[@class='new-txt-icon']")); 
		     softAssert.assertTrue(AddSmsicon.isDisplayed(), "Add SMS icon is not present on the page");
		     
		     //Test to check user is able to see the New Text
		     String actualresult = "New Text";
		       String Expectedresult = driver.findElement(By.xpath("//span[contains(text(),'New Text')]")).getText();
		       softAssert.assertEquals(actualresult, Expectedresult); 
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'New Text')]")).click();
		       
		       //Test to check user is able to see the New Message Panel after click on New SMS.
		       WebElement NewMessagePanel = driver.findElement(By.xpath("//img[@class='new-txt-icon']")); 
			     softAssert.assertTrue(NewMessagePanel.isDisplayed(), "NewMessagePanel is not present on the page");
			      Thread.sleep(3000);
			    //Test to check user is able to NewMessage Text over the panel.
			     String actualresult1 = "New Message";
			     String Expectedresult1 = driver.findElement(By.xpath("//*[@id='divNewMessage']/span[1]")).getText();
			     softAssert.assertEquals(actualresult1, Expectedresult1);
			     
			     //Test to check user is able to see the SMS close panel.
			     
			     WebElement SMSclosepanel = driver.findElement(By.xpath("//span[contains(@id,'divSMSclose')]")); 
			     softAssert.assertTrue(SMSclosepanel.isDisplayed(), "SMSclosepanel is not present on the page");
			     
			     //Test to check user is able to see the Contact symbol
			     
			     WebElement Contactsymbol = driver.findElement(By.xpath("//img[@class='user_small']")); 
			     softAssert.assertTrue(Contactsymbol.isDisplayed(), "Contactsymbol is not present on the page");
			     
			     //Test to check user is able to see "To" text over the SMSpanel.
			     WebElement Totext = driver.findElement(By.xpath("//span[contains(text(),'New Message')]")); 
			     softAssert.assertTrue(Totext.isDisplayed(), "Totext is not present on the page");
			     
			     //Test to check user is able see "textbox" for entering number.
			     WebElement textbox = driver.findElement(By.id("txtToNumber")); 
			     softAssert.assertTrue(textbox.isDisplayed(), "textbox is not present on the page");
			     
			     //Test to check user is able see "Textareabox" for entering message.
			     WebElement Textareabox = driver.findElement(By.xpath("//*[@id='txtMsgText']")); 
			     softAssert.assertTrue(Textareabox.isDisplayed(), "textbox is not present on the page");
			     
			     //Test to check user is able to see the SMS send img
			     WebElement SMSsendimg = driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")); 
			     softAssert.assertTrue(SMSsendimg.isDisplayed(), "SMSsendimg is not present on the page");
			     
			     //Test to check user is able to see Uploadfile image
			     WebElement Uploadfile = driver.findElement(By.xpath("//*[@for='FUUploadMMS']")); 
			     softAssert.assertTrue(Uploadfile.isDisplayed(), "Uploadfile is not present on the page");
			     
			     //Test to check user is able to see the "480 of 480 characters remaining" text.
			     WebElement charactersremaining = driver.findElement(By.xpath("//*[@for='FUUploadMMS']")); 
			     softAssert.assertTrue(charactersremaining.isDisplayed(), "480 of 480 characters remaining is not present on the page");
			     
			     //Test to check user is able to see the "Counted as 0 message(s)" text
			     
			     WebElement Countedasmessage = driver.findElement(By.xpath("//*[@for='FUUploadMMS']")); 
			     softAssert.assertTrue(Countedasmessage.isDisplayed(), "Countedasmessage is not present on the page");		     
			     //Test to check user is able to close the SMS panel by click on SMS close symbol
			     WebElement SMSclosepanel1 = driver.findElement(By.xpath("//span[contains(@id,'divSMSclose')]")); 
			     SMSclosepanel1.click();
			     softAssert.assertAll();
	  }
	@ Test (priority = 28)
	  public void testSMSfunctionalitiesandValidations() throws InterruptedException
	  {
		  SoftAssert softAssert = new SoftAssert();
		  //Test to check user is able to see the phonenumber validation after click on Send image button without entering number.
		driver.findElement(By.xpath("//span[contains(text(),'New Text')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();
		   Thread.sleep(3000);
		   String expectedresult = "Enter Phone in xxxxxxxxxx or xxx-xxx-xxxx or (xxx) xxx-xxxx format.";
		   
		   String actualresult = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
		   
		   softAssert.assertEquals(expectedresult, actualresult);
		   
		 
		//Test to check user is able to see the phonenumber validation after click on send image with entering lessthen 10 digits.
		   
		   driver.findElement(By.id("txtToNumber")).sendKeys("877");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();

		   Thread.sleep(3000);
		   String expectedresult1 = "Use one of these formats for phone number xxxxxxxxxx, xxx-xxx-xxxx, (xxx) xxx-xxxx.";
		   
		   String actualresult1 = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
		   
		   softAssert.assertEquals(expectedresult1, actualresult1);  
		   driver.findElement(By.id("txtToNumber")).clear();
		   
		//Test to check user is able to see blank validation message when click on img sending button without entering message.
		   driver.findElement(By.id("txtToNumber")).sendKeys("8446247684");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();
		   Thread.sleep(3000);

		   String expectedresult2 = "You cannot send a blank message.";
		   
		   String actualresult2 = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
		   
		   softAssert.assertEquals(expectedresult2, actualresult2); 
		   
		   driver.findElement(By.id("txtToNumber")).clear();
		   
		   //test to check user is able to see Message sent successfull validation after sent sms.
		   
		   driver.findElement(By.id("txtToNumber")).sendKeys("8446247684");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='txtMsgText']")).sendKeys("Testing SMS by suresh");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='imgNewSMSSend']")).click();
		   String expectedresult3 = "Message sent successfully.";
		   String actualresult3 = driver.findElement(By.xpath("//*[@id='divMsgError']")).getText();
		   softAssert.assertEquals(expectedresult3, actualresult3); 
		   Thread.sleep(3000);
		   
		   WebElement SMSclosepanel1 = driver.findElement(By.xpath("//span[contains(@id,'divSMSclose')]")); 
		     SMSclosepanel1.click();
		     softAssert.assertAll();
		
	  }
	@Test (priority = 29)
	public void testMaingreetingfunctionality() throws InterruptedException
	{
		  SoftAssert softAssert = new SoftAssert();
		 driver.findElement(By.id("divSettings")).click();
		  Thread.sleep(3000);
		 driver.findElement(By.id("lnkGreetings")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("lnkSTGreeting")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("lnkTextToSpeech")).click();
		  Thread.sleep(3000);
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");
		  Thread.sleep(3000);
		  driver.findElement(By.id("TTSText")).clear();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnConvert")).click();
		  //Test to check user is able to see validation when click on convert button without enter text on textbox.
		  String Actualresult = "Please enter your Text-to-speech Main Greeting text before you click Convert...";
		  String Exptedresult = driver.findElement(By.xpath("//label[contains(text(),'Please enter your Text-to-speech Main Greeting text before you click Convert...')]")).getText();
		  Thread.sleep(3000);
		  softAssert.assertEquals(Actualresult, Exptedresult);
		  
		   WebElement dropdown = driver.findElement(By.id("ddlVoiceList")); // Replace with actual dropdown ID
	     Select select = new Select(dropdown);

	     // Select an option by visible text
	     select.selectByVisibleText("Ivy");
	    
	     // Validate if the selected option is the expected one
	     
	     softAssert.assertEquals(select.getFirstSelectedOption().getText(), "Ivy");
	     
	     // Get all options from the dropdown
	     List<WebElement> options = select.getOptions();

	     // Check if expected options are present
	     softAssert.assertEquals(options.size(), 8); // Change 4 to expected option count

	     // Verify the text of each option if needed
	     for (WebElement option : options) {
	          softAssert.assertTrue(option.getText().equals("Ivy") 
	          		|| option.getText().equals("Joanna") || option.getText().equals("Joey")
	          		|| option.getText().equals("Kendra") || option.getText().equals("Kimberly") 
	          		|| option.getText().equals("Matthew")|| option.getText().equals("Salli") || option.getText().equals("Justin"));
	         // Add assertions for each expected option text
	     }

	     WebElement audioPlayer = driver.findElement(By.id("TTSSampleGreet")); // Replace with actual audio player ID
	     softAssert.assertTrue(audioPlayer.isDisplayed());
	     
	     
	     
		  Thread.sleep(3000);
		  driver.findElement(By.id("TTSText")).sendKeys("We provide several products/services. If you were billed by COA Network and do not recognize our name, it is likely that you are using one of our products/services that is labeled by one of our large clients or a reseller. If you have questions about your bill or need to cancel your account, please contact us at CustomerCare@COANetwork.com or call 1-800-454-5930.");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnConvert")).click();
		  Thread.sleep(3000);
		  //Test to check user is able to see the (File conversion in progress.) content after click on convert with entered text.
		  String actual2 = "File conversion in progress.";
		  Thread.sleep(3000);
		  String Expect2 = driver.findElement(By.xpath("//span[contains(text(),'File conversion in progress.')]")).getText();
	   softAssert.assertEquals(actual2, Expect2); 
	   softAssert.assertAll();
		  
		
	}
	@Test (priority = 30)
	public void testSaveContacts() throws InterruptedException
	{
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("divContacts")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAddContact")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
	//Test to check user is able to see validation(Required a number) when click save button without enter any digit.
		  String Actualresult = "Required Phone Number.";
		  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Required Phone Number.')]")).getText();
		  softAssert.assertEquals(Actualresult, Expectedresult);
		  //test to check user is able to see the validation when entered less then ten digits.
		  driver.findElement(By.id("txtcntNumber")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
		  String Actualresult1 = "Enter Valid Phone Number.";
		  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Phone Number.')]")).getText();
		  softAssert.assertEquals(Actualresult1, Expectedresult1);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtcntNumber")).clear();
	//Test to check user is able see the validation(Enter Valid Email Address.) when enter wrong email.
		  driver.findElement(By.id("txtcntNumber")).sendKeys("9874563299");
		  WebElement Email = driver.findElement(By.id("txtcntEmail"));
		  Email.sendKeys("Testing");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
		  Thread.sleep(3000);
		  String Actualresult2 = "Enter Valid Email Address.";
		  String Expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Email Address.')]")).getText();
		  softAssert.assertEquals(Actualresult2, Expectedresult2);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtcntNumber")).clear();
		  Email.clear();
		  Thread.sleep(3000);
		  WebElement firstname = driver.findElement(By.id("txtcntFirstName"));
		  firstname.sendKeys("Testing");
		  Thread.sleep(3000);
		  WebElement lastname = driver.findElement(By.id("txtcntLastName"));
		  lastname.sendKeys("Contacts");
		  Thread.sleep(3000);
		  WebElement Phonenumber = driver.findElement(By.id("txtcntNumber"));
		  Phonenumber.sendKeys("1235647897");
		  Thread.sleep(3000);
		  WebElement Companyname = driver.findElement(By.id("txtcntFirstName"));
		  Companyname.sendKeys("COA");
		  Thread.sleep(3000);
		  WebElement Email1 = driver.findElement(By.id("txtcntEmail"));
		  Email1.sendKeys("Rajesh@gmail.com");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
		  //Test to check user is able to see the contact saved validation(Enter Valid Email Address.)
//		  String Actresult = "Your contact has been saved.";
//		  String Expresult = driver.findElement(By.xpath("//*[contains(text(),'Your contact has been saved.')]")).getText();
//		  softAssert.assertEquals(Actresult, Expresult);
		  Thread.sleep(3000);
		  driver.findElement(By.id("divAddCntClose")).click();
		   softAssert.assertAll();
	}

	@Test (priority = 31)
	public void testContactsSectionPage() throws InterruptedException
	{
		  SoftAssert softAssert = new SoftAssert();
		   WebElement imageElement = driver.findElement(By.xpath("//*[contains(@src,'images/CS-addcon-img.png')]")); // Modify the XPath accordingly
	     String srcAttribute = imageElement.getAttribute("src");
	     // Verify if src attribute contains a valid URL
	     softAssert.assertNotNull(srcAttribute, "Image is present");
	     // Optionally, you can also check if the URL is not empty or a placeholder image
	     softAssert.assertNotEquals(srcAttribute, "", "Image source is not empty");
	     
		  driver.findElement(By.id("imgDeleteContact")).click();
		  Thread.sleep(3000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  Thread.sleep(3000);
		  //Test to check user is able to see validation(Your contact has been deleted.) after deleted contact.
		  String Actualresult = "Your contact has been deleted.";
		  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Your contact has been deleted.')]")).getText();
		  softAssert.assertEquals(Actualresult, Expectedresult);
		  Thread.sleep(3000);
		  //Test to check user is able to see the Personal Information text
		  String Actualresult1 = "Personal Information";
		  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Personal Information')]")).getText();
		  softAssert.assertEquals(Actualresult1, Expectedresult1);
		  Thread.sleep(3000);
		  String Mainnumber =  driver.findElement(By.id("txtNumber")).getAttribute("value");
		  System.out.println(Mainnumber);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtNumber")).clear();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnEditContact")).click();
		  Thread.sleep(3000);
		  //Test to check user is able to see validation(Required a number) when click save button without enter any digit.
		  String Actualresult2 = "Required Phone Number.";
		  String Expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Required Phone Number.')]")).getText();
		  softAssert.assertEquals(Actualresult2, Expectedresult2);
		  //test to check user is able to see the validation when entered less then ten digits.
		  driver.findElement(By.id("txtNumber")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnEditContact")).click();
		  String Actualresult3 = "Enter Valid Phone Number.";
		  String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Phone Number.')]")).getText();
		  softAssert.assertEquals(Actualresult3, Expectedresult3);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtNumber")).clear();
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtNumber")).sendKeys(Mainnumber);
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnEditContact")).click();
		
		  //Test to check user is able to see validation(Your contact has been saved.) after deleted contact.
		  String Actualresult4 = "Your contact has been saved.";
		  String Expectedresult4 = driver.findElement(By.xpath("//*[contains(text(),'Your contact has been saved.')]")).getText();
		  softAssert.assertEquals(Actualresult4, Expectedresult4);
		  Thread.sleep(3000);
//		  int expectedItemCount = 5;
//		  List<WebElement> items = driver.findElements(By.xpath("//ul[@class='pagination bootpag']/a[not(text()='Prev' or text()='Next')]"));
//		  Thread.sleep(3000);
//	     int itemCount = items.size();
//			
//	     System.out.println(itemCount);
//	     softAssert.assertEquals(itemCount, expectedItemCount);
		  driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'3')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//a[contains(text(),'5')]")).click();
//		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		  Thread.sleep(3000);
		  WebElement prev = driver.findElement(By.xpath("//a[contains(text(),'Prev')]"));
		  prev.click();
		  Thread.sleep(3000);
		  prev.click();  prev.click();
		  
		  // Test to check whether Dropdown Existence or not on the page.
		       
		        WebElement dropdown = driver.findElement(By.id("ddlRowCount"));
		        softAssert.assertNotNull(dropdown);
		  // Test to check whether Dropdown Options or not diplaying over page.
//		           
//		            WebElement dropdown1 = driver.findElement(By.id("your_dropdown_id"));
//		            Select select = new Select(dropdown1);
//		            List<WebElement> options = select.getOptions();
		            
		            
		            //Test to check user is able to see select And Validate Option from dropdown.
		              
		                WebElement dropdown2 = driver.findElement(By.id("ddlRowCount"));
		                Select select = new Select(dropdown2);
		                Thread.sleep(3000);
		                select.selectByVisibleText("500"); // Change to the desired option
		                String selectedValue = select.getFirstSelectedOption().getText();
		                Thread.sleep(3000);
		                System.out.println(selectedValue);
		                softAssert.assertEquals(selectedValue, "500"); 
		  
		                WebElement singleCheckbox = driver.findElement(By.xpath("//*[contains(@for,'All')]"));
		                // Verify checkbox is unchecked initially
		                softAssert.assertFalse(singleCheckbox.isSelected(), "Checkbox is initially unchecked");
		                // Click on the checkbox
		                singleCheckbox.click();
		              
		               
		                // Verify checkbox is checked after clicking
		              //  softAssert.assertTrue(singleCheckbox.isSelected(), "Checkbox is checked after click");
		                Thread.sleep(3000);
		                singleCheckbox.click();
		                Thread.sleep(3000);
		                WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='grdContacts']/tbody/tr[1]/td[1]/label/span"));
		                Thread.sleep(3000);
		                checkbox1.click();
		                Thread.sleep(3000);
//		                WebDriverWait wait = new WebDriverWait(driver, 15);
//		                wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox1, true));
		                Thread.sleep(3000);
		             //   softAssert.assertTrue(checkbox1.isSelected(), "Checkbox 1 is checked");
		                Thread.sleep(3000);
		                WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='grdContacts']/tbody/tr[2]/td[1]/label/span"));
		                // Check both checkb
		           
		                checkbox2.click();
		                // Verify both checkboxes are checked
		                Thread.sleep(3000);
		                
		                driver.findElement(By.xpath("//img[@src='Images/delete.png']")).click();
		                Thread.sleep(3000);
		                Alert alert1 = driver.switchTo().alert();
		                alert1.accept();
		                Thread.sleep(3000);
		                String Actualresult11 = "Your contacts has been deleted.";
		        		String Expectedrsult = driver.findElement(By.xpath("//*[contains(text(),'Your contacts has been deleted.')]")).getText();
		        		softAssert.assertEquals(Actualresult11, Expectedrsult);
		              //  softAssert.assertTrue(checkbox2.isSelected(), "Checkbox 2 is checked");
		        		   softAssert.assertAll();
		  
		  
	}




	@Test (priority = 32)
	public void testImportandExportUI() throws InterruptedException
	{
		  SoftAssert softAssert = new SoftAssert();
		Thread.sleep(3000);
		//Test to check user is able to click on Import and export link.
		driver.findElement(By.xpath("//*[contains(text(),'Import/Export')]")).click();
		// test to check user is able to see this text(Import Your Contacts)
		String Actualresult = "Import Your Contacts";
		String Expectedrsult = driver.findElement(By.xpath("//*[contains(text(),'Import Your Contacts')]")).getText();
		softAssert.assertEquals(Actualresult, Expectedrsult);
		// test to check user is able to see this text(The Imported File Should contains Headers)
		String Actualresult1 = "*The Imported File Should contains Headers";
		String Expectedrsult1 = driver.findElement(By.xpath("//*[contains(text(),'The Imported File Should contains Headers')]")).getText();
		softAssert.assertEquals(Actualresult1, Expectedrsult1);
		//Test to check user is able to see this text(FirstName,LastName,Email,PhoneNumber,Company)
		String Actualresult12 = "*FirstName,LastName,Email,PhoneNumber,Company";
		String Expectedrsult12 = driver.findElement(By.xpath("//*[contains(text(),'FirstName,LastName,Email,PhoneNumber,Company')]")).getText();
		softAssert.assertEquals(Actualresult12, Expectedrsult12);
		
		//Test to check user is able to see the "No file chosen" text
		String Actualresult13 = "No File Chosen";
		String Expectedrsult13 = driver.findElement(By.xpath("//span[@id ='spanid']")).getText();
		softAssert.assertEquals(Actualresult13, Expectedrsult13);
		
		//Test to check user is able to see this text (Choose File)
		String Actualresult14 = "Choose File";
		String Expectedrsult14 = driver.findElement(By.xpath("//*[@id='divImportExport']/div[1]/div[2]/label/strong")).getText();
		softAssert.assertEquals(Actualresult14, Expectedrsult14);
		
		//Test to check user is able to see the Import button is enabled or not.
		
		WebElement importbutton = driver.findElement(By.id("btnImportcsvContact"));
		softAssert.assertTrue(importbutton.isEnabled());
		
		//Test to check user is able to see this text(Export Contacts)
		String Actualresult15 = "Export Contacts";
		String Expectedrsult15 = driver.findElement(By.xpath("//*[contains(text(),'Export Contacts')]")).getText();
		softAssert.assertEquals(Actualresult15, Expectedrsult15);
		
		//Test to check user is able to see this text(Export Contacts)
		String Actualresult16 = "Choose format:";
		String Expectedrsult16 = driver.findElement(By.xpath("//*[contains(text(),'Choose format:')]")).getText();
		softAssert.assertEquals(Actualresult16, Expectedrsult16);
		
		//Test to check user is able to see the Import button is enabled or not.
		WebElement exportbutton = driver.findElement(By.id("btnexportContact"));
	  softAssert.assertTrue(exportbutton.isEnabled());
	  
	  //Test to check user is able to see choose format drop down is presence on the page.
	  
	  WebElement dropdownElement = null;
	    try {
	        dropdownElement = driver.findElement(By.id("Format"));
	    
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        // NoSuchElementException will be thrown if the element is not found
	        // Handle the absence of the dropdown here if needed
	  	  System.out.println("Dropdown is not present on the page.");
	    }

	    // Verify if the dropdown is present on the page
	    softAssert.assertNotNull(dropdownElement, "Dropdown is present on the page");
	    softAssert.assertAll();
	}


	@Test (priority = 33)
	public void testImportandExportfunctionality() throws InterruptedException
	{
		  SoftAssert softAssert = new SoftAssert();
		//Test to check user is able to click on Import button or not
		WebElement importbutton = driver.findElement(By.id("btnImportcsvContact"));
		importbutton.click();
		//Test to check user is able to see the validation(Choose the file you wish to upload.) when click on Import without upload a file. 
		Thread.sleep(3000);
		String Actualresult16 = "Choose the file you wish to upload.";
		String Expectedrsult16 = driver.findElement(By.xpath("//*[contains(text(),'Choose the file you wish to upload.')]")).getText();
		softAssert.assertEquals(Actualresult16, Expectedrsult16);
		
		//Test check user is able to upload file or not.
		String filepath = "C:\\Users\\Singanaboina Suresh\\Downloads\\8773789517_Contacts (4).csv";
		Thread.sleep(3000);
		driver.findElement(By.id("FUCntdocument")).sendKeys(filepath);
		Thread.sleep(3000);
		WebElement importbutton1 = driver.findElement(By.id("btnImportcsvContact"));
		importbutton1.click();
		Thread.sleep(3000);
		//Test to check user is able to see the successfull message after upload the file.
		String Actualresult17 = "Your contacts has been Imported.";
		String Expectedrsult17 = driver.findElement(By.xpath("//*[contains(text(),'Your contacts has been Imported.')]")).getText();
		softAssert.assertEquals(Actualresult17, Expectedrsult17);
		Thread.sleep(3000);
		//Test to check user is able to click on Export button to be download contacts list
		WebElement exportbutton = driver.findElement(By.id("btnexportContact"));
		exportbutton.click();
		   softAssert.assertAll();
		
	}

	@Test (priority = 34)
	public void userSettings() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("divSettings")).click();
		   Thread.sleep(2000);
		  driver.findElement(By.id("lnkUserSettings")).click();
		   Thread.sleep(2000);
		  // Verify default selected value
	    WebElement dropdown = driver.findElement(By.id("DDLTimeZone"));
	    Select select = new Select(dropdown);
	    String defaultSelectedOption = select.getFirstSelectedOption().getText();
	    softAssert.assertEquals(defaultSelectedOption, "Eastern");
	    Thread.sleep(2000);
	    // Verify all expected options are available
	    WebElement dropdown1 = driver.findElement(By.id("DDLTimeZone"));
	    Select select1 = new Select(dropdown1);
	    int expectedOptionsCount = 10; // Replace with the expected number of options
	    int actualOptionsCount = select1.getOptions().size();
	    System.out.println(actualOptionsCount);
	    softAssert.assertEquals(actualOptionsCount, expectedOptionsCount);
	    Thread.sleep(2000);
	    WebElement dropdownElement = driver.findElement(By.id("DDLTimeZone"));
	    Select dropdown11 = new Select(dropdownElement);
	    dropdown11.selectByVisibleText("India");
	    // Verify that the selected option is as expected
	    String selectedOption = dropdown11.getFirstSelectedOption().getText();
	    softAssert.assertEquals(selectedOption, "India");
	    Thread.sleep(2000);
	    dropdown11.selectByVisibleText("Eastern");
	    // Verify that the selected option is as expected
	    String selectedOption1 = dropdown11.getFirstSelectedOption().getText();
	    softAssert.assertEquals(selectedOption1, "Eastern");
	    Thread.sleep(2000);
	    
	    String actualresult = "User Settings";
	    String Expectedresult = driver.findElement(By.xpath("//label[contains(text(),'User Settings')]")).getText();
	    softAssert.assertEquals(actualresult, Expectedresult);
	    Thread.sleep(3000);
	    String actualresult1 = "Automatic Login when I Call from this Number";
	    String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Automatic Login when I Call from this Number')]")).getText();
	    softAssert.assertEquals(actualresult1, Expectedresult1);
	    Thread.sleep(3000);
	    WebElement imageElement = driver.findElement(By.xpath("//*[@id='AncAutoLogin']/img")); // Modify the XPath accordingly
	    String srcAttribute = imageElement.getAttribute("src");
	    // Verify if src attribute contains a valid URL
	     softAssert.assertNotNull(srcAttribute, "Image is present");
	    // Optionally, you can also check if the URL is not empty or a placeholder image
	    softAssert.assertNotEquals(srcAttribute, "", "Image source is not empty"); 
	    
	    String Phonenumberprasent = driver.findElement(By.id("txtAutoLoginANI")).getAttribute("value");
	    
	    String Expectedresult11 = "(844) 624-7684";
	    System.out.println(Phonenumberprasent);
	    if(Phonenumberprasent.equals(Expectedresult11))
	    {
	  	  driver.findElement(By.id("txtAutoLoginANI")).clear();
	  	  Thread.sleep(3000);
	  	  driver.findElement(By.id("btnSave")).click();
	  	  Thread.sleep(3000);
	  	  driver.findElement(By.id("txtAutoLoginANI")).sendKeys("99");
	        Thread.sleep(3000);
	        driver.findElement(By.id("btnSave")).click();
	        String actualresult11 = "Please enter a valid 10 digit number for Auto-Login.";
	        String Expectedresult12 = driver.findElement(By.xpath("//*[contains(text(),'Please enter a valid 10 digit number for Auto-Login.')]")).getText();
	        softAssert.assertEquals(actualresult11, Expectedresult12);
	        
	        driver.findElement(By.id("txtAutoLoginANI")).clear();
	        Thread.sleep(3000);
	        driver.findElement(By.id("txtAutoLoginANI")).sendKeys("8446247684");
	        Thread.sleep(3000);
	        driver.findElement(By.id("btnSave")).click();
	        String actualresult111 = "User settings updated successfully.";
	        String Expectedresult111 = driver.findElement(By.xpath("//*[@id='lblStatusMsg']")).getText();
	        softAssert.assertEquals(actualresult111, Expectedresult111);
	    }
	    
	   String AutoPhonenumber = driver.findElement(By.id("txtAutoLoginANI")).getAttribute("value");
	   
	   if(AutoPhonenumber.isEmpty())
	   {
	    driver.findElement(By.id("txtAutoLoginANI")).sendKeys("99");
	    Thread.sleep(3000);
	    driver.findElement(By.id("btnSave")).click();
	    String actualresult11 = "Please enter a valid 10 digit number for Auto-Login.";
	    String Expectedresult12 = driver.findElement(By.xpath("//*[contains(text(),'Please enter a valid 10 digit number for Auto-Login.')]")).getText();
	    softAssert.assertEquals(actualresult11, Expectedresult12);
	    
	    driver.findElement(By.id("txtAutoLoginANI")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtAutoLoginANI")).sendKeys("8446247684");
	    Thread.sleep(3000);
	    driver.findElement(By.id("btnSave")).click();
	    String actualresult111 = "User settings updated successfully.";
	    String Expectedresult111 = driver.findElement(By.xpath("//*[@id='lblStatusMsg']")).getText();
	    softAssert.assertEquals(actualresult111, Expectedresult111);
	    
	   }
	   String actualresult11 = "Edit your Display Name";
	   String Expectedresult111 = driver.findElement(By.xpath("//*[contains(text(),'Edit your Display Name')]")).getText();
	   softAssert.assertEquals(actualresult11, Expectedresult111);
	   
	   String actualresult111 = "First Name";
	   String Expectedresult1111 = driver.findElement(By.xpath("//*[contains(text(),'First Name')]")).getText();
	   softAssert.assertEquals(actualresult111, Expectedresult1111);
	   
	   String actualresult1111 = "Last Name";
	   String Expectedresult11111 = driver.findElement(By.xpath("//*[contains(text(),'Last Name')]")).getText();
	   softAssert.assertEquals(actualresult1111, Expectedresult11111);
	   
	    
	   String Firstname = driver.findElement(By.id("txtFirstName")).getAttribute("value");
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtFirstName")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("btnSave")).click();
	   String actualresult11111 = "First Name required!";
	   String Expectedresult111111 = driver.findElement(By.xpath("//*[contains(text(),'First Name required!')]")).getText();
	   softAssert.assertEquals(actualresult11111, Expectedresult111111);
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtFirstName")).sendKeys(Firstname);
	   Thread.sleep(4000);
	   driver.findElement(By.id("btnSave")).click();
	   Thread.sleep(3000);
	   String actualresult111111 = "User settings updated successfully.";
	   String Expectedresult1111111 = driver.findElement(By.xpath("//*[@id='lblStatusMsg']")).getText();
	   softAssert.assertEquals(actualresult111111, Expectedresult1111111);
	   
	   
	   String Lastname = driver.findElement(By.id("txtLastName")).getAttribute("value");
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtLastName")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("btnSave")).click();
	   String actualresult1111111 = "Last Name required!";
	   String Expectedresult11111111 = driver.findElement(By.xpath("//*[contains(text(),'Last Name required!')]")).getText();
	   softAssert.assertEquals(actualresult1111111, Expectedresult11111111);
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtLastName")).sendKeys(Lastname);
	   Thread.sleep(3000);
	   driver.findElement(By.id("btnSave")).click();
	   Thread.sleep(3000);
	   String actualresult11111111 = "User settings updated successfully.";
	   String Expectedresult111111111 = driver.findElement(By.xpath("//*[@id='lblStatusMsg']")).getText();
	   softAssert.assertEquals(actualresult11111111, Expectedresult111111111);
	   
	   
	   // Find all links on the webpage
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   // Validate links are present
	   softAssert.assertTrue(links.size() > 0, "No links found on the page");
	   System.out.println(links.size());
	   
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	   
	   driver.findElement(By.id("spChangePasscode")).click();
	   Thread.sleep(3000);
	   
	   String actualresult111111111 = "Enter a 4 to 6 digit numeric passcode";
	   String Expectedresult1111111111 = driver.findElement(By.xpath("//span[contains(text(),'Enter a 4 to 6 digit numeric passcode')]")).getText();
	   softAssert.assertEquals(actualresult111111111, Expectedresult1111111111);
	   
	   String actualresult1111111111 = "New Passcode";
	   String Expectedresult11111111111 = driver.findElement(By.xpath("//label[@for='txtNewPasscode']")).getText();
	   softAssert.assertEquals(actualresult1111111111, Expectedresult11111111111);
	   
	   String actualresult11111111111 = "Retype New Passcode";
	   String Expectedresult111111111111 = driver.findElement(By.xpath("//label[@for='txtRetypePasscode']")).getText();
	   softAssert.assertEquals(actualresult11111111111, Expectedresult111111111111);
	   
	   
	   
	   // Find the Save button
	   WebElement saveButton = driver.findElement(By.id("btnPassSave"));
	   // Verify that the Save button is enabled
	   softAssert.assertTrue(saveButton.isEnabled(), "Save button is not enabled");
	  
	   
	   
	   WebElement saveButton1 = driver.findElement(By.id("btnPassSave"));
	   // Click the Save button
	   saveButton1.click();
	   
	   String actualresult111111111111 = "Passcode required.";
	   String Expectedresult1111111111111 = driver.findElement(By.xpath("//label[contains(text(),'Passcode required.')]")).getText();
	   softAssert.assertEquals(actualresult111111111111, Expectedresult1111111111111);
	   Thread.sleep(3000);
	  
	   driver.findElement(By.id("txtNewPasscode")).sendKeys("55");
	   Thread.sleep(3000);
	   WebElement saveButton11 = driver.findElement(By.id("btnPassSave"));
	   // Click the Save button
	   saveButton11.click();
	   Thread.sleep(3000);
	   String actualresult1111111111111 = "Enter a 4 to 6 digit passcode.";
	   String Expectedresult11111111111111 = driver.findElement(By.xpath("//label[contains(text(),'Enter a 4 to 6 digit passcode.')]")).getText();
	   softAssert.assertEquals(actualresult1111111111111, Expectedresult11111111111111);
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtNewPasscode")).clear();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtNewPasscode")).sendKeys("1000");
	   Thread.sleep(3000);
	   WebElement saveButton111 = driver.findElement(By.id("btnPassSave"));
	   // Click the Save button
	   saveButton111.click();
	   Thread.sleep(3000);
	   String actualresult11111111111111 = "Passcode and confirm passcode should be same.";
	   String Expectedresult111111111111111 = driver.findElement(By.xpath("//label[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	   softAssert.assertEquals(actualresult11111111111111, Expectedresult111111111111111);
	   
	   driver.findElement(By.id("txtRetypePasscode")).sendKeys("55");
	   Thread.sleep(3000);
	   WebElement saveButton1111 = driver.findElement(By.id("btnPassSave"));
	   // Click the Save button
	   saveButton1111.click();
	   Thread.sleep(3000);
	   String actualresult111111111111111 = "Passcode and confirm passcode should be same.";
	   String Expectedresult1111111111111111 = driver.findElement(By.xpath("//*[contains(text(),'Passcode and confirm passcode should be same.')]")).getText();
	   softAssert.assertEquals(actualresult111111111111111, Expectedresult1111111111111111);
	   driver.findElement(By.id("txtRetypePasscode")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtRetypePasscode")).sendKeys("1000");
	   Thread.sleep(3000);
	   WebElement saveButton11111 = driver.findElement(By.id("btnPassSave"));
	   // Click the Save button
	   saveButton11111.click();
	   Thread.sleep(3000);
	   String actualresult1111111111111111 = "Passcode updated successfully.";
	   String Expectedresult11111111111111111 = driver.findElement(By.xpath("//label[contains(text(),'Passcode updated successfully.')]")).getText();
	   softAssert.assertEquals(actualresult1111111111111111, Expectedresult11111111111111111);
	  
	   
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	   String actualresult12 = "Switch to/from Fax Only Service";
	   String Expectedresult12 = driver.findElement(By.xpath("//*[contains(text(),'Switch to/from Fax Only Service  ')]")).getText();
	   softAssert.assertEquals(actualresult12, Expectedresult12);
	   
	   // Verify the default selected state of a radio button
	   WebElement defaultSelectedRadio = driver.findElement(By.xpath("//input[@id='rbCOAVM' and @checked='checked']"));
	   softAssert.assertTrue(defaultSelectedRadio.isSelected(), "Default selected radio button is not selected");
	   
	   
	   
	   // Verify the default selected state of a radio button
	   WebElement defaultSelectedRadio1 = driver.findElement(By.xpath("//input[@id='rbCOAFAX' and @value='rbCOAFAX']"));
	   softAssert.assertFalse(defaultSelectedRadio1.isSelected(), "Default selected radio button is not selected");
	   
	   
	   
	   String actualresult123 = "Play Messages on the Phone in this Order";
	   String Expectedresult123 = driver.findElement(By.xpath("//*[contains(text(),'Play Messages on the Phone in this Order')]")).getText();
	   softAssert.assertEquals(actualresult123, Expectedresult123);
	   
	   // Verify the default selected state of a radio button
	   WebElement defaultSelectedRadio11 = driver.findElement(By.xpath("//input[@id='rbOldestFirst' and @checked='checked']"));
	   softAssert.assertTrue(defaultSelectedRadio11.isSelected(), "Default selected radio button is not selected");
	   
	  
	   
	   // Verify the default selected state of a radio button
	   WebElement defaultSelectedRadio111 = driver.findElement(By.xpath("//input[@id='rbNewestFirst' and @value='rbNewestFirst']"));
	   softAssert.assertFalse(defaultSelectedRadio111.isSelected(), "Default selected radio button is not selected");
		Thread.sleep(3000);
	   WebElement relatedElement = driver.findElement(By.xpath("//label[@for='rbNewestFirst']"));
	   relatedElement.click();
	   softAssert.assertTrue(relatedElement.isEnabled(), "Related element is still enabled after selecting radio option 2");
		Thread.sleep(3000);
	   WebElement relatedElement1 = driver.findElement(By.xpath("//label[@for='rbOldestFirst']"));
	   relatedElement1.click();
	   softAssert.assertTrue(relatedElement1.isEnabled(), "Related element is still enabled after selecting radio option 2");
		Thread.sleep(3000);
	   String actualresult1231 = "Record All Outbound Calls";
	   String Expectedresult1231 = driver.findElement(By.xpath("//*[contains(text(),'Record All Outbound Calls')]")).getText();
	   softAssert.assertEquals(actualresult1231, Expectedresult1231);
		Thread.sleep(3000);
	 
	  
	  if(driver.findElements(By.xpath("//*[@id='divOutBndAutoRec']/div/label/div[@class='toggle btn btn-default off']")).size()>0)
	  {
	  	driver.findElement(By.xpath("//*[@id='divOutBndAutoRec']/div/label/div[@class='toggle btn btn-default off']")).click();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//*[@id='divOutBndAutoRec']/div/label/div[@class='toggle btn btn-primary']")).click();
	  }
	   
	   if(driver.findElements(By.xpath("//*[@id='divOutBndAutoRec']/div/label/div[@class='toggle btn btn-primary']")).size()>0)
	   {
	  	 driver.findElement(By.xpath("//*[@id='divOutBndAutoRec']/div/label/div[@class='toggle btn btn-primary']")).click();
	  	 Thread.sleep(2000);
	  	 driver.findElement(By.xpath("//*[@id='divOutBndAutoRec']/div/label/div[@class='toggle btn btn-default off']")).click();
	   }
	   Thread.sleep(2000);
	////////////////////////////////////////////////////   
	   
	   String actualresult12311 = "Include Hang-up Calls in your Inbox";
	   String Expectedresult12311 = driver.findElement(By.xpath("//*[contains(text(),'Include Hang-up Calls in your Inbox')]")).getText();
	   softAssert.assertEquals(actualresult12311, Expectedresult12311);
		Thread.sleep(2000);
	 
	  
	  if(driver.findElements(By.xpath("//*[@id='divHangUp']/div/label/div[@class='toggle btn btn-default off']")).size()>0)
	  {
	  	driver.findElement(By.xpath("//*[@id='divHangUp']/div/label/div[@class='toggle btn btn-default off']")).click();
	  	Thread.sleep(2000);
	  	WebElement element  = driver.findElement(By.xpath("//*[@id='divHangUp']/div/label/div[@class='toggle btn btn-primary']"));
	  	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	  	element.click();
	  	
	  }
	 

	   if(driver.findElements(By.xpath("//*[@id='divHangUp']/div/label/div[@class='toggle btn btn-primary']")).size()>0)
	   {
	  	 driver.findElement(By.xpath("//*[@id='divHangUp']/div/label/div[@class='toggle btn btn-primary']")).click();
	  	 Thread.sleep(2000);
	  	 driver.findElement(By.xpath("//*[@id='divHangUp']/div/label/div[@class='toggle btn btn-default off']")).click();
	   }
	   Thread.sleep(2000);
	////////////////////////////////////////////////////////////////////
	   
	   String actualresult123111 = "Play prompt before Recording a Message";
	   String Expectedresult123111 = driver.findElement(By.xpath("//*[contains(text(),'Play prompt before Recording a Message')]")).getText();
	   softAssert.assertEquals(actualresult123111, Expectedresult123111);
		Thread.sleep(2000);
	 
	  
	  if(driver.findElements(By.xpath("//*[@id='divPlayPrompt']/div/label/div[@class='toggle btn btn-default off']")).size()>0)
	  {
	  	driver.findElement(By.xpath("//*[@id='divPlayPrompt']/div/label/div[@class='toggle btn btn-default off']")).click();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//*[@id='divPlayPrompt']/div/label/div[@class='toggle btn btn-primary']")).click();
	  }
	   

	   if(driver.findElements(By.xpath("//*[@id='divPlayPrompt']/div/label/div[@class='toggle btn btn-primary']")).size()>0)
	   {
	  	 driver.findElement(By.xpath("//*[@id='divPlayPrompt']/div/label/div[@class='toggle btn btn-primary']")).click();
	  	 Thread.sleep(2000);
	  	 driver.findElement(By.xpath("//*[@id='divPlayPrompt']/div/label/div[@class='toggle btn btn-default off']")).click();
	   }
	   Thread.sleep(2000);
	  ////////////////////////////////////////////////////////////////////////////////////// 
	   
	   String actualresult1231111 = "Allow Callers to Leave a Message on the Main Number";
	   String Expectedresult1231111 = driver.findElement(By.xpath("//*[contains(text(),'Allow Callers to Leave a Message on the Main Number')]")).getText();
	   softAssert.assertEquals(actualresult1231111, Expectedresult1231111);
		Thread.sleep(2000);
	 
	  
	  if(driver.findElements(By.xpath("//*[@id='divLeaveMsg']/div/label/div[@class='toggle btn btn-default off']")).size()>0)
	  {
	  	driver.findElement(By.xpath("//*[@id='divLeaveMsg']/div/label/div[@class='toggle btn btn-default off']")).click();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//*[@id='divLeaveMsg']/div/label/div[@class='toggle btn btn-primary']")).click();
	  }
	   

	   if(driver.findElements(By.xpath("//*[@id='divLeaveMsg']/div/label/div[@class='toggle btn btn-primary']")).size()>0)
	   {
	  	 driver.findElement(By.xpath("//*[@id='divLeaveMsg']/div/label/div[@class='toggle btn btn-primary']")).click();
	  	 Thread.sleep(2000);
	  	 driver.findElement(By.xpath("//*[@id='divLeaveMsg']/div/label/div[@class='toggle btn btn-default off']")).click();
	   }
		
	   String actualresult155 = "Set Up my iTeleCenter number like";
	   String Expectedresult155 = driver.findElement(By.xpath("//*[contains(text(),'Set Up my iTeleCenter number like')]")).getText();
	   softAssert.assertEquals(actualresult155, Expectedresult155);
		Thread.sleep(2000);


	 
	  
	  
	  String Phonenumberprasent1 = driver.findElement(By.id("txtLike")).getAttribute("value");
	  
	  String Expectedresult188 = "(844) 624-7684";
	  System.out.println(Phonenumberprasent1);
	  if(Phonenumberprasent1.equals(Expectedresult188))
	  {
		  driver.findElement(By.id("txtLike")).clear();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtLike")).sendKeys("99");
	      Thread.sleep(3000);
	      driver.findElement(By.id("btnSave")).click();
	      String actualresult1556 = "Phone Number Should be in the format [(xxx) xxx-xxxx, xxx-xxx-xxxx, (xxx)xxx-xxxx, xxxxxxxxxx]";
	      String Expectedresult1556 = driver.findElement(By.xpath("//label[contains(text(),'Phone Number Should be in the format [(xxx) xxx-xxxx, xxx-xxx-xxxx, (xxx)xxx-xxxx, xxxxxxxxxx]')]")).getText();
	      softAssert.assertEquals(actualresult1556, Expectedresult1556);
	      
	      driver.findElement(By.id("txtLike")).clear();
	      Thread.sleep(3000);
	      driver.findElement(By.id("txtLike")).sendKeys("8446247684");
	      Thread.sleep(3000);
	      driver.findElement(By.id("btnSave")).click();
	      String actualresult177 = "User settings updated successfully.";
	      String Expectedresult177 = driver.findElement(By.xpath("//*[@id='lblStatusMsg']")).getText();
	      softAssert.assertEquals(actualresult177, Expectedresult177);
	  }
	 
	 
	  String AutoPhonenumber1 = driver.findElement(By.id("txtLike")).getAttribute("value");
	  
	  if(AutoPhonenumber1.isEmpty())
	  {
	   driver.findElement(By.id("txtLike")).sendKeys("99");
	   Thread.sleep(3000);
	   driver.findElement(By.id("btnSave")).click();
	   String actualresult1556 = "Phone Number Should be in the format [(xxx) xxx-xxxx, xxx-xxx-xxxx, (xxx)xxx-xxxx, xxxxxxxxxx]";
	   String Expectedresult1556 = driver.findElement(By.xpath("//label[contains(text(),'Phone Number Should be in the format [(xxx) xxx-xxxx, xxx-xxx-xxxx, (xxx)xxx-xxxx, xxxxxxxxxx]')]")).getText();
	   softAssert.assertEquals(actualresult1556, Expectedresult1556);
	   
	   driver.findElement(By.id("txtLike")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("txtLike")).sendKeys("8446247684");
	   Thread.sleep(3000);
	   driver.findElement(By.id("btnSave")).click();
	   String actualresult144 = "User settings updated successfully.";
	   String Expectedresult144 = driver.findElement(By.xpath("//*[@id='lblStatusMsg']")).getText();
	   softAssert.assertEquals(actualresult144, Expectedresult144);
	   
	  }
	   softAssert.assertAll();
	  
	   
	}
	 @Test (priority = 35)
	  public void callBloack() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
		  driver.findElement(By.id("divSettings")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("lnkCallBlock")).click();
		  Thread.sleep(3000);
		  if(driver.findElements(By.xpath("//*[@id='divTitle']/label[2]/div[@class='toggle btn btn-primary']")).size()>0)
		  {
			  driver.findElement(By.xpath("//*[@id='divTitle']/label[2]/div[@class='toggle btn btn-primary']")).click();
			  String Autocallblackoff = "Your call block has been turned Off.";
			 String  Actautocallblack = driver.findElement(By.xpath("//*[contains(text(),'Your call block has been turned  Off.')]")).getText();
			  Thread.sleep(3000);
			 softAssert.assertEquals(Actautocallblack, Autocallblackoff);
		  }
		  Thread.sleep(3000);
		  if(driver.findElements(By.xpath("//*[@id='divTitle']/label[2]/div[@class='toggle btn btn-default off']")).size()>0)
		  {
			  driver.findElement(By.xpath("//*[@id='divTitle']/label[2]/div[@class='toggle btn btn-default off']")).click();
			  String Autocallblackon = "Your call block has been turned On.";
			 String  Actautocallblackon = driver.findElement(By.xpath("//*[contains(text(),'Your call block has been turned  On.')]")).getText();
			  Thread.sleep(3000);
			 softAssert.assertEquals(Actautocallblackon, Autocallblackon);
		  }
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAdd1")).click();
		  Thread.sleep(3000);
		  String Expblockedcallersvalidation = "Phone number required";
		  String Actblockedcallersvalidation = driver.findElement(By.xpath("//*[contains(text(),'Phone number required')]")).getText();
		  softAssert.assertEquals(Actblockedcallersvalidation, Expblockedcallersvalidation);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtBlockCaller")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAdd1")).click();
		  
		  String Expblockedcallersvalidations = "Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.";
		  String Actblockedcallersvalidations = driver.findElement(By.xpath("//*[contains(text(),'Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.')]")).getText();
		  softAssert.assertEquals(Actblockedcallersvalidations, Expblockedcallersvalidations);
		  
		  driver.findElement(By.id("txtBlockCaller")).clear();
		  driver.findElement(By.id("txtBlockCaller")).sendKeys("3185459042");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAdd1")).click();
		 
		  
		  String Expblockedcallersvalidationss = "Call Block settings updated successfully.";
		  String Actblockedcallersvalidationss = driver.findElement(By.xpath("//*[contains(text(),'Call Block settings updated successfully.')]")).getText();
		  softAssert.assertEquals(Actblockedcallersvalidationss, Expblockedcallersvalidationss);
		  Thread.sleep(3000);
		  
		  String Expblockedcallernum = "(318) 545-9042";
		  String Actblockedcallernum = driver.findElement(By.xpath("//*[contains(text(),'(318) 545-9042')]")).getText();
		  softAssert.assertEquals(Actblockedcallernum, Expblockedcallernum);
		  Thread.sleep(3000);
		  
		  WebElement checkbox = driver.findElement(By.xpath("//*[@id='tblCallblock']/tbody/tr/td[1]/span[1]"));
		  checkbox.isDisplayed();
	  
		  checkbox.click();
		  softAssert.assertFalse(checkbox.isSelected(), "checkbox is selected");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnSave1")).click();
		  
		  
		  String Expblockedcallersvalidationsss = "Caller has been deleted from the blocked callers list.";
		  String Actblockedcallersvalidationsss = driver.findElement(By.xpath("//*[contains(text(),'Caller has been deleted from the blocked callers list.')]")).getText();
		  softAssert.assertEquals(Actblockedcallersvalidationsss, Expblockedcallersvalidationsss);
		  Thread.sleep(3000);
		  
		  //////////////////////
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
		  Thread.sleep(2000);
		  driver.findElement(By.id("btnAdd")).click();
		
		  String Expblockedareacodesvalidation = "Area Code required";
		  String Actblockedareacodesvalidation = driver.findElement(By.xpath("//*[contains(text(),'Area Code required')]")).getText();
		  softAssert.assertEquals(Actblockedareacodesvalidation, Expblockedareacodesvalidation);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtAreaCode")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAdd")).click();
		  
		  String Expblockedareacodesvalidations = "Enter a three digit area code";
		  String Actblockedareacodesvalidations = driver.findElement(By.xpath("//*[contains(text(),'Enter a three digit area code')]")).getText();
		  softAssert.assertEquals(Actblockedareacodesvalidations, Expblockedareacodesvalidations);
		  
		  driver.findElement(By.id("txtAreaCode")).clear();
		  driver.findElement(By.id("txtAreaCode")).sendKeys("969");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAdd")).click();
		  String Expblockedareacodesvalidationss = "Call Block settings updated successfully.";
		  String Actblockedareacodesvalidationss = driver.findElement(By.xpath("//*[contains(text(),'Call Block settings updated successfully.')]")).getText();
		  softAssert.assertEquals(Actblockedareacodesvalidationss, Expblockedareacodesvalidationss);
		  Thread.sleep(3000);
		  
		  String Expareacode = "969";
		  String Actareacode = driver.findElement(By.xpath("//*[contains(text(),'969')]")).getText();
		  softAssert.assertEquals(Actareacode, Expareacode);
		  Thread.sleep(3000);
		  
		  WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='tblCallBlkAreaCodes']/tbody/tr/td[1]/span[1]"));
		  checkbox1.isDisplayed();
	  
		  checkbox1.click();
		  softAssert.assertFalse(checkbox1.isSelected(), "checkbox is selected");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnUpdateBlockAreaCode")).click();
		  
		  
		  String Expblockedareacodesvalidationsss = "Area code has been deleted from the blocked area code list.";
		  String Actblockedareacodesvalidationsss = driver.findElement(By.xpath("//*[contains(text(),'Area code has been deleted from the blocked area code list.')]")).getText();
		  softAssert.assertEquals(Actblockedareacodesvalidationsss, Expblockedareacodesvalidationsss);
		  /////////////////
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
		  Thread.sleep(2000);
		  driver.findElement(By.id("btnAddExcludes")).click();
		
		  String Expunblockedvalidation = "Phone number required";
		  String Actunblockedvalidation = driver.findElement(By.xpath("//*[contains(text(),'Phone number required')]")).getText();
		  softAssert.assertEquals(Actunblockedvalidation, Expunblockedvalidation);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtExcludeNumber")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAddExcludes")).click();
		  
		  String Expunblockedvalidations = "Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.";
		  String Actunblockedvalidations = driver.findElement(By.xpath("//*[contains(text(),'Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.')]")).getText();
		  softAssert.assertEquals(Actunblockedvalidations, Expunblockedvalidations);
		  
		  driver.findElement(By.id("txtExcludeNumber")).clear();
		  driver.findElement(By.id("txtExcludeNumber")).sendKeys("7325952970");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAddExcludes")).click();
		 
		  
		  String Expunblockedvalidationss = "Call Block settings updated successfully.";
		  String Actunblockedvalidationss = driver.findElement(By.xpath("//*[contains(text(),'Call Block settings updated successfully.')]")).getText();
		  softAssert.assertEquals(Actunblockedvalidationss, Expunblockedvalidationss);
		  Thread.sleep(3000);
		  
		  String Expnumb = "(732) 595-2970";
		  String Actnumbe = driver.findElement(By.xpath("//*[contains(text(),'(732) 595-2970')]")).getText();
		  softAssert.assertEquals(Actnumbe, Expnumb);
		  Thread.sleep(3000);
		  
		  WebElement checkbox12 = driver.findElement(By.xpath("//*[@id='tblCallExcblock']/tbody/tr/td[1]/span[1]"));
		  checkbox12.isDisplayed();
	  
		  checkbox12.click();
		  softAssert.assertFalse(checkbox12.isSelected(), "checkbox is selected");
		  Thread.sleep(3000);
		  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
		  Thread.sleep(2000);
		  driver.findElement(By.id("btnUpdateExcludes")).click();
		  
		  
		  String Expunblockedvalidationsss = "Exclude number has been deleted from the exclude number list.";
		  String Actunblockedvalidationsss = driver.findElement(By.xpath("//*[contains(text(),'Exclude number has been deleted from the exclude number list.')]")).getText();
		  softAssert.assertEquals(Actunblockedvalidationsss, Expunblockedvalidationsss);
		  
		   softAssert.assertAll();
	  }

	 @Test (priority = 36)
	 public void testUploadAudioFileforUnavailable() throws InterruptedException
	 {
		  SoftAssert softAssert = new SoftAssert();
	 	driver.findElement(By.id("lnkGreetings")).click();
	 	Thread.sleep(3000);
	 	  driver.findElement(By.id("lnkUAGreeting")).click();
	 	  Thread.sleep(3000);
	 	  String filePath = "C:\\Users\\Singanaboina Suresh\\Documents\\Greetings\\UNAVAILABLE_EXT_0006.GRE.WAV";
	 	  Thread.sleep(3000);
	 	  driver.findElement(By.id("fupGreeting1")).sendKeys(filePath);
	 	  Thread.sleep(3000);
	 	  driver.findElement(By.id("btnSave")).click();
	 	   softAssert.assertAll();
	 }
	 
	 @Test (priority = 37)
	 public void accountManagement() throws InterruptedException {
		  SoftAssert softAssert = new SoftAssert();
	 	  driver.findElement(By.xpath("//img[@class='drpbtn']")).click();
	 	  Thread.sleep(5000);
	 	  driver.findElement(By.xpath("//a[contains(text(),'Account Management')]")).click();
	 	  Thread.sleep(4000);
	 	  driver.findElement(By.xpath("//*[contains(text(),'Manage Login Details')]")).click();
	 	  Thread.sleep(4000);
	 	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	 	   Thread.sleep(2000);
	 	  
	 	   if(driver.findElements(By.xpath("//*[contains(text(),'Got it!')]")).size()>0)
	 	   {
	 		   driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();  
	 	   }
	 	   Thread.sleep(2000);
	 	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	 	  Thread.sleep(3000);
	 	  String  extchangeemail = "Email Required.";
	     String Actualchangeemail = driver.findElement(By.xpath("//*[contains(text(),'Email Required.')]")).getText();
	     softAssert.assertEquals(Actualchangeemail, extchangeemail);
	     
	     
	     driver.findElement(By.id("txtCustomerEmail")).sendKeys("Singanaboina");
	 	  Thread.sleep(3000);
	 	  driver.findElement(By.id("btnSave")).click();
	 	  Thread.sleep(3000);
	 	  String  extchangeemail1 = "Enter Valid Email.";
	     String Actualchangeemail1 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Email.')]")).getText();
	     softAssert.assertEquals(Actualchangeemail1, extchangeemail1);
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.id("txtCustomerEmail")).clear();
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtCustomerEmail")).sendKeys("Singanaboina.suresh@coanetwork.com");      
	     //current passcode
	     driver.findElement(By.id("btnSave")).click();
	     
	     Thread.sleep(3000);
	 	  String  extcurrentpass = "Old Passcode Required.";
	     String Actualcurrentpass = driver.findElement(By.xpath("//*[contains(text(),'Old Passcode Required.')]")).getText();
	     softAssert.assertEquals(Actualcurrentpass, extcurrentpass);
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtOldPwd")).sendKeys("5SS");
	     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     Thread.sleep(3000);
	     String  extcurrentpassinvalid = "Passcode must be 4 to 6 digits. It cannot contain letters or special characters.";
	     String Actualcurrentpassinvalid = driver.findElement(By.xpath("//*[contains(text(),'Passcode must be 4 to 6 digits. It cannot contain letters or special characters.')]")).getText();
	     softAssert.assertEquals(Actualcurrentpassinvalid, extcurrentpassinvalid);
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtOldPwd")).clear();
	     Thread.sleep(2000);
	     driver.findElement(By.id("txtOldPwd")).sendKeys("1000");
	     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     
	     String  extnewpassinvalid = "New Passcode Required.";
	     String Actualnewpassinvalid = driver.findElement(By.xpath("//*[contains(text(),'New Passcode Required.')]")).getText();
	     softAssert.assertEquals(Actualnewpassinvalid, extnewpassinvalid);
	     Thread.sleep(3000);
	     
	     
	     driver.findElement(By.id("txtNewPwd")).sendKeys("6S@");
	     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     
	     String  extnewpassinvalid1 = "Passcode must be 4 to 6 digits. It cannot contain letters or special characters.";
	     String Actualnewpassinvalid1 = driver.findElement(By.xpath("//*[contains(text(),'Passcode must be 4 to 6 digits. It cannot contain letters or special characters.')]")).getText();
	     softAssert.assertEquals(Actualnewpassinvalid1, extnewpassinvalid1);
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtNewPwd")).clear();
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtNewPwd")).sendKeys("1000");
	     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     Thread.sleep(3000);
	     
	     String  extrenewpassinvalid1 = "Reenter New Passcode.";
	     String Actualrenewpassinvalid1 = driver.findElement(By.xpath("//*[contains(text(),'Reenter New Passcode.')]")).getText();
	     softAssert.assertEquals(Actualrenewpassinvalid1, extrenewpassinvalid1);
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtRenterPwd")).sendKeys("6S@");
	     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     Thread.sleep(3000);
	     String  extrenewpassinvalid11 = "Passcode must be 4 to 6 digits. It cannot contain letters or special characters.";
	     String Actualrenewpassinvalid11 = driver.findElement(By.xpath("//*[contains(text(),'Passcode must be 4 to 6 digits. It cannot contain letters or special characters.')]")).getText();
	     softAssert.assertEquals(Actualrenewpassinvalid11, extrenewpassinvalid11);
	     
	     driver.findElement(By.id("txtRenterPwd")).clear();
	     Thread.sleep(2000);
	     driver.findElement(By.id("txtRenterPwd")).sendKeys("1000");
	     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     Thread.sleep(4000);
	     String  extrenewpassinvalid111 = "Your Old Passcode does not match our records. Please try again.";
	     String Actualrenewpassinvalid111 = driver.findElement(By.xpath("//*[contains(text(),'Your Old Passcode does not match our records. Please try again.')]")).getText();
	     softAssert.assertEquals(Actualrenewpassinvalid111, extrenewpassinvalid111);
	     softAssert.assertAll();
	 	  
	 }
	 @Test (priority = 38)

	 public void servicePlan() throws InterruptedException
	 {
		  SoftAssert softAssert = new SoftAssert();
	 	  driver.findElement(By.id("lnkplans")).click();
	 	   Thread.sleep(3000);
	 	   String extService = "Service Plans";
	 		  String ActService = driver.findElement(By.xpath("//*[contains(text(),'Service Plans')]")).getText();
	 		  softAssert.assertEquals(ActService, extService);
	 		  
	 		   String extcancelaccount = "Cancel Account";
	 			  String Actcancelaccount = driver.findElement(By.xpath("//*[contains(text(),'Cancel Account')]")).getText();
	 			  softAssert.assertEquals(Actcancelaccount, extcancelaccount);
	 		  
	 	  String extcustomerCare = "Please contact customer service at CustomerCare@COANetwork.comto find out about other service plans available to you.";
	 	  String ActcustomerCare = driver.findElement(By.xpath("//*[@id='divNoPkg']/p")).getText();
	 	  softAssert.assertEquals(ActcustomerCare, extcustomerCare);
	 	   softAssert.assertAll();
	 }
	 @Test (priority = 39)
	 public void billing() throws InterruptedException
	 {
		  SoftAssert softAssert = new SoftAssert();
	 	  driver.findElement(By.id("lnkbilling")).click();
	 	  Thread.sleep(3000);
	 	  String viewinvoice = "View Invoice";
	 	  String Actviewinvoice = driver.findElement(By.id("lnkviewinvoice")).getText();
	 	  softAssert.assertEquals(Actviewinvoice, viewinvoice);
	 	  Thread.sleep(3000);
	 	  String extpayinvoice = "Pay Invoices";
	 	  String Actpayinvoice = driver.findElement(By.id("lnkpayinvoice")).getText();
	 	  softAssert.assertEquals(Actpayinvoice, extpayinvoice);
	 	  Thread.sleep(3000);
	 	  driver.findElement(By.id("lnkpayinvoice")).click();
	 	  
	 	  Thread.sleep(2000);
	 	  String extpectedurl = "https://qabackoffice.itelecenter.com/AccountManagement/makepayments.aspx";
	 	  String actualurl = driver.getCurrentUrl();
	 	  softAssert.assertEquals(actualurl, extpectedurl);
	 	  Thread.sleep(2000);
	 	  String extpayinvoicetxt = "Pay Invoice";
	 	  String Actpayinvoicetxt = driver.findElement(By.xpath("//p[contains(text(),'Pay Invoice')]")).getText();
	 	  softAssert.assertEquals(Actpayinvoicetxt, extpayinvoicetxt);
	 	  Thread.sleep(2000);
	 	  
//	 	  String extRefferaltxt = "Referrals";
//	 	  String ActRefferaltxt = driver.findElement(By.xpath("//span[contains(text(),'Referrals')]")).getText();
//	 	  softAssert.assertEquals(ActRefferaltxt, extRefferaltxt);
//	 	  Thread.sleep(2000);
//	 	  driver.findElement(By.xpath("//span[contains(text(),'Referrals')]")).click();
//	 	  Thread.sleep(2000);
//	 	  String extRefferalurl = "https://backoffice.itelecenter.com/AccountManagement/referralList.aspx";
//	 	  String ActRefferalurl = driver.getCurrentUrl();
//	 	  softAssert.assertEquals(ActRefferalurl, extRefferalurl);
//	 	  Thread.sleep(2000);
//	 	  String extpayinvoicetxtlist = "Referral List";
//	 	  String Actpayinvoicetxtlist = driver.findElement(By.xpath("//p[contains(text(),'Referral List')]")).getText();
//	 	  softAssert.assertEquals(Actpayinvoicetxtlist, extpayinvoicetxtlist);
//	 	  Thread.sleep(2000);
//	 	  String extpayinvoicetxtlist1 = "Note: Referrals on a lower priced package, free trials or those with past due accounts do not count toward your free service.";
//	 	  String Actpayinvoicetxtlist1 = driver.findElement(By.xpath("//*[@id='divContainerRight']/div/div[2]/p")).getText();
//	 	  softAssert.assertEquals(Actpayinvoicetxtlist1, extpayinvoicetxtlist1);
//	 	  Thread.sleep(2000);          
//	 	  WebElement imageElement = driver.findElement(By.xpath("//img[@src='../Images/telefriend.jpg']"));
//	     boolean isImageDisplayed = imageElement.isDisplayed();
//	     softAssert.assertTrue(isImageDisplayed, "Tell a Friend is not displayed on the page.");
//	     
	     Thread.sleep(2000);
	     String extdownloadapps = "Download the iTeleCenter mobile app";
	 	  String Actdownloadapps = driver.findElement(By.xpath("//span[contains(text(),'Download the iTeleCenter mobile app')]")).getText();
	 	  softAssert.assertEquals(Actdownloadapps, extdownloadapps);
	     
	 	  Thread.sleep(2000);
	 	  WebElement ImageApple = driver.findElement(By.xpath("//img[@src='Images/itc_apple_store.png']"));
	     boolean Imageapplephone = ImageApple.isDisplayed();
	     softAssert.assertTrue(Imageapplephone, "ImageApple is not displayed on the page.");
	     Thread.sleep(2000);
	     WebElement imageandroidapp = driver.findElement(By.xpath("//img[@src='Images/itc_android_app_store.png']"));
	     boolean imageandroid = imageandroidapp.isDisplayed();
	     softAssert.assertTrue(imageandroid, "imageandroidapp is not displayed on the page.");
	     Thread.sleep(2000);
	     
	   
	  
	     String mainWindowHandle = driver.getWindowHandle();
	     System.out.println("Parent window title:-"+ driver.getTitle());
	     driver.findElement(By.xpath("//img[@src='Images/itc_apple_store.png']")).click();
	     Set<String> windowhandles = driver.getWindowHandles();
	     for(String windowhand : windowhandles )
	     {
	   	  if(!windowhand.equals(mainWindowHandle)) {
	   	  driver.switchTo().window(windowhand);
	   	     Thread.sleep(4000);
	   	     
	   	     String extApplephone = "https://apps.apple.com/ml/app/itelecenter/id426417970";
	   		  String ActApplephone = driver.getCurrentUrl();
	   		  softAssert.assertEquals(ActApplephone, extApplephone);
	   	
	   	     Thread.sleep(2000);
	   	     WebElement ImageAppStore = driver.findElement(By.xpath("//a[@href='https://www.apple.com/ml/ios/app-store/']"));
	   	      boolean Imageappstore = ImageAppStore.isDisplayed();
	   	      softAssert.assertTrue(Imageappstore, "ImageAppStore is not displayed on the page.");
	   	      Thread.sleep(2000);
	   	      
	   	      WebElement iTCAppleimage = driver.findElement(By.xpath("//img[@src='/assets/artwork/1x1-42817eea7ade52607a760cbee00d1495.gif' and @class = 'we-artwork__image ember3 ']"));
	   	      boolean iTCAppleimages = iTCAppleimage.isDisplayed();
	   	      softAssert.assertTrue(iTCAppleimages, "iTCAppleimage is not displayed on the page");
	   	      Thread.sleep(2000);
	   	      
	   	      WebElement Imagecoanetwork = driver.findElement(By.xpath("//a[@href='https://www.apple.com/ml/ios/app-store/']"));
	   	      boolean Imagecoanetworks = Imagecoanetwork.isDisplayed();
	   	      softAssert.assertTrue(Imagecoanetworks, "Imagecoanetworks is not displayed on the page.");
	   		  Thread.sleep(2000);
	   	      driver.close();
	   	  }
	   
	     }
	     Thread.sleep(2000);

	     driver.switchTo().window(mainWindowHandle);
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//img[@src='Images/itc_android_app_store.png']")).click();
	     
	     Set<String> windowahandles = driver.getWindowHandles();
	     
	     for(String windowandroid : windowahandles)
	     {
	   	  if(!windowandroid.equals(mainWindowHandle)) {
	   	  driver.switchTo().window(windowandroid);
	   	   Thread.sleep(2000);
	   	  String extAndroidphone = "https://play.google.com/store/apps/details?id=com.coanetwork.iTeleCenter";
	   	  String ActAndroidphone = driver.getCurrentUrl();
	   	  softAssert.assertEquals(ActAndroidphone, extAndroidphone);
	   	   Thread.sleep(2000);
	   	  WebElement Imageplaystore = driver.findElement(By.xpath("//a[@href='/store/games' and @aria-label ='Google Play logo']"));
	   	  boolean Imageplaystores = Imageplaystore.isDisplayed();
	 	      softAssert.assertTrue(Imageplaystores, "Imageplaystores is not displayed on the page.");
	 	      Thread.sleep(2000);
	 	      String extandroidapp = "iTeleCenter";
	 		  String Actandroidapp = driver.findElement(By.xpath("//h1[contains(text(),'iTeleCenter')]")).getText();
	 		  softAssert.assertEquals(Actandroidapp, extandroidapp);
	 		   Thread.sleep(2000);
	 		   driver.close();
	   	  }
	 		  
	   	  
	     }
	     
	     Thread.sleep(2000);
	     
	     driver.switchTo().window(mainWindowHandle);
	     
	     Thread.sleep(2000);
	 	  
	     
	 /*    driver.findElement(By.xpath("//img[@src='Images/itc_apple_store.png']")).click();
	     Thread.sleep(2000);
	     
	 Set<String> windowahandlesrefreal = driver.getWindowHandles();
	     
	     for(String windowandroidrefaral : windowahandlesrefreal)
	     {
	   	  if(!windowandroidrefaral.equals(mainWindowHandle)) {
	   		  driver.switchTo().window(windowandroidrefaral);
	   		  Thread.sleep(2000);
	   		  String extTelefriend = "TeleFriend";
	   		  String ActTelefriend = driver.getTitle();
	   		  softAssert.assertEquals(ActTelefriend, extTelefriend);
	   		  Thread.sleep(2000);
	   		  WebElement Imageplaystore = driver.findElement(By.xpath("//*[@id='OuterPop']/h1"));
	       	  boolean Imageplaystores = Imageplaystore.isDisplayed();
	   	      softAssert.assertTrue(Imageplaystores, "ImageAppStore is not displayed on the page.");
	   	      Thread.sleep(2000);
	   	      String invite = "Invite 3 Friends and Your Service is FREE!";
	   	      String Actinvite = driver.findElement(By.xpath("//h2[contains(text(),'Invite 3 Friends and Your Service is ')]")).getText();
	   	      softAssert.assertEquals(Actinvite, invite);
	   	   
	   	  
	   	 
	     }
	 Thread.sleep(2000);
	     
	     driver.switchTo().window(mainWindowHandle);
	     */
	     softAssert.assertAll();
	  
	 }


	 @Test (priority = 40)
	 public void textToSpeechafterConverted() throws InterruptedException {
	 	  
		  SoftAssert softAssert = new SoftAssert();
	 	driver.findElement(By.id("divSettings")).click();
	 	 Thread.sleep(3000);
	 	driver.findElement(By.id("lnkGreetings")).click();
	     Thread.sleep(3000);
	 	driver.findElement(By.id("lnkSTGreeting")).click();
	     Thread.sleep(3000);
	 	driver.findElement(By.id("lnkTextToSpeech")).click();
	     Thread.sleep(3000);
	 	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	 	
	 	   String ExpectedSTstatus = "Listen to Converted Greeting";
	 	      String ActualStstatus = driver.findElement(By.xpath("//*[contains(text(),'Listen to Converted Greeting')]")).getText();
	 	      softAssert.assertEquals(ActualStstatus, ExpectedSTstatus);
	 	      
	 	      WebElement audio2 = driver.findElement(By.id("TTSConvertedGreet"));  // Replace with the actual ID or other locator of your logo

	 	      // Verify that the logo is visible on the page
	 	      softAssert.assertTrue(audio2.isDisplayed(), "Recording should be visible on the page");
	 	      Thread.sleep(5000);
	 	      
	 	      String ExpectedActivateTTS = "Activate TTS Greeting";
	 	      String ActualActivateTTS = driver.findElement(By.xpath("//label[contains(text(),'Activate TTS Greeting')]")).getText();
	 	      softAssert.assertEquals(ActualActivateTTS, ExpectedActivateTTS);
	 	      Thread.sleep(3000);
	 	      // Find the checkbox element by its locator (for example, by id, class name, etc.)
	 	        WebElement checkboxElement = driver.findElement(By.xpath("//input[@id='chkactive']"));
	 	        // Check if the checkbox is enabled
	 	        checkboxElement.click();
	 	        Thread.sleep(3000);
	 	        boolean isEnabled = checkboxElement.isEnabled();
	 	        // softAssert that the checkbox is enabled
	 	        softAssert.assertTrue(isEnabled, "Checkbox is not enabled");
	 	      
	 	        WebElement savebutton = driver.findElement(By.id("btnTexttoSpeechSave"));
	 	        // Check if the button is enabled
	 	        boolean isEnabled1 = savebutton.isEnabled();
	 	        // softAssert that the button is enabled
	 	        softAssert.assertTrue(isEnabled1, "Button is not enabled");
	 	        Thread.sleep(3000);
	 	        String ExpectedTTSstatus = "Congratulations! Your new Text-to-speech main greeting has been activated.";
	 	        String ActualTTSStatus = driver.findElement(By.xpath("//h1[contains(text(),'Congratulations! Your new Text-to-speech main greeting has been activated.')]")).getText();
	 	        softAssert.assertEquals(ActualTTSStatus, ExpectedTTSstatus);
	 	       softAssert.assertAll();
	 	  
	 }



  

}
