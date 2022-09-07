package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laptop 
{
	@FindBy(xpath = "//a[text()='Laptops']") private WebElement laptopsLink;
	@FindBy(xpath = "//a[text()='Dell i7 8gb']") private WebElement LaptopDellI7;
	@FindBy(xpath = "//a[text()='Add to cart']") private WebElement addToCartButton;
	
	
	public Laptop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void laptopClick()
	{
		laptopsLink.click();
	}
	public void laptopSelectClick()
	{
		LaptopDellI7.click();
	}
	public void addToCartClick()
	{
		addToCartButton.click();
	}
}
