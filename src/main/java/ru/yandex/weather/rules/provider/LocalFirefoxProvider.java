package ru.yandex.weather.rules.provider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocalFirefoxProvider implements WebDriverProvider {

    private FirefoxOptions firefoxOptions;

    public LocalFirefoxProvider() {
        this.firefoxOptions = new FirefoxOptions();
    }

    public LocalFirefoxProvider(FirefoxOptions firefoxOptions) {
        this.firefoxOptions = firefoxOptions;
    }

    @Override
    public RemoteWebDriver createDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(firefoxOptions);
    }
}
