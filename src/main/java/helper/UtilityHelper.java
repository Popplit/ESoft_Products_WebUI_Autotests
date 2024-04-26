package helper;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.clipboard;
import static com.codeborne.selenide.Selenide.switchTo;

public class UtilityHelper {
    public static String getTextFromClipboard() {
        return clipboard().getText();
    }
    public static String getCurrentUrl() {
        return WebDriverRunner.url();
    }
    public static void switchWindowTo(int index) {
        switchTo().window(index);
    }
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception ignored) { }
    }
}
