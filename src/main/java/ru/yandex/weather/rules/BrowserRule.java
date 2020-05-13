package ru.yandex.weather.rules;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.yandex.weather.rules.provider.WebDriverProvider;

public class BrowserRule extends TestWatcher implements WebDriverRule {

    private final WebDriverProvider provider;
    private RemoteWebDriver driver;

    public BrowserRule(WebDriverProvider provider) {
        this.provider = provider;
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
            driver = provider.createDriver();
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
