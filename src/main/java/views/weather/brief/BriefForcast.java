package views.weather.brief;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Прогноз погоды кратко")
@FindBy(className = "forecast-brief")
public class BriefForcast extends HtmlElement {

    private List<BriefForecastItem> items;

    public List<BriefForecastItem> getItems() {
        return items;
    }
}