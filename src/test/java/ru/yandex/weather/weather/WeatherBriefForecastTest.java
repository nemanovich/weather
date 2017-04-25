package ru.yandex.weather.weather;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.weather.utils.data.Region;
import ru.yandex.weather.utils.rules.DriverRule;
import views.MainPage;
import views.weather.brief.BriefForcast;

import java.util.Collection;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.hasText;
import static ru.yandex.weather.api.YaWeatherApi.getRegionForecast;
import static ru.yandex.weather.utils.FrontendURIFactory.getRegionUrl;
import static ru.yandex.weather.utils.data.Region.MOSCOW;
import static ru.yandex.weather.utils.matchers.TemperatureMatcher.isTemperature;

@Features("Краткий прогноз погоды")
@Stories("Значения прогноза")
@RunWith(Parameterized.class)
public class WeatherBriefForecastTest {
    private static final Region REGION = MOSCOW;

    @Rule
    public DriverRule driver = new DriverRule();
    private BriefForcast briefForcast = new MainPage(driver.getWebDriver()).getBriefForcast();

    private int index;

    @Parameterized.Parameters(name = "in day {0}")
    public static Collection<Object[]> getDayForecast() throws Exception {
        return IntStream.range(1, 10).mapToObj(i -> new Object[]{i}).collect(toList());
    }

    public WeatherBriefForecastTest(int index) {
        this.index = index;
    }

    @Before
    public void openMainPage() {
        driver.open(getRegionUrl(REGION));
    }

    @Test
    @Description("Максимальная дневная температура")
    public void testMaxDayTemperature() {
        int t = getRegionForecast(REGION).getForecasts().get(index).getParts().getDay().getTempMax();
        assertThat("неверная дневная температура в столбце №" + (index + 1),
                briefForcast.getItems().get(index).getDayTemp(),
                hasText(isTemperature(t))
        );
    }
}
