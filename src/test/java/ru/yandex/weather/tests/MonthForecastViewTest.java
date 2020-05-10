package ru.yandex.weather.tests;

import org.junit.Rule;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.weather.utils.rules.DriverRule;
import ru.yandex.weather.views.portal.PortalPage;
import ru.yandex.weather.views.weather.MainPage;
import ru.yandex.weather.views.weather.monthly.MonthlyForecastPage;

import static java.time.OffsetDateTime.now;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.hasText;
import static ru.yandex.weather.utils.WebDriverUtil.switchToNextTab;

@Features("Месячный календарь")
@Stories("Отображение блоков на главной странице")
public class MonthForecastViewTest {

    @Rule
    public DriverRule driver = new DriverRule();

    private PortalPage portalPage = new PortalPage(driver.getWebDriver());
    private MainPage mainPage = new MainPage(driver.getWebDriver());
    private MonthlyForecastPage monthPage = new MonthlyForecastPage(driver.getWebDriver());

    @Test
    @Title("Отображение текущмесячного календаря")
    public void testCurrentDay() {
        driver.open("https://yandex.ru/");

        portalPage.moreSwitcher.click();
        portalPage.moreTabPopup.weatherItem.click();
        switchToNextTab(driver.getWebDriver());
        mainPage.briefForecast.monthForecastLink.click();

        assertThat(monthPage.calendar.weeks, hasSize(5));
        assertThat(monthPage.calendar.currentDay.dayValue, hasText(String.valueOf(now().getDayOfMonth())));

        assertThat(monthPage.calendar.currentDay.dayValue.getCssValue("background-color"), is("rgba(246, 96, 73, 1)"));
        assertThat(monthPage.calendar.currentDay.dayValue.getCssValue("width"), is("28px"));
        assertThat(monthPage.calendar.currentDay.dayValue.getCssValue("height"), is("28px"));
    }
}
