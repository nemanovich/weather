package ru.yandex.weather.api;

import com.google.gson.Gson;
import ru.yandex.weather.api.beans.forecast.ForecastResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class YaWeatherApiParser {

    public static ForecastResult getForecastResult(String url) {
        ForecastResult result = null;
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            result = new Gson().fromJson(rd, ForecastResult.class);
        } catch (IOException e) {
            throw new RuntimeException("Cannot parse gson from " + url, e);
        }
        return result;
    }
}
