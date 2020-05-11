package ru.yandex.weather.rules;

import org.junit.rules.TestWatcher;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.weather.utils.WebDriverConfig;

public class TestRuleUtil extends TestWatcher {

    public static WebDriverRule webDriverRule() {
        if (WebDriverConfig.useDocker()) {
            return (BrowserWebDriverContainerWrapper) new BrowserWebDriverContainerWrapper()
                    .withCapabilities(new ChromeOptions());
        } else {
            return new LocalChromeRule();
        }
    }
}
