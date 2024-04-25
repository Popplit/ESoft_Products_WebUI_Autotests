package test.identicalKemerovo;

import org.junit.jupiter.api.BeforeEach;
import test.BaseTest;

import static constants.Constants.Urls.IDENTICAL_KEMEROVO_URL;

public class IKemTest extends BaseTest {
    @BeforeEach
    void init() {
        initDriver(IDENTICAL_KEMEROVO_URL);
    }
}
