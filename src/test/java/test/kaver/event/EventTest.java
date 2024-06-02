package test.kaver.event;

import configuration.TestName;
import helper.Utils;
import org.junit.jupiter.api.Test;
import test.kaver.KaverTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest extends KaverTest {
    @Test
    @TestName(value = "Сохранение ссылки в буфер обмена при помощи кнопки «Копировать ссылку»")
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
