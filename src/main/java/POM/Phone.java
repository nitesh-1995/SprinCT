package POM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Phone
{
	@FindBy(xpath = "//a[text()='Phones']") private WebElement phonesLink;
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']") private WebElement phoneSamsungGalaxyS6;
	@FindBy(xpath = "//a[text()='Add to cart']") private WebElement addToCartButton;
	
	public Phone(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void phoneClick()
	{
		phonesLink.click();
	}
	public void phoneSelectClick()
	{
		phoneSamsungGalaxyS6.click();
	}
	
	public void addToCartClick()
	{
		addToCartButton.click();
	}
}
