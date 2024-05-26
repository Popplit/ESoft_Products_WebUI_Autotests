package test.identicalKemerovo.catalog;

import configuration.TestName;
import org.junit.jupiter.api.Test;
import test.identicalKemerovo.IKemTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogTest extends IKemTest {
    @Test
    @TestName(value = "Открытие соответствующей подробной карточки товара")
    void productCardOpensCorrectProductPageTest() {
        catalogPage = mainPage.getHeaderElements()
                .eShopBtnClick();
        String firstProductTitle = catalogPage.getFirstProductTitle();
        productPage = catalogPage.firstProductCardClick();
        String productTitle = productPage.getProductTitle();
        assertEquals(firstProductTitle, productTitle);
    }
}
