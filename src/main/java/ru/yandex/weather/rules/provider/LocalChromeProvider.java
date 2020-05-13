package ru.yandex.weather.rules.provider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocalChromeProvider implements WebDriverProvider {

    private ChromeOptions chromeOptions;

    public LocalChromeProvider() {
        this.chromeOptions = new ChromeOptions();
    }

    public LocalChromeProvider(ChromeOptions chromeOptions) {
        this.chromeOptions = chromeOptions;
    }

    @Override
    public RemoteWebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
}
