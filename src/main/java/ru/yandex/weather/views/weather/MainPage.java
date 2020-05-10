package ru.yandex.weather.views.weather;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.weather.views.weather.brief.BriefForecast;

public class MainPage {

    public Header header;
    public BriefForecast briefForecast;
    public Suggest suggest;

    @FindBy(className = "header-title")
    public HtmlElement title;

    @FindBy(className = "radio-button__radio_side_right")
    public HtmlElement detailedForecastTab;

    public MainPage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }

    @Step("Кликнуть на таб 'Подробно'")
    public void selectDetailedForecast() {
        detailedForecastTab.click();
    }

}
