package ru.yandex.weather.views.weather.brief;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Прогноз погоды кратко")
@FindBy(className = "forecast-briefly")
public class BriefForecast extends HtmlElement {

    @Name("Прогноз погоды на месяц")
    @FindBy(linkText = "На месяц")
    public HtmlElement monthForecastLink;

    public List<BriefForecastItem> items;

}