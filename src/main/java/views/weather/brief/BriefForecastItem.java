package views.weather.brief;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Блок дня в кратком прогнозе погоды")
@FindBy(css = ".forecast-brief__item.day-anchor")
public class BriefForecastItem extends HtmlElement {

    @Name("Дневная температура в виджете короткого прогноза")
    @FindBy(className = "forecast-brief__item-temp-day")
    private HtmlElement dayTemp;

    public HtmlElement getDayTemp() {
        return dayTemp;
    }
}
