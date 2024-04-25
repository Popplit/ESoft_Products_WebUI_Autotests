package configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import static com.codeborne.selenide.Selenide.open;

public class Settings {
    private static WebDriver driver;

    public static void createDriver() {
        String browserName = PropertiesReader.getInstance().getBrowserName();
        switch (browserName) {
            case ("Chrome"):
                driver = new ChromeDriver();
                break;
            case ("Firefox"):
                driver = new FirefoxDriver();
                break;
            case ("Edge"):
                driver = new EdgeDriver();
                break;
            case ("Safari"):
                driver = new SafariDriver();
                break;
        }
    }

    public static void initDriver(String URL) {
        createDriver();
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 15000;
        open(URL);
    }
}
