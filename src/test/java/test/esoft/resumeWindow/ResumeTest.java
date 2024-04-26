package test.esoft.resumeWindow;

import org.junit.jupiter.api.Test;
import test.esoft.ESoftTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResumeTest extends ESoftTest {
    @Test
    void sendResumeWithNotFullPhoneNumberTest() {
        resumePage = mainPage.sendResumeBtnClick();
        mainPage = resumePage.setYourNameTextBox("Тестовый тест")
                .setPhoneNumberTextBox("999999999")
                .setJobTextBox("Тестировщик")
                .setAboutYourselfTextBox("Я тестирую эту форму")
                .sendBtnClick();
        assertTrue(resumePage.checkIfValueTooShortMessageIsDisplayed());
    }
}
