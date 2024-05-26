package test.kaver.eventsCatalog;

import configuration.TestName;
import org.junit.jupiter.api.Test;
import test.kaver.KaverTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventsCatalogTest extends KaverTest {
    @Test
    @TestName(value = "Выбор категории событий открывает соответствующую страницу категории")
    void eventsCategoryChangeShowsCorrectEventsCatalogCategoryTest() {
        eventsCatalogPage = mainPage.getHeaderElements().eventsBtnClick()
            .concertCategoryBtnClick();
        assertTrue(eventsCatalogPage.checkIfConcertCategoryCatalogTitleIsDisplayed());
    }
}
