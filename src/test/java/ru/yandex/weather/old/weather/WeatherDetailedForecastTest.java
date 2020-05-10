package ru.yandex.weather.old.weather;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.weather.api.YaWeatherApi;
import ru.yandex.weather.api.beans.forecast.ForecastResult;
import ru.yandex.weather.utils.data.Region;
import ru.yandex.weather.utils.rules.DriverRule;
import ru.yandex.weather.views.MainPage;

import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.hasText;
import static ru.yandex.weather.utils.FrontendURIFactory.getRegionUrl;
import static ru.yandex.weather.utils.data.Region.MOSCOW;

@Features("Подробный прогноз погоды")
@Stories("Значения прогноза")
public class WeatherDetailedForecastTest {
    private static final Region REGION = MOSCOW;
    private ForecastResult forecast;

    @Rule
    public DriverRule driver = new DriverRule();
    private MainPage mainPage = new MainPage(driver.getWebDriver());

    @Before
    public void openMainPage() {
        forecast = YaWeatherApi.getRegionForecast(MOSCOW);

        driver.open(getRegionUrl(REGION));
        mainPage.selectDetailedForecast();
    }

    @Ignore
    @Test
    @Title("Описание прогноза погоды на ближайшее утро")
    public void testDetailedMorningForecastDescription() {
        String conditionEng = forecast.getForecasts().get(0).getParts().getMorning().getCondition();

        assertThat(
                "неверное описание прогноза погоды в первой строке подробного виджета",
                mainPage.detailedForcast.getDaysInfoItems().get(0).getDayTimes().get(0).getCondition(),
                hasText(forecast.getLocalization().get(conditionEng))
        );
    }
}
