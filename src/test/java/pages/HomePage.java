package pages;

import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.SeleniumUtil;
import utils.WaitUtil;

public class HomePage extends BaseTest {

    @FindBy(id = "dml-container")
    private WebElement new_order_button;

    @FindBy(xpath = "//img[@alt='Poplin Logo']")
    private WebElement poplin_title_text;

    @FindBy(id = "button-element")
    private WebElement question_mark_icon;

    @FindBy(id = "checkbox-element")
    private WebElement credit_refer_and_earn_text;

    @FindBy(xpath = "//poplin-item[@ng-reflect-title='Start new order']")
    private WebElement start_new_order_button;

    private WebElement homepageTab(String tab) {
        String tab_locator = "//ul[@class='nav-footer-tabs']/li/a/span[text()='" + tab + "']";
        return driver.findElement(By.xpath(tab_locator));
    }

    public void isHomePageDisplayed() {
        WaitUtil.waitForElementVisible(new_order_button, defaultTimeout);
        boolean is_new_order_button_displayed = new_order_button.isDisplayed();
        Assert.assertTrue(is_new_order_button_displayed);
        boolean is_poplin_title_text_displayed = poplin_title_text.isDisplayed();
        Assert.assertTrue(is_poplin_title_text_displayed);
        boolean is_question_mark_icon_displayed = question_mark_icon.isDisplayed();
        Assert.assertTrue(is_question_mark_icon_displayed);
        boolean is_credit_refer_and_earn_text_displayed = credit_refer_and_earn_text.isDisplayed();
        Assert.assertTrue(is_credit_refer_and_earn_text_displayed);
        boolean is_homepageTab_laundry_displayed = homepageTab("Laundry").isDisplayed();
        Assert.assertTrue(is_homepageTab_laundry_displayed);
        boolean is_homepageTab_orders_displayed = homepageTab("Orders").isDisplayed();
        Assert.assertTrue(is_homepageTab_orders_displayed);
        boolean is_homepageTab_account_displayed = homepageTab("Account").isDisplayed();
        Assert.assertTrue(is_homepageTab_account_displayed);
        boolean is_homepageTab_referrals_displayed = homepageTab("Referrals").isDisplayed();
        Assert.assertTrue(is_homepageTab_referrals_displayed);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }

    public void startNewOrder() throws InterruptedException {
        Thread.sleep(5000); //This is to wait for the data to load
        new_order_button.click();
        start_new_order_button.click();
        SeleniumUtil.takeScreenshot(driver, scenario);
    }
}
