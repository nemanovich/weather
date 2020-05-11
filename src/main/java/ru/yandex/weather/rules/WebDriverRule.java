package ru.yandex.weather.rules;

import org.junit.rules.TestRule;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverRule extends TestRule {

    RemoteWebDriver getWebDriver();
}
