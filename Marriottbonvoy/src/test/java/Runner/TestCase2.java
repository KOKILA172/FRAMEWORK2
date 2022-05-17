package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.SigninPage;
import PageObject.Validatingtitle;
import utility.BaseClass;


public class TestCase2 extends BaseClass{
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();
		

	}

	@Test
	public void Test2navigation() throws IOException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	Validatingtitle v = new Validatingtitle(driver);
	
	
	Assert.assertEquals(v.getTitle().getText(), "My Trips");
	log.info("Succesfully validated text message");
}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
}
