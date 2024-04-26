package test.kaver.eventsCatalog;

import org.junit.jupiter.api.Test;
import test.kaver.KaverTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventsCatalogTest extends KaverTest {
    @Test
    void eventsCategoryChangeShowsCorrectEventsCatalogCategoryTest() {
        eventsCatalogPage = mainPage.getHeaderElements().eventsBtnClick()
            .concertCategoryBtnClick();
        assertTrue(eventsCatalogPage.checkIfConcertCategoryCatalogTitleIsDisplayed());
    }
}
