package ru.yandex.weather.views.weather.monthly;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class MonthlyForecastPage {

    public MonthlyCalendar calendar;

    public MonthlyForecastPage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }

}
