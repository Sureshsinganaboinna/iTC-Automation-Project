package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class voiceStudio {
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
		      driver.findElement(By.id("divSettings")).click();
		  }

		  @Test(priority = 1)
		  
		  public void testReportsContent() throws InterruptedException {
			  SoftAssert softAssert = new SoftAssert();
			  
			  
			  driver.findElement(By.id("lnkGreetings")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("lnkVoiceStudio")).click();
			  
				WebElement progressimage = driver.findElement(By.xpath("//img[@src='Images/newImages/Progress-step1.svg']"));
				softAssert.assertTrue(progressimage.isDisplayed(), "progressimage must be displayed");
			  
			  String actualresult = "Select Talent";
			String expectedresult =  driver.findElement(By.xpath("//label[contains(text(),'Select Talent')]")).getText();
			softAssert.assertEquals(actualresult, expectedresult);
			
			WebElement toogle = driver.findElement(By.id("AncTalent"));
			softAssert.assertTrue(toogle.isDisplayed(), "info toogle must be displayed");
			
			driver.findElement(By.id("AncTalent")).click();

			  Thread.sleep(3000);
			  String actualresult2 = "Select a Voice";
			String expectedresult2 =  driver.findElement(By.xpath("//h3[contains(text(),'Select a Voice')]")).getText();
			softAssert.assertEquals(actualresult2, expectedresult2);
			
			 String actualresult23 = "Select the Voice you want for your recording.";
				String expectedresult23 =  driver.findElement(By.xpath("//*[contains(text(),'Select the Voice you want for your recording.')]")).getText();
				softAssert.assertEquals(actualresult23, expectedresult23);

			WebElement dropdown = driver.findElement(By.id("ddlselecttalent"));
			//Get Available option
			Select select = new Select(dropdown);
			List<WebElement> options = select.getOptions();
			System.out.println(options.size());
			select.selectByVisibleText("Andy W");
			List<WebElement> e = select.getOptions();
			int itemCount = e.size();
			for(int l = 0; l < itemCount; l++)
			{
			    System.out.println(e.get(l).getText());
			}
			  String actualresult1 = "Select Alternate Talent";
				String expectedresult1 =  driver.findElement(By.xpath("//label[contains(text(),'Select Alternate Talent')]")).getText();
				softAssert.assertEquals(actualresult1, expectedresult1);
				
				WebElement toogle1 = driver.findElement(By.id("AncAltTalent"));
				softAssert.assertTrue(toogle1.isDisplayed(), "info toogle must be displayed");
				
				driver.findElement(By.id("AncAltTalent")).click();
				  Thread.sleep(3000);
				String actualresult11 = "Select an Alternate Voice";
				String expectedresult11 =  driver.findElement(By.xpath("//h3[contains(text(),'Select an Alternate Voice')]")).getText();
				softAssert.assertEquals(actualresult11, expectedresult11);
				
				String actualresult111 = "Select an alternate Voice (in case your first choice is not available). If you don’t want to select an alternate, select the same Voice you selected in the Select Talent drop-down.";
				String expectedresult111 =  driver.findElement(By.xpath("//*[contains(text(),'Select an alternate Voice (in case your first choice is not available). If you don’t want to select an alternate, select the same Voice you selected in the Select Talent drop-down.')]")).getText();
				softAssert.assertEquals(actualresult111, expectedresult111);
				
				WebElement dropdown1 = driver.findElement(By.id("ddlselectalternatetalent"));
				//Get Available option
				Select select1 = new Select(dropdown1);
				List<WebElement> options1 = select1.getOptions();
				System.out.println(options1.size());
				select1.selectByVisibleText("Bob A");
				List<WebElement> e1 = select.getOptions();
				int itemCount1 = e1.size();
				for(int l = 0; l < itemCount1; l++)
				{
				    System.out.println(e.get(l).getText());
				} 
				WebElement cancel = driver.findElement(By.id("btnCancel"));
				softAssert.assertTrue(cancel.isDisplayed(), "cancel button must be displayed");
				WebElement Next = driver.findElement(By.id("btnNext"));
				softAssert.assertTrue(Next.isDisplayed(), "Next button must be displayed");
				
				 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
				String actualresult112 = "Listen to Sample Voice of each Talent";
				String expectedresult112 =  driver.findElement(By.xpath("//*[contains(text(),'Listen to Sample Voice of each Talent')]")).getText();
				softAssert.assertEquals(actualresult112, expectedresult112);
				String actualresult1121 = "Andy W";
				String expectedresult1121 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[2]/div[1]/div[contains(text(),'Andy W')]")).getText();
				softAssert.assertEquals(actualresult1121, expectedresult1121);
				String actualresult11211 = "(Younger, friendly, passionate, can do high energy)";
				String expectedresult11211 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[2]/div[1]/div[contains(text(),'(Younger, friendly, passionate, can do high energy)')]")).getText();
				softAssert.assertEquals(actualresult11211, expectedresult11211);
				WebElement AndyWaudiofile = driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Andy W.mp3']"));
				softAssert.assertTrue(AndyWaudiofile.isDisplayed(), "AndyWaudiofile must be displayed");
				driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Andy W.mp3']")).click();
				 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
				  Thread.sleep(3000);
				String actualresult1123 = "Ann M";
				String expectedresult1123 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[3]/div[1]/div[contains(text(),'Ann M')]")).getText();
				softAssert.assertEquals(actualresult1123, expectedresult1123);
				String actualresult1124 = "(Upbeat, enthusiastic, friendly, warm, perky)";
				String expectedresult1124 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[3]/div[1]/div[contains(text(),'(Upbeat, enthusiastic, friendly, warm, perky)')]")).getText();
				softAssert.assertEquals(actualresult1124, expectedresult1124);
				WebElement AnnMaudiofile = driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Andy W.mp3']"));
				softAssert.assertTrue(AnnMaudiofile.isDisplayed(), "AnnMaudiofile must be displayed");
				driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Ann M.mp3']")).click();
				 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
				  Thread.sleep(3000);
				 String actualresult11234 = "Carena A";
					String expectedresult11234 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[4]/div[1]/div[contains(text(),'Carena A')]")).getText();
					softAssert.assertEquals(actualresult11234, expectedresult11234);
					String actualresult11245 = "(Spanish Professional, warm, fresh, younger)";
					String expectedresult11245 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[4]/div[1]/div[contains(text(),'(Spanish  Professional, warm, fresh, younger)')]")).getText();
					softAssert.assertEquals(actualresult11245, expectedresult11245);
					WebElement CarenaAaudiofile = driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Andy W.mp3']"));
					softAssert.assertTrue(CarenaAaudiofile.isDisplayed(), "AnnMaudiofile must be displayed");
					driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Carena Spn.mp3']")).click();
					 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
					  Thread.sleep(3000);
					 String actualresult112345 = "Bob A";
						String expectedresult112345 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[5]/div[1]/div[contains(text(),'Bob A')]")).getText();
						softAssert.assertEquals(actualresult112345, expectedresult112345);
						String actualresult112456 = "(Upbeat, enthusiastic, friendly, warm, perky)";
						String expectedresult112456 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[5]/div[1]/div[contains(text(),'(Authoritative, sincere, believable, likeable, business like)')]")).getText();
						softAssert.assertEquals(actualresult112456, expectedresult112456);
						WebElement BobAaudiofile = driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Andy W.mp3']"));
						softAssert.assertTrue(BobAaudiofile.isDisplayed(), "AnnMaudiofile must be displayed");
						driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Bob A.mp3']")).click();
						 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
						  Thread.sleep(3000);
						 String actualresult1123456 = "Wendy A";
							String expectedresult1123456 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[6]/div[1]/div[contains(text(),'Wendy A')]")).getText();
							softAssert.assertEquals(actualresult1123456, expectedresult1123456);
							String actualresult1124567 = "(Inviting, warm, serious, confident, professional)";
							String expectedresult1124567 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[6]/div[1]/div[contains(text(),'(Inviting, warm, serious, confident, professional)')]")).getText();
							softAssert.assertEquals(actualresult1124567, expectedresult1124567);
							WebElement WendyAaudiofile = driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Wendy A.mp3']"));
							softAssert.assertTrue(WendyAaudiofile.isDisplayed(), "AnnMaudiofile must be displayed");
							driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Wendy A.mp3']")).click();
							 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,900)");
							  Thread.sleep(3000);
							 String actualresult11234567 = "Miguel R";
								String expectedresult11234567 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[7]/div[1]/div[contains(text(),'Miguel R')]")).getText();
								softAssert.assertEquals(actualresult11234567, expectedresult11234567);
								String actualresult11245678 = "(Spanish Charming, confident, exotic, warm)";
								String expectedresult11245678 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div[4]/div[7]/div[1]/div[contains(text(),'(Spanish Charming, confident, exotic, warm)')]")).getText();
								softAssert.assertEquals(actualresult11245678, expectedresult11245678);
								WebElement MiguelRaudiofile = driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Miguel R Spanish.mp3']"));
								softAssert.assertTrue(MiguelRaudiofile.isDisplayed(), "AnnMaudiofile must be displayed");
								driver.findElement(By.xpath("//audio[@src='https://qabackoffice.itelecenter.com/VPBx_Uploaded_Files/COA_VoiceStudio/Miguel R Spanish.mp3']")).click();
								 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
								  Thread.sleep(3000);
			driver.findElement(By.id("btnNext")).click();

		  }
		  @Test(priority = 2)
		  
		public void selectGreetingTypePage() throws InterruptedException {  
			  SoftAssert softAssert = new SoftAssert();
				WebElement progressimage = driver.findElement(By.xpath("//img[@src='Images/newImages/Progress-step2.svg']"));
				softAssert.assertTrue(progressimage.isDisplayed(), "progressimage must be displayed");
			WebElement backbutton = driver.findElement(By.id("btnBack"));
			softAssert.assertTrue(backbutton.isDisplayed(), "back button must be displayed");
			WebElement cancelbutton = driver.findElement(By.id("btnCancel"));
			softAssert.assertTrue(cancelbutton.isDisplayed(), "cancel button must be displayed");
			WebElement nextbutton = driver.findElement(By.id("btnNext"));
			softAssert.assertTrue(nextbutton.isDisplayed(), "Next button must be displayed");
			 String actualresult = "Main Greeting";
				String expectedresult11234567 =  driver.findElement(By.xpath("//*[@id='divGreetBox']/div[1]/div[1]/label/span[contains(text(),'Main Greeting')]")).getText();
				softAssert.assertEquals(actualresult, expectedresult11234567);
				WebElement toogleHelpmanu = driver.findElement(By.id("AncStandardGreeting"));
				softAssert.assertTrue(toogleHelpmanu.isDisplayed(), "toogleHelpmanu must be displayed");
				driver.findElement(By.id("AncStandardGreeting")).click();
				String actualresult1 = "Main Greeting";
				String expectedresult112345671 =  driver.findElement(By.xpath("//h3[contains(text(),'Main Greeting')]")).getText();
				softAssert.assertEquals(actualresult1, expectedresult112345671);
				String actualresult11 = "This is the greeting your callers will hear during your business hours. Be sure to greet them and direct them to different departments, extensions, etc.";
				String expectedresult11 =  driver.findElement(By.xpath("//*[contains(text(),'This is the greeting your callers will hear during your business hours. Be sure to greet them and direct them to different departments, extensions, etc.')]")).getText();
				softAssert.assertEquals(actualresult11, expectedresult11);
				driver.findElement(By.id("AncStandardGreeting")).click();
				Thread.sleep(3000);
				 String actualresult2 = "After-Hours Greeting";
					String expectedresult2 =  driver.findElement(By.xpath("//*[@id='divGreetBox']/div[2]/div[1]/label/span[contains(text(),'After-Hours Greeting')]")).getText();
					softAssert.assertEquals(actualresult2, expectedresult2);
					WebElement toogleHelpmanu1 = driver.findElement(By.id("AncAH"));
					softAssert.assertTrue(toogleHelpmanu1.isDisplayed(), "toogleHelpmanu must be displayed");
					driver.findElement(By.id("AncAH")).click();
					String actualresult111 = "After-Hours Greeting";
					String expectedresult1123456711 =  driver.findElement(By.xpath("//h3[contains(text(),'After-Hours Greeting')]")).getText();
					softAssert.assertEquals(actualresult111, expectedresult1123456711);
					String actualresult1111 = "This greeting will play during your closed hours if you have set up your business hours on the After-Hours Greeting page. Use this greeting to inform your callers of your business hours and ask them to leave a message.";
					String expectedresult111 =  driver.findElement(By.xpath("//*[contains(text(),'This greeting will play during your closed hours if you have set up your business hours on the After-Hours Greeting page. Use this greeting to inform your callers of your business hours and ask them to leave a message.')]")).getText();
					softAssert.assertEquals(actualresult1111, expectedresult111);
					driver.findElement(By.id("AncAH")).click();
					Thread.sleep(3000);
					String actualresult21 = "Unavailable Greeting";
					String expectedresult21 =  driver.findElement(By.xpath("//*[@id='divGreetBox']/div[3]/div[1]/label/span[contains(text(),'Unavailable Greeting')]")).getText();
					softAssert.assertEquals(actualresult21, expectedresult21);
					WebElement toogleHelpmanu11 = driver.findElement(By.id("AncUnavailable"));
					softAssert.assertTrue(toogleHelpmanu11.isDisplayed(), "toogleHelpmanu must be displayed");
					driver.findElement(By.id("AncUnavailable")).click();
					String actualresult11111 = "Unavailable Greeting";
					String expectedresult11234567111 =  driver.findElement(By.xpath("//h3[contains(text(),'Unavailable Greeting')]")).getText();
					softAssert.assertEquals(actualresult11111, expectedresult11234567111);
					String actualresult111111 = "This greeting should inform your callers that you are not available and instruct them to leave a message.";
					String expectedresult1111 =  driver.findElement(By.xpath("//*[contains(text(),'This greeting should inform your callers that you are not available and instruct them to leave a message.')]")).getText();
					softAssert.assertEquals(actualresult111111, expectedresult1111);
					driver.findElement(By.id("AncUnavailable")).click();
					Thread.sleep(3000);
					String actualresult211 = "On Hold Greeting";
					String expectedresult211 =  driver.findElement(By.xpath("//*[@id='divGreetBox']/div[4]/div[1]/label/span[contains(text(),'On Hold Greeting')]")).getText();
					softAssert.assertEquals(actualresult211, expectedresult211);
					WebElement toogleHelpmanu111 = driver.findElement(By.id("AncOnHold"));
					softAssert.assertTrue(toogleHelpmanu111.isDisplayed(), "toogleHelpmanu must be displayed");
					driver.findElement(By.id("AncOnHold")).click();
					String actualresult1111111 = "On Hold Greeting";
					String expectedresult112345671111 =  driver.findElement(By.xpath("//h3[contains(text(),'On Hold Greeting')]")).getText();
					softAssert.assertEquals(actualresult1111111, expectedresult112345671111);
					String actualresult11111111 = "You can use the time your callers are waiting to connect to you as an opportunity to present them with a marketing message about your company, products, or services.";
					String expectedresult11111 =  driver.findElement(By.xpath("//*[contains(text(),'You can use the time your callers are waiting to connect to you as an opportunity to present them with a marketing message about your company, products, or services.')]")).getText();
					softAssert.assertEquals(actualresult11111111, expectedresult11111);
					driver.findElement(By.id("AncOnHold")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='divGreetBox']/div[1]/div[1]/label/span[@class='MTS-checkmark']")).click();
					((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
					String actualresult3 = "Type your greeting below";
					String expectedresult3 =  driver.findElement(By.xpath("//*[@id='divStrgreeting']/label[contains(text(),'Type your greeting below')]")).getText();
					softAssert.assertEquals(actualresult3, expectedresult3);
					String actualresult31 = "4000 of 4000 characters remaining\n"
							+ "\n"
							+ "";
					String expectedresult31 =  driver.findElement(By.xpath("//*[@id='divStrgreeting']/p")).getText();
					softAssert.assertEquals(actualresult31, expectedresult31);
					WebElement Textbox = driver.findElement(By.id("txtStrgreeting"));
					softAssert.assertTrue(Textbox.isDisplayed(), "Textbox must be displayed");
					Thread.sleep(3000);
					
					driver.findElement(By.id("btnNext")).click();
					String actualresult311 = "You must enter the text that you want recorded for the selected Greeting Type.";
					String expectedresult311 =  driver.findElement(By.xpath("//label[contains(text(),'You must enter the text that you want recorded for the selected Greeting Type.')]")).getText();
					softAssert.assertEquals(actualresult311, expectedresult311);
					Thread.sleep(3000);
					driver.findElement(By.id("txtStrgreeting")).sendKeys("Testing voice studio functionality please ignore it");
					Thread.sleep(3000);
					driver.findElement(By.id("btnNext")).click();
		}
		  @Test(priority = 3)
		  public void addSpecialInstructions() throws InterruptedException
		  {
			  SoftAssert softAssert = new SoftAssert();
			  WebElement progressimage = driver.findElement(By.xpath("//img[@src='Images/newImages/Progress-step3.svg']"));
				softAssert.assertTrue(progressimage.isDisplayed(), "progressimage must be displayed");
			  String actualresult311 = "Please describe how you want the talent to read your script. You may want to sound like an exciting sales pitch, a friendly conversation, an informative presentation, etc. Be as descriptive as possible.";
				String expectedresult311 =  driver.findElement(By.xpath("//label[contains(text(),'Please describe how you want the talent to read your script. You may want to sound like an exciting sales pitch, a friendly conversation, an informative presentation, etc. Be as descriptive as possible.')]")).getText();
				softAssert.assertEquals(actualresult311, expectedresult311);
				 String actualresult3111 = "200 of 200 characters remaining";
					String expectedresult3111 =  driver.findElement(By.xpath("//*[@id='div2']/p")).getText();
					softAssert.assertEquals(actualresult3111, expectedresult3111);
					((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
					Thread.sleep(3000);
					driver.findElement(By.id("btnNext")).click();
					 String actualresult31111 = "Please fill all below required fields.";
						String expectedresult31111 =  driver.findElement(By.xpath("//*[contains(text(),'Please fill all below required fields.')]")).getText();
						softAssert.assertEquals(actualresult31111, expectedresult31111);	
					driver.findElement(By.id("txtInstructions")).sendKeys("Testing voice studio functionality please ingore if you get any notificaitons");
					
					 String actualresult311111 = "Please identify any unique pronunciations - spell them phonetically (if none, type \"NONE\")";
						String expectedresult311111 =  driver.findElement(By.xpath("//label[contains(text(),'Please identify any unique pronunciations - spell them phonetically (if none, type \"NONE\") ')]")).getText();
						softAssert.assertEquals(actualresult311111, expectedresult311111);
						 String actualresult3111111 = "200 of 200 characters remaining";
							String expectedresult3111111 =  driver.findElement(By.xpath("//*[@id='div3']/p")).getText();
							softAssert.assertEquals(actualresult3111111, expectedresult3111111);
							((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
							Thread.sleep(3000);
							driver.findElement(By.id("btnNext")).click();
							 String actualresult31111111 = "Please fill all below required fields.";
								String expectedresult31111111 =  driver.findElement(By.xpath("//*[contains(text(),'Please fill all below required fields.')]")).getText();
								softAssert.assertEquals(actualresult31111111, expectedresult31111111);	
							driver.findElement(By.id("txtpronunciation")).sendKeys("Testing voice studio functionality please ingore if you get any notificaitons");		
							String actualresult34 = "Any special instructions?";
							String expectedresult34 =  driver.findElement(By.xpath("//label[contains(text(),'Any special instructions?')]")).getText();
							softAssert.assertEquals(actualresult34, expectedresult34);
							 String actualresult35 = "200 of 200 characters remaining";
								String expectedresult35 =  driver.findElement(By.xpath("//*[@id='div4']/p")).getText();
								softAssert.assertEquals(actualresult35, expectedresult35);
								((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
								Thread.sleep(3000);
								WebElement backbutton = driver.findElement(By.id("btnBack"));
								softAssert.assertTrue(backbutton.isDisplayed(), "back button must be displayed");
								WebElement cancelbutton = driver.findElement(By.id("btnCancel"));
								softAssert.assertTrue(cancelbutton.isDisplayed(), "cancel button must be displayed");
								WebElement nextbutton = driver.findElement(By.id("btnNext"));
								softAssert.assertTrue(nextbutton.isDisplayed(), "Next button must be displayed");
								driver.findElement(By.id("txtSplInstructions")).sendKeys("Testing voice studio functionality please ingore if you get any notificaitons");	
								Thread.sleep(3000);
								driver.findElement(By.id("btnNext")).click();
		  }
		  @Test (priority = 4)
		  
		  public void placeOrder() throws InterruptedException
		  {
			  SoftAssert softAssert = new SoftAssert();
			  WebElement progressimage = driver.findElement(By.xpath("//img[@src='Images/newImages/Progress-step4.svg']"));
				softAssert.assertTrue(progressimage.isDisplayed(), "progressimage must be displayed");
				String actualresult34 = "Greeting Type";
				String expectedresult34 =  driver.findElement(By.xpath("//h4[contains(text(),'Greeting Type')]")).getText();
				softAssert.assertEquals(actualresult34, expectedresult34);
				String actualresult341 = "Manage your greetings here.";
				String expectedresult341 =  driver.findElement(By.xpath("//p[contains(text(),'Manage your greetings here.')]")).getText();
				softAssert.assertEquals(actualresult341, expectedresult341);
				String actualresult3411 = "Main";
				String expectedresult3411 =  driver.findElement(By.xpath("//*[@id='divGreetBlock']/div/div[contains(text(),'Main')]")).getText();
				softAssert.assertEquals(actualresult3411, expectedresult3411);
				String actualresult34111 = "Review";
				String expectedresult34111 =  driver.findElement(By.xpath("//*[@id='divGreetBlock']/div/div[contains(text(),'Review')]")).getText();
				softAssert.assertEquals(actualresult34111, expectedresult34111);
				String actualresult341111 = "Once an order is submitted, a binding, non-refundable transaction has occurred.";
				String expectedresult341111 =  driver.findElement(By.xpath("//p[contains(text(),'Once an order is submitted, a binding, non-refundable transaction has occurred.')]")).getText();
				softAssert.assertEquals(actualresult341111, expectedresult341111);
				String actualresult345 = "Selected Talent is subject to availability. Please designate a first choice talent and an alternate talent. Every effort will be made to book your first choice, but will default to the alternate choice if your first choice is not available for any reason. If neither choice is available, we will contact you.";
				String expectedresult345 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[2]/div[2]/div[3]/p[2]")).getText();
				softAssert.assertEquals(actualresult345, expectedresult345);
				String actualresult346 = "The Talent is not responsible for pronunciation keys not supplied or typographical errors in copy.";
				String expectedresult346 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[2]/div[2]/div[3]/p[3]")).getText();
				softAssert.assertEquals(actualresult346, expectedresult346);
				String actualresult347 = "BY CLICKING THE SUBMIT BUTTON BELOW, YOU AGREE TO THE TERMS AND CONDITIONS ABOVE.";
				String expectedresult347 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[2]/div[2]/div[3]/p[4]")).getText();
				softAssert.assertEquals(actualresult347, expectedresult347);
				String actualresult348 = "The recording fee of  $49.00  will be charged to the credit card we have on file.";
				String expectedresult348 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[2]/div[2]/div[3]/p[5]")).getText();
				softAssert.assertEquals(actualresult348, expectedresult348);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='divGreetBlock']/div/div[contains(text(),'Review')]")).click();
				
				String actualresult3415= "Main Greeting";
				String expectedresult3415 =  driver.findElement(By.xpath("//h4[contains(text(),'Main Greeting')]")).getText();
				softAssert.assertEquals(actualresult3415, expectedresult3415);
				String actualresult34151= "Make any changes below and click save when finished.";
				String expectedresult34151 =  driver.findElement(By.xpath("//p[contains(text(),'Make any changes below and click save when finished.')]")).getText();
				softAssert.assertEquals(actualresult34151, expectedresult34151);
				String actualresult341511= "3949 of 4000 characters remaining";
				String expectedresult341511 =  driver.findElement(By.xpath("//*[@id='div5']/div")).getText();
				softAssert.assertEquals(actualresult341511, expectedresult341511);
				Thread.sleep(3000);
				 WebElement btnReviewCancel = driver.findElement(By.id("btnReviewCancel"));
					softAssert.assertTrue(btnReviewCancel.isDisplayed(), "btnReviewCancel must be displayed");
					WebElement btnReviewSave = driver.findElement(By.id("btnReviewSave"));
					softAssert.assertTrue(btnReviewSave.isDisplayed(), "btnReviewSave button must be displayed");
					Thread.sleep(3000);
				driver.findElement(By.id("txtScript")).clear();
				driver.findElement(By.id("btnReviewSave")).click();
				Thread.sleep(3000);
				String actualresult34156= "Please enter the script for Greeting.";
				String expectedresult34156 =  driver.findElement(By.xpath("//label[contains(text(),'Please enter the script for Greeting.')]")).getText();
				softAssert.assertEquals(actualresult34156, expectedresult34156);
				Thread.sleep(3000);
				driver.findElement(By.id("txtScript")).sendKeys("Testing voice studio functionality please ignore if you get any notificaitonss");
				driver.findElement(By.id("btnReviewSave")).click();
				Thread.sleep(3000);
				String actualresult341561= "Entered Script changes has been saved.";
				String expectedresult341561 =  driver.findElement(By.xpath("//label[contains(text(),'Entered Script changes has been saved.')]")).getText();
				softAssert.assertEquals(actualresult341561, expectedresult341561);
				Thread.sleep(3000);
				driver.findElement(By.id("btnReviewCancel")).click();
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,750)");
				Thread.sleep(3000);
			  WebElement backbutton = driver.findElement(By.id("btnBack"));
				softAssert.assertTrue(backbutton.isDisplayed(), "back button must be displayed");
				WebElement cancelbutton = driver.findElement(By.id("btnCancel"));
				softAssert.assertTrue(cancelbutton.isDisplayed(), "cancel button must be displayed");
				WebElement nextbutton = driver.findElement(By.id("btnNext"));
				softAssert.assertTrue(nextbutton.isDisplayed(), "Next button must be displayed");
				driver.findElement(By.id("btnNext")).click();
				Thread.sleep(3000);
				String actualresult3415611= "Submit Order";
				String expectedresult3415611 =  driver.findElement(By.xpath("//h3[contains(text(),'Submit Order')]")).getText();
				softAssert.assertEquals(actualresult3415611, expectedresult3415611);
				
				String actualresult5 = "Your order has been submitted.";
				String expectedresult5 =  driver.findElement(By.xpath("//h5[contains(text(),'Your order has been submitted.')]")).getText();
				softAssert.assertEquals(actualresult5, expectedresult5);
				
				String actualresult51 = "We will notify you via the email address we have on file when your script has been recorded and uploaded.";
				String expectedresult51 =  driver.findElement(By.xpath("//p[contains(text(),'We will notify you via the email address we have on file when your script has been recorded and uploaded.')]")).getText();
				softAssert.assertEquals(actualresult51, expectedresult51);
				
				String actualresult511 = "If you have any questions, please contact Customer Care at 800-454-5930 or CustomerCare@COANetwork.com";
				String expectedresult511 =  driver.findElement(By.xpath("//*[@id='divContainerRight']/div[3]/div/div/p[2]")).getText();
				softAssert.assertEquals(actualresult511, expectedresult511);
		
		  }

  @AfterMethod
  public void afterMethod() {
  }

}
