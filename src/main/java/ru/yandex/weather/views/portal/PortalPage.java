package ru.yandex.weather.views.portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class PortalPage {

    public MoreTabPopup moreTabPopup;

    @Name("Еще в меню")
    @FindBy(className = "home-tabs3__more-switcher")
    public HtmlElement moreSwitcher;

    public PortalPage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }

}
