package ru.yandex.weather.utils.rules;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.yandex.qatools.allure.annotations.Step;

import static org.openqa.selenium.remote.DesiredCapabilities.firefox;

public class DriverRule extends TestWatcher {

    private WebDriver driver;
    private DesiredCapabilities caps;

    public DriverRule() {
        this(firefox());
    }

    public DriverRule(DesiredCapabilities caps) {
        this.caps = caps;
    }

    public DriverRule(WebDriver webDriver) {
        this.driver = webDriver;
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

    public WebDriver getWebDriver() {
        if (driver == null) {
            driver = new RemoteWebDriver(firefox());
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

    @Step("Открыть страницу {0}")
    public void open(String url) {
        getWebDriver().get(url);
    }
}
