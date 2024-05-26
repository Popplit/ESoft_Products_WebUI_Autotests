package test.esoft.vacancy;

import configuration.TestName;
import org.junit.jupiter.api.Test;
import test.esoft.ESoftTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacancyTest extends ESoftTest {
    @Test
    @TestName(value = "Переход на соответствующую подробную страницу вакансии")
    void vacancyButtonClickLeadsToCorrectVacancyPageTest() {
        mainPage = mainPage.vacanciesBtnClick();
        String firstVacancyTitle = mainPage.getFirstVacancyTitle();
        vacancyPage = mainPage.firstVacancyBtnClick();
        String vacancyHeader = vacancyPage.getVacancyHeaderText();
        assertEquals(firstVacancyTitle, vacancyHeader);
    }
}
