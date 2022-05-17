package Runner;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.SigninPage;
import utility.BaseClass;
import utility.Excelsheet;
import utility.Screenshot;




public class TestCase1 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();
		

	}

	@Test
	public void Test1navigation() throws IOException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		SigninPage s = new SigninPage(driver);
		Excelsheet e=new Excelsheet();
		Screenshot s1=new Screenshot();
		log.info("chrome is opened succesfully");
		
		s.getSignin().click();
		s.getClickSignin().click();
		s.getEmail().sendKeys(e.getStringData("login",0,0));
		s.getPassword().sendKeys(e.getStringData("login",0,1));
		s.getLogin().click();
		log.info("login is invalid");
	}
	
	
	@AfterMethod()
	public void tearDownMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		Screenshot.captureScreenshot(driver);
	}
		

		
	}
	
	

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	
}
