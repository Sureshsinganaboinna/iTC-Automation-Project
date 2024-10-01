package Testngproject1.iTCbackoffice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandlePermissionPops {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
	      options.addArguments("--use-fake-ui-for-media-stream");
	      options.addArguments("--disable-notifications");
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	    //  driver = new ChromeDriver();
		// WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
	     driver.get("https://qanewbackoffice.itelecenter.com/login.aspx");
	 //     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//input[@name = 'txtPhone']")).sendKeys("8555158253");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'txtPasscode']")).sendKeys("2222");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'btnSubmit']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.id("divSettings")).click();
	  }
 @Test (priority = 1)
 
public void emailNotification() throws InterruptedException
{
	  SoftAssert softAssert = new SoftAssert();
	driver.findElement(By.id("divSettings")).click();
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='lnkMessageNotification']/div/div/span/span")).click();
	
	String ActualResult = "Message Notification for (855) 515-8253";
	String ExpectedResult = driver.findElement(By.xpath("//*[contains(text(),'Message Notification for (855) 515-8253')]")).getText();
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
 @Test (priority = 2)
 public void cellPhoneNotification() throws InterruptedException
 {
	  SoftAssert softAssert = new SoftAssert();
	  driver.findElement(By.id("divSettings")).click();
		 Thread.sleep(3000);
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
		if(driver.findElements(By.xpath("//*[@id='divMsgCellPhone' and @style = 'display: none;']")).size()>0)
		{
	    driver.findElement(By.xpath("//*[@id='divMsgCellPhone' and @style = 'display: none;']")).click();
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
}
