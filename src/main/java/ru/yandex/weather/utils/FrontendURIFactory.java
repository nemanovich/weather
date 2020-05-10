package ru.yandex.weather.utils;

import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;

public class FrontendURIFactory {

    private static URIBuilder getTemplate() {
        return new URIBuilder().setScheme("https").setHost("yandex.ru/");
    }

    public static String getRegionUrl(String regionUrl) {
        try {
            return getTemplate().setPath("pogoda/" + regionUrl).build().toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException("Cannot parse uri from resource " + regionUrl, e);
        }
    }
}