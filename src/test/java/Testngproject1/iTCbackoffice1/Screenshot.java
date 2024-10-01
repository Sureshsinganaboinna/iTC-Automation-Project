package Testngproject1.iTCbackoffice1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Singanaboina Suresh\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		    //  driver = new ChromeDriver();
		  ChromeDriver   driver = new ChromeDriver();

	    driver.get("https://www.coasecure.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//input[@name = 'txtEmail']")).sendKeys("8773789517");  //(833)6322654
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@name = 'txtPassCode']")).sendKeys("1000");    //891929
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
		      Thread.sleep(3000);
		      //Total page screenshot
//			  ChromeDriver ts = driver;
			  driver.getScreenshotAs(OutputType.FILE);
			File src =   driver.getScreenshotAs(OutputType.FILE);
			File target = new File(".//Screenshotss//Home.png");
			FileUtils.copyFile(src, target);
					
		 /*     //Only certain portion of the page screenshot
			WebElement Portion = driver.findElement(By.xpath("//*[@id='form1']/section[1]"));
			File src1 = Portion.getScreenshotAs(OutputType.FILE);
			File target1 = new File(".//Screenshotss//Manu.png");
			FileUtils.copyFile(src1, target1);
			*/
			  
	}

}
