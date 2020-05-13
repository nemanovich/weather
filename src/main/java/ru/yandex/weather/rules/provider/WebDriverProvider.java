package ru.yandex.weather.rules.provider;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverProvider {
    RemoteWebDriver createDriver();
}
