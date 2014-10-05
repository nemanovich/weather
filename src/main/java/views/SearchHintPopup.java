package views;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Попап с поисковыми подсказками")
@Block(@FindBy(className = "b-form-input__popup_head-search_yes"))
public class SearchHintPopup extends HtmlElement {

	@Name("Список подсказок")
	@FindBy(className = "b-autocomplete-item")
	private List<WebElement> hints;

	public List<WebElement> getHintsList() {
		return hints;
	}
}