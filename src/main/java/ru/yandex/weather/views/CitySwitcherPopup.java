package ru.yandex.weather.views;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Попап 'Другой город'")
@FindBy(className = "navigation-city__last-cities")
public class CitySwitcherPopup extends HtmlElement {

    @Name("Ссылки на страницы регионов в попапе 'Другой город'")
    @FindBy(className = "last-cities__item")
    private List<Item> regions;

    public List<Item> getRegions() {
        return regions;
    }

    @Step("Выбрать {0} по порядку регион (индекс c 0)")
    public void selectRegion(int index) {
        getRegions().get(index).click();
    }

    public static class Item extends HtmlElement {

        @Name("Названия городов в попапе 'Другой город'")
        @FindBy(className = "last-cities__name")
        private HtmlElement title;

        public HtmlElement getTitle() {
            return title;
        }
    }
}