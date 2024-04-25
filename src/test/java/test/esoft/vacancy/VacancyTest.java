package test.esoft.vacancy;

import org.junit.jupiter.api.Test;
import test.esoft.ESoftTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacancyTest extends ESoftTest {
    @Test
    void vacancyButtonClickLeadsToCorrectVacancyPage() {
        mainPage = mainPage.vacanciesBtnClick();
        String firstVacancyTitle = mainPage.getFirstVacancyTitle();
        vacancyPage = mainPage.firstVacancyBtnClick();
        String vacancyHeader = vacancyPage.getVacancyHeaderText();
        assertEquals(firstVacancyTitle, vacancyHeader);
    }
}
