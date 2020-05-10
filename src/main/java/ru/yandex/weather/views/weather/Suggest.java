package ru.yandex.weather.views.weather;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Поисковый саджест")
@FindBy(className = "suggest2__content")
public class Suggest extends HtmlElement {

    @Name("Элементы поискового саджеста")
    @FindBy(className = "suggest2-item")
    public List<HtmlElement> hints;

    @Step("Выбрать {0} по порядку подсказку (индекс c 0)")
    public void selectHint(int index) {
        hints.get(index).click();
    }
}