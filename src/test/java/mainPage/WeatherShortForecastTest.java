package mainPage;

import static org.junit.Assert.*;
import generated.ru.yandex.weather.forecast.DayType;
import generated.ru.yandex.weather.forecast.ForecastType;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import services.YandexWeatherService;
import support.City;
import views.MainPage;

@RunWith(Parameterized.class)
public class WeatherShortForecastTest extends BaseTest {

	private static MainPage mainPage;

	public int index;
	public DayType expectedDayForecast;

	private static ForecastType getForecast(int id)
			throws MalformedURLException, JAXBException {
		return YandexWeatherService.getForecast(City.MOSCOW.id());
	}

	@org.junit.runners.Parameterized.Parameters(name = "temperature in day {0}")
	public static List<Object[]> getDayForecast() throws Exception {
		List<DayType> days = getForecast(City.MOSCOW.id()).getDay();
		days.remove(0); // убираем сегодняшний день
		List<Object[]> parameters = new ArrayList<Object[]>();
		for (int i = 0; i < days.size(); i++) {
			parameters.add(new Object[] { i, days.get(i) });
		}
		return parameters;
	}

	public WeatherShortForecastTest(int index, DayType expectedDayForecast) {
		this.index = index;
		this.expectedDayForecast = expectedDayForecast;
	}

	@BeforeClass
	public static final void openMainPage() {
		mainPage = new MainPage();
		mainPage.loadPage(City.MOSCOW.url());
	}

	@Features("Краткий прогноз погоды")
	@Stories("дневная температура")
	@Test
	public final void testDayTemperature() throws Exception {
		// TODO: заменить magic number на поиск по аттрибуту type == 'day_short'
		int expectedTemperature = expectedDayForecast.getDayPart().get(4)
				.getTemperature();
		int actualTemperature = 
				Integer.parseInt(mainPage.getShortDayForcastWidget().getDayTemparature(index));

		assertEquals(expectedTemperature, actualTemperature);
	}
}
