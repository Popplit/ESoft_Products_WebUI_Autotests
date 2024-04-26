package configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import static com.codeborne.selenide.Selenide.open;

public class Settings {
    private static WebDriver driver;

    public static void createDriver() {
        String browserName = PropertiesReader.getInstance().getBrowserName();
        switch (browserName) {
            case ("Chrome"):
                driver = new ChromeDriver((ChromeOptions) new ChromeOptions().setPageLoadStrategy(PageLoadStrategy.EAGER));
                break;
            case ("Firefox"):
                driver = new FirefoxDriver(new FirefoxOptions().setPageLoadStrategy(PageLoadStrategy.EAGER));
                break;
            case ("Edge"):
                driver = new EdgeDriver((EdgeOptions) new EdgeOptions().setPageLoadStrategy(PageLoadStrategy.EAGER));
                break;
            case ("Safari"):
                driver = new SafariDriver(new SafariOptions().setPageLoadStrategy(PageLoadStrategy.EAGER));
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
