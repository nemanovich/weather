package mainPage;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
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
		String serviceWeatherDescription = getForecast(City.SAINT_PETERSBURG)
				.getDay().get(0).getDayPart().get(0).getWeatherType();
		assertEquals(serviceWeatherDescription,
				mainPage.getDetailedWeatherDescription(0));
	}
}
