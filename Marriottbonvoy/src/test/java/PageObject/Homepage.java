package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
	By destination=By.xpath("//input[@name='destinationAddress.destination']");
	
			
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public WebElement getDestination() {
		// TODO Auto-generated method stub
		return driver.findElement(destination);
	}

	


	/*public WebElement getPlace() {
		// TODO Auto-generated method stub
		return driver.findElement(place);
	}*/

	


}




