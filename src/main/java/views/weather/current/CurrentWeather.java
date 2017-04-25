package views.weather.current;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Погода сегодня")
@FindBy(className = "current-weather")
public class CurrentWeather extends HtmlElement {

    @Name("Температура сейчас")
    @FindBy(className = "current-weather__thermometer_type_now")
    private HtmlElement tempNow;

    public HtmlElement getTempNow() {
        return tempNow;
    }
}