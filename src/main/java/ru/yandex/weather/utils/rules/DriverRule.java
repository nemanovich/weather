package ru.yandex.weather.utils.rules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class DriverRule extends TestWatcher {

    private WebDriver driver;

    public DriverRule() {
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

    public WebDriver getWebDriver() {
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

    @Step("Открыть страницу {0}")
    public void open(String url) {
        getWebDriver().get(url);
    }
}
