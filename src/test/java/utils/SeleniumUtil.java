package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;

public class SeleniumUtil {

    public static void takeScreenshot(WebDriver driver, Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "testImg"); //stick it in the report
    }

    public static WebElement locateShadowRootElement(WebDriver driver, By locator1, By locator2) {
        return driver.findElement(locator1).getShadowRoot().findElement(locator2);
    }


    public static void switchFrame(WebDriver driver, WebElement element) {
        driver.switchTo().frame(element);
    }

    public static void switchToMainFrame(WebDriver driver) {
        driver.switchTo().defaultContent();
    }


}
