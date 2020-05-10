package ru.yandex.weather.views.weather;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Хидер страницы с поисковой строкой")
@FindBy(className = "yandex-header")
public class Header extends HtmlElement {

    @Name("Поисковая строка")
    @FindBy(id = "header2input")
    public TextInput searchInput;

    @Step("Ищем по запросу '{0}'")
    public void search(String searchQuery) {
        searchInput.sendKeys(searchQuery);
        searchInput.sendKeys(Keys.ENTER);
    }
}
