package views;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import support.DriverFactory;

public class MainPage extends PageFactory {

	private TodayWeather weatherToday;
	private ShortDayForcast shortDayForcastWidget;
	private SearchHintPopup searchHintPopup;
	private CitySwitcherPopup citySwitcherPopup;

	@FindBy(className = "b-form-input__input")
	private TextInput searchInput;

	@FindBy(className = "b-form-button__input")
	private Button searchButton;

	@FindBy(className = "b-navigation-city__city")
	private WebElement cityTitle;

	@FindBy(className = "b-pseudo-button_is-bem_yes")
	private Button citySwitcherButton;

	@FindBy(xpath = ".//*[contains(@id, 'yandex_ad')]")
	private WebElement topYandexDirect;

	@FindBy(id = "b-direct")
	private WebElement verticalYandexDirect;

	@FindBy(xpath = ".//*[contains(@class, 'b-form-radio__radio') and @value='detailed']/following-sibling::*")
	private WebElement detailedForecastTab;

	@FindBy(className = "b-forecast-detailed__data")
	private WebElement detailedWeatherTable;

	@FindBy(xpath = ".//*[@class ='b-forecast-detailed__item b-t_c_4']")
	private List<WebElement> detailedWeatherDescriptions;

	public MainPage() {
		PageFactory.initElements(
				new HtmlElementDecorator(DriverFactory.getDriver()), this);
	}

	@Step("Открыть страницу http://pogoda.yandex.ru/'{0}'")
	public void loadPage(String region_url) {
		DriverFactory.getDriver().get("http://pogoda.yandex.ru/" + region_url);
	}

	@Step("Ввод в поисковую строку '{0}' и клик по кнопке 'Найти'")
	public void search(String searchQuery) {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(ExpectedConditions.visibilityOf(searchInput
						.getWrappedElement())).sendKeys(searchQuery);
		searchButton.click();
		waitUntilSearchCompleted();
	}

	@Step("Кликнуть на таб 'Кратко'")
	public void selectDetailedForecast() {
		new WebDriverWait(DriverFactory.getDriver(), 10).until(
				ExpectedConditions.visibilityOf(detailedForecastTab)).click();
	}

	@Step("Кликнуть на кнопку 'Другой город'")
	public void openCitySwitcherPopup() {
		new WebDriverWait(DriverFactory.getDriver(), 10).until(
				ExpectedConditions.visibilityOf(citySwitcherButton
						.getWrappedElement())).click();
	}

	public void waitUntilSearchCompleted() {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(new ExpectedCondition<Boolean>() {
					@Override
					public Boolean apply(WebDriver d) {
						return searchInput.getText().isEmpty();
					}
				});
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public TextInput getSearchInput() {
		return searchInput;
	}

	public String getCityTitle() {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(ExpectedConditions.visibilityOf(cityTitle));
		return cityTitle.getText();
	}

	public TodayWeather getWeatherToday() {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(ExpectedConditions.visibilityOf(weatherToday));
		return weatherToday;
	}

	public WebElement getTopYandexDirect() {
		new WebDriverWait(DriverFactory.getDriver(), 5)
				.until(ExpectedConditions.visibilityOf(topYandexDirect));
		return topYandexDirect;
	}

	public WebElement getVerticalYandexDirect() {
		new WebDriverWait(DriverFactory.getDriver(), 5)
				.until(ExpectedConditions.visibilityOf(verticalYandexDirect));
		return verticalYandexDirect;
	}

	public ShortDayForcast getShortDayForcastWidget() {
		return shortDayForcastWidget;
	}

	// TODO: вынести в отдельный виджет, реализовать разбиение блоков по дням,
	// строк по временным промежуткам дня
	public String getDetailedWeatherDescription(int index) {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(ExpectedConditions.visibilityOf(detailedWeatherTable));
		return detailedWeatherDescriptions.get(index).getText();
	}

	public List<WebElement> getSearchHints() {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(ExpectedConditions.visibilityOf(searchHintPopup));
		return searchHintPopup.getHintsList();
	}

	public Button getCitySwitcherButton() {
		return citySwitcherButton;
	}

	public CitySwitcherPopup getCitySwitcherPopup() {
		new WebDriverWait(DriverFactory.getDriver(), 10)
				.until(ExpectedConditions.visibilityOf(citySwitcherPopup));
		return citySwitcherPopup;
	}
}
