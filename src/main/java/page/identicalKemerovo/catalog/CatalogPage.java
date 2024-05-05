package page.identicalKemerovo.catalog;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import page.identicalKemerovo.product.ProductPage;
import page.identicalKemerovo.shoppingCart.ShoppingCartPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private final ElementsCollection addToShoppingCartBtns = $$x("//span[@class='t-store__card__btn-text' and text()='В корзину']");
    private final ElementsCollection productTitles = $$x("//div[contains(@class, 't-store__card__title')]");
    private final SelenideElement shoppingCartBtn = $x("//div[@class='t706__carticon-imgwrap']");
    private final ElementsCollection moreAboutProductBtns = $$x("//span[@class='t-store__card__btn-text' and text()='Подробнее']");

    public CatalogPage addDifferentProductsToShoppingCart(int amount) {
        for (int i = 0; i < amount; i++) {
            addToShoppingCartBtns.get(i).shouldBe(visible).click();
        }
        return this;
    }

    public String getFirstProductTitle() {
        return productTitles.first().getText();
    }

    public ProductPage firstProductCardClick() {
        moreAboutProductBtns.first().shouldBe(visible).click();
        return new ProductPage();
    }

    public ShoppingCartPage shoppingCartBtnClick() {
        shoppingCartBtn.shouldBe(visible).click();
        return new ShoppingCartPage();
    }
}
