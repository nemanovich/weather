package ru.yandex.weather;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.weather.utils.rules.DriverRule;
import ru.yandex.weather.views.MainPage;

import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WrapsElementMatchers.isDisplayed;
import static ru.yandex.weather.utils.FrontendURIFactory.getRegionUrl;
import static ru.yandex.weather.utils.data.Region.MOSCOW;

@Features("Яндекс.Директ")
@Stories("Отображение блоков на главной странице")
public class AdsTest {

    @Rule
    public DriverRule driver = new DriverRule();
    private MainPage mainPage = new MainPage(driver.getWebDriver());

    @Before
    public void openMainPage() {
        driver.open(getRegionUrl(MOSCOW));
    }

    @Test
    @Title("Отображение блоков директа на странице")
    public void testYaDirectBlocks() {
        assertThat("Верхний блок директа не отображается", mainPage.getTopYaDirect(), isDisplayed());
        assertThat("Нижний блок директа не отображается", mainPage.getBottomYaDirect(), isDisplayed());
    }
}
