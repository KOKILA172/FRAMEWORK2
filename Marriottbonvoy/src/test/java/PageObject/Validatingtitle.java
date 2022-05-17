package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validatingtitle {
	public WebDriver driver;
	By title=By.xpath("//*[@id='container-7b66ae5aae']/div/div/header/nav[2]/div/ul/li[6]/a/span[2]");
	
	
	
	public Validatingtitle(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}
	
}
