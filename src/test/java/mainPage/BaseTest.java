package mainPage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ru.yandex.qatools.allure.annotations.Attachment;
import support.DriverFactory;

public abstract class BaseTest {

	@Attachment(type = "image/png")
	public static byte[] takeScreenshot() {
		return ((TakesScreenshot) DriverFactory.getDriver())
				.getScreenshotAs(OutputType.BYTES);
	}

	@BeforeClass
	public static void setUp() {
		DriverFactory.start();
	}

	@AfterClass
	public static void tearDown() {
		DriverFactory.quit();
	}
}
