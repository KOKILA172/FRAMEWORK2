package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Homepage;
import utility.BaseClass;
import utility.Excelsheet;

public class TestCase3 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test3navigation() throws IOException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		Homepage h = new Homepage(driver);

		h.getDestination().click();
		h.getDestination().sendKeys("New York, NY");
		h.getDestination().sendKeys(Keys.ARROW_DOWN);
		h.getDestination().sendKeys(Keys.ENTER);

		log.info("Succesfully found the destination");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}
