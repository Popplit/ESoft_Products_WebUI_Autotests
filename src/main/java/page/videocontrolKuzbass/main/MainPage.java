package page.videocontrolKuzbass.main;

import com.codeborne.selenide.ElementsCollection;
import page.videocontrolKuzbass.camera.CameraPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;

public class MainPage {
    private final ElementsCollection cameraCards = $$x("//a[contains(@class, 'cameras__item')]");

    public CameraPage openCameraPage(int index) {
        cameraCards.get(index).shouldBe(visible).click();
        return new CameraPage();
    }
}
