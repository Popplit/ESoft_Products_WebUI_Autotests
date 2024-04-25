package test;

import configuration.Settings;
import org.junit.jupiter.api.AfterEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest extends Settings {
    @AfterEach
    void close() {
        closeWebDriver();
    }
}
