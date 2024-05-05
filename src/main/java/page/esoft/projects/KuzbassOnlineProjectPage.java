package page.esoft.projects;

import com.codeborne.selenide.SelenideElement;
import helper.ElementHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class KuzbassOnlineProjectPage {
    private final SelenideElement projectHeader = $x("//div[@field='title' and text()='Кузбасс Онлайн']");

    public boolean checkIfProjectHeaderIsDisplayed() {
        return ElementHelper.isElementDisplayed(projectHeader, 10, visible);
    }
}
