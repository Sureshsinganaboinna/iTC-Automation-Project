package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TextCodesFunctionality {
	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
	        
	        // Allow notifications
	     //   options2.addArguments("--enable-features=NotificationTriggers");
	      ChromeOptions options = new ChromeOptions();
	        options.addArguments("--use-fake-ui-for-media-stream");
	        options.addArguments("--disable-notifications");
	        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	        //  driver = new ChromeDriver();
	        
	         driver = new ChromeDriver(options);

	        driver.get("https://www.coasecure.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.id("divSettings")).click();
		      Thread.sleep(3000);		  	  
		  	  driver.findElement(By.id("lnkMessageNotification")).click();     
		     
	}
		  	
  @Test
  public void testMessageNotificationUI() throws InterruptedException
  {
	  //Test to check user is able to click on Settings manu
	  
	 
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
      // Wait for the dynamically appended text element to appear
      WebElement dynamicTextElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblDNIS"))); // Replace with actual ID
      // Get the text of the dynamically appended element
      String dynamicText = dynamicTextElement.getText();
      // Verify if the text contains the expected content
      Assert.assertTrue(dynamicText.contains("Message Notification for")); // Replace with expected text
   ////////////////////////////////////////////////////////////////////////////////   
      WebElement saveButton = driver.findElement(By.id("btnSave")); // Replace with actual save button ID
      Assert.assertTrue(saveButton.isDisplayed(), "Save button is not displayed on the page");
     
//      WebElement saveButton1 = driver.findElement(By.id("btnSave")); // Replace with actual save button ID
//      String buttonText = saveButton1.getText();
//      Assert.assertEquals(buttonText, "Save", "Save button text is not as expected");
 ///////////////////////////////////////////////////////////////////////////////////    
      WebElement cancelButton = driver.findElement(By.id("btnSave")); // Replace with actual save button ID
      Assert.assertTrue(cancelButton.isDisplayed(), "cancel button is not displayed on the page");
      
//      WebElement cancelButton1 = driver.findElement(By.id("btnSave")); // Replace with actual save button ID
//      String buttonText1 = cancelButton1.getText();
//      Assert.assertEquals(buttonText1, "cancel", "cancel button text is not as expected");
   /////////////////////////////////////////////////////////////////////////////////
      String Actualresult = "Message Notification by Email";
	  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Message Notification by Email')]")).getText();
	  Assert.assertEquals(Actualresult, Expectedresult);
	  
	  WebElement imageElement = driver.findElement(By.xpath("//*[contains(@id,'AncEmailNotificationSettings')]")); // Modify the XPath accordingly
      String srcAttribute = imageElement.getAttribute("src");
      // Verify if src attribute contains a valid URL
      // Assert.assertNotNull(srcAttribute, "Image is present");
      // Optionally, you can also check if the URL is not empty or a placeholder image
      Assert.assertNotEquals(srcAttribute, "", "Image source is not empty");  
      
      ///////////////////////////////////////////////////////////////////////////////////
      String Actualresult1 = "Email Address 1";
	  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Email Address 1')]")).getText();
	  Assert.assertEquals(Actualresult1, Expectedresult1);
	  
	  
      ///////////////////////////////////////////////////////////////////////////////////
	//Email Address----2
	  

	  WebElement textField = driver.findElement(By.xpath("//input[@id='txtEmail2']")); // Replace with your text field ID

      String fieldValue = textField.getAttribute("value");
	  System.out.println(fieldValue);
	  
	  if(fieldValue.isEmpty())
	  {
		  WebElement toggleKey1 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div/div/span[@class='toggle-handle btn btn-default']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKey1.isDisplayed(), "Toggle key is not present on the page");
	      
	      WebElement toggleKeyoff2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff2.isDisplayed(), "Toggle key is present with OFF on the page");
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div/div/span[@class='toggle-handle btn btn-default']")).click();
	      Thread.sleep(3000);
		  
	      driver.findElement(By.id("btnSave")).click();
	      
	      String Actualresult6 = "Enter the Email address.";
		  String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
		  Assert.assertEquals(Actualresult6, Expectedresult6);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmail2")).sendKeys("singanaboina.suresh@coanetwork.com");
		  Thread.sleep(5000);
		    driver.findElement(By.id("btnSave")).click();
		    
		    String Actualresult7 = "Your settings have been updated successfully.";
			String Expectedresult7 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult7, Expectedresult7);
		   
	      WebElement toggleKeyon2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyon2.isDisplayed(), "Toggle key is present with ON on the page");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")).click();
	      
	      WebElement toggleKeyoff3 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff3.isDisplayed(), "Toggle key is present with OFF on the page");
	  }
	  else
	  {
		  System.out.println("Is not Empty");
	  }
	  
	  WebElement textField1 = driver.findElement(By.xpath("//input[@id='txtEmail2']")); // Replace with your text field ID
 
	  String Actualvalue = "singanaboina.suresh@coanetwork.com";
      String fieldValue1 = textField1.getAttribute("value");
	  System.out.println(fieldValue1);
	  
	  if(fieldValue1.equalsIgnoreCase(Actualvalue))
	  {
		  driver.findElement(By.id("txtEmail2")).clear();
		     Thread.sleep(2000);
		     if(driver.findElements(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")).size()>0)
		     {
		     
		  WebElement toggleKey1 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKey1.isDisplayed(), "Toggle key is not present on the page");
	      
	      WebElement toggleKeyoff2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff2.isDisplayed(), "Toggle key is present with OFF on the page");
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div/div/span[@class='toggle-handle btn btn-default']")).click();
	      Thread.sleep(3000);
		  
	      driver.findElement(By.id("btnSave")).click();
	      
	      String Actualresult6 = "Enter the Email address.";
		  String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
		  Assert.assertEquals(Actualresult6, Expectedresult6);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmail2")).sendKeys("singanaboina.suresh@coanetwork.com");
		  Thread.sleep(5000);
		    driver.findElement(By.id("btnSave")).click();
		    
		    String Actualresult7 = "Your settings have been updated successfully.";
			String Expectedresult7 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult7, Expectedresult7);
		   
	      WebElement toggleKeyon2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyon2.isDisplayed(), "Toggle key is present with ON on the page");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")).click();
	      
	      WebElement toggleKeyoff3 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff3.isDisplayed(), "Toggle key is present with OFF on the page");
	      Thread.sleep(3000);

	      driver.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  String Actualresult78 = "Your settings have been updated successfully.";
			String Expectedresult78 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult78, Expectedresult78);
	      
		     }
		     if(driver.findElements(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")).size()>0)
		     {
		    	 driver.findElement(By.id("txtEmail2")).clear();
			     Thread.sleep(2000);
		 
		  
	      driver.findElement(By.id("btnSave")).click();
	      
	      String Actualresult6 = "Enter the Email address.";
		  String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
		  Assert.assertEquals(Actualresult6, Expectedresult6);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmail2")).sendKeys("singanaboina.suresh@coanetwork.com");
		  Thread.sleep(5000);
		    driver.findElement(By.id("btnSave")).click();
		    
		    String Actualresult7 = "Your settings have been updated successfully.";
			String Expectedresult7 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult7, Expectedresult7);
		   
	      WebElement toggleKeyon2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyon2.isDisplayed(), "Toggle key is present with ON on the page");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-primary']")).click();
	      
	      WebElement toggleKeyoff3 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff3.isDisplayed(), "Toggle key is present with OFF on the page");
	      Thread.sleep(3000);
	      driver.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  String Actualresult78 = "Your settings have been updated successfully.";
			String Expectedresult78 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult78, Expectedresult78);
	      
	      
	      
		     }
	  }
	  
	  //Email Address----1
	  
	  WebElement textField11 = driver.findElement(By.xpath("//input[@id='txtEmail']")); // Replace with your text field ID

      String fieldValue11 = textField11.getAttribute("value");
	  System.out.println(fieldValue11);
	  
	  if(fieldValue11.isEmpty())
	  {
		  WebElement toggleKey1 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKey1.isDisplayed(), "Toggle key is not present on the page");
	      
	      WebElement toggleKeyoff2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff2.isDisplayed(), "Toggle key is present with OFF on the page");
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")).click();
	      Thread.sleep(3000);
		  
	      driver.findElement(By.id("btnSave")).click();
	      
	      String Actualresult6 = "Enter the Email address.";
		  String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
		  Assert.assertEquals(Actualresult6, Expectedresult6);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmail")).sendKeys("singanaboina.suresh@coanetwork.com");
		  Thread.sleep(5000);
		    driver.findElement(By.id("btnSave")).click();
		    
		    String Actualresult7 = "Your settings have been updated successfully.";
			String Expectedresult7 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult7, Expectedresult7);
			 Thread.sleep(2000);
	      WebElement toggleKeyon2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyon2.isDisplayed(), "Toggle key is present with ON on the page");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")).click();
	      
	      WebElement toggleKeyoff3 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff3.isDisplayed(), "Toggle key is present with OFF on the page");
	  }
	  else
	  {
		  System.out.println("Is not Empty");
	  }
	  
	  WebElement textField111 = driver.findElement(By.xpath("//input[@id='txtEmail2']")); // Replace with your text field ID
 
	  String Actualvalue1 = "singanaboina.suresh@coanetwork.com";
      String fieldValue111 = textField111.getAttribute("value");
	  System.out.println(fieldValue111);
	  
	  if(fieldValue111.equalsIgnoreCase(Actualvalue1))
	  {
		  driver.findElement(By.id("txtEmail")).clear();
		     Thread.sleep(2000);
		     if(driver.findElements(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")).size()>0)
		     {
		     
		  WebElement toggleKey1 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKey1.isDisplayed(), "Toggle key is not present on the page");
	      
	      WebElement toggleKeyoff2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff2.isDisplayed(), "Toggle key is present with OFF on the page");
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[2]/div/label/div/div/span[@class='toggle-handle btn btn-default']")).click();
	      Thread.sleep(3000);
		  
	      driver.findElement(By.id("btnSave")).click();
	      
	      String Actualresult6 = "Enter the Email address.";
		  String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
		  Assert.assertEquals(Actualresult6, Expectedresult6);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmail")).sendKeys("singanaboina.suresh@coanetwork.com");
		  Thread.sleep(5000);
		    driver.findElement(By.id("btnSave")).click();
		    
		    String Actualresult7 = "Your settings have been updated successfully.";
			String Expectedresult7 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult7, Expectedresult7);
		   
	      WebElement toggleKeyon2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyon2.isDisplayed(), "Toggle key is present with ON on the page");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")).click();
	      
	      WebElement toggleKeyoff3 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff3.isDisplayed(), "Toggle key is present with OFF on the page");
	      

	      driver.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  String Actualresult78 = "Your settings have been updated successfully.";
			String Expectedresult78 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult78, Expectedresult78);
	      
		     }
		     if(driver.findElements(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")).size()>0)
		     {
		    	 driver.findElement(By.id("txtEmail")).clear();
			     Thread.sleep(2000);
		 
		  
	      driver.findElement(By.id("btnSave")).click();
	      
	      String Actualresult6 = "Enter the Email address.";
		  String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'Enter the Email address.')]")).getText();
		  Assert.assertEquals(Actualresult6, Expectedresult6);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmail")).sendKeys("singanaboina.suresh@coanetwork.com");
		  Thread.sleep(5000);
		    driver.findElement(By.id("btnSave")).click();
		    
		    String Actualresult7 = "Your settings have been updated successfully.";
			String Expectedresult7 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult7, Expectedresult7);
		   
	      WebElement toggleKeyon2 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyon2.isDisplayed(), "Toggle key is present with ON on the page");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-primary']")).click();
	      
	      WebElement toggleKeyoff3 = driver.findElement(By.xpath("//*[@id='divMsg1']/div[1]/div/label/div[@class='toggle btn btn-default off']")); // Replace with the actual toggle key ID or other locator strategy
	      Assert.assertTrue(toggleKeyoff3.isDisplayed(), "Toggle key is present with OFF on the page");
	      Thread.sleep(3000);
	      driver.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		  String Actualresult78 = "Your settings have been updated successfully.";
			String Expectedresult78 = driver.findElement(By.xpath("//*[contains(text(),'Your settings have been updated successfully.')]")).getText();
			Assert.assertEquals(Actualresult78, Expectedresult78);
	      
	      
	      
		     }
	  }
	  
	  
  }
	
	
	  @Test (priority = 1)
	  public void testSaveContacts() throws InterruptedException
	  {
		
		  driver.findElement(By.id("divContacts")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnAddContact")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
 //Test to check user is able to see validation(Required a number) when click save button without enter any digit.
		  String Actualresult = "Required Phone Number.";
		  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Required Phone Number.')]")).getText();
		  Assert.assertEquals(Actualresult, Expectedresult);
		  //test to check user is able to see the validation when entered less then ten digits.
		  driver.findElement(By.id("txtcntNumber")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
		  String Actualresult1 = "Enter Valid Phone Number.";
		  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Phone Number.')]")).getText();
		  Assert.assertEquals(Actualresult1, Expectedresult1);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtcntNumber")).clear();
// Test to check user is able see the validation(Enter Valid Email Address.) when enter wrong email.
		  driver.findElement(By.id("txtcntNumber")).sendKeys("9874563299");
		  WebElement Email = driver.findElement(By.id("txtcntEmail"));
		  Email.sendKeys("Testing");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnContactSave")).click();
		  Thread.sleep(3000);
		  String Actualresult2 = "Enter Valid Email Address.";
		  String Expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Email Address.')]")).getText();
		  Assert.assertEquals(Actualresult2, Expectedresult2);
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
//		  Assert.assertEquals(Actresult, Expresult);
		  Thread.sleep(3000);
		  driver.findElement(By.id("divAddCntClose")).click();
		  
	  }
	  
	  @Test (priority = 0)
	  public void testContactsSectionPage() throws InterruptedException
	  {
		  
		   WebElement imageElement = driver.findElement(By.xpath("//*[contains(@src,'images/CS-addcon-img.png')]")); // Modify the XPath accordingly
	        String srcAttribute = imageElement.getAttribute("src");
	        // Verify if src attribute contains a valid URL
	        Assert.assertNotNull(srcAttribute, "Image is present");
	        // Optionally, you can also check if the URL is not empty or a placeholder image
	        Assert.assertNotEquals(srcAttribute, "", "Image source is not empty");
	        
		  driver.findElement(By.id("imgDeleteContact")).click();
		  Thread.sleep(3000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  Thread.sleep(3000);
		  //Test to check user is able to see validation(Your contact has been deleted.) after deleted contact.
		  String Actualresult = "Your contact has been deleted.";
		  String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Your contact has been deleted.')]")).getText();
		  Assert.assertEquals(Actualresult, Expectedresult);
		  //Test to check user is able to see the Personal Information text
		  String Actualresult1 = "Personal Information";
		  String Expectedresult1 = driver.findElement(By.xpath("//*[contains(text(),'Personal Information')]")).getText();
		  Assert.assertEquals(Actualresult1, Expectedresult1);
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
		  Assert.assertEquals(Actualresult2, Expectedresult2);
		  //test to check user is able to see the validation when entered less then ten digits.
		  driver.findElement(By.id("txtNumber")).sendKeys("99");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnEditContact")).click();
		  String Actualresult3 = "Enter Valid Phone Number.";
		  String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Phone Number.')]")).getText();
		  Assert.assertEquals(Actualresult3, Expectedresult3);
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtNumber")).clear();
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtNumber")).sendKeys(Mainnumber);
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnEditContact")).click();
		
		  //Test to check user is able to see validation(Your contact has been saved.) after deleted contact.
		  String Actualresult4 = "Your contact has been saved.";
		  String Expectedresult4 = driver.findElement(By.xpath("//*[contains(text(),'Your contact has been saved.')]")).getText();
		  Assert.assertEquals(Actualresult4, Expectedresult4);
		  Thread.sleep(3000);
//		  int expectedItemCount = 5;
//		  List<WebElement> items = driver.findElements(By.xpath("//ul[@class='pagination bootpag']/a[not(text()='Prev' or text()='Next')]"));
//		  Thread.sleep(3000);
//	        int itemCount = items.size();
//			
//	        System.out.println(itemCount);
//	        Assert.assertEquals(itemCount, expectedItemCount);
		  driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'3')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'5')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		  Thread.sleep(3000);
		  WebElement prev = driver.findElement(By.xpath("//a[contains(text(),'Prev')]"));
		  prev.click();
		  Thread.sleep(3000);
		  prev.click();  prev.click();
		  
		  // Test to check whether Dropdown Existence or not on the page.
		       
		        WebElement dropdown = driver.findElement(By.id("ddlRowCount"));
		        Assert.assertNotNull(dropdown);
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
		                Assert.assertEquals(selectedValue, "500"); 
		  
		                WebElement singleCheckbox = driver.findElement(By.xpath("//*[contains(@for,'All')]"));
		                // Verify checkbox is unchecked initially
		                Assert.assertFalse(singleCheckbox.isSelected(), "Checkbox is initially unchecked");
		                // Click on the checkbox
		                singleCheckbox.click();
		              
		               
		                // Verify checkbox is checked after clicking
		              //  Assert.assertTrue(singleCheckbox.isSelected(), "Checkbox is checked after click");
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
		             //   Assert.assertTrue(checkbox1.isSelected(), "Checkbox 1 is checked");
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
		        		Assert.assertEquals(Actualresult11, Expectedrsult);
		              //  Assert.assertTrue(checkbox2.isSelected(), "Checkbox 2 is checked");
		                
	  }
	  
	  @Test
	  public void testNotifyByEmailWhenItRecieve() throws InterruptedException
	  {
		  
		  if(driver.findElements(By.xpath("//*[@id='chkEmailAny' and @checked = 'checked']")).size()>0)
		  {
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id='chkEmailAny' and @checked = 'checked']")).click();
			  
		  
		  WebElement AnythingdeliveredtomyinboxCheckbox = driver.findElement(By.id("chkEmailAny"));
	        Assert.assertFalse(AnythingdeliveredtomyinboxCheckbox.isSelected(), "Checkbox should not be selected after clicking");
	        
	        WebElement VoicemailMessageCheckbox = driver.findElement(By.id("chkEMailVMNOTIFY"));
	        Assert.assertFalse(VoicemailMessageCheckbox.isSelected(), "VoicemailMessageCheckbox should not be selected after clicking");
	        
	        WebElement FaxesCheckbox = driver.findElement(By.id("chkEMailFXNOTIFY"));
	        Assert.assertFalse(FaxesCheckbox.isSelected(), "FaxesCheckbox should not be selected after clicking");
	        
	        WebElement BroadcastMessageCheckbox = driver.findElement(By.id("chkEMailBRDNOTIFY"));
	        Assert.assertFalse(BroadcastMessageCheckbox.isSelected(), "BroadcastMessageCheckbox should not be selected after clicking");
	        
	        WebElement HangupsCheckbox = driver.findElement(By.id("chkEMailHUMNOTIFY"));
	        Assert.assertFalse(HangupsCheckbox.isSelected(), "HangupsCheckbox should not be selected after clicking");
	        
	        WebElement TextMessageCheckbox = driver.findElement(By.id("chkTextNOTIFY"));
	        Assert.assertFalse(TextMessageCheckbox.isSelected(), "TextMessageCheckbox should not be selected after clicking");
	        
	        WebElement VoicemailMessageSelectCheckbox = driver.findElement(By.id("chkEMailVMNOTIFY"));
	        VoicemailMessageSelectCheckbox.click();
	        Assert.assertTrue(VoicemailMessageSelectCheckbox.isSelected(), "VoicemailMessageSelectCheckbox should be selected after clicking");
	        Thread.sleep(2000);
	        VoicemailMessageSelectCheckbox.click();
	        Assert.assertFalse(VoicemailMessageSelectCheckbox.isSelected(), "VoicemailMessageSelectCheckbox should not be selected after clicking");
	        
	        WebElement FaxesSelectCheckbox = driver.findElement(By.id("chkEMailFXNOTIFY"));
	        FaxesSelectCheckbox.click();
	        Assert.assertTrue(FaxesSelectCheckbox.isSelected(), "FaxesSelectCheckbox should be selected after clicking");
	        Thread.sleep(2000);
	        FaxesSelectCheckbox.click();
	        Assert.assertFalse(FaxesSelectCheckbox.isSelected(), "FaxesSelectCheckbox should not be selected after clicking");
	        
	        WebElement BroadcastMessageSelectCheckbox = driver.findElement(By.id("chkEMailBRDNOTIFY"));
	        BroadcastMessageSelectCheckbox.click();
	        Assert.assertTrue(BroadcastMessageSelectCheckbox.isSelected(), "BroadcastMessageSelectCheckbox should be selected after clicking");
	        Thread.sleep(2000);
	        BroadcastMessageSelectCheckbox.click();
	        Assert.assertFalse(BroadcastMessageSelectCheckbox.isSelected(), "BroadcastMessageSelectCheckbox should be selected after clicking");
	        
	        WebElement HangupsSelectCheckbox = driver.findElement(By.id("chkEMailHUMNOTIFY"));
	        HangupsSelectCheckbox.click();
	        Assert.assertTrue(HangupsSelectCheckbox.isSelected(), "HangupsSelectCheckbox should be selected after clicking");
	        Thread.sleep(2000);
	        HangupsSelectCheckbox.click();
	        Assert.assertFalse(HangupsSelectCheckbox.isSelected(), "HangupsSelectCheckbox should be selected after clicking");
	        
	        WebElement TextMessageSelectCheckbox = driver.findElement(By.id("chkTextNOTIFY"));
	        TextMessageSelectCheckbox.click();
	        Assert.assertTrue(TextMessageSelectCheckbox.isSelected(), "TextMessageCheckbox should not be selected after clicking");
	        Thread.sleep(2000);
	        Assert.assertFalse(TextMessageSelectCheckbox.isSelected(), "TextMessageCheckbox should not be selected after clicking");
	        
	        
		  }
	        
	        
	        
	        
	  }
	  
	  
	@Test (priority = 2)
	public void testImportandExportUI() throws InterruptedException
	{
		Thread.sleep(3000);
		//Test to check user is able to click on Import and export link.
		driver.findElement(By.xpath("//*[contains(text(),'Import/Export')]")).click();
		// test to check user is able to see this text(Import Your Contacts)
		String Actualresult = "Import Your Contacts";
		String Expectedrsult = driver.findElement(By.xpath("//*[contains(text(),'Import Your Contacts')]")).getText();
		Assert.assertEquals(Actualresult, Expectedrsult);
		// test to check user is able to see this text(The Imported File Should contains Headers)
		String Actualresult1 = "*The Imported File Should contains Headers";
		String Expectedrsult1 = driver.findElement(By.xpath("//*[contains(text(),'The Imported File Should contains Headers')]")).getText();
		Assert.assertEquals(Actualresult1, Expectedrsult1);
		//Test to check user is able to see this text(FirstName,LastName,Email,PhoneNumber,Company)
		String Actualresult12 = "*FirstName,LastName,Email,PhoneNumber,Company";
		String Expectedrsult12 = driver.findElement(By.xpath("//*[contains(text(),'FirstName,LastName,Email,PhoneNumber,Company')]")).getText();
		Assert.assertEquals(Actualresult12, Expectedrsult12);
		
		//Test to check user is able to see the "No file chosen" text
		String Actualresult13 = "No File Chosen";
		String Expectedrsult13 = driver.findElement(By.xpath("//span[@id ='spanid']")).getText();
		Assert.assertEquals(Actualresult13, Expectedrsult13);
		
		//Test to check user is able to see this text (Choose File)
		String Actualresult14 = "Choose File";
		String Expectedrsult14 = driver.findElement(By.xpath("//*[@id='divImportExport']/div[1]/div[2]/label/strong")).getText();
		Assert.assertEquals(Actualresult14, Expectedrsult14);
		
		//Test to check user is able to see the Import button is enabled or not.
		
		WebElement importbutton = driver.findElement(By.id("btnImportcsvContact"));
		Assert.assertTrue(importbutton.isEnabled());
		
		//Test to check user is able to see this text(Export Contacts)
		String Actualresult15 = "Export Contacts";
		String Expectedrsult15 = driver.findElement(By.xpath("//*[contains(text(),'Export Contacts')]")).getText();
		Assert.assertEquals(Actualresult15, Expectedrsult15);
		
		//Test to check user is able to see this text(Export Contacts)
		String Actualresult16 = "Choose format:";
		String Expectedrsult16 = driver.findElement(By.xpath("//*[contains(text(),'Choose format:')]")).getText();
		Assert.assertEquals(Actualresult16, Expectedrsult16);
		
		//Test to check user is able to see the Import button is enabled or not.
		WebElement exportbutton = driver.findElement(By.id("btnexportContact"));
	    Assert.assertTrue(exportbutton.isEnabled());
	    
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
	      Assert.assertNotNull(dropdownElement, "Dropdown is present on the page");
	    
	}
	
	
	@Test (priority = 3)
	public void testImportandExportfunctionality() throws InterruptedException
	{
		//Test to check user is able to click on Import button or not
		WebElement importbutton = driver.findElement(By.id("btnImportcsvContact"));
		importbutton.click();
		//Test to check user is able to see the validation(Choose the file you wish to upload.) when click on Import without upload a file. 
		Thread.sleep(3000);
		String Actualresult16 = "Choose the file you wish to upload.";
		String Expectedrsult16 = driver.findElement(By.xpath("//*[contains(text(),'Choose the file you wish to upload.')]")).getText();
		Assert.assertEquals(Actualresult16, Expectedrsult16);
		
		//Test check user is able to upload file or not.
		String filepath = "C:\\Users\\Singanaboina Suresh\\Downloads\\7243144758_Contacts.csv";
		Thread.sleep(3000);
		driver.findElement(By.id("FUCntdocument")).sendKeys(filepath);
		Thread.sleep(3000);
		WebElement importbutton1 = driver.findElement(By.id("btnImportcsvContact"));
		importbutton1.click();
		Thread.sleep(3000);
		//Test to check user is able to see the successfull message after upload the file.
		String Actualresult17 = "Your contacts has been Imported.";
		String Expectedrsult17 = driver.findElement(By.xpath("//*[contains(text(),'Your contacts has been Imported.')]")).getText();
		Assert.assertEquals(Actualresult17, Expectedrsult17);
		Thread.sleep(3000);
		//Test to check user is able to click on Export button to be download contacts list
		WebElement exportbutton = driver.findElement(By.id("btnexportContact"));
		exportbutton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
//  @Test
//  public void testTextCodeLink() throws InterruptedException {
//	
//	WebElement save = driver.findElement(By.id("btnSavetxtCode"));
//	if(save.isEnabled())
//	{
//		System.out.println("Save button is Enabled");
//	}
//	else
//	{
//		System.out.println("Save button is Not Enabled");
//	}
//	WebElement cancel = driver.findElement(By.id("btnCanceltxtCode"));
//	if(cancel.isEnabled())
//	{
//		System.out.println("Cancel button is Enabled");
//	}
//	else
//	{
//		System.out.println("Cancel button is Not Enabled");
//	}
////	String Actualresult = "Configure Text Code - Testing1";
////     String Expected =  driver.findElement(By.id("lblConfigExt")).getText();
////     Assert.assertEquals(Actualresult, Expected);
//	driver.findElement(By.xpath("//*[@id='dgTextCodeLists']/tbody/tr[2]/td")).click();
//	  Thread.sleep(3000);
//     WebElement deleteimage = driver.findElement(By.id("imgtxtCodeDelete"));
//     Assert.assertTrue(deleteimage.isDisplayed(), "Delete image should be visible on the page");// Replace with the actual ID or other locator of your logo
//
//     
//   /*  WebElement dynamicTextElement = driver.findElement(By.id("lblConfigExt"));
//     // Capture initial text
//     String initialText = dynamicTextElement.getText();
//     WebElement actionButton = driver.findElement(By.xpath("//*[@class = 'griditemselected']"));
//     actionButton.click();
//          String changedText = dynamicTextElement.getText();*/
//     
//     // Verify that the logo is visible on the page
//    
//     WebElement AddTextcodeImage = driver.findElement(By.id("imgtxtCodeDelete"));  // Replace with the actual ID or other locator of your logo
//
//     // Verify that the logo is visible on the page
//     Assert.assertTrue(AddTextcodeImage.isDisplayed(), "AddTextcodeImage image should be visible on the page");
//     String Actualresult1 = "Text Codes";
//     String Expected1 =  driver.findElement(By.id("lnkExtAdd")).getText();
//     Assert.assertEquals(Actualresult1, Expected1);
//     String Actualresult2 = "Text Code:";
//     String Expected2 =  driver.findElement(By.xpath("//*[contains(@for,'txtCode')]")).getText();
//     Assert.assertEquals(Actualresult2, Expected2);
//     String Actualresult3 = "Text-back is:";
//     String Expected3 =  driver.findElement(By.xpath("//*[contains(@for,'txtNewFirstName')]")).getText();
//     Assert.assertEquals(Actualresult3, Expected3);
//     String Actualresult4 = "Upto 400 total text messages on account per month are free. (2¢ per additional message)";
//     String Expected4 =  driver.findElement(By.xpath("//*[contains(@style,'font-style: italic;color:red;')]")).getText();
//     Assert.assertEquals(Actualresult4, Expected4);
//     String Actualresult5 = "Text-back is:";
//     String Expected5 =  driver.findElement(By.xpath("//*[contains(@for,'txtNewFirstName')]")).getText();
//     Assert.assertEquals(Actualresult5, Expected5);
//     String Actualresult6 = "462 of 480 characters remaining";
//     String Expected6 =  driver.findElement(By.xpath("//*[contains(@style,'margin-bottom: 10px; margin-left:13%; margin-top: 5px;')]")).getText();
//     Assert.assertEquals(Actualresult6, Expected6);
////     String Actualresult7 = "Counted as 1 message(s)"
////     		 
////     		 +"Upto 400 total text messages on account per month are free. (2¢ per additional message)";
////     String Expected7 =  driver.findElement(By.xpath("//*[contains(@style,'margin-left: 13%; margin-top: 5px; margin-bottom: 10px;')]")).getText();
////     Assert.assertEquals(Actualresult7, Expected7);
//     WebElement Textcodefieldbox = driver.findElement(By.id("txtCode"));
// 	if(Textcodefieldbox.isDisplayed())
// 	{
// 		System.out.println("Displayed");
// 	}
// 	else
// 	{
// 		System.out.println("Not Displayed");
// 	}
//    WebElement TextcodeinfoImage = driver.findElement(By.id("a5"));
// 	if(TextcodeinfoImage.isDisplayed())
// 	{
// 		System.out.println("Info_icon is Displayed");
// 	}
// 	else
// 	{
// 		System.out.println("Info_icon is Not Displayed");
// 	}
// 	  WebElement Textbacktoogle = driver.findElement(By.xpath("//*[contains(@class,'checkbox-inline')]"));
// 	 	if(Textbacktoogle.isDisplayed())
// 	 	{
// 	 		System.out.println("Toggle key is Displayed");
// 	 	}
// 	 	else 
// 	 	{
// 	 		System.out.println("Toggle key is Not Displayed");
// 	 	}
// 	 	
//     
//  }
//  @Test 
//  public void testUIofAddNewTextCcode() throws InterruptedException {
//	  
//	  if(driver.findElements(By.id("imgAddtxtCode")).size()>0)
//	  {
//		  driver.findElement(By.id("imgAddtxtCode")).click();
//		  String Actualresult2 = "Text Code:";
//		     String Expected2 =  driver.findElement(By.xpath("//*[contains(@for,'txtCode')]")).getText();
//		     Assert.assertEquals(Actualresult2, Expected2);
//		     
//		     WebElement Textcodefieldbox = driver.findElement(By.id("txtCode"));
//		  	if(Textcodefieldbox.isDisplayed())
//		  	{
//		  		System.out.println("txtCode is Displayed");
//		  	}
//		  	else
//		  	{
//		  		System.out.println("txtCode is Not Displayed");
//		  	}
//		    WebElement TextcodeinfoImage = driver.findElement(By.id("a5"));
//		 	if(TextcodeinfoImage.isDisplayed())
//		 	{
//		 		System.out.println("Info_icon is Displayed");
//		 	}
//		 	else
//		 	{
//		 		System.out.println("Info_icon is Not Displayed");
//		 	}
//		 	  String Actualresult5 = "Text-back is:";
//		      String Expected5 =  driver.findElement(By.xpath("//*[contains(@for,'txtNewFirstName')]")).getText();
//		      Assert.assertEquals(Actualresult5, Expected5);
//		      Thread.sleep(3000);
//		      WebElement buttonElement = driver.findElement(By.xpath("//*[contains(@class,'btn btn-default active toggle-off')]"));
//
//		        // Check if the element is enabled
//		        boolean isButtonEnabled = buttonElement.isEnabled();
//
//		        // Assertion to verify if the element is enabled
//		        Assert.assertTrue(isButtonEnabled, "Submit button is not enabled");
//		        
//		        driver.findElement(By.xpath("//label[@class='checkbox-inline']")).click();
//		  	  
//		        String Expected = "Auto Reply:";
//		  	  WebElement element = driver.findElement(By.xpath("//label[@for='autotxtReply']")); // Assuming the text is within the <body> tag
//
//		        // Get the text from the element
//		        String pageText = element.getText();
//		        System.out.println(pageText);
//
//		        // Assert that the text is present on the page
//		        Assert.assertEquals(pageText, Expected);
//		        WebElement AutotxtReply = driver.findElement(By.id("autotxtReply"));
//		     	if(AutotxtReply.isDisplayed())
//		     	{
//		     		System.out.println("autotxtReply is Displayed");
//		     	}
//		     	else
//		     	{
//		     		System.out.println("autotxtReply is Not Displayed");
//		     	}
//		     	 String Actualresult6 = "480 of 480 characters remaining";
//		         String Expected6 =  driver.findElement(By.xpath("//*[contains(@style,'margin-bottom: 10px; margin-left:13%; margin-top: 5px;')]")).getText();
//		         Assert.assertEquals(Actualresult6, Expected6);
//		         
//		         String Actualresult4 = "Counted as 0 message(s)\n"
//		         		+ "\n"
//		         		+ "Upto 400 total text messages on account per month are free. (2¢ per additional message)";
//		         String Expected4 =  driver.findElement(By.xpath("//*[contains(@style,'margin-left: 13%; margin-top: 5px; margin-bottom: 10px;')]")).getText();
//		         Assert.assertEquals(Actualresult4, Expected4);
//		     	
//	  }
//	  
//  }
//  @Test
//  public void testCreateNewTextCode() throws InterruptedException {
//	  
//	  driver.findElement(By.id("imgAddtxtCode")).click();
//	  Thread.sleep(2000);
//	  driver.findElement(By.id("btnSaveNewtxtCode")).click();
//
//	  //Test to check user is able to see this validation(Please Enter Text Code.) when he does not enter textcode name in text code field and click on ssave button.  
//	  String Actual = "Please Enter Text Code.";
//	  String Expected4 =  driver.findElement(By.xpath("//*[contains(text(),'Please Enter Text Code.')]")).getText();
//	  Assert.assertEquals(Actual, Expected4);
//	  Thread.sleep(2000);
//	  driver.findElement(By.id("txtCode")).sendKeys("Code");
//	  Thread.sleep(2000);
//	  //Test to check user is able to see this validation(Please On Text-back.) when he does not turn on Text-back tooglekey with entered textcode and click on save button. 
//	  driver.findElement(By.id("btnSaveNewtxtCode")).click();
//	  String Actual1 = "Please On Text-back.";
//	  String Expected5 =  driver.findElement(By.xpath("//*[contains(text(),'Please On Text-back.')]")).getText();
//	  Assert.assertEquals(Actual1, Expected5);
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//*[contains(@class,'checkbox-inline')]")).click();
//	  //Test to check user is able to see this validation(Please Enter Auto Reply Text.) when he does not enter Auto replay msg
//	  driver.findElement(By.id("btnSaveNewtxtCode")).click();
//	  String Actual2 = "Please Enter Auto Reply Text.";
//	  String Expected6 =  driver.findElement(By.xpath("//*[contains(text(),'Please Enter Auto Reply Text.')]")).getText();
//	  Assert.assertEquals(Actual2, Expected6);
//	  //Test to check user is able to see successfull validation or not.
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//textarea[@id='autotxtReply']")).sendKeys("Testing Text codes");
//	  Thread.sleep(2000);
//	 WebElement test = driver.findElement(By.id("btnSaveNewtxtCode"));
//	 test.click();
//	 Thread.sleep(4000);
//	 test.click();
//	 
//	  /// Test to check user able see this validation(Text Code Updated successfully.) when he enter existed textcode.
////	  String Actual3 = "Text Code Updated successfully.";
////	  String Expected7 =  driver.findElement(By.xpath("//*[contains(text(),'Text Code Updated successfully.')]")).getText();
////	  Assert.assertEquals(Actual3, Expected7);
//
//
//
//	  
//	  
//	  
//	  
  
  @AfterClass
  public void afterClass() {
  }

}
