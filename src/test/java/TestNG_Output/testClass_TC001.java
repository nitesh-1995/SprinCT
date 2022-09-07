package TestNG_Output;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import POM.HomePage;
import POM.Laptop;
import POM.MonitorPage;
import POM.Phone;
import Utility.SpringCTUtil;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class testClass_TC001 extends BaseClass{
  
	HomePage HP;
	Phone Ph;
	Laptop Lap;
	MonitorPage Mon;
	
  @Parameters ("browserName")
  @BeforeMethod
  public void beforeTest(String browserName) throws EncryptedDocumentException, IOException, InterruptedException 
  {
	openBrowser(browserName);
	System.out.println(SpringCTUtil.readPropertyData("URL"));
	HP= new HomePage(driver);
	Ph= new Phone(driver);
	Lap= new Laptop(driver);
	Mon= new MonitorPage(driver);
	
	HP.loginClick();
	SpringCTUtil.implicitWaitInMillis(driver, 200);
	HP.userNameInsertion(SpringCTUtil.readPropertyData("userName"));
	HP.passwordInsertion(SpringCTUtil.readPropertyData("password"));
	HP.loginbuttonClick();
	
	Thread.sleep(1000);
	Ph.phoneClick();
	Thread.sleep(1000);
	Ph.phoneSelectClick();
	Thread.sleep(1000);
	Ph.addToCartClick();
	
	Thread.sleep(1000);
	SpringCTUtil.AlertHandling(driver);
	HP.HomebuttonClick();
	
	Thread.sleep(1000);
	Lap.laptopClick();
	Thread.sleep(1000);
	Lap.laptopSelectClick();
	Thread.sleep(1000);
	Lap.addToCartClick();
	
	Thread.sleep(1000);
	SpringCTUtil.AlertHandling(driver);
	HP.HomebuttonClick();
	
	Thread.sleep(1000);
	Mon.monitorClick();
	Thread.sleep(1000);
	Mon.monitorSelectClick();
	Thread.sleep(1000);
	Mon.addToCartClick();
	
	Thread.sleep(1000);
	SpringCTUtil.AlertHandling(driver);

	Thread.sleep(1000);
	HP.CartbuttonClick();	
  }

  @Test
  public void validateLogin() throws IOException, InterruptedException
  {
	  SpringCTUtil.implicitWaitInMillis(driver, 4000);
	  SoftAssert SA = new SoftAssert();
	  SA.assertTrue(HP.actualUserNameLink().contains(SpringCTUtil.readPropertyData("userName")));
	  SA.assertAll();
  }
  
  @AfterMethod
  public void afterTest() 
  {
	  driver.close();
  }

}
