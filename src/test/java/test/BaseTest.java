package test;

import configuration.Settings;
import helper.ReportingExtension;
import helper.Utils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@ExtendWith(ReportingExtension.class)
public class BaseTest extends Settings {
    @AfterEach
    void close() {
        closeWebDriver();
        Utils.cleanDownloadsFolder();
    }
}
