package ru.yandex.weather.utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class WebDriverUtil {

    public static void switchToNextTab(WebDriver driver) {
        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(1));
    }
}
