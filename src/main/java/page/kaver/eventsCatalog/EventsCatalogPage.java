package page.kaver.eventsCatalog;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.ElementHelper;
import page.kaver.event.EventPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class EventsCatalogPage {
    private final SelenideElement concertCategoryBtn = $x("//span[text()='Концерты']");
    private final SelenideElement concertCategoryCatalogTitle = $x("//h1[contains(text(), 'Концерты')]");
    private final ElementsCollection eventCardsTitles = $$x("//span[contains(@class, 'line-clamp-3')]");

    public EventsCatalogPage concertCategoryBtnClick() {
        concertCategoryBtn.shouldBe(visible).click();
        return this;
    }

    public boolean checkIfConcertCategoryCatalogTitleIsDisplayed() {
        return ElementHelper.isElementDisplayed(concertCategoryCatalogTitle, 5, visible);
    }

    public EventPage eventCardClick(int index) {
        eventCardsTitles.get(index).shouldBe(visible).click();
        return new EventPage();
    }
}
