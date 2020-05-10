package ru.yandex.weather.views.portal;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Попап в 'еще'")
@FindBy(className = "home-tabs3__more-top")
public class MoreTabPopup extends HtmlElement {

    @Name("Элементы поискового саджеста")
    @FindBy(css = "a[data-id=pogoda]")
    public HtmlElement weatherItem;

}