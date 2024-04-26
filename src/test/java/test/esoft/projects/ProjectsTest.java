package test.esoft.projects;

import org.junit.jupiter.api.Test;
import test.esoft.ESoftTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectsTest extends ESoftTest {
    @Test
    void kuzbassOnlineProjectButtonLeadsToCorrectPageTest() {
        kuzbassOnlineProjectPage = mainPage.projectsBtnClick()
            .kuzbassOnlineProjectBtnClick();
        assertTrue(kuzbassOnlineProjectPage.checkIfProjectHeaderIsDisplayed());
    }
}
