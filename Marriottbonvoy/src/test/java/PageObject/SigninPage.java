package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {
	
	public WebDriver driver;
	
	By signin=By.xpath("//*[@id='container-7b66ae5aae']/div/div/header/nav[2]/div/ul/li[3]/a/span[2]");
	By clicksignin=By.xpath("//*[@id='sign-in-tooltip-id']/button");
	By email=By.xpath("//*[@id='signin-userid']");
	By password=By.xpath("//*[@id='signin-user-password']");
	By login=By.cssSelector("button[type='submit']");
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getSignin() {
		// TODO Auto-generated method stub
		return driver.findElement(signin);
	}
	
	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}


	public WebElement getClickSignin() {
		// TODO Auto-generated method stub
		 return driver.findElement(clicksignin);
	}
	
}
