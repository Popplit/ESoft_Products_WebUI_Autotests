package test.videocontrolKuzbass;

import org.junit.jupiter.api.BeforeEach;
import test.BaseTest;

import static constants.Constants.Urls.VIDEOCONTROL_KUZBASS_URL;

public class VideocontrolKuzTest extends BaseTest {
    @BeforeEach
    void init() {
        initDriver(VIDEOCONTROL_KUZBASS_URL);
    }
}
