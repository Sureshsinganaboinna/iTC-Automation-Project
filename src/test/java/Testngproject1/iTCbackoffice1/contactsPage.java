package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class contactsPage {
	static WebDriver driver;
	@BeforeClass
	  public void setup() throws InterruptedException  {
		  
			 ChromeOptions options = new ChromeOptions();
		      options.addArguments("--use-fake-ui-for-media-stream");
		      options.addArguments("--disable-notifications");
			  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		    //  driver = new ChromeDriver();
			// WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver(options);
			  driver.manage().window().maximize();
		     driver.get("https://qanewbackoffice.itelecenter.com/login.aspx");
//		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
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
//		  int expectedItemCount = 5;
//		  List<WebElement> items = driver.findElements(By.xpath("//ul[@class='pagination bootpag']/a[not(text()='Prev' or text()='Next')]"));
//		  Thread.sleep(3000);
//	     int itemCount = items.size();
//			
//	     System.out.println(itemCount);
//	     softAssert.assertEquals(itemCount, expectedItemCount);
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
//		  Thread.sleep(3000);
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
  @AfterMethod
  public void afterMethod() {
  }

}
