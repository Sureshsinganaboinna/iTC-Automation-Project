package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class Coasecureloginpage {
	private WebDriver driver;


  @BeforeClass
  public void beforeTest() throws InterruptedException {
//	  WebDriverManager.chromedriver().setup();
 // driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		  driver = new ChromeDriver();
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
  driver.get("https://www.coasecure.com/");
  driver.manage().window().maximize();
  }
  @Test(priority=1)
  public void TestCase1ForVerifyingEmailField() throws InterruptedException {

     // driver.get("https://qa.coasecure.com/");
    //  driver.manage().window().maximize();
   String actual = "Email/DNIS Required.";
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
      String expected = driver.findElement(By.xpath("//*[contains(text(),'Email/DNIS Required.')]")).getText();
    
      Assert.assertEquals(actual, expected); 
    //  ====================================================================
      String actual1 = "Enter valid Email/DNIS.";
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("877pp");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
      Thread.sleep(3000);
      String expected1 = driver.findElement(By.xpath("//*[contains(text(),'Enter valid Email/DNIS.')]")).getText();
     
      Assert.assertEquals(actual1, expected1); 
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).clear();
  }
  @Test(priority=2)
      public void TestCase2ForVerifyingPasscodeField() throws InterruptedException {
	  String actual2 = "Passcode Required.";
	  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");
      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
      Thread.sleep(3000);
      String expected2 = driver.findElement(By.xpath("//*[contains(text(),'Passcode Required.')]")).getText();
     
      Assert.assertEquals(actual2, expected2); 
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).clear();
      //==============================================================
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");
      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("100aa");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
      Thread.sleep(3000);
      String actual3 = "Invalid passcode.";
      String expected3 = driver.findElement(By.xpath("//*[contains(text(),'Invalid passcode.')]")).getText();
      
      Assert.assertEquals(actual3, expected3); 
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).clear();
//================================================
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("87737895176");
      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1002pp");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
      Thread.sleep(3000);
      String actual4 = "Account/Email invalid!";
      String expected4 = driver.findElement(By.xpath("//*[contains(text(),'Account/Email invalid!')]")).getText();
      
      Assert.assertEquals(actual4, expected4); 
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).clear();
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).clear();
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//input[@name = 'txtEmail']")).clear();
	  
  }
   @Test (priority=3)
   public void testHeadline() throws Exception 
   {
	   String Actualresult1 = "Log into your Back Office";
	   String Expectedresult1 = driver.findElement(By.id("divLoginHead")).getText();
	   
	   Assert.assertEquals(Actualresult1, Expectedresult1);
	
	
   }
   @Test (priority=4)
   public void testDefaultSelectedCheckBox() throws Exception 
   {
	  
	   WebElement Checkbox = driver.findElement(By.xpath("//input[@name = 'chkRememberMe']"));
	   Checkbox.isDisplayed();
	   
	   if(Checkbox.isSelected())
	   {
		   Assert.assertTrue(Checkbox.isSelected(), "Checkbox should be checked after clicking");
	   }
	  
	     
   }
   
   
   @Test(priority=5)
   public void testCheckboxIsChecked() throws InterruptedException {
       // Locate the checkbox element
       WebElement checkbox = driver.findElement(By.xpath("//span[@class = 'main_ch_mr']"));  // Replace with the actual ID of your checkbox
       checkbox.click();
	   Thread.sleep(3000);
       // Verify the checkbox is unchecked initially
       Assert.assertFalse(checkbox.isSelected(), "Checkbox should be unchecked initially");
       Thread.sleep(3000);
       // Check the checkbox
       // Wait for the checkbox to be clickable
//       WebDriverWait wait = new WebDriverWait(driver, 100);
//       wait.until(ExpectedConditions.elementToBeClickable(checkbox));

       // Click the checkbox
       WebElement checkbox1 = driver.findElement(By.xpath("//span[@class = 'main_ch_mr']"));  // Replace with the actual ID of your checkbox
       checkbox1.click();
       
       Thread.sleep(3000);
       // Verify the checkbox is checked after clicking
       Assert.assertFalse(checkbox1.isSelected(), "Checkbox should be checked after clicking");
   }

  

   
   @Test(priority=6)
   public void testPbxLinkClick() throws InterruptedException {
       // Locate the link element
	   String Actual23 = "Log into your PBX Extension";
	   String Expected23 = driver.findElement(By.id("divLoginPBX")).getText();
	   Assert.assertEquals(Actual23, Expected23); 
	   Thread.sleep(3000);
       WebElement link = driver.findElement(By.id("spLoginPBX"));  // Replace with the actual link text on your page

       // Click the link
       link.click();

       // Verify that the current URL matches the expected destination after clicking the link
       String actual1 = "https://www.coasecure.com/LoginPBX.aspx";
       String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
     
       Assert.assertEquals(actual1, currentUrl);
       Thread.sleep(2000);
       driver.navigate().back();
      // Assert.assertTrue(currentUrl.contains("expected_destination"), "Unexpected URL after clicking the link");
   }
   @Test(priority=7)
   public void testForgotLinkClick1() throws InterruptedException {
       // Locate the link element
	
       WebElement link = driver.findElement(By.id("spForgotPass"));  // Replace with the actual link text on your page

       // Click the link
       link.click();

       // Verify that the current URL matches the expected destination after clicking the link
       String actual1 = "https://www.coasecure.com/";
       String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
       Assert.assertEquals(actual1, currentUrl); 
       Thread.sleep(3000);
      
       driver.navigate().refresh();
      // Assert.assertTrue(currentUrl.contains("expected_destination"), "Unexpected URL after clicking the link");
   }
   @Test(priority=8)
   public void loginButtonEnabled() {
       // Locate the link element
       WebElement link = driver.findElement(By.id("btnLogin"));  // Replace with the actual link text on your page
       link.isEnabled();
       
       driver.navigate().forward();
   }
   @Test (priority=9)
   public void itcLogoVisibility() {
       // Locate the logo element
       WebElement logo = driver.findElement(By.id("imgLogo"));  // Replace with the actual ID or other locator of your logo

       // Verify that the logo is visible on the page
       Assert.assertTrue(logo.isDisplayed(), "Logo should be visible on the page");
   }
   @Test (priority=10)
   public void testContactUsInformation() {
       // Locate the logo element
       WebElement contactus  = driver.findElement(By.xpath("//*[contains(text(),'Contact Us 24/7')]"));  // Replace with the actual ID or other locator of your logo
       contactus.click();
       String actualresult = "Call Us";
       String Expectedresult = driver.findElement(By.xpath("//*[contains(text(),'Call Us')]")).getText();
       Assert.assertEquals(actualresult, Expectedresult); 
       String actualresult1 = "United States or Canada";
       String Expectedresult1 = driver.findElement(By.xpath("//*[@id=\"divCallUs\"]/div[2]")).getText();
       Assert.assertEquals(actualresult1, Expectedresult1); 
       String actualresult2 = "Outside the United States or Canada";
       String Expectedresult2 = driver.findElement(By.xpath("//*[contains(text(),'Outside the United States or Canada')]")).getText();
       Assert.assertEquals(actualresult2, Expectedresult2); 
       String actualresult3 = "(800) 454-5930";
       String Expectedresult3 = driver.findElement(By.xpath("//*[contains(text(),'(800) 454-5930')]")).getText();
       Assert.assertEquals(actualresult3, Expectedresult3); 
       String actualresult4 = "(732) 579-1200";
       String Expectedresult4 = driver.findElement(By.xpath("//*[contains(text(),'(732) 579-1200')]")).getText();
       Assert.assertEquals(actualresult4, Expectedresult4); 
       String actualresult5 = "Email Us";
       String Expectedresult5 = driver.findElement(By.xpath("//*[contains(text(),'Email Us')]")).getText();
       Assert.assertEquals(actualresult5, Expectedresult5); 
       String actualresult6 = "CustomerCare@COANetwork.com";
       String Expectedresult6 = driver.findElement(By.xpath("//*[contains(text(),'CustomerCare@COANetwork.com')]")).getText();
       Assert.assertEquals(actualresult6, Expectedresult6); 
   
       // Verify that the logo is visible on the page
      // Assert.assertTrue(logo.isDisplayed(), "Logo should be visible on the page");
   }
   @Test (priority=11)
   public void coaNetworkAllRightsReserved() {
       // Locate the logo element
//       String expected = driver.findElement(By.xpath("//*[@id=\"form1\"]/footer/div[1]")).getText();  // Replace with the actual ID or other locator of your logo
//             String Actual = "� 2023 COA Network. All Rights Reserved.";
//             Assert.assertEquals(Actual, expected); 
//             
           
   }
  @AfterTest
  public void afterTest() {
	  
  }

}
