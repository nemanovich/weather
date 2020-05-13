package ru.yandex.weather.utils;

import com.typesafe.config.ConfigFactory;


public class WebDriverConfig {

    public static String browserBinaryPath() {
        if (ConfigFactory.load().hasPath("webdriver.browser.binary.path")) {
            return ConfigFactory.load().getString("webdriver.browser.binary.path");
        } else {
            return "";
        }
    }

    public static BrowserType browserType() {
        return ConfigFactory.load().getEnum(BrowserType.class, "webdriver.browser.type");
    }
}