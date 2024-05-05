package test.identicalKemerovo.shoppingCart;

import org.junit.jupiter.api.Test;
import test.identicalKemerovo.IKemTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartTest extends IKemTest {
    @Test
    void correctPriceSumWithMultipleProductsTest() {
        catalogPage = mainPage.getHeaderElements()
            .eShopBtnClick();
        shoppingCartPage = catalogPage.addDifferentProductsToShoppingCart(2)
            .shoppingCartBtnClick();
        assertEquals(shoppingCartPage.getSumOfProductsPrices(), shoppingCartPage.getPriceSum());
    }

    @Test
    void checkForErrorWhenAllTextBoxesNotFilledTest() {
        catalogPage = mainPage.getHeaderElements()
            .eShopBtnClick();
        shoppingCartPage = catalogPage.addDifferentProductsToShoppingCart(1)
            .shoppingCartBtnClick()
            .payBtnClick();
        assertTrue(shoppingCartPage.checkIfNotAllFilledTextBoxesErrorIsDisplayed());
    }
}
