package page.kaver.header;

import com.codeborne.selenide.SelenideElement;
import page.kaver.eventsCatalog.EventsCatalogPage;
import page.kaver.main.MainPage;
import page.kaver.search.SearchPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderElements {
    private final SelenideElement changeCityBtn = $x("//button[text()='Санкт‑Петербург']");
    private final SelenideElement cityKemerovoBtn = $x("//*[@id='headlessui-menu-item-6']");
    private final SelenideElement searchBtn = $x("//a[contains(@href, '/search')]");
    private final SelenideElement eventsBtn = $x("//a[text()='События']");

    public MainPage changeCityToKemerovo() {
        changeCityBtn.shouldBe(visible).click();
        cityKemerovoBtn.shouldBe(visible).click();
        return new MainPage();
    }

    public SearchPage searchBtnClick() {
        searchBtn.shouldBe(visible).click();
        return new SearchPage();
    }

    public EventsCatalogPage eventsBtnClick() {
        eventsBtn.shouldBe(visible).click();
        return new EventsCatalogPage();
    }
}
