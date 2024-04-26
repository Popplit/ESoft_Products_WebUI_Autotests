package page.kaver.event;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ShareEventPage {
    private final SelenideElement copyLinkBtn = $x("//span[contains(text(), 'Копировать ссылку')]");

    public ShareEventPage copyLinkBtnClick() {
        copyLinkBtn.shouldBe(visible).click();
        return this;
    }
}
