package ru.yandex.weather.views.weather.monthly;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Прогноз погоды подробно")
@FindBy(className = "climate-calendar")
public class MonthlyCalendar extends HtmlElement {

    @Name("Блок текущего дня")
    @FindBy(className = "climate-calendar-day_current_day")
    public MonthlyCalendarDay currentDay;

    @Name("Блок недели в месячном прогнозе")
    @FindBy(css = "[class=climate-calendar__row]")
    public List<MonthlyCalendarWeek> weeks;

    @Name("Блок дня в месячном прогнозе")
    @FindBy(className = "climate-calendar__cell")
    public static class MonthlyCalendarDay extends HtmlElement {

        @Name("Значение дня")
        @FindBy(className = "climate-calendar-day__day")
        public HtmlElement dayValue;
    }

    public static class MonthlyCalendarWeek extends HtmlElement {

        public List<MonthlyCalendarDay> days;
    }
}