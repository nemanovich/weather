package views;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Попап 'Другой город'")
@Block(@FindBy(className = "b-menu_type_city-switcher"))
public class CitySwitcherPopup extends HtmlElement {

    @Name("Список ссылок на страницы городов")
    @FindBy(className = "b-link_type_with-temperature")
    private List<WebElement> cityLinks;

    public List<WebElement> getCityLinks() {
    	return cityLinks;
    }
}