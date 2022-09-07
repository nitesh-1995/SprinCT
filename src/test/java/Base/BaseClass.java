package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.SpringCTUtil;


public class BaseClass 
{
	
	public WebDriver driver;
	public void openBrowser(String browserName) throws IOException
	{
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Interview Project\\Softwares\\chromedriver.exe");
			
			driver=  new ChromeDriver();
		}
		
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Interview Project\\Softwares\\geckodriver.exe");
			
			driver=  new FirefoxDriver();
		}
		
		driver.get(SpringCTUtil.readPropertyData("URL"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
}
