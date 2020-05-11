package ru.yandex.weather.utils;

import com.typesafe.config.ConfigFactory;

public class WebDriverConfig {

    public static boolean useDocker() {
        return ConfigFactory.load().getBoolean("webdriver.docker.enable");
    }
}