package ru.yandex.weather.api;

import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.weather.api.beans.forecast.ForecastResult;
import ru.yandex.weather.utils.data.Region;

import java.net.URISyntaxException;

import static ru.yandex.weather.api.YaWeatherApiParser.getForecastResult;
import static ru.yandex.weather.api.YaWeatherURIBuilderFactory.getForecastURIByGeoId;

public class YaWeatherApi {

    @Step("Получение по api прогноза по региону {0}")
    public static ForecastResult getRegionForecast(Region region) {
        ForecastResult result = null;
        try {
            result = getForecastResult(getForecastURIByGeoId(Region.MOSCOW.id()).build().toString());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
