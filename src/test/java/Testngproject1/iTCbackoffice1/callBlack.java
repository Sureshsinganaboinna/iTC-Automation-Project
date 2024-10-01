package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.interactions.Actions;

public class callBlack {
 static ChromeDriver driver;
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
	      Thread.sleep(3000);
  }
  
  /*
  @Test
  public void callBloack() throws InterruptedException {
	  
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
		 Assert.assertEquals(Actautocallblack, Autocallblackoff);
	  }
	  Thread.sleep(3000);
	  if(driver.findElements(By.xpath("//*[@id='divTitle']/label[2]/div[@class='toggle btn btn-default off']")).size()>0)
	  {
		  driver.findElement(By.xpath("//*[@id='divTitle']/label[2]/div[@class='toggle btn btn-default off']")).click();
		  String Autocallblackon = "Your call block has been turned On.";
		 String  Actautocallblackon = driver.findElement(By.xpath("//*[contains(text(),'Your call block has been turned  On.')]")).getText();
		  Thread.sleep(3000);
		 Assert.assertEquals(Actautocallblackon, Autocallblackon);
	  }
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAdd1")).click();
	  Thread.sleep(3000);
	  String Expblockedcallersvalidation = "Phone number required";
	  String Actblockedcallersvalidation = driver.findElement(By.xpath("//*[contains(text(),'Phone number required')]")).getText();
	  Assert.assertEquals(Actblockedcallersvalidation, Expblockedcallersvalidation);
	  Thread.sleep(3000);
	  driver.findElement(By.id("txtBlockCaller")).sendKeys("99");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAdd1")).click();
	  
	  String Expblockedcallersvalidations = "Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.";
	  String Actblockedcallersvalidations = driver.findElement(By.xpath("//*[contains(text(),'Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.')]")).getText();
	  Assert.assertEquals(Actblockedcallersvalidations, Expblockedcallersvalidations);
	  
	  driver.findElement(By.id("txtBlockCaller")).clear();
	  driver.findElement(By.id("txtBlockCaller")).sendKeys("3185459042");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAdd1")).click();
	 
	  
	  String Expblockedcallersvalidationss = "Call Block settings updated successfully.";
	  String Actblockedcallersvalidationss = driver.findElement(By.xpath("//*[contains(text(),'Call Block settings updated successfully.')]")).getText();
	  Assert.assertEquals(Actblockedcallersvalidationss, Expblockedcallersvalidationss);
	  Thread.sleep(3000);
	  
	  String Expblockedcallernum = "(318) 545-9042";
	  String Actblockedcallernum = driver.findElement(By.xpath("//*[contains(text(),'(318) 545-9042')]")).getText();
	  Assert.assertEquals(Actblockedcallernum, Expblockedcallernum);
	  Thread.sleep(3000);
	  
	  WebElement checkbox = driver.findElement(By.xpath("//*[@id='tblCallblock']/tbody/tr/td[1]/span[1]"));
	  checkbox.isDisplayed();
  
	  checkbox.click();
	  Assert.assertFalse(checkbox.isSelected(), "checkbox is selected");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnSave1")).click();
	  
	  
	  String Expblockedcallersvalidationsss = "Caller has been deleted from the blocked callers list.";
	  String Actblockedcallersvalidationsss = driver.findElement(By.xpath("//*[contains(text(),'Caller has been deleted from the blocked callers list.')]")).getText();
	  Assert.assertEquals(Actblockedcallersvalidationsss, Expblockedcallersvalidationsss);
	  Thread.sleep(3000);
	  
	  //////////////////////
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	  Thread.sleep(2000);
	  driver.findElement(By.id("btnAdd")).click();
	
	  String Expblockedareacodesvalidation = "Area Code required";
	  String Actblockedareacodesvalidation = driver.findElement(By.xpath("//*[contains(text(),'Area Code required')]")).getText();
	  Assert.assertEquals(Actblockedareacodesvalidation, Expblockedareacodesvalidation);
	  Thread.sleep(3000);
	  driver.findElement(By.id("txtAreaCode")).sendKeys("99");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAdd")).click();
	  
	  String Expblockedareacodesvalidations = "Enter a three digit area code";
	  String Actblockedareacodesvalidations = driver.findElement(By.xpath("//*[contains(text(),'Enter a three digit area code')]")).getText();
	  Assert.assertEquals(Actblockedareacodesvalidations, Expblockedareacodesvalidations);
	  
	  driver.findElement(By.id("txtAreaCode")).clear();
	  driver.findElement(By.id("txtAreaCode")).sendKeys("969");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAdd")).click();
	 
	  
	  String Expblockedareacodesvalidationss = "Call Block settings updated successfully.";
	  String Actblockedareacodesvalidationss = driver.findElement(By.xpath("//*[contains(text(),'Call Block settings updated successfully.')]")).getText();
	  Assert.assertEquals(Actblockedareacodesvalidationss, Expblockedareacodesvalidationss);
	  Thread.sleep(3000);
	  
	  String Expareacode = "969";
	  String Actareacode = driver.findElement(By.xpath("//*[contains(text(),'969')]")).getText();
	  Assert.assertEquals(Actareacode, Expareacode);
	  Thread.sleep(3000);
	  
	  WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='tblCallBlkAreaCodes']/tbody/tr/td[1]/span[1]"));
	  checkbox1.isDisplayed();
  
	  checkbox1.click();
	  Assert.assertFalse(checkbox1.isSelected(), "checkbox is selected");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnUpdateBlockAreaCode")).click();
	  
	  
	  String Expblockedareacodesvalidationsss = "Area code has been deleted from the blocked area code list.";
	  String Actblockedareacodesvalidationsss = driver.findElement(By.xpath("//*[contains(text(),'Area code has been deleted from the blocked area code list.')]")).getText();
	  Assert.assertEquals(Actblockedareacodesvalidationsss, Expblockedareacodesvalidationsss);
	  /////////////////
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	  Thread.sleep(2000);
	  driver.findElement(By.id("btnAddExcludes")).click();
	
	  String Expunblockedvalidation = "Phone number required";
	  String Actunblockedvalidation = driver.findElement(By.xpath("//*[contains(text(),'Phone number required')]")).getText();
	  Assert.assertEquals(Actunblockedvalidation, Expunblockedvalidation);
	  Thread.sleep(3000);
	  driver.findElement(By.id("txtExcludeNumber")).sendKeys("99");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAddExcludes")).click();
	  
	  String Expunblockedvalidations = "Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.";
	  String Actunblockedvalidations = driver.findElement(By.xpath("//*[contains(text(),'Use one of these formats for phone number: xxxxxxxxxx, xxx-xxx-xxxx, or (xxx) xxx-xxxx.')]")).getText();
	  Assert.assertEquals(Actunblockedvalidations, Expunblockedvalidations);
	  
	  driver.findElement(By.id("txtExcludeNumber")).clear();
	  driver.findElement(By.id("txtExcludeNumber")).sendKeys("7325952970");
	  Thread.sleep(3000);
	  driver.findElement(By.id("btnAddExcludes")).click();
	 
	  
	  String Expunblockedvalidationss = "Call Block settings updated successfully.";
	  String Actunblockedvalidationss = driver.findElement(By.xpath("//*[contains(text(),'Call Block settings updated successfully.')]")).getText();
	  Assert.assertEquals(Actunblockedvalidationss, Expunblockedvalidationss);
	  Thread.sleep(3000);
	  
	  String Expnumb = "(732) 595-2970";
	  String Actnumbe = driver.findElement(By.xpath("//*[contains(text(),'(732) 595-2970')]")).getText();
	  Assert.assertEquals(Actnumbe, Expnumb);
	  Thread.sleep(3000);
	  
	  WebElement checkbox12 = driver.findElement(By.xpath("//*[@id='tblCallExcblock']/tbody/tr/td[1]/span[1]"));
	  checkbox12.isDisplayed();
  
	  checkbox12.click();
	  Assert.assertFalse(checkbox12.isSelected(), "checkbox is selected");
	  Thread.sleep(3000);
	  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
	  Thread.sleep(2000);
	  driver.findElement(By.id("btnUpdateExcludes")).click();
	  
	  
	  String Expunblockedvalidationsss = "Exclude number has been deleted from the exclude number list.";
	  String Actunblockedvalidationsss = driver.findElement(By.xpath("//*[contains(text(),'Exclude number has been deleted from the exclude number list.')]")).getText();
	  Assert.assertEquals(Actunblockedvalidationsss, Expunblockedvalidationsss);
	  
	  
  }
*/
  @AfterClass
  public void afterClass() {
  }

}
