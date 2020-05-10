package ru.yandex.weather.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.weather.views.weather.brief.BriefForcast;
import ru.yandex.weather.views.weather.current.CurrentWeather;
import ru.yandex.weather.views.weather.detailed.DetailedForecast;

public class MainPage {

    public Header header;
    public CurrentWeather currentWeather;
    public BriefForcast briefForcast;
    public DetailedForecast detailedForcast;
    public Suggest suggest;

    @FindBy(className = "header-title")
    public HtmlElement title;

    @Name("Верхний блок Директа")
    @FindBy(className = "adv_pos_top")
    public HtmlElement topYaDirect;

    @Name("Нижний блок Директа")
    @FindBy(className = "adv_pos_bottom")
    public HtmlElement bottomYaDirect;

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
