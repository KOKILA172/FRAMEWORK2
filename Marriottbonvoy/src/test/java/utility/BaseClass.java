package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BaseClass  {
	public static WebDriver driver;
	public Properties prop;
	


	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\CA\\Marriottbonvoy\\Config\\config.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\CA\\Marriottbonvoy\\target\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

	

}
