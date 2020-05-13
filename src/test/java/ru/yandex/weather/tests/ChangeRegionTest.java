package ru.yandex.weather.tests;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.weather.rules.WebDriverRule;
import ru.yandex.weather.views.weather.MainPage;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.hasText;
import static ru.yandex.weather.rules.TestRuleUtil.webDriverRule;
import static ru.yandex.weather.utils.FrontendURIFactory.getRegionUrl;

@Features("Смена региона")
public class ChangeRegionTest {

    @ClassRule
    public static WebDriverRule browser = webDriverRule();

    private MainPage mainPage = new MainPage(browser.getWebDriver());

    @Before
    public void openMainPage() {
        browser.getWebDriver().get(getRegionUrl("moscow"));
    }

    @Test
    @Stories("Из поисковой строки")
    @Title("Смена региона из поисковой строки без саджеста")
    public void testRegionSearchWithoutHint() {
        mainPage.header.search("Москва");
        assertThat(mainPage.title, hasText("Вы искали: Москва"));
    }

    @Test
    @Stories("Из поисковой строки")
    @Title("Смена региона из поисковой строки через саджест")
    public void testRegionSearchWithHint() {
        mainPage.header.searchInput.sendKeys("Екатеринбург");
        assertThat(mainPage.suggest.hints.get(0), hasText(startsWith("Екатеринбург")));
        mainPage.suggest.selectHint(0);
        assertThat(mainPage.title, hasText(startsWith("Погода в Екатеринбурге")));
    }
}
