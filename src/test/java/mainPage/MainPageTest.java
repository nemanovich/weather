package mainPage;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import support.City;
import views.MainPage;

public class MainPageTest extends BaseTest {

	private static MainPage mainPage;

	@BeforeClass
	public static final void openMainPage() {
		mainPage = new MainPage();
		mainPage.loadPage(City.MOSCOW.url());
	}

	@Features("Яндекс.Директ")
	@Stories("отображается на главной странице")
	@Test
	public final void yandexDirectIsVisible() throws Exception {
		takeScreenshot();
		assertTrue(mainPage.getTopYandexDirect().isDisplayed());
		assertTrue(mainPage.getVerticalYandexDirect().isDisplayed());
	}
}
