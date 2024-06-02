package test.esoft.resumeWindow;

import configuration.TestName;
import org.junit.jupiter.api.Test;
import test.esoft.ESoftTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResumeTest extends ESoftTest {
    @Test
    @TestName(value = "Отправка формы «Анкета-резюме» с неполным номером телефона")
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
