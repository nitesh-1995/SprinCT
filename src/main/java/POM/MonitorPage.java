package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorPage 
{
	@FindBy(xpath = "//a[text()='Monitors']") private WebElement monitorsLink;
	@FindBy(xpath = "//a[text()='ASUS Full HD']") private WebElement MonitorFullHD;
	@FindBy(xpath = "//a[text()='Add to cart']") private WebElement addToCartButton;
	
	
	public MonitorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void monitorClick()
	{
		monitorsLink.click();
	}
	public void monitorSelectClick()
	{
		MonitorFullHD.click();
	}
	public void addToCartClick()
	{
		addToCartButton.click();
	}
}
