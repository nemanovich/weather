package mainPage;

import generated.ru.yandex.weather.forecast.ForecastType;

import java.net.MalformedURLException;

import javax.xml.bind.JAXBException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ru.yandex.qatools.allure.annotations.Attachment;
import services.YandexWeatherService;
import support.City;
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
	
	protected static ForecastType getForecast(City city)
			throws MalformedURLException, JAXBException {
		return YandexWeatherService.getForecast(city.id());
	}
}
