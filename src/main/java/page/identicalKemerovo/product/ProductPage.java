package page.identicalKemerovo.product;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    private final SelenideElement productTitle = $x("//div[@class='t-store__prod-popup__title-wrapper']/div[contains(@class, 'js-product-name')]");

    public String getProductTitle() {
        return productTitle.shouldBe(visible).getText();
    }
}
