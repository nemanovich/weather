package ru.yandex.weather.views.weather.detailed;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Прогноз погоды подробно")
@FindBy(className = "forecast-detailed")
public class DetailedForecast extends HtmlElement {

    private List<DetailedForecastInfoItem> daysInfoItems;

    public List<DetailedForecastInfoItem> getDaysInfoItems() {
        return daysInfoItems;
    }
}