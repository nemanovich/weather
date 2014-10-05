package views;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Прогноз погоды кратко")
@Block(@FindBy(className = "b-forecast_line_9"))
public class ShortDayForcast extends HtmlElement {

    @Name("Дневная температура")
    @FindBy(className = "b-forecast__tday")
    private List<WebElement> dayTemparature;

    public List<WebElement> getDayTemparature() {
    	return dayTemparature;
    }
    
    @Step("Получить дневную температуру '{0}' дня от текущего")
    public String getDayTemparature(int index) {
    	return dayTemparature.get(index).getText();
    }
}