package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(id = "login2") private  WebElement loginLink;
	

	
	@FindBy(id = "loginusername") private WebElement userName;
	@FindBy(id = "loginpassword") private WebElement password;
	@FindBy(xpath = "//button[@onclick='logIn()']") private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'sctqaautomation@grr.la')]") private WebElement actualUserName;
	@FindBy(xpath = "//a[text()='Home ']")	private WebElement HomeButton;
	@FindBy(xpath = "//a[text()='Cart']")	private WebElement CartButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginClick()
	{
		loginLink.click();
	}

	
	public void userNameInsertion(String userNameFromProperty)
	{
		userName.sendKeys(userNameFromProperty);
	}
	
	public void passwordInsertion(String passwordFromProperty)
	{
		password.sendKeys(passwordFromProperty);
	}
	
	public void loginbuttonClick()
	{
		loginButton.click();
	}
	
	public String actualUserNameLink()
	{
		String actualUserId=actualUserName.getText();
	
		return actualUserId;
	}
	
	public void HomebuttonClick()
	{
		HomeButton.click();
	}
	
	public void CartbuttonClick()
	{
		CartButton.click();
	}
	
}
