package TestNG_Output;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.util.concurrent.Monitor;

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
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class testClass_TC002 extends BaseClass{
  
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
	
	SpringCTUtil.implicitWaitInMillis(driver, 200);
	Ph.phoneClick();
	SpringCTUtil.implicitWaitInMillis(driver, 200);
	Ph.phoneSelectClick();
	SpringCTUtil.implicitWaitInMillis(driver, 200);
	Ph.addToCartClick();
	
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	SpringCTUtil.AlertHandling(driver);
//	HP.HomebuttonClick();
//	
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	Lap.laptopClick();
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	Lap.laptopSelectClick();
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	Lap.addToCartClick();
//	
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	SpringCTUtil.AlertHandling(driver);
//	HP.HomebuttonClick();
//	
//	SpringCTUtil.AlertHandling(driver);
//	Mon.monitorClick();
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	Mon.monitorSelectClick();
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	Mon.addToCartClick();
//	
//	SpringCTUtil.implicitWaitInMillis(driver, 200);
//	HP.CartbuttonClick();
  }

  @Test
  public void validateHii() 
  {
	Reporter.log("Hii");
  }
  
  @AfterMethod
  public void afterTest() 
  {
   driver.close();
  }

}
