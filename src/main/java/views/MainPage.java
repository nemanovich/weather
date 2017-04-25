package views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import views.weather.brief.BriefForcast;
import views.weather.current.CurrentWeather;
import views.weather.detailed.DetailedForecast;

public class MainPage {

    private Header header;
    private CurrentWeather currentWeather;
    private BriefForcast briefForcast;
    private DetailedForecast detailedForcast;
    private Suggest suggest;
    private CitySwitcherPopup citySwitcherPopup;

    @FindBy(css = ".navigation-city .title")
    private HtmlElement cityTitle;

    @FindBy(className = "button_choose-city")
    private Button citySwitcherButton;

    @Name("Верхний блок Директа")
    @FindBy(className = "adv_pos_top")
    private HtmlElement topYaDirect;

    @Name("Нижний блок Директа")
    @FindBy(className = "adv_pos_bottom")
    private HtmlElement bottomYaDirect;

    @FindBy(className = "radio-button__radio_side_right")
    private HtmlElement detailedForecastTab;

    public MainPage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }

    @Step("Кликнуть на таб 'Подробно'")
    public void selectDetailedForecast() {
        detailedForecastTab.click();
    }

    @Step("Кликнуть на кнопку 'Другой город'")
    public void openCitySwitcherPopup() {
        citySwitcherButton.click();
    }

    public Header getHeader() {
        return header;
    }

    public HtmlElement getCityTitle() {
        return cityTitle;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public HtmlElement getTopYaDirect() {
        return topYaDirect;
    }

    public HtmlElement getBottomYaDirect() {
        return bottomYaDirect;
    }

    public DetailedForecast getDetailedForcast() {
        return detailedForcast;
    }

    public CitySwitcherPopup getCitySwitcherPopup() {
        return citySwitcherPopup;
    }

    public BriefForcast getBriefForcast() {
        return briefForcast;
    }

    public Suggest getSuggest() {
        return suggest;
    }
}
