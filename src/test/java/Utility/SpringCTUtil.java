package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;

public class SpringCTUtil extends BaseClass
{
	public static void implicitWaitInMillis(WebDriver driver, int timeInMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeInMillis));
	}
	
	public static String readPropertyData(String key) throws IOException
	{
		Properties P= new Properties();
		
		
		FileInputStream FIS= new FileInputStream("C:\\Users\\Nitesh Tadadikar\\eclipse-worksspace\\sprinCT\\testData.properties");
		
		P.load(FIS);
		
		String propertydata = P.getProperty(key);
		return propertydata;
	}
	
	public static void AlertHandling(WebDriver driver)
	{
		Alert Alrt = driver.switchTo().alert();
		
		Alrt.accept();
	}
}
