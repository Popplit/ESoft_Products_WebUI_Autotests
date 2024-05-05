package test.kaver.event;

import helper.Utils;
import org.junit.jupiter.api.Test;
import test.kaver.KaverTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest extends KaverTest {
    @Test
    void copyLinkBtnSavingEventLinkToClipboardTest() {
        eventsCatalogPage = mainPage.getHeaderElements().eventsBtnClick();
        int eventCardIndex = 1;
        eventPage = eventsCatalogPage.eventCardClick(eventCardIndex);
        shareEventPage = eventPage.shareBtnClick()
            .copyLinkBtnClick();
        String expectedUrl = Utils.getCurrentUrl();
        String actualUrl = Utils.getTextFromClipboard();
        assertEquals(expectedUrl, actualUrl);
    }
}
