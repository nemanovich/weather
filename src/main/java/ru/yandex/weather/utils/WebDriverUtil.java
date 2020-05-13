package ru.yandex.weather.utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static java.time.Duration.ofSeconds;
import static org.awaitility.Awaitility.await;

public class WebDriverUtil {

    public static void switchToNextTab(WebDriver driver) {
        await().timeout(ofSeconds(5)).until(() -> driver.getWindowHandles().size() > 1);
        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(1));
    }
}
