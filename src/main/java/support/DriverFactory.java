package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class DriverFactory {
	private static volatile DriverFactory instance;
	private WebDriver driver;

	public static DriverFactory getInstance() {
		DriverFactory localInstance = instance;
		if (localInstance == null) {
			synchronized (DriverFactory.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = localInstance = new DriverFactory();
				}
			}
		}
		return localInstance;
	}

	public static WebDriver getDriver() throws WebDriverException {
		return getInstance().driver;
	}

	private WebDriver initPhantomjs() {
		return new PhantomJSDriver();
	}

	public static void start() {
		if (getInstance().driver == null) {
			getInstance().driver = getInstance().initPhantomjs();
		}
	}

	public static void quit() {
		getInstance().driver.quit();
		getInstance().driver = null;
	}
}
