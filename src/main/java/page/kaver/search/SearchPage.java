package page.kaver.search;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement placesRadioBtn = $x("//span[text()='В местах']");
    private final SelenideElement searchTextBox = $x("//input[@type='text']");
    private final ElementsCollection placesTitles = $$x("//p[contains(@class, 'font-bold')]");

    public SearchPage placesRadioBtnClick() {
        placesRadioBtn.shouldBe(visible).click();
        return this;
    }

    public SearchPage typeInSearchTextBox(String placeName) {
        searchTextBox.shouldBe(visible).sendKeys(placeName);
        return this;
    }

    public String getPlaceTitle(int index) {
        return placesTitles.get(index).shouldBe(visible).getText();
    }
}
