package ru.yandex.weather.views.weather.detailed;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Блок погоды каждого дня в подробном прогнозе")
@FindBy(className = "forecast-detailed__day-info")
public class DetailedForecastInfoItem extends HtmlElement {

    private List<DetailedDayTime> dayTimes;

    public List<DetailedDayTime> getDayTimes() {
        return dayTimes;
    }
}
