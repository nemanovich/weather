package ru.yandex.weather.region;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.weather.utils.rules.DriverRule;
import ru.yandex.weather.views.MainPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.MatcherDecorators.should;
import static ru.yandex.qatools.htmlelements.matchers.MatcherDecorators.timeoutHasExpired;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.hasText;
import static ru.yandex.weather.utils.FrontendURIFactory.getRegionUrl;
import static ru.yandex.weather.utils.data.Region.MOSCOW;
import static ru.yandex.weather.utils.data.Region.SAINT_PETERSBURG;

@Features("Смена региона")
public class ChangeRegionTest {

    @Rule
    public DriverRule driver = new DriverRule();
    private MainPage mainPage = new MainPage(driver.getWebDriver());

    @Before
    public void openMainPage() {
        driver.open(getRegionUrl(MOSCOW));
    }

    @Test
    @Stories("Из поисковой строки")
    @Title("Смена региона из поисковой строки без саджеста")
    public void testRegionSearchWithoutHint() {
        mainPage.getHeader().search("Москва Льва Толстого");

        assertThat("неверный тайтл региона",
                mainPage.getCityTitle(),
                should(hasText(startsWith("улица Льва Толстого, Москва"))).whileWaitingUntil(timeoutHasExpired())
        );
    }

    @Test
    @Stories("Из поисковой строки")
    @Title("Смена региона из поисковой строки через саджест")
    public void testRegionSearchWithHint() {
        mainPage.getHeader().getSearchInput().sendKeys("Екатеринбург");
        assertThat(mainPage.getSuggest().getHints().get(0), hasText(startsWith("Екатеринбург")));
        mainPage.getSuggest().selectHint(0);

        assertThat("неверный тайтл региона",
                mainPage.getCityTitle(),
                should(hasText(startsWith("Погода в Екатеринбурге"))).whileWaitingUntil(timeoutHasExpired())
        );
    }

    @Test
    @Stories("Другой город")
    @Title("Смена региона из подсказок попапа 'Другой город'")
    @Description("В попапе 'Другой город' появляются ранее посещенные регионы. Проверяется переход по этим регионам.")
    public void testRegionChangeFromCitySwitcher() {
        driver.open(getRegionUrl(SAINT_PETERSBURG));
        mainPage.openCitySwitcherPopup();

        assertThat(
                "неверный регион в попапе выбора региона",
                mainPage.getCitySwitcherPopup().getRegions().get(0).getTitle(),
                hasText(containsString(MOSCOW.toString()))
        );

        mainPage.getCitySwitcherPopup().selectRegion(0);

        assertThat("неверный тайтл региона",
                mainPage.getCityTitle(),
                should(hasText(startsWith("Погода в Москве"))).whileWaitingUntil(timeoutHasExpired()));
    }
}
