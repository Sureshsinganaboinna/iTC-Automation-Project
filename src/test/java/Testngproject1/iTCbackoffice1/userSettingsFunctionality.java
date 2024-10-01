package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class userSettingsFunctionality {
       static WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--use-fake-ui-for-media-stream");
      options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	 driver = new ChromeDriver(options);
	 driver.manage().window().maximize();
	 driver.get("https://www.coasecure.com/");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");
     driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");
   
     driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();

     driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
  }

  @Test (priority = 35)
  public void userSettingsPage() throws InterruptedException {
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
      WebElement imageElement = driver.findElement(By.xpath("//a[@id='AncAutoLogin']")); // Modify the XPath accordingly
      String srcAttribute = imageElement.getAttribute("src");
      // Verify if src attribute contains a valid URL
       softAssert.assertNotNull(srcAttribute, "Image is present");
      // Optionally, you can also check if the URL is not empty or a placeholder image
   //   softAssert.assertNotEquals(srcAttribute, "", "Image source is not empty"); 
      
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
     
     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
     Thread.sleep(2000);
     driver.findElement(By.id("spChangePasscode")).click();
    /* Actions act =  new Actions(driver);
     act.moveToElement(driver.findElement(By.id("spChangePasscode"))).click().perform();*/
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
    
     
     Thread.sleep(3000);
    /* WebElement saveButton1 = driver.findElement(By.id("btnPassSave"));
     // Click the Save button
     saveButton1.click();*/
     Actions act1 =  new Actions(driver);
     act1.moveToElement(driver.findElement(By.id("btnPassSave"))).click().perform();
     
    // Actions act1 =  new Actions(driver);
 //    act1.moveToElement(driver.findElement(By.id("btnPassSave"))).click().perform();
     
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
     WebElement defaultSelectedRadio11 = driver.findElement(By.xpath("//input[@id='rbOldestFirst']"));
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
  
  
  @AfterMethod
  public void afterMethod() {
  }

}
