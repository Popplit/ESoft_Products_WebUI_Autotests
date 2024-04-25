package test.kaver;

import org.junit.jupiter.api.BeforeEach;
import test.BaseTest;

import static constants.Constants.Urls.KAVER_URL;

public class KaverTest extends BaseTest {
    @BeforeEach
    void init() {
        initDriver(KAVER_URL);
    }
}
