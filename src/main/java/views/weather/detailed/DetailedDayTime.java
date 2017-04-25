package views.weather.detailed;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Погода по времени суток в виджете подробного прогноза")
@FindBy(className = "weather-table__row")
public class DetailedDayTime extends HtmlElement {

    @Name("Описание погоды в строках в виджете подробного прогноза")
    @FindBy(className = "weather-table__body-cell_type_condition")
    private HtmlElement condition;

    public HtmlElement getCondition() {
        return condition;
    }
}
