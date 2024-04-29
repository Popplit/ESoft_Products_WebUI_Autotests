package configuration;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static constants.Constants.Configuration.DOWNLOADS_PATH;

public class Settings {
    public static void initDriver(String URL) {
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout          = 15000;
        Configuration.downloadsFolder  = DOWNLOADS_PATH;
        open(URL);
    }
}
