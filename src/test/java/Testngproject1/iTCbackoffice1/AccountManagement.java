package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AccountManagement {
    private WebDriver driver;

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--use-fake-ui-for-media-stream");
      options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
	    //  driver = new ChromeDriver();
	  driver = new ChromeDriver(options);

    driver.get("https://www.coasecure.com/");
		  driver.manage().window().maximize();
		
		  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");  //(833)6322654
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");    //891929
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
	      
	      
  }
  @Test (priority = 1)
  public void f() throws InterruptedException {

	  driver.findElement(By.xpath("//img[@class='drpbtn']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("aAccount")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[contains(text(),'Manage Login Details')]")).click();
	  Thread.sleep(4000);
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[contains(text(),'Got it!')]")).click();
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	  Thread.sleep(3000);
	  String  extchangeemail = "Email Required.";
      String Actualchangeemail = driver.findElement(By.xpath("//*[contains(text(),'Email Required.')]")).getText();
      Assert.assertEquals(Actualchangeemail, extchangeemail);
      
      
      driver.findElement(By.id("txtCustomerEmail")).sendKeys("Singanaboina");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnSave")).click();
	  Thread.sleep(3000);
	  String  extchangeemail1 = "Enter Valid Email.";
      String Actualchangeemail1 = driver.findElement(By.xpath("//*[contains(text(),'Enter Valid Email.')]")).getText();
      Assert.assertEquals(Actualchangeemail1, extchangeemail1);
      Thread.sleep(3000);
      
      
      driver.findElement(By.id("txtCustomerEmail")).clear();
      Thread.sleep(3000);
      driver.findElement(By.id("txtCustomerEmail")).sendKeys("Singanaboina.suresh@coanetwork.com");      
      //current passcode
      driver.findElement(By.id("btnSave")).click();
      
      Thread.sleep(3000);
	  String  extcurrentpass = "Old Passcode Required.";
      String Actualcurrentpass = driver.findElement(By.xpath("//*[contains(text(),'Old Passcode Required.')]")).getText();
      Assert.assertEquals(Actualcurrentpass, extcurrentpass);
      Thread.sleep(3000);
      driver.findElement(By.id("txtOldPwd")).sendKeys("5SS");
      Thread.sleep(3000);
      driver.findElement(By.id("btnSave")).click();
      Thread.sleep(3000);
      String  extcurrentpassinvalid = "Passcode must be 4 to 6 digits. It cannot contain letters or special characters.";
      String Actualcurrentpassinvalid = driver.findElement(By.xpath("//*[contains(text(),'Passcode must be 4 to 6 digits. It cannot contain letters or special characters.')]")).getText();
      Assert.assertEquals(Actualcurrentpassinvalid, extcurrentpassinvalid);
      Thread.sleep(3000);
      driver.findElement(By.id("txtOldPwd")).clear();
      Thread.sleep(2000);
      driver.findElement(By.id("txtOldPwd")).sendKeys("1000");
      Thread.sleep(3000);
      driver.findElement(By.id("btnSave")).click();
      
      String  extnewpassinvalid = "New Passcode Required.";
      String Actualnewpassinvalid = driver.findElement(By.xpath("//*[contains(text(),'New Passcode Required.')]")).getText();
      Assert.assertEquals(Actualnewpassinvalid, extnewpassinvalid);
      Thread.sleep(3000);
      
      
      driver.findElement(By.id("txtNewPwd")).sendKeys("6S@");
      Thread.sleep(3000);
      driver.findElement(By.id("btnSave")).click();
      
      String  extnewpassinvalid1 = "Passcode must be 4 to 6 digits. It cannot contain letters or special characters.";
      String Actualnewpassinvalid1 = driver.findElement(By.xpath("//*[contains(text(),'Passcode must be 4 to 6 digits. It cannot contain letters or special characters.')]")).getText();
      Assert.assertEquals(Actualnewpassinvalid1, extnewpassinvalid1);
      Thread.sleep(3000);
      driver.findElement(By.id("txtNewPwd")).clear();
      Thread.sleep(3000);
      driver.findElement(By.id("txtNewPwd")).sendKeys("1000");
      Thread.sleep(3000);
      driver.findElement(By.id("btnSave")).click();
      Thread.sleep(3000);
      
      String  extrenewpassinvalid1 = "Reenter New Passcode.";
      String Actualrenewpassinvalid1 = driver.findElement(By.xpath("//*[contains(text(),'Reenter New Passcode.')]")).getText();
      Assert.assertEquals(Actualrenewpassinvalid1, extrenewpassinvalid1);
      Thread.sleep(3000);
      driver.findElement(By.id("txtRenterPwd")).sendKeys("6S@");
      Thread.sleep(3000);
      driver.findElement(By.id("btnSave")).click();
      Thread.sleep(3000);
      String  extrenewpassinvalid11 = "Passcode must be 4 to 6 digits. It cannot contain letters or special characters.";
      String Actualrenewpassinvalid11 = driver.findElement(By.xpath("//*[contains(text(),'Passcode must be 4 to 6 digits. It cannot contain letters or special characters.')]")).getText();
      Assert.assertEquals(Actualrenewpassinvalid11, extrenewpassinvalid11);
      
      driver.findElement(By.id("txtRenterPwd")).clear();
      Thread.sleep(2000);
      driver.findElement(By.id("txtRenterPwd")).sendKeys("1000");
      Thread.sleep(3000);
      driver.findElement(By.id("btnSave")).click();
      Thread.sleep(4000);
      String  extrenewpassinvalid111 = "Your Old Passcode does not match our records. Please try again.";
      String Actualrenewpassinvalid111 = driver.findElement(By.xpath("//*[contains(text(),'Your Old Passcode does not match our records. Please try again.')]")).getText();
      Assert.assertEquals(Actualrenewpassinvalid111, extrenewpassinvalid111);
      
	  
  }
  @Test (priority = 2)
  
  public void servicePlan() throws InterruptedException
  {
	  driver.findElement(By.id("lnkplans")).click();
	   Thread.sleep(3000);
	   String extService = "Service Plans";
		  String ActService = driver.findElement(By.xpath("//*[contains(text(),'Service Plans')]")).getText();
		  Assert.assertEquals(ActService, extService);
		  
		   String extcancelaccount = "Cancel Account";
			  String Actcancelaccount = driver.findElement(By.xpath("//*[contains(text(),'Cancel Account')]")).getText();
			  Assert.assertEquals(Actcancelaccount, extcancelaccount);
		  
	  String extcustomerCare = "Please contact customer service at CustomerCare@coanetwork.comto find out about other service plans available to you.";
	  String ActcustomerCare = driver.findElement(By.xpath("//*[@id='divNoPkg']/p")).getText();
	  Assert.assertEquals(ActcustomerCare, extcustomerCare);
  }
  @Test (priority = 3)
  public void billing() throws InterruptedException
  {
	  driver.findElement(By.id("lnkbilling")).click();
	  Thread.sleep(3000);
	  String viewinvoice = "View Invoice";
	  String Actviewinvoice = driver.findElement(By.id("lnkviewinvoice")).getText();
	  Assert.assertEquals(Actviewinvoice, viewinvoice);
	  Thread.sleep(3000);
	  String extpayinvoice = "Pay Invoices";
	  String Actpayinvoice = driver.findElement(By.id("lnkpayinvoice")).getText();
	  Assert.assertEquals(Actpayinvoice, extpayinvoice);
	  Thread.sleep(3000);
	  driver.findElement(By.id("lnkpayinvoice")).click();
	  
	  Thread.sleep(2000);
	  String extpectedurl = "https://backoffice.itelecenter.com/AccountManagement/makepayments.aspx";
	  String actualurl = driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, extpectedurl);
	  Thread.sleep(2000);
	  String extpayinvoicetxt = "Pay Invoice";
	  String Actpayinvoicetxt = driver.findElement(By.xpath("//p[contains(text(),'Pay Invoice')]")).getText();
	  Assert.assertEquals(Actpayinvoicetxt, extpayinvoicetxt);
	  Thread.sleep(2000);
	  
	  String extRefferaltxt = "Referrals";
	  String ActRefferaltxt = driver.findElement(By.xpath("//span[contains(text(),'Referrals')]")).getText();
	  Assert.assertEquals(ActRefferaltxt, extRefferaltxt);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[contains(text(),'Referrals')]")).click();
	  Thread.sleep(2000);
	  String extRefferalurl = "https://backoffice.itelecenter.com/AccountManagement/referralList.aspx";
	  String ActRefferalurl = driver.getCurrentUrl();
	  Assert.assertEquals(ActRefferalurl, extRefferalurl);
	  Thread.sleep(2000);
	  String extpayinvoicetxtlist = "Referral List";
	  String Actpayinvoicetxtlist = driver.findElement(By.xpath("//p[contains(text(),'Referral List')]")).getText();
	  Assert.assertEquals(Actpayinvoicetxtlist, extpayinvoicetxtlist);
	  Thread.sleep(2000);
	  String extpayinvoicetxtlist1 = "Note: Referrals on a lower priced package, free trials or those with past due accounts do not count toward your free service.";
	  String Actpayinvoicetxtlist1 = driver.findElement(By.xpath("//*[@id='divContainerRight']/div/div[2]/p")).getText();
	  Assert.assertEquals(Actpayinvoicetxtlist1, extpayinvoicetxtlist1);
	  Thread.sleep(2000);          
	  WebElement imageElement = driver.findElement(By.xpath("//img[@src='../Images/telefriend.jpg']"));
      boolean isImageDisplayed = imageElement.isDisplayed();
      Assert.assertTrue(isImageDisplayed, "Tell a Friend is not displayed on the page.");
      
      Thread.sleep(2000);
      String extdownloadapps = "Download the iTeleCenter mobile app";
	  String Actdownloadapps = driver.findElement(By.xpath("//span[contains(text(),'Download the iTeleCenter mobile app')]")).getText();
	  Assert.assertEquals(Actdownloadapps, extdownloadapps);
      
	  Thread.sleep(2000);
	  WebElement ImageApple = driver.findElement(By.xpath("//img[@src='Images/itc_apple_store.png']"));
      boolean Imageapplephone = ImageApple.isDisplayed();
      Assert.assertTrue(Imageapplephone, "ImageApple is not displayed on the page.");
      Thread.sleep(2000);
      WebElement imageandroidapp = driver.findElement(By.xpath("//img[@src='Images/itc_android_app_store.png']"));
      boolean imageandroid = imageandroidapp.isDisplayed();
      Assert.assertTrue(imageandroid, "imageandroidapp is not displayed on the page.");
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
    		  Assert.assertEquals(ActApplephone, extApplephone);
    	
    	     Thread.sleep(2000);
    	     WebElement ImageAppStore = driver.findElement(By.xpath("//a[@href='https://www.apple.com/ml/ios/app-store/']"));
    	      boolean Imageappstore = ImageAppStore.isDisplayed();
    	      Assert.assertTrue(Imageappstore, "ImageAppStore is not displayed on the page.");
    	      Thread.sleep(2000);
    	      
    	      WebElement iTCAppleimage = driver.findElement(By.xpath("//img[@src='/assets/artwork/1x1-42817eea7ade52607a760cbee00d1495.gif' and @class = 'we-artwork__image ember3 ']"));
    	      boolean iTCAppleimages = iTCAppleimage.isDisplayed();
    	      Assert.assertTrue(iTCAppleimages, "iTCAppleimage is not displayed on the page");
    	      Thread.sleep(2000);
    	      
    	      WebElement Imagecoanetwork = driver.findElement(By.xpath("//a[@href='https://www.apple.com/ml/ios/app-store/']"));
    	      boolean Imagecoanetworks = Imagecoanetwork.isDisplayed();
    	      Assert.assertTrue(Imagecoanetworks, "Imagecoanetworks is not displayed on the page.");
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
    	  Assert.assertEquals(ActAndroidphone, extAndroidphone);
    	   Thread.sleep(2000);
    	  WebElement Imageplaystore = driver.findElement(By.xpath("//a[@href='/store/games' and @aria-label ='Google Play logo']"));
    	  boolean Imageplaystores = Imageplaystore.isDisplayed();
	      Assert.assertTrue(Imageplaystores, "Imageplaystores is not displayed on the page.");
	      Thread.sleep(2000);
	      String extandroidapp = "iTeleCenter";
		  String Actandroidapp = driver.findElement(By.xpath("//h1[contains(text(),'iTeleCenter')]")).getText();
		  Assert.assertEquals(Actandroidapp, extandroidapp);
		   Thread.sleep(2000);
		   driver.close();
    	  }
		  
    	  
      }
      
      Thread.sleep(2000);
      
      driver.switchTo().window(mainWindowHandle);
      
      Thread.sleep(2000);
	  
      
      driver.findElement(By.xpath("//img[@src='../Images/telefriend.jpg']")).click();
      Thread.sleep(2000);
      
 Set<String> windowahandlesrefreal = driver.getWindowHandles();
      
      for(String windowandroidrefaral : windowahandlesrefreal)
      {
    	  if(!windowandroidrefaral.equals(mainWindowHandle)) {
    		  driver.switchTo().window(windowandroidrefaral);
    		  Thread.sleep(2000);
    		  String extTelefriend = "TeleFriend";
    		  String ActTelefriend = driver.getTitle();
    		  Assert.assertEquals(ActTelefriend, extTelefriend);
    		  Thread.sleep(2000);
    		  WebElement Imageplaystore = driver.findElement(By.xpath("//*[@id='OuterPop']/h1"));
        	  boolean Imageplaystores = Imageplaystore.isDisplayed();
    	      Assert.assertTrue(Imageplaystores, "ImageAppStore is not displayed on the page.");
    	      Thread.sleep(2000);
    	      String invite = "Invite 3 Friends and Your Service is FREE!";
    	      String Actinvite = driver.findElement(By.xpath("//h2[contains(text(),'Invite 3 Friends and Your Service is ')]")).getText();
    	      Assert.assertEquals(Actinvite, invite);
    	   
    	  
    	  }
      }
 Thread.sleep(2000);
      
      driver.switchTo().window(mainWindowHandle);
      
      
   
  }
  
  @AfterClass
  public void afterClass() {
  }

}
