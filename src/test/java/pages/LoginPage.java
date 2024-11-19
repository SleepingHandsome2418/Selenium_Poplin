package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExcelUtility;
import utils.JavaScriptExecutorUtil;
import utils.SeleniumUtil;
import utils.WaitUtil;

import java.io.IOException;

public class LoginPage extends BaseTest {

    //FOR SHADOW ROOT
    By continue_with_email_button_shadow_host_locator = By.xpath("//div[@class='or-divider']/following-sibling::poplin-button/ion-button");
    By continue_with_email_button_shadow_root_locator = By.cssSelector("button");
    By continue_button_shadow_host_locator = By.id("email-login-button");
    By continue_button_shadow_root_locator = By.cssSelector("button");
    By login_button_shadow_host_locator = By.id("enter-password-login-button");
    By login_button_shadow_root_locator = By.cssSelector("button");
    @FindBy(id = "email")
    private WebElement email_address_field;
    @FindBy(id = "enter-password")
    private WebElement password_field;
    @FindBy(xpath = "//img[@alt='Enable notifications']")
    private WebElement enable_notification_image;

    public void openPage() {
        goTo("https://nonprod-app.poplin.co/");
        SeleniumUtil.takeScreenshot(driver, scenario);
    }

    public void login() throws IOException {
        WebElement continue_with_email_button = SeleniumUtil.locateShadowRootElement(driver, continue_with_email_button_shadow_host_locator, continue_with_email_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, continue_with_email_button);
        WaitUtil.waitForElementVisible(email_address_field, defaultTimeout);
        email_address_field.sendKeys(ExcelUtility.testDataHandler("username"));
        WebElement continue_button = SeleniumUtil.locateShadowRootElement(driver, continue_button_shadow_host_locator, continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, continue_button);
        WaitUtil.waitForElementVisible(password_field, defaultTimeout);
        password_field.sendKeys(ExcelUtility.testDataHandler("password"));
        WebElement login_button = SeleniumUtil.locateShadowRootElement(driver, login_button_shadow_host_locator, login_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, login_button);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }


    public void openPoplinAndLogin() throws InterruptedException, IOException {
        this.openPage();
        WebElement continue_with_email_button = SeleniumUtil.locateShadowRootElement(driver, continue_with_email_button_shadow_host_locator, continue_with_email_button_shadow_root_locator);
        System.out.println(continue_with_email_button);
        JavaScriptExecutorUtil.clickUsingJs(driver, continue_with_email_button);
        WaitUtil.waitForElementVisible(email_address_field, defaultTimeout);
        email_address_field.sendKeys(ExcelUtility.testDataHandler("username"));
        WebElement continue_button = SeleniumUtil.locateShadowRootElement(driver, continue_button_shadow_host_locator, continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, continue_button);
        WaitUtil.waitForElementVisible(password_field, defaultTimeout);
        password_field.sendKeys(ExcelUtility.testDataHandler("password"));
        WebElement login_button = SeleniumUtil.locateShadowRootElement(driver, login_button_shadow_host_locator, login_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, login_button);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }
}
