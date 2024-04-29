package test.videocontrolKuzbass;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import org.junit.jupiter.api.BeforeEach;
import page.videocontrolKuzbass.camera.CameraPage;
import page.videocontrolKuzbass.main.MainPage;
import test.BaseTest;

import static constants.Constants.Urls.VIDEOCONTROL_KUZBASS_URL;

public class VideocontrolKuzTest extends BaseTest {
    protected MainPage mainPage;
    protected CameraPage cameraPage;

    @BeforeEach
    void init() {
        initDriver(VIDEOCONTROL_KUZBASS_URL);
        Configuration.timeout = 30000;
        Configuration.fileDownload = FileDownloadMode.FOLDER;
        mainPage = new MainPage();
    }
}
