package ru.yandex.weather.rules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.yandex.weather.rules.provider.BrowserStackProvider;
import ru.yandex.weather.rules.provider.LocalChromeProvider;
import ru.yandex.weather.rules.provider.LocalFirefoxProvider;
import ru.yandex.weather.rules.provider.WebDriverProvider;
import ru.yandex.weather.utils.WebDriverConfig;

import static java.util.Arrays.asList;
import static ru.yandex.weather.utils.WebDriverConfig.browserType;

public class TestRuleUtil extends TestWatcher {

    public static WebDriverRule webDriverRule() {
        WebDriverProvider provider;
        switch (browserType()) {
            case LOCAL_FIREFOX:
                FirefoxOptions options = new FirefoxOptions();
                if (StringUtils.isNoneBlank(WebDriverConfig.browserBinaryPath())) {
                    options.setBinary(WebDriverConfig.browserBinaryPath());
                }
                provider = new LocalFirefoxProvider(options.addArguments(asList("--width=1024", "--height=768")));
                WebDriverManager.firefoxdriver().setup();
                break;
            case LOCAL_CHROME:
                provider = new LocalChromeProvider();
                WebDriverManager.chromedriver().setup();
                break;
            case BROWSERSTACK:
                provider = new BrowserStackProvider();
                break;
            case DOCKER:
                return new BrowserWebDriverContainerWrapper();
            default:
                throw new UnsupportedOperationException("Browser " + browserType() + "doesn't supported");
        }

        return new BrowserRule(provider);
    }
}
