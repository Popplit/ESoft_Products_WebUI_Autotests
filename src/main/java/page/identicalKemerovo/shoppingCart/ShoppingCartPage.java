package page.identicalKemerovo.shoppingCart;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.ElementHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage {
    private final ElementsCollection productsPrices = $$x("//div[contains(@class, 't706__product-amount')]/div[@class='t706__cartwin-prodamount-price']");
    private final SelenideElement priceSum = $x("//span[contains(@class, 't706__cartwin-prodamount')]/div[@class='t706__cartwin-prodamount-price']");
    private final SelenideElement notAllFilledTextBoxesErrorMessage = $x("(//a[@class='t-form__errorbox-link' and text()='Пожалуйста, заполните все обязательные поля'])[1]");
    private final SelenideElement payBtn = $x("//button[@type='submit']");

    public int getSumOfProductsPrices() {
        int SumOfProductsPrices = 0;
        for (SelenideElement productPrice : productsPrices) {
            SumOfProductsPrices += Integer.parseInt(productPrice.getText().replaceAll("[\\s]", ""));
        }
        return SumOfProductsPrices;
    }

    public int getPriceSum() {
        return Integer.parseInt(priceSum.getText().replaceAll("[\\s]", ""));
    }

    public ShoppingCartPage payBtnClick() {
        payBtn.shouldBe(visible).click();
        return this;
    }

    public boolean checkIfNotAllFilledTextBoxesErrorIsDisplayed() {
        return ElementHelper.isElementDisplayed(notAllFilledTextBoxesErrorMessage, 5, visible);
    }
}
