package test.videocontrolKuzbass.camera;

import helper.Utils;
import org.junit.jupiter.api.Test;
import test.videocontrolKuzbass.VideocontrolKuzTest;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CameraTest extends VideocontrolKuzTest {
    @Test
    void redirectionToOtherCameraTest() {
        cameraPage = mainPage.openCameraPage(0);
        String cameraCardTitle = cameraPage.getCameraTitle(1);
        cameraPage = cameraPage.openCameraPage(1);
        String activeCameraTitle = cameraPage.getActiveCameraTitle();
        assertEquals(cameraCardTitle, activeCameraTitle);
    }

    @Test
    void screenshotDownloadTest() {
        cameraPage = mainPage.openCameraPage(0);
        File screenshotFile = cameraPage.downloadScreenshot();
        assertTrue(Utils.checkIfFileIsInCorrectFormat(screenshotFile, ".png"));
    }

    @Test
    void changeCameraTimelineScaleTest() {
        cameraPage = mainPage.openCameraPage(0);
        String expectedTimeLineScale = "12 ч";
        String actualTimeLineScale = cameraPage.timelinePlusBtnClick()
            .getTimelineScaleTitle();
        assertEquals(expectedTimeLineScale, actualTimeLineScale);
    }
}
