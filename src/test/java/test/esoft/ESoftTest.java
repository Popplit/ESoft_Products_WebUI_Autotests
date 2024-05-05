package test.esoft;

import org.junit.jupiter.api.BeforeEach;
import page.esoft.main.MainPage;
import page.esoft.projects.KuzbassOnlineProjectPage;
import page.esoft.resumeWindow.ResumePage;
import page.esoft.vacancy.VacancyPage;
import test.BaseTest;

import static constants.Constants.Urls.ESOFT_URL;

public class ESoftTest extends BaseTest {
    protected MainPage mainPage;
    protected KuzbassOnlineProjectPage kuzbassOnlineProjectPage;
    protected ResumePage resumePage;
    protected VacancyPage vacancyPage;

    @BeforeEach
    void init() {
        initDriver(ESOFT_URL);
        mainPage = new MainPage();
    }
}
