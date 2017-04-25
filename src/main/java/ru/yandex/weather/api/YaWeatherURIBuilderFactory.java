package ru.yandex.weather.api;

import org.apache.http.client.utils.URIBuilder;

public class YaWeatherURIBuilderFactory {

    private static URIBuilder getBuilderTemplate() {
        return new URIBuilder()
                .setScheme("https")
                .setHost("api.weather.yandex.ru/");
    }

    public static URIBuilder getForecastURI() {
        return getBuilderTemplate().setPath("v1/forecast");
    }

    public static URIBuilder getForecastURIByGeoId(int id) {
        return getForecastURI().addParameter("geoid", String.valueOf(id)).addParameter("l10n", "true");
    }
}