package Testngproject1.iTCbackoffice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.interactions.Actions;

public class faxScript extends BaseClass {
  @Test
  public void f() {
	  SoftAssert softassert = new SoftAssert();
	  driver.findElement(By.id("spFaxes")).isDisplayed();
	  driver.findElement(By.id("spFaxes")).click();
	    // Locate the image element
      WebElement imageElement = driver.findElement(By.xpath("//*[@id='grdInboxNew_imgMsg_0']"));
      // Verify image presence
      softassert.assertTrue(imageElement.isDisplayed(), "Image is not displayed");
      
      
      String receivedfaxtxtActualresult = "Received fax";
      String Expectedresult = driver.findElement(By.xpath("//*[@id='grdInboxNew_lblMsgType_0']")).getText();
      softassert.assertEquals(receivedfaxtxtActualresult, Expectedresult);
      
      WebElement ele = driver.findElement(By.xpath("//*[@id='grdInboxNew_grdimgCallblock_0']"));
    //Creating object of an Actions class
    Actions action = new Actions(driver);
    //Performing the mouse hover action on the target element.
    action.moveToElement(ele).perform();
    
    WebElement ele1 = driver.findElement(By.xpath("//*[@id='grdInboxNew_grdimgFlag_0']"));
    //Creating object of an Actions class
    Actions action1 = new Actions(driver);
    //Performing the mouse hover action on the target element.
    action1.moveToElement(ele1).perform();
    
    WebElement ele11 = driver.findElement(By.xpath("//*[@id='grdInboxNew_grdimgDelete_0']"));
    //Creating object of an Actions class
    Actions action11 = new Actions(driver);
    //Performing the mouse hover action on the target element.
    action11.moveToElement(ele11).perform();
      
      
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
