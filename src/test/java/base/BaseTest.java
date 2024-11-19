package base;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected static WebDriver driver;
    protected static Scenario scenario;
    protected static int defaultTimeout = 15;

    public BaseTest() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            String chrome_driver_path = "chromedriver.exe";
            String key = "webdriver.chrome.driver";
            System.setProperty(key, chrome_driver_path);
            driver = new ChromeDriver(options);
        }
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Scenario getScenario() {
        return this.scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public void beforeScenario(Scenario scenario) {
        this.scenario = scenario;

        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            String chromeDriverPath = "path/to/chromedriver"; // Update path to your chromedriver
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(defaultTimeout, TimeUnit.SECONDS);
    }

    public void afterScenario() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
