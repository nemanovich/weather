package views;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Хидер страницы с поисковой строкой")
@FindBy(className = "header2")
public class Header extends HtmlElement {

    @Name("Поисковая строка")
    @FindBy(id = "header2input")
    private TextInput searchInput;

    @Name("Кнопка поиска")
    @FindBy(className = "suggest2-form__button")
    private Button searchButton;

    @Step("Ищем по запросу '{0}'")
    public void search(String searchQuery) {
        searchInput.sendKeys(searchQuery);
        searchButton.click();
    }

    public Button getSearchButton() {
        return searchButton;
    }

    public TextInput getSearchInput() {
        return searchInput;
    }
}
