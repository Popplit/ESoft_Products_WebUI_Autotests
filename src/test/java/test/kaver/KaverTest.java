package test.kaver;

import com.codeborne.selenide.Configuration;
import helper.Utils;
import org.junit.jupiter.api.BeforeEach;
import page.kaver.event.EventPage;
import page.kaver.event.ShareEventPage;
import page.kaver.eventsCatalog.EventsCatalogPage;
import page.kaver.main.MainPage;
import page.kaver.search.SearchPage;
import test.BaseTest;

import static constants.Constants.Urls.KAVER_URL;

public class KaverTest extends BaseTest {
    protected MainPage mainPage;
    protected SearchPage searchPage;
    protected EventsCatalogPage eventsCatalogPage;
    protected EventPage eventPage;
    protected ShareEventPage shareEventPage;

    @BeforeEach
    void init() {
        initDriver(KAVER_URL);
        Utils.waitFor(3);
        Configuration.timeout = 20000;
        mainPage = new MainPage();
    }
}
