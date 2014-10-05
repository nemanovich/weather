package mainPage;

import static org.junit.Assert.assertEquals;
import generated.ru.yandex.weather.forecast.ForecastType;

import java.net.MalformedURLException;
import javax.xml.bind.JAXBException;

import org.junit.BeforeClass;
import org.junit.Test;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import services.YandexWeatherService;
import support.City;
import support.DriverFactory;
import views.MainPage;

public class TodayWeatherTest extends BaseTest {

	private static MainPage mainPage;

	@BeforeClass
	public static final void openMainPage() {
		mainPage = new MainPage();
		mainPage.loadPage(City.MOSCOW.url());
	}

	@Features("Текущая погода")
	@Stories("температура сейчас")
	@Test
	public final void testCurrentTemperature() throws Exception {
		String actualTemperature = mainPage.getWeatherToday()
				.getCurrentTemperature();
		int expectedTemperature = YandexWeatherService
				.getForecast(City.MOSCOW.id()).getFact().getTemperature()
				.getValue();
		assertEquals(String.format("+%s °C", expectedTemperature),
				actualTemperature);
	}
}
