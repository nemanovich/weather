package mainPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import support.City;
import support.DriverFactory;
import views.MainPage;

public class ChangeRegionTest extends BaseTest {

	private static MainPage mainPage;

	@Before
	public final void openMainPage() {
		mainPage = new MainPage();
		mainPage.loadPage(City.MOSCOW.url());
	}

	@Features("Смена региона")
	@Stories("из поисковой строки без подсказки")
	@Test
	public final void regionSearchWithoutHint() throws Exception {
		mainPage.search("Киев");
		assertEquals("Погода в Киеве", mainPage.getCityTitle());
		takeScreenshot();
	}

	@Features("Смена региона")
	@Stories("из поисковой строки через подсказку")
	@Test
	public final void regionSearchWithHint() throws Exception {
		mainPage.getSearchInput().sendKeys("Екатеринбург");
		assertTrue(mainPage.getSearchHints().get(0).getText()
				.startsWith("Екатеринбург"));
		takeScreenshot();
		mainPage.getSearchHints().get(0).click();
		mainPage.waitUntilSearchCompleted();
		assertEquals("Погода в Екатеринбурге", mainPage.getCityTitle());
		takeScreenshot();
	}

	@Features("Смена региона")
	@Stories("из попапа 'Другой город'")
	@Test
	public final void regionChangeFromCitySwitcher() throws Exception {
		DriverFactory.getDriver().manage().deleteAllCookies();
		mainPage.search("Новосибирск");
		mainPage.loadPage(City.MOSCOW.url());
		mainPage.openCitySwitcherPopup();

		WebElement firstLink = mainPage.getCitySwitcherPopup().getCityLinks().get(0);
		assertEquals("Новосибирск", firstLink.getText());
		takeScreenshot();

		firstLink.click();
		assertEquals("Погода в Новосибирске", mainPage.getCityTitle());
		takeScreenshot();
	}
}
