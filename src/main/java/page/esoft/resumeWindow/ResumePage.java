package page.esoft.resumeWindow;

import com.codeborne.selenide.SelenideElement;
import helper.ElementHelper;
import page.esoft.main.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ResumePage {
    private final SelenideElement yourNameTextBox = $x("//input[@id='input_1495810354468']");
    private final SelenideElement phoneNumberTextBox = $x("//input[@id='input_1495810359387']");
    private final SelenideElement jobTextBox = $x("//textarea[@id='input_1668484941929']");
    private final SelenideElement aboutYourselfTextBox = $x("//textarea[@id='input_1495810410810']");
    private final SelenideElement sendBtn = $x("(//button[text()='Отправить '])[1]");
    private final SelenideElement valueTooShortErrorMessage = $x("(//*[contains(@class, 'js-rule-error-minlength')]/a[text()='Слишком короткое значение'])[1]");

    public ResumePage setYourNameTextBox(String value) {
        yourNameTextBox.shouldBe(visible).sendKeys(value);
        return this;
    }

    public ResumePage setPhoneNumberTextBox(String value) {
        phoneNumberTextBox.shouldBe(visible).sendKeys(value);
        return this;
    }

    public ResumePage setJobTextBox(String value) {
        jobTextBox.shouldBe(visible).sendKeys(value);
        return this;
    }

    public ResumePage setAboutYourselfTextBox(String value) {
        aboutYourselfTextBox.shouldBe(visible).sendKeys(value);
        return this;
    }

    public MainPage sendBtnClick() {
        sendBtn.shouldBe(visible).click();
        return new MainPage();
    }

    public boolean checkIfValueTooShortMessageIsDisplayed() {
        return ElementHelper.isElementDisplayed(valueTooShortErrorMessage, 5, visible);
    }
}
