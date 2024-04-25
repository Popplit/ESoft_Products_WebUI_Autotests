package page.esoft.main;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import page.esoft.vacancy.VacancyPage;
import page.esoft.projects.KuzbassOnlineProjectPage;
import page.esoft.resumeWindow.ResumePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement sendResumeBtn = $x("//div[@data-elem-id='1668440193370']");
    private final ElementsCollection vacancyBtns = $$x("//div[@class='t993__btn-text-title']");
    private final SelenideElement projectsBtn = $x("//a[text()='Проекты']");
    private final SelenideElement vacanciesBtn = $x("//a[text()='Вакансии']");
    private final SelenideElement kuzbassOnlineProjectBtn = $x("//div[@data-elem-id='1675309060941']");

    public ResumePage sendResumeBtnClick() {
        sendResumeBtn.shouldBe(visible).click();
        return new ResumePage();
    }

    public String getFirstVacancyTitle() {
        return vacancyBtns.first().getText();
    }

    public VacancyPage firstVacancyBtnClick() {
        vacancyBtns.first().shouldBe(visible).click();
        switchTo().window(1);
        return new VacancyPage();
    }

    public MainPage projectsBtnClick() {
        projectsBtn.shouldBe(visible).click();
        return this;
    }

    public MainPage vacanciesBtnClick() {
        vacanciesBtn.shouldBe(visible).click();
        return this;
    }

    public KuzbassOnlineProjectPage kuzbassOnlineProjectBtnClick() {
        kuzbassOnlineProjectBtn.shouldBe(visible).click();
        return new KuzbassOnlineProjectPage();
    }
}
