package test.identicalKemerovo;

import org.junit.jupiter.api.BeforeEach;
import page.identicalKemerovo.catalog.CatalogPage;
import page.identicalKemerovo.main.MainPage;
import page.identicalKemerovo.product.ProductPage;
import page.identicalKemerovo.shoppingCart.ShoppingCartPage;
import test.BaseTest;

import static constants.Constants.Urls.IDENTICAL_KEMEROVO_URL;

public class IKemTest extends BaseTest {
    protected MainPage mainPage;
    protected CatalogPage catalogPage;
    protected ShoppingCartPage shoppingCartPage;
    protected ProductPage productPage;

    @BeforeEach
    void init() {
        initDriver(IDENTICAL_KEMEROVO_URL);
        mainPage = new MainPage();
    }
}
