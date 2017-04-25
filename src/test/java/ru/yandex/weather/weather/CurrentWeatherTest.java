package ru.yandex.weather.weather;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.weather.utils.data.Region;
import ru.yandex.weather.utils.rules.DriverRule;
import ru.yandex.weather.views.MainPage;

import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.hasText;
import static ru.yandex.weather.api.YaWeatherApi.getRegionForecast;
import static ru.yandex.weather.utils.FrontendURIFactory.getRegionUrl;
import static ru.yandex.weather.utils.data.Region.MOSCOW;
import static ru.yandex.weather.utils.matchers.TemperatureMatcher.isTemperature;

@Features("Текущая погода")
@Stories("Значения погоды")
public class CurrentWeatherTest {
    private static final Region REGION = MOSCOW;

    @Rule
    public DriverRule driver = new DriverRule();
    private MainPage mainPage = new MainPage(driver.getWebDriver());

    @Before
    public void openMainPage() {
        driver.open(getRegionUrl(REGION));
    }

    @Test
    @Title("Текущая температура")
    public void testCurrentTemperature() {
        int expectedTemp = getRegionForecast(REGION).getFact().getTemp();

        assertThat(mainPage.getCurrentWeather().getTempNow(), hasText(isTemperature(expectedTemp).withDegree()));
    }
}
