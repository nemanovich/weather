package ru.yandex.weather.rules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocalChromeRule extends TestWatcher implements WebDriverRule {

    private RemoteWebDriver driver;

    public LocalChromeRule() {
        WebDriverManager.chromedriver().setup();
    }

    @Override
    protected void starting(Description description) {
        getWebDriver();
    }

    @Override
    protected void finished(Description description) {
        if (driver != null && isRemoteSessionActive()) {
            driver.quit();
        }
        driver = null;
    }

    public RemoteWebDriver getWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    private boolean isRemoteSessionActive() {
        try {
            driver.getCurrentUrl();
            return true;
        } catch (WebDriverException e) {
            return false;
        }
    }
}
