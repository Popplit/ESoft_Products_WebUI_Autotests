package page.kaver.event;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class EventPage {
    private final SelenideElement shareBtn = $x("//*[@id='layout']/main/div[1]/div/div/div[2]/div[2]/button[2]");

    public ShareEventPage shareBtnClick() {
        shareBtn.shouldBe(visible).click();
        return new ShareEventPage();
    }
}
