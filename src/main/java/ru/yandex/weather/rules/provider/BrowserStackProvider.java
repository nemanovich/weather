package ru.yandex.weather.rules.provider;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackProvider implements WebDriverProvider {


    @Override
    public RemoteWebDriver createDriver() {
        String USERNAME = "anton1601";
        String AUTOMATE_KEY = "SpJqJCE2PjpPsbCzJXy3";
        String url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "74");
        caps.setCapability("resolution", "1280x1024");
        caps.setCapability("name", "Weather Test");
        try {
            return new RemoteWebDriver(new URL(url), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
