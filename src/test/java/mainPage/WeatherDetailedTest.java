package mainPage;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import services.YandexWeatherService;
import support.City;
import views.MainPage;

public class WeatherDetailedTest extends BaseTest {

	private static MainPage mainPage;

	@BeforeClass
	public static final void openMainPage() {
		mainPage = new MainPage();
		mainPage.loadPage(City.SAINT_PETERSBURG.url());
		mainPage.selectDetailedForecast();
	}

	@Features("Подробный прогноз погоды")
	@Stories("описание погоды в первой строке")
	@Test
	public final void testFirstDescription() throws Exception {
		String pageWeatherDescription = mainPage
				.getDetailedWeatherDescription(0);
		String serviceWeatherDescription = YandexWeatherService
				.getForecast(City.SAINT_PETERSBURG.id()).getDay().get(0)
				.getDayPart().get(0).getWeatherType();
		assertEquals(serviceWeatherDescription, pageWeatherDescription);
	}
}
