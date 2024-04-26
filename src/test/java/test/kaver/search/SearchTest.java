package test.kaver.search;

import org.junit.jupiter.api.Test;
import test.kaver.KaverTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest extends KaverTest {
    @Test
    void searchForSpecificPlaceTest() {
        mainPage = mainPage.getHeaderElements().changeCityToKemerovo();
        searchPage = mainPage.getHeaderElements().searchBtnClick();
        String expectedPlaceName = "Hashtag";
        String firstPlaceTitle = searchPage.placesRadioBtnClick()
            .typeInSearchTextBox(expectedPlaceName)
            .getPlaceTitle(0);
        assertEquals(expectedPlaceName, firstPlaceTitle);
    }
}
