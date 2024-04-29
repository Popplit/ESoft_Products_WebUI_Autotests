package page.videocontrolKuzbass.camera;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CameraPage {
    private final SelenideElement activeCameraTitle = $x("//span[@class='camera__name']");
    private final ElementsCollection cameraTitles = $$x("//div[contains(@class, 'camera__item--name')]");
    private final SelenideElement screenShotBtn = $x("//span[@class='control__element icon__snapshot']");
    private final SelenideElement timelinePlusBtn = $x("//span[contains(@class, 'icon__plus')]");
    private final SelenideElement timelineScaleTitle = $x("//div[contains(@class, 'icon__scale')]");

    public CameraPage openCameraPage(int index) {
        cameraTitles.get(index).shouldBe(visible).click();
        return new CameraPage();
    }

    public String getActiveCameraTitle() {
        return activeCameraTitle.shouldBe(visible).getText();
    }

    public String getCameraTitle(int index) {
        return cameraTitles.get(index).shouldBe(visible).getText();
    }

    public File downloadScreenshot() {
        return screenShotBtn.shouldBe(visible).download();
    }

    public CameraPage timelinePlusBtnClick() {
        timelinePlusBtn.shouldBe(visible).click();
        return this;
    }

    public String getTimelineScaleTitle() {
        return timelineScaleTitle.shouldBe(visible).getText().replaceAll("[\n]", " ");
    }
}
