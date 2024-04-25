package page.esoft.vacancy;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class VacancyPage {
    private final SelenideElement vacancyHeader = $x("//div[@field='tn_text_1685433547348']");

    public String getVacancyHeaderText() {
        return vacancyHeader.shouldBe(visible).getText().replaceAll("[\n]", " ");
    }
}
