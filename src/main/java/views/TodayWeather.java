package views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Погода сегодня")
@Block(@FindBy(className = "l-layout_layout_current-weather"))
public class TodayWeather extends HtmlElement {

	@Name("Температура сейчас")
	@FindBy(className = "b-thermometer__now")
	private WebElement temperatureNow;

	public String getCurrentTemperature() {
		return temperatureNow.getText();
	}
}