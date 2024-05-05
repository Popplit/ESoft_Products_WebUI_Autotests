package helper;

import com.codeborne.selenide.WebDriverRunner;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.clipboard;
import static com.codeborne.selenide.Selenide.switchTo;
import static constants.Constants.Configuration.DOWNLOADS_PATH;

public class Utils {

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
            Thread.sleep(seconds * 1000L);
        } catch (Exception ignored) { }
    }

    public static boolean checkIfFileIsInCorrectFormat(File file, String fileFormat) {
        return file.getName().contains(fileFormat);
    }

    public static void cleanDownloadsFolder() {
        File downloadsDirectory = new File(DOWNLOADS_PATH);

        try {
            FileUtils.cleanDirectory(downloadsDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
