package page.identicalKemerovo.header;

import com.codeborne.selenide.SelenideElement;
import page.identicalKemerovo.catalog.CatalogPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderElements {
    private final SelenideElement eShopBtn = $x("(//a[contains(@class, t-menu__link-item) and text()='Интернет-магазин'])[2]");

    public CatalogPage eShopBtnClick() {
        eShopBtn.shouldBe(visible).click();
        return new CatalogPage();
    }
}
