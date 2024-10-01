package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testing.framework.EmailUtils;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;

import java.util.List;
import java.util.Properties;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.tools.ant.taskdefs.SendEmail;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class NewTest {
	static WebDriver driver;
	@BeforeClass
	  public void setup() throws InterruptedException  {
		  
			 ChromeOptions options = new ChromeOptions();
		      options.addArguments("--use-fake-ui-for-media-stream");
		      options.addArguments("--disable-notifications");
			  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (4)\\\\chromedriver-win64\\\\chromedriver.exe");
		    //  driver = new ChromeDriver();
			// WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver(options);
			  driver.manage().window().maximize();
		     driver.get("https://qanewbackoffice.itelecenter.com/login.aspx");
//		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
		     driver.findElement(By.xpath("//input[@name = 'txtPhone']")).sendKeys("8555158253");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@name = 'txtPasscode']")).sendKeys("2000");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@name = 'btnSubmit']")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[contains(@id,'Tools')]")).click();
		  }
		
		
		  @Test(priority = 2)
		  
		  public void testReportsContent() {
			  SoftAssert softAssert = new SoftAssert();
			  
			  //By Date Range And Extension content Verification
		  String actual3 = "Reports\n"
		  		+ "Manage your team members and their account permissions here.";
		  String expected3 = driver.findElement(By.xpath("//*[@id='divContainerRight']/div[1]/div/div")).getText();
		  
		  softAssert.assertEquals(actual3, expected3); 

		  String actual4 = "By Date Range And Extension";
		  String expected4 = driver.findElement(By.xpath("//*[@id='divByDateRange']/div/div[1]/h2")).getText();
		  
		  softAssert.assertEquals(actual4, expected4); 
		  
		  String actual5 = "Provides call counts and basic call information filtered by extension dialed by the caller. The same call may appear in multiple reports if the caller dialed more than one extension during the course of the call.";
		  String expected5 = driver.findElement(By.xpath("//*[@id='divByDateRange']/div/div[1]/p")).getText();
		  
		  softAssert.assertEquals(actual5, expected5);
		  
		 
		  WebElement link = driver.findElement(By.id("divByDateRangeView"));  // Replace with the actual link text on your page
		  
		  softAssert.assertTrue(link.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
		  
		  //Statistics content Verification
		  String actual = "Statistics";
		  String expected = driver.findElement(By.xpath("//*[@id='divStatistics']/div/div[1]/h2")).getText();
		  
		  softAssert.assertEquals(actual, expected); 

		  String actual01 = "Provides at-a-glance statistics of all calls received on your number. You can see how many callers left a voicemail, requested to connect to you directly, send you a fax, etc. The statistics shows separate information for main number and each extension that was dialed by any caller during your selected time.";
		  String expected01 = driver.findElement(By.xpath("//*[@id='divStatistics']/div/div[1]/p")).getText();
		  
		  softAssert.assertEquals(actual01, expected01);
		  
		 
		  WebElement ViewReportbutton = driver.findElement(By.id("divStatisticsView"));  // Replace with the actual link text on your page
		  
		  softAssert.assertTrue(ViewReportbutton.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
		   
		//  Call Detail content Verification
		  String actual11 = "Call Detail";
		  String expected11 = driver.findElement(By.xpath("//*[@id='divCallDetail']/div/div[1]/h2")).getText();
		  
		  softAssert.assertEquals(actual11, expected11); 

		  String actual02 = "Provides a step-by-step analysis of the actions of your caller while they were on the phone, including the exact time they have taken an action and the time they spent listening to a greeting or a menu, recording a voicemail, etc.";
		  String expected02 = driver.findElement(By.xpath("//*[@id='divCallDetail']/div/div[1]/p")).getText();
		  
		  softAssert.assertEquals(actual02, expected02);
		  
		 
		  WebElement ViewReportbutton03 = driver.findElement(By.id("divCallDetailView"));  // Replace with the actual link text on your page
		  
		  softAssert.assertTrue(ViewReportbutton03.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
		//Texts by Date Range content Verification
		  String actual12 = "Text By Date Range";
		  String expected12 = driver.findElement(By.xpath("//*[@id='divTxtByDate']/div/div[1]/h2")).getText();
		  
		  softAssert.assertEquals(actual12, expected12); 

		  String actual03 = "Provides details about sms/text message conversation within a given time. Shows counts of individual text messages in each conversation (one message is equal to up to 160 characters) as well as the total number of messages that have been processed by the system.";
		  String expected03 = driver.findElement(By.xpath("//*[@id='divTxtByDate']/div/div[1]/p")).getText();
		  
		  softAssert.assertEquals(actual03, expected03);
		  
		 
		  WebElement ViewReportbutton04 = driver.findElement(By.id("divTxtByDateView"));  // Replace with the actual link text on your page
		  
		  softAssert.assertTrue(ViewReportbutton04.isEnabled(), "View Report button is enabled or not if enabled true return if not False return");
		   softAssert.assertAll();
		  
		  }
		  
		  
		  @Test (priority = 3)
		  public void testBarChat() throws InterruptedException {
			 
			  SoftAssert softAssert = new SoftAssert();
			  driver.findElement(By.id("divByDateRangeView")).click();
		      Thread.sleep(5000);
		      String actual42 = "My details";
			  String expected42 = driver.findElement(By.xpath("//*[@id='divContainerRight']/div[1]/div/div[1]/span[2]")).getText();
			  softAssert.assertEquals(actual42, expected42);
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
		      
		      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
		      softAssert.assertAll();
		  }
		  @Test (priority = 4)
		 public void testStatistics() throws InterruptedException {
			
			  SoftAssert softAssert = new SoftAssert();
			  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-750)");
			   Thread.sleep(10000);
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
		      
//		      WebElement barChartElement = driver.findElement(By.cssSelector(barChartSelector));
//		      softAssert.assertNotNull(barChartElement, "Bar chart is not present on the page");
		      
		      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
		      
			  WebElement barChart = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ReportViewer1_ReportViewer']")); // Change the locator strategy as needed
		      Thread.sleep(10000);
		     // barChart.isDisplayed();
		      
		      // softAssertion to check if the bar chart is displayed
		      softAssert.assertTrue(barChart.isDisplayed(), "Bar chart is not present on the page or not visible");
		      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
		      softAssert.assertAll();
		      
		  }
		  @Test (priority = 5)
		 public void testCallDetail() throws InterruptedException {
			
			  SoftAssert softAssert = new SoftAssert();
			  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-750)");
			     Thread.sleep(2000);
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
//		       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
//		       Thread.sleep(5000);sss
//			  WebElement barChart1 = driver.findElement(By.xpath("//*[@id='ReportViewer1']")); // Change the locator strategy as needed
//		      Thread.sleep(5000);
//		     // barChart.isDisplayed();
		      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
		      Thread.sleep(3000);
//		      // softAssertion to check if the bar chart is displayed
//		      softAssert.assertTrue(barChart1.isDisplayed(), "Bar chart is not present on the page or not visible");
		      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
		      softAssert.assertAll();
		  }
		  @Test(priority = 6)
		public void testTextByDateRange() throws InterruptedException {
			  SoftAssert softAssert = new SoftAssert();
			  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-750)");
			     Thread.sleep(2000);
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
		  @Test  (priority = 7)
		  public void testUIofAddNewTextCcode() throws InterruptedException {
			  SoftAssert softAssert = new SoftAssert();

		      driver.findElement(By.id("divTextCodes")).click();
			  Thread.sleep(3000);
			  if(driver.findElements(By.id("imgAddtxtCode")).size()>0)
			  {
				  driver.findElement(By.id("imgAddtxtCode")).click();
				  String Actualresult2 = "Text Code";
				     String Expected2 =  driver.findElement(By.xpath("//h4[contains(text(),'Text Code')]")).getText();
				     softAssert.assertEquals(Actualresult2, Expected2);
				    
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
				     	 String Actualresult6 = "Upto 400 total text messages on account per month are free.\n"
				     	 		+ "(2¢ per additional message)";
				         String Expected6 =  driver.findElement(By.xpath("//*[@id='divTxtbkContent']/div/div[1]/p")).getText();
				         softAssert.assertEquals(Actualresult6, Expected6);
				         
				         String Actualresult4 = "480 of 480characters remaining • Counted as 0 message(s)";
				         String Expected4 =  driver.findElement(By.xpath("//p[@id='divCharCount']")).getText();
				         softAssert.assertEquals(Actualresult4, Expected4);
				     	
			  }
			   softAssert.assertAll();
		  }
		  @Test (priority = 8)
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
			  driver.findElement(By.xpath("//*[@id='divExtGreet']/div[2]/div/div[2]/div")).click();
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
//			  String Actual3 = "Text Code Updated successfully.";
//			  String Expected7 =  driver.findElement(By.xpath("//*[contains(text(),'Text Code Updated successfully.')]")).getText();
//			  softAssert.assertEquals(Actual3, Expected7);  
			   softAssert.assertAll();
		  }
		  @Test (priority = 9)
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
//				  String Actresult = "Your contact has been saved.";
//				  String Expresult = driver.findElement(By.xpath("//*[contains(text(),'Your contact has been saved.')]")).getText();
//				  softAssert.assertEquals(Actresult, Expresult);
				  Thread.sleep(3000);
				  driver.findElement(By.id("divAddCntClose")).click();
				   softAssert.assertAll();
			}

			@Test (priority = 10)
			public void testContactsSectionPage() throws InterruptedException
			{
				  SoftAssert softAssert = new SoftAssert();
				  driver.findElement(By.id("divContacts")).click();
				  Thread.sleep(3000);
				   WebElement imageElement = driver.findElement(By.xpath("//*[@id='divContactGrid']/div[1]/div/div/div[2]")); // Modify the XPath accordingly
			     String srcAttribute = imageElement.getAttribute("src");
			     // Verify if src attribute contains a valid URL
			     softAssert.assertNotNull(srcAttribute, "Image is present");
			     // Optionally, you can also check if the URL is not empty or a placeholder image
			  //   softAssert.assertNotEquals(srcAttribute, "", "Image source is not empty");
			     
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
//				  int expectedItemCount = 5;
//				  List<WebElement> items = driver.findElements(By.xpath("//ul[@class='pagination bootpag']/a[not(text()='Prev' or text()='Next')]"));
//				  Thread.sleep(3000);
//			     int itemCount = items.size();
//					
//			     System.out.println(itemCount);
//			     softAssert.assertEquals(itemCount, expectedItemCount);
				 if(driver.findElements(By.xpath("//a[contains(text(),'1')]")).size()>0)
				 {
					 driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
				 }
				  Thread.sleep(3000);
				  if(driver.findElements(By.xpath("//a[contains(text(),'2')]")).size()>0)
					 {
						 driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
					 }
				  Thread.sleep(3000);
				  if(driver.findElements(By.xpath("//a[contains(text(),'3')]")).size()>0)
					 {
						 driver.findElement(By.xpath("//a[contains(text(),'3')]")).click();
					 }
					
				  Thread.sleep(3000);
				  if(driver.findElements(By.xpath("//a[contains(text(),'4')]")).size()>0)
					 {
						 driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
					 }
				  Thread.sleep(3000);
				 if(driver.findElements(By.xpath("//a[contains(text(),'5')]")).size()>0)
					 {
						 driver.findElement(By.xpath("//a[contains(text(),'5')]")).click();
					 }
//				  Thread.sleep(3000);
				  if(driver.findElements(By.xpath("//a[contains(text(),'Next')]")).size()>0)
				  {
					  driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();	  
				  }
				  Thread.sleep(3000);
				
						  if(driver.findElements(By.xpath("//a[contains(text(),'Prev')]")).size()>0)
						  {
							  driver.findElement(By.xpath("//a[contains(text(),'Prev')]")).click();
						  }
						  Thread.sleep(3000);
						  if(driver.findElements(By.xpath("//a[contains(text(),'Prev')]")).size()>0)
						  {
							  driver.findElement(By.xpath("//a[contains(text(),'Prev')]")).click();
						  } 
						  Thread.sleep(3000);
						  if(driver.findElements(By.xpath("//a[contains(text(),'Prev')]")).size()>0)
						  {
							  driver.findElement(By.xpath("//a[contains(text(),'Prev')]")).click();
						  }				  Thread.sleep(3000);
				  
				  
				  // Test to check whether Dropdown Existence or not on the page.
				       
				        WebElement dropdown = driver.findElement(By.id("ddlRowCount"));
				        softAssert.assertNotNull(dropdown);
				  // Test to check whether Dropdown Options or not diplaying over page.
//				           
//				            WebElement dropdown1 = driver.findElement(By.id("your_dropdown_id"));
//				            Select select = new Select(dropdown1);
//				            List<WebElement> options = select.getOptions();
				            
				            
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
//				                WebDriverWait wait = new WebDriverWait(driver, 15);
//				                wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox1, true));
				                Thread.sleep(3000);
				             //   softAssert.assertTrue(checkbox1.isSelected(), "Checkbox 1 is checked");
				                Thread.sleep(3000);
				                WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='grdContacts']/tbody/tr[2]/td[1]/label/span"));
				                // Check both checkb
				           
				                checkbox2.click();
				                // Verify both checkboxes are checked
				                Thread.sleep(3000);
				                
				                driver.findElement(By.xpath("//img[@src='Images/newImages/trash-icon.svg']")).click();
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

			@Test (priority = 11)
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
				String Actualresult1 = "The Imported File Should contains Headers";
				String Expectedrsult1 = driver.findElement(By.xpath("//*[contains(text(),'The Imported File Should contains Headers')]")).getText();
				softAssert.assertEquals(Actualresult1, Expectedrsult1);
				//Test to check user is able to see this text(FirstName,LastName,Email,PhoneNumber,Company)
				String Actualresult12 = "FirstName,LastName,Email,PhoneNumber,Company";
				String Expectedrsult12 = driver.findElement(By.xpath("//*[contains(text(),'FirstName,LastName,Email,PhoneNumber,Company')]")).getText();
				softAssert.assertEquals(Actualresult12, Expectedrsult12);
				
				//Test to check user is able to see the "No file chosen" text
				String Actualresult13 = "Click to upload";
				String Expectedrsult13 = driver.findElement(By.xpath("//*[contains(text(),'Click to upload')]")).getText();
				softAssert.assertEquals(Actualresult13, Expectedrsult13);
				
				String Actualresult131 = "or drag and drop";
				String Expectedrsult131 = driver.findElement(By.xpath("//*[contains(text(),'or drag and drop')]")).getText();
				softAssert.assertEquals(Actualresult131, Expectedrsult131);
				
				//Test to check user is able to see this text (Choose File)
				String Actualresult14 = "SVG, PNG, JPG or GIF (max. 800x400px)";
				String Expectedrsult14 = driver.findElement(By.xpath("//*[contains(text(),'SVG, PNG, JPG or GIF (max. 800x400px)')]")).getText();
				softAssert.assertEquals(Actualresult14, Expectedrsult14);
				
				//Test to check user is able to see the Import button is enabled or not.
				
				WebElement importbutton = driver.findElement(By.id("btnImportcsvContact"));
				softAssert.assertTrue(importbutton.isEnabled());
				
				//Test to check user is able to see this text(Export Contacts)
				String Actualresult15 = "Export Your Contacts";
				String Expectedrsult15 = driver.findElement(By.xpath("//*[contains(text(),'Export Your Contacts')]")).getText();
				softAssert.assertEquals(Actualresult15, Expectedrsult15);
				
				//Test to check user is able to see this text(Export Contacts)
				String Actualresult16 = "Choose format";
				String Expectedrsult16 = driver.findElement(By.xpath("//*[contains(text(),'Choose format')]")).getText();
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


			@Test (priority = 12)
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
			 @Test (priority = 13)
			  
				public void emailNotification() throws InterruptedException
				{
					  SoftAssert softAssert = new SoftAssert();
					driver.findElement(By.id("divSettings")).click();
					 Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='lnkMessageNotification']/div/div/span/span")).click();
					
					String ActualResult = "Message Notification for";
					String ExpectedResult = driver.findElement(By.xpath("//*[contains(text(),'Message Notification for')]")).getText();
					softAssert.assertEquals(ActualResult, ExpectedResult);
					   Thread.sleep(3000);
					   String ActualResult1 = "Manage your team members and their account permissions here.";
						String ExpectedResult1 = driver.findElement(By.xpath("//*[contains(text(),'Manage your team members and their account permissions here.')]")).getText();
						softAssert.assertEquals(ActualResult1, ExpectedResult1);
						Thread.sleep(3000);
						String ActualResult11 = "Manage your team members and their account permissions here.";
						String ExpectedResult11 = driver.findElement(By.xpath("//*[contains(text(),'Manage your team members and their account permissions here.')]")).getText();
						softAssert.assertEquals(ActualResult11, ExpectedResult11);	
						Thread.sleep(3000);
						WebElement Cancelbutton = driver.findElement(By.id("btnCancel")); // Replace "button-id" with your actual button ID or other locator
				        // Assert that the button is displayed
						softAssert.assertTrue(Cancelbutton.isDisplayed(), "CancelButton is not displayed on the page");
						
						WebElement Savebutton = driver.findElement(By.id("btnSave")); // Replace "button-id" with your actual button ID or other locator
				        // Assert that the button is displayed
						softAssert.assertTrue(Savebutton.isDisplayed(), "SaveButton is not displayed on the page");
						Thread.sleep(3000);
						String ActualResult12 = "Email Notifictation";
						String ExpectedResult12 = driver.findElement(By.xpath("//*[contains(text(),'Email Notifictation ')]")).getText();
						softAssert.assertEquals(ActualResult12, ExpectedResult12);	
						Thread.sleep(3000);
						WebElement Tooltip = driver.findElement(By.id("AncEmailNotificationSettings")); // Replace "button-id" with your actual button ID or other locator
				        // Assert that the button is displayed
						softAssert.assertTrue(Tooltip.isDisplayed(), "Tooltip is not displayed on the page");	
						Thread.sleep(3000);
						driver.findElement(By.id("AncEmailNotificationSettings")).click();
						
						String ActualResult121 = "Email Notification Settings";
						String ExpectedResult121 = driver.findElement(By.xpath("//*[contains(text(),'Email Notification Settings')]")).getText();
						softAssert.assertEquals(ActualResult121, ExpectedResult121);
						Thread.sleep(3000);
						String ActualResult1211 = "Message Notification can be set up to notify you via email when you receive new voicemail messages or faxes. This saves you time and money, because you don’t have to keep calling your iTeleCenter system, or log in online to Web Center, in order to check for new messages – you can check them right from your e-mail!";
						String ExpectedResult1211 = driver.findElement(By.xpath("//*[contains(text(),'Message Notification can be set up to notify you via email when you receive new voicemail messages or faxes. This saves you time and money, because you don’t have to keep calling your iTeleCenter system, or log in online to Web Center, in order to check for new messages – you can check them right from your e-mail!')]")).getText();
						softAssert.assertEquals(ActualResult1211, ExpectedResult1211);
						Thread.sleep(3000);
						String ActualResult12111 = "Enter an alternative email if you’d like to be contacted via a different email.";
						String ExpectedResult12111 = driver.findElement(By.xpath("//*[contains(text(),'Enter an alternative email if you’d like to be contacted via a different email.')]")).getText();
						softAssert.assertEquals(ActualResult12111, ExpectedResult12111);
						Thread.sleep(3000);
						String ActualResult121111 = "Anything delivered to my inbox";
						String ExpectedResult121111 = driver.findElement(By.xpath("//*[@id='liEmailAny']/span[2]")).getText();
						softAssert.assertEquals(ActualResult121111, ExpectedResult121111);
						String ActualResult1211111 = "Voicemail messages";
						String ExpectedResult1211111 = driver.findElement(By.xpath("//*[@id='liEmailVM']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1211111, ExpectedResult1211111);
						String ActualResult1212 = "Faxes";
						String ExpectedResult1212 = driver.findElement(By.xpath("//*[@id='liEmailFax']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1212, ExpectedResult1212);
						String ActualResult1213 = "Broadcast messages";
						String ExpectedResult1213 = driver.findElement(By.xpath("//*[@id='liEmailBRD']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1213, ExpectedResult1213);
						String ActualResult1214 = "Hang ups";
						String ExpectedResult1214 = driver.findElement(By.xpath("//*[@id='liEmailHUM']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1214, ExpectedResult1214);
						String ActualResult1215 = "Text messages";
						String ExpectedResult1215= driver.findElement(By.xpath("//*[@id='liEmailTxt']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1215, ExpectedResult1215);
						Thread.sleep(3000);
						 // Find the checkbox element
				        WebElement checkbox = driver.findElement(By.className("MTS-checkmark")); // Replace "checkbox-id" with your actual checkbox ID or other locator
				        // Verify checkbox is not checked initially
				        softAssert.assertFalse(checkbox.isSelected(), "Checkbox is unexpectedly checked initially");  
				        // Check the checkbox
				        checkbox.click();
				        // Verify checkbox is checked
				        softAssert.assertTrue(checkbox.isSelected(), "Checkbox could not be checked");
				        driver.findElement(By.id("btnSave")).click();
				        Thread.sleep(3000);
				        String ActualResult123 = "Your settings have been updated successfully.";
						String ExpectedResult123 = driver.findElement(By.xpath("//label[contains(text(),'Your settings have been updated successfully.')]")).getText();
						softAssert.assertEquals(ActualResult123, ExpectedResult123);
						
						 WebElement checkbox1 = driver.findElement(By.className("MTS-checkmark")); // Replace "checkbox-id" with your actual checkbox ID or other locator
					        // Verify checkbox is initially unchecked
						 softAssert.assertFalse(checkbox1.isSelected(), "Checkbox is unexpectedly checked initially");
						 checkbox1.click();
						  Thread.sleep(3000);
						  driver.findElement(By.id("btnSave")).click();
					        Thread.sleep(3000);
					        String ActualResult1231 = "Your settings have been updated successfully.";
							String ExpectedResult1231 = driver.findElement(By.xpath("//label[contains(text(),'Your settings have been updated successfully.')]")).getText();
							softAssert.assertEquals(ActualResult1231, ExpectedResult1231);
							 Thread.sleep(3000);
							 
							 WebElement emailimage = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/img[@src='Images/newImages/EmailIcon.svg']")); // Replace "checkbox-id" with your actual checkbox ID or other locator
						        // Verify checkbox is not checked initially
						        softAssert.assertFalse(emailimage.isSelected(), "emailimage is unexpectedly checked initially");  			
							driver.findElement(By.id("txtEmail")).clear();
						
							driver.findElement(By.id("btnSave")).click();
							Thread.sleep(3000);
							   String ActualResult12311 = "Enter the Email address.";
								String ExpectedResult12311 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
								softAssert.assertEquals(ActualResult12311, ExpectedResult12311);
								driver.findElement(By.id("txtEmail")).sendKeys("singanaboina.suresh@coanetwork.com");
								Thread.sleep(3000);
								driver.findElement(By.id("btnSave")).click();
								Thread.sleep(3000);
							    String ActualResult1234 = "Your settings have been updated successfully.";
								String ExpectedResult1234 = driver.findElement(By.xpath("//label[contains(text(),'Your settings have been updated successfully.')]")).getText();
								softAssert.assertEquals(ActualResult1234, ExpectedResult1234);
				if(driver.findElements(By.xpath("//*[@checked='checked' and @id = 'chkEmail2Notify']")).size()>0)
				{
					driver.findElement(By.id("txtEmail2")).clear();
					Thread.sleep(3000);
					driver.findElement(By.id("btnSave")).click();
					Thread.sleep(3000);
					   String ActualResult123111 = "Enter the Email address.";
						String ExpectedResult123111 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
						softAssert.assertEquals(ActualResult123111, ExpectedResult123111);
						driver.findElement(By.id("txtEmail2")).sendKeys("singanaboina.suresh@coanetwork.com");
						Thread.sleep(3000);
						driver.findElement(By.id("btnSave")).click();
						Thread.sleep(3000);
					    String ActualResult12341 = "Your settings have been updated successfully.";
						String ExpectedResult12341 = driver.findElement(By.xpath("//label[contains(text(),'Your settings have been updated successfully.')]")).getText();
						softAssert.assertEquals(ActualResult12341, ExpectedResult12341);
					
				}			
				}
				  @Test (priority = 14)
				  public void cellPhoneNotification() throws InterruptedException
				  {
					  SoftAssert softAssert = new SoftAssert();
					   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)");
					   Thread.sleep(3000);
					   String ActualResult12341 = "Notification to your Cell Phone";
						String ExpectedResult12341 = driver.findElement(By.xpath("//*[contains(text(),'Notification to your Cell Phone')]")).getText();
						softAssert.assertEquals(ActualResult12341, ExpectedResult12341);
						
			driver.findElement(By.id("changeToolTip1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("changeToolTip1")).click();
			Thread.sleep(3000);
						String ActualResult121 = "via SMS text";
						String ExpectedResult121 = driver.findElement(By.xpath("//*[contains(text(),'via SMS text')]")).getText();
						softAssert.assertEquals(ActualResult121, ExpectedResult121);
						Thread.sleep(3000);
						if(driver.findElements(By.xpath("//*[@id='divMsgCellPhone' and @style = 'display: block;']")).size()>0)
						{
						String ActualResult1211 = "Message Notification by Text to your Cell Phone";
						String ExpectedResult1211 = driver.findElement(By.xpath("//*[@id='divCell1']/h5")).getText();
						softAssert.assertEquals(ActualResult1211, ExpectedResult1211);
						
						String ActualResult122 = "Cell Phone Number";
						String ExpectedResult122 = driver.findElement(By.xpath("//*[contains(text(),'Cell Phone Number')]")).getText();
						softAssert.assertEquals(ActualResult122, ExpectedResult122);
						
						String ActualResult1221 = "I agree to receive SMS/MMS/Text notifications from iTeleCenter on this number";
						String ExpectedResult1221 = driver.findElement(By.xpath("//*[contains(text(),'I agree to receive SMS/MMS/Text notifications from iTeleCenter on this number')]")).getText();
						softAssert.assertEquals(ActualResult1221, ExpectedResult1221);
						
						WebElement btnChange = driver.findElement(By.id("btnChange")); // Replace "checkbox-id" with your actual checkbox ID or other locator
				        // Verify checkbox is initially unchecked
					 softAssert.assertFalse(btnChange.isSelected(), "btnChange is unexpectedly checked initially");
						
					 WebElement noteSymbel = driver.findElement(By.xpath("//img[@src='Images/newImages/STG-note.svg']")); // Replace "checkbox-id" with your actual checkbox ID or other locator
				        // Verify checkbox is initially unchecked
					 softAssert.assertFalse(noteSymbel.isSelected(), "btnChange is unexpectedly checked initially");
					 
					 String ActualResult1222 = "Note";
						String ExpectedResult1222 = driver.findElement(By.xpath("//*[contains(text(),'Note')]")).getText();
						softAssert.assertEquals(ActualResult1222, ExpectedResult1222);
					 
						String ActualResult1223 = "Your carrier’s regular text message charges may apply. \n"
								+ "                                  Some carriers may split messages into multiple texts if they exceed the carrier’s maximum length.";
						String ExpectedResult1223 = driver.findElement(By.xpath("//*[@id='divNoteCell']/div/p")).getText();
						softAssert.assertEquals(ActualResult1223, ExpectedResult1223);
					      
						String ActualResult1213 = "Anything delivered to my inbox";
						String ExpectedResult1213 = driver.findElement(By.xpath("//*[@id='liTextAny']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1213, ExpectedResult1213);
						String ActualResult1214 = "Voicemail messages";
						String ExpectedResult1214 = driver.findElement(By.xpath("//*[@id='liTextVM']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1214, ExpectedResult1214);
						String ActualResult1215 = "Faxes";
						String ExpectedResult1215= driver.findElement(By.xpath("//*[@id='liTextFax']/span[2]")).getText();
						softAssert.assertEquals(ActualResult1215, ExpectedResult1215);
						String ActualResult12151 = "Broadcast messages";
						String ExpectedResult12151= driver.findElement(By.xpath("//*[@id='liTextBRD']/span[2]")).getText();
						softAssert.assertEquals(ActualResult12151, ExpectedResult12151);
						String ActualResult121511 = "Hang ups";
						String ExpectedResult121511= driver.findElement(By.xpath("//*[@id='liTextHUM']/span[2]")).getText();
						softAssert.assertEquals(ActualResult121511, ExpectedResult121511);
						Thread.sleep(3000);
						 // Find the checkbox element
				        WebElement checkbox = driver.findElement(By.id("liTextAny")); // Replace "checkbox-id" with your actual checkbox ID or other locator
				        // Verify checkbox is not checked initially
				        softAssert.assertFalse(checkbox.isSelected(), "Checkbox is unexpectedly checked initially");  
				        // Check the checkbox
				        checkbox.click();
				        // Verify checkbox is checked
				        softAssert.assertTrue(checkbox.isSelected(), "Checkbox could not be checked");
				        checkbox.click();
				        Thread.sleep(3000);
				        driver.findElement(By.id("btnChange")).click();
				        String ActualResult1244 = "Service Provider";
						String ExpectedResult1244= driver.findElement(By.xpath("//*[contains(text(),'Service Provider')]")).getText();
						softAssert.assertEquals(ActualResult1244, ExpectedResult1244);
						driver.findElement(By.id("txtCellPhoneNo")).clear();
						 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
						 Thread.sleep(3000);
						 driver.findElement(By.id("btnSave")).click();
						 
						 String ActualResult12441 = "Enter the cell phone number.";
							String ExpectedResult12441= driver.findElement(By.xpath("//*[contains(text(),'Enter the cell phone number.')]")).getText();
							softAssert.assertEquals(ActualResult12441, ExpectedResult12441);
							((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)");
							 Thread.sleep(3000);
							WebElement dropdown = driver.findElement(By.id("ddlCellProvider"));
							//Get Available option
							Select select = new Select(dropdown);
							List<WebElement> options = select.getOptions();
							System.out.println(options.size());
							String values = options.toString();
							System.out.println(values);
							select.selectByVisibleText("Other");
							
							driver.findElement(By.id("txtCellPhoneNo")).sendKeys("7329626565");
							 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
							 Thread.sleep(3000);
							 driver.findElement(By.id("btnSave")).click();
								Thread.sleep(3000);
							    String ActualResult12345 = "Your settings have been updated successfully.";
								String ExpectedResult12345 = driver.findElement(By.xpath("//label[contains(text(),'Your settings have been updated successfully.')]")).getText();
								softAssert.assertEquals(ActualResult12345, ExpectedResult12345);
							
							
						}
						if(driver.findElements(By.id("chkCellONOFFNotify")).size()>0)
						{
							Thread.sleep(3000);
							driver.findElement(By.id("chkCellOtNOFFNotify")).click();
//							 Actions act =  new Actions(driver);
//						      act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'display: none;')]"))).click().perform();
							Thread.sleep(3000);
							String ActualResult1211 = "Message Notification by Text to your Cell Phone";
							String ExpectedResult1211 = driver.findElement(By.xpath("//*[@id='divCell1']/h5")).getText();
							softAssert.assertEquals(ActualResult1211, ExpectedResult1211);
							
							String ActualResult122 = "Cell Phone Number";
							String ExpectedResult122 = driver.findElement(By.xpath("//*[contains(text(),'Cell Phone Number')]")).getText();
							softAssert.assertEquals(ActualResult122, ExpectedResult122);
							
							String ActualResult1221 = "I agree to receive SMS/MMS/Text notifications from iTeleCenter on this number";
							String ExpectedResult1221 = driver.findElement(By.xpath("//*[contains(text(),'I agree to receive SMS/MMS/Text notifications from iTeleCenter on this number')]")).getText();
							softAssert.assertEquals(ActualResult1221, ExpectedResult1221);
							
							WebElement btnChange = driver.findElement(By.id("btnChange")); // Replace "checkbox-id" with your actual checkbox ID or other locator
					        // Verify checkbox is initially unchecked
						 softAssert.assertFalse(btnChange.isSelected(), "btnChange is unexpectedly checked initially");
							
						 WebElement noteSymbel = driver.findElement(By.xpath("//img[@src='Images/newImages/STG-note.svg']")); // Replace "checkbox-id" with your actual checkbox ID or other locator
					        // Verify checkbox is initially unchecked
						 softAssert.assertFalse(noteSymbel.isSelected(), "btnChange is unexpectedly checked initially");
						 
						 String ActualResult1222 = "Note";
							String ExpectedResult1222 = driver.findElement(By.xpath("//*[contains(text(),'Note')]")).getText();
							softAssert.assertEquals(ActualResult1222, ExpectedResult1222);
						 
							String ActualResult1223 = "Your carrier’s regular text message charges may apply. \n"
									+ "                                  Some carriers may split messages into multiple texts if they exceed the carrier’s maximum length.";
							String ExpectedResult1223 = driver.findElement(By.xpath("//*[@id='divNoteCell']/div/p")).getText();
							softAssert.assertEquals(ActualResult1223, ExpectedResult1223);
						      
							String ActualResult1213 = "Anything delivered to my inbox";
							String ExpectedResult1213 = driver.findElement(By.xpath("//*[@id='liTextAny']/span[2]")).getText();
							softAssert.assertEquals(ActualResult1213, ExpectedResult1213);
							String ActualResult1214 = "Voicemail messages";
							String ExpectedResult1214 = driver.findElement(By.xpath("//*[@id='liTextVM']/span[2]")).getText();
							softAssert.assertEquals(ActualResult1214, ExpectedResult1214);
							String ActualResult1215 = "Faxes";
							String ExpectedResult1215= driver.findElement(By.xpath("//*[@id='liTextFax']/span[2]")).getText();
							softAssert.assertEquals(ActualResult1215, ExpectedResult1215);
							String ActualResult12151 = "Broadcast messages";
							String ExpectedResult12151= driver.findElement(By.xpath("//*[@id='liTextBRD']/span[2]")).getText();
							softAssert.assertEquals(ActualResult12151, ExpectedResult12151);
							String ActualResult121511 = "Hang ups";
							String ExpectedResult121511= driver.findElement(By.xpath("//*[@id='liTextHUM']/span[2]")).getText();
							softAssert.assertEquals(ActualResult121511, ExpectedResult121511);
							Thread.sleep(3000);
							 // Find the checkbox element
					        WebElement checkbox = driver.findElement(By.id("liTextAny")); // Replace "checkbox-id" with your actual checkbox ID or other locator
					        // Verify checkbox is not checked initially
					        softAssert.assertFalse(checkbox.isSelected(), "Checkbox is unexpectedly checked initially");  
					        // Check the checkbox
					        checkbox.click();
					        // Verify checkbox is checked
					        softAssert.assertTrue(checkbox.isSelected(), "Checkbox could not be checked");
					        checkbox.click();
					        Thread.sleep(3000);
					        driver.findElement(By.id("btnChange")).click();
					        String ActualResult1244 = "Service Provider";
							String ExpectedResult1244= driver.findElement(By.xpath("//*[contains(text(),'Service Provider')]")).getText();
							softAssert.assertEquals(ActualResult1244, ExpectedResult1244);
							driver.findElement(By.id("txtCellPhoneNo")).clear();
							 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
							 Thread.sleep(3000);
							 driver.findElement(By.id("btnSave")).click();
							 
							 String ActualResult12441 = "Enter the cell phone number.";
								String ExpectedResult12441= driver.findElement(By.xpath("//*[contains(text(),'Enter the cell phone number.')]")).getText();
								softAssert.assertEquals(ActualResult12441, ExpectedResult12441);
								((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)");
								 Thread.sleep(3000);
								WebElement dropdown = driver.findElement(By.id("ddlCellProvider"));
								//Get Available option
								Select select = new Select(dropdown);
								List<WebElement> options = select.getOptions();
								System.out.println(options.size());
								String values = options.toString();
								System.out.println(values);
								select.selectByVisibleText("Other");
								
								driver.findElement(By.id("txtCellPhoneNo")).sendKeys("7329626565");
								 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
								 Thread.sleep(3000);
								 driver.findElement(By.id("btnSave")).click();
									Thread.sleep(3000);
								    String ActualResult12345 = "Your settings have been updated successfully.";
									String ExpectedResult12345 = driver.findElement(By.xpath("//label[contains(text(),'Your settings have been updated successfully.')]")).getText();
									softAssert.assertEquals(ActualResult12345, ExpectedResult12345);
								
							
							
							
							
							
						}
						
				  }
				  
				
				
  /*
  @Test
  public void afterHoursGreeting() throws InterruptedException {
	     Thread.sleep(3000);
	     driver.findElement(By.id("divSettings")).click();
		  Thread.sleep(3000);
	    
	  driver.findElement(By.id("lnkAHGreeting")).click();
	     Thread.sleep(3000);
	  String extreuslt = "Create an After-Hours Greeting";
	  String actresult = driver.findElement(By.xpath("//span[contains(text(),'Create an After-Hours Greeting')]")).getText();
	  Assert.assertEquals(extreuslt, actresult);
	     Thread.sleep(3000);
	  String extreuslt1 = " Tips for creating Greeting ";
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
    	 
      }
      Thread.sleep(3000);
      if(driver.findElements(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label/div[@class='toggle btn btn-default off']")).size()>0)
      {	  
    	  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[4]/div[1]/label/div[@class='toggle btn btn-default off']")).click();
    	 
      }
  }
*/
  @AfterClass
  public void afterClass() throws EmailException {
	
	  System.out.println("===Start Test");
	  EmailAttachment attachment = new EmailAttachment();
	  attachment.setPath("C:\\Spring\\eclipse-workspace\\iTCbackoffice1\\test-output\\emailable-report.html");
	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
	  attachment.setDescription("Test results");
	  attachment.setName("Test results");
	  // Create the email message
	  MultiPartEmail email = new MultiPartEmail();
	  email.setHostName("mail.coanetwork.com");
	  email.addTo("bharath.chandra@coanetwork.com", "John Doe");
	  email.setFrom("singanaboina.suresh@coanetwork.com", "Me");
	  email.setSubject("The picture");
	  email.setMsg("Here is the picture you wanted");

	  // add the attachment
	  email.attach(attachment);

	  // send the email
	  email.send();
	  System.out.println("===End Test");
  }

}
