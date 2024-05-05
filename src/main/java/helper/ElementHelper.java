package helper;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.ex.ElementNotFound;

import java.time.Duration;

public class ElementHelper {
    public static boolean isElementDisplayed(SelenideElement element, int timeInSeconds, WebElementCondition condition) {
        try {
            return element.shouldBe(condition, Duration.ofSeconds(timeInSeconds)).isDisplayed();
        }
        catch (ElementNotFound e) {
            return false;
        }
    }
}
