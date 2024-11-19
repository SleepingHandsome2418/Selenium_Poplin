package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.JavaScriptExecutorUtil;
import utils.SeleniumUtil;
import utils.WaitUtil;

public class PlaceAnOrderPage extends BaseTest {

    //FOR SHADOW ROOT
    By continue_button_shadow_host_locator = By.id("choose-profile-continue-button");
    By continue_button_shadow_root_locator = By.cssSelector("button");
    By oversized_continue_button_shadow_host_locator = By.id("oversized-continue-button");
    By oversized_continue_button_shadow_root_locator = By.cssSelector("button");
    By protecting_laundry_checkbox1_shadow_host_locator = By.id("checkbox-drawer-checkbox-1");
    By protecting_laundry_checkbox1_shadow_root_locator = By.cssSelector("svg");
    By protecting_laundry_checkbox2_shadow_host_locator = By.id("checkbox-drawer-checkbox-2");
    By protecting_laundry_checkbox2_shadow_root_locator = By.cssSelector("svg");
    By protecting_laundry_checkbox3_shadow_host_locator = By.id("checkbox-drawer-checkbox-3");
    By protecting_laundry_checkbox3_shadow_root_locator = By.cssSelector("svg");
    By protecting_laundry_continue_button_shadow_host_locator = By.id("drawer-modal-continue-button");
    By protecting_laundry_continue_button_shadow_root_locator = By.cssSelector("button");
    By preferred_laundry_continue_button_shadow_host_locator = By.id("preferred-continue-button");
    By preferred_laundry_continue_button_shadow_root_locator = By.cssSelector("button");
    By preferred_laundry_confirm_and_continue_button_shadow_host_locator = By.xpath("//poplin-button[@ng-reflect-label='Confirm and Continue']/ion-button");
    By preferred_laundry_confirm_and_continue_button_shadow_root_locator = By.cssSelector("button");
    By basic_radio_button_shadow_host_locator = By.xpath("//ion-radio[@ng-reflect-name='Basic']");
    By basic_radio_button_shadow_root_locator = By.className("radio-icon");
    By coverage_continue_button_shadow_host_locator = By.id("coverage-continue-button");
    By coverage_continue_button_shadow_root_locator = By.cssSelector("button");
    By place_order_continue_button_shadow_host_locator = By.id("place-order-button");
    By place_order_continue_button_shadow_root_locator = By.cssSelector("button");
    By pay_button_shadow_host_locator = By.id("stripe-pay-button");
    By pay_continue_button_shadow_root_locator = By.cssSelector("button");
    @FindBy(xpath = "//ion-radio[@id='radio-' and @ng-reflect-name='Regular']")
    private WebElement standard_delivery_radio_button;
    @FindBy(id = "delivery-continue-button-wrapper")
    private WebElement delivery_continue_button;
    @FindBy(xpath = "//poplin-number-stepper[@ng-reflect-id='stepper-small']//poplin-icon[@ng-reflect-name='plus_custom']")
    private WebElement small_add_button;
    @FindBy(xpath = "//poplin-number-stepper[@ng-reflect-label='Oversized Items']//poplin-icon[@ng-reflect-name='plus_custom']")
    private WebElement oversized_add_button;
    @FindBy(id = "buttonLabel-bag-continue-button")
    private WebElement bag_continue_button;
    @FindBy(xpath = "(//poplin-order-review-card[@ng-reflect-heading='Pickup Location']/article[@id='review-card-pickup']//span)[1]")
    private WebElement pick_up_location_detail1;
    @FindBy(xpath = "(//poplin-order-review-card[@ng-reflect-heading='Pickup Location']/article[@id='review-card-pickup']//span)[2]")
    private WebElement pick_up_location_detail2;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Delivery Speed']/article[@id='review-card-delivery']//span)[1]")
    private WebElement deliver_speed_detail1;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Delivery Speed']/article[@id='review-card-delivery']//span)[2]")
    private WebElement deliver_speed_detail2;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Laundry Care']/article[@id='review-card-laundry']//span)[1]")
    private WebElement laundry_care_detail1;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Laundry Care']/article[@id='review-card-laundry']//span)[2]")
    private WebElement laundry_care_detail2;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Laundry Care']/article[@id='review-card-laundry']//span)[3]")
    private WebElement laundry_care_detail3;
    @FindBy(xpath = "//poplin-order-review-card[@heading='Bag Count']/article[@id='review-card-bag']//span")
    private WebElement bag_count_detail;
    @FindBy(xpath = "//poplin-order-review-card[@heading='Oversized Items']/article[@id='review-card-oversized']//span")
    private WebElement oversized_items_detail;
    @FindBy(xpath = "//poplin-order-review-card[@heading='Preferred Laundry Pros']/article[@id='review-card-preferred']//span")
    private WebElement preferred_laundry_detail;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Coverage']/article[@id='review-card-coverage']//span)[1]")
    private WebElement coverage_detail1;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Coverage']/article[@id='review-card-coverage']//span)[2]")
    private WebElement coverage_detail2;
    @FindBy(xpath = "(//poplin-order-review-card[@heading='Coverage']/article[@id='review-card-coverage']//span)[3]")
    private WebElement coverage_detail3;
    @FindBy(xpath = "//div[@id='estimated-order-cost']/strong")
    private WebElement estimated_cost_text;
    @FindBy(xpath = "//a[@id='preauth-modal-trigger']/parent::div/following-sibling::span")
    private WebElement preauthorized_amount_text;
    @FindBy(xpath = "//*[contains(text(),'Packing')]")
    private WebElement loading_message;
    @FindBy(id = "Field-numberInput")
    private WebElement card_number_field;
    @FindBy(id = "Field-expiryInput")
    private WebElement expiration_date_field;
    @FindBy(id = "Field-cvcInput")
    private WebElement cvc_field;
    @FindBy(id = "alert-24-msg")
    private WebElement error_message;
    @FindBy(xpath = "//iframe[@title='Secure payment input frame']")
    private WebElement payement_iframe;

    public void placeAnOrder() {
        WebElement continue_button = SeleniumUtil.locateShadowRootElement(driver, continue_button_shadow_host_locator, continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, continue_button);
        WaitUtil.waitForElementClickable(standard_delivery_radio_button, defaultTimeout);
        JavaScriptExecutorUtil.clickUsingJs(driver, standard_delivery_radio_button);
        JavaScriptExecutorUtil.clickUsingJs(driver, delivery_continue_button);
        WaitUtil.waitForElementClickable(small_add_button, defaultTimeout);
        small_add_button.click();
        small_add_button.click();
        bag_continue_button.click();
        WaitUtil.waitForElementClickable(oversized_add_button, defaultTimeout);
        oversized_add_button.click();
        oversized_add_button.click();
        WebElement oversized_continue_button = SeleniumUtil.locateShadowRootElement(driver, oversized_continue_button_shadow_host_locator, oversized_continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, oversized_continue_button);
        WebElement protecting_laundry_checkbox1 = SeleniumUtil.locateShadowRootElement(driver, protecting_laundry_checkbox1_shadow_host_locator, protecting_laundry_checkbox1_shadow_root_locator);
        WebElement protecting_laundry_continue_button = SeleniumUtil.locateShadowRootElement(driver, protecting_laundry_continue_button_shadow_host_locator, protecting_laundry_continue_button_shadow_root_locator);
        WaitUtil.waitForElementVisible(protecting_laundry_continue_button, defaultTimeout);
        WaitUtil.waitForElementClickable(protecting_laundry_checkbox1, defaultTimeout);
        protecting_laundry_checkbox1.click();
        WebElement protecting_laundry_checkbox2 = SeleniumUtil.locateShadowRootElement(driver, protecting_laundry_checkbox2_shadow_host_locator, protecting_laundry_checkbox2_shadow_root_locator);
        protecting_laundry_checkbox2.click();
        WebElement protecting_laundry_checkbox3 = SeleniumUtil.locateShadowRootElement(driver, protecting_laundry_checkbox3_shadow_host_locator, protecting_laundry_checkbox3_shadow_root_locator);
        protecting_laundry_checkbox3.click();
        JavaScriptExecutorUtil.clickUsingJs(driver, protecting_laundry_continue_button);
        WebElement preferred_laundry_continue_button = SeleniumUtil.locateShadowRootElement(driver, preferred_laundry_continue_button_shadow_host_locator, preferred_laundry_continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, preferred_laundry_continue_button);
        WebElement preferred_laundry_confirm_and_continue_button = SeleniumUtil.locateShadowRootElement(driver, preferred_laundry_confirm_and_continue_button_shadow_host_locator, preferred_laundry_confirm_and_continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, preferred_laundry_confirm_and_continue_button);
        WebElement basic_radio_button = SeleniumUtil.locateShadowRootElement(driver, basic_radio_button_shadow_host_locator, basic_radio_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, basic_radio_button);
        WebElement coverage_continue_button = SeleniumUtil.locateShadowRootElement(driver, coverage_continue_button_shadow_host_locator, coverage_continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, coverage_continue_button);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }

    public void reviewOrder() {
        WaitUtil.waitForCondition(ExpectedConditions.invisibilityOf(loading_message), defaultTimeout);
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(pick_up_location_detail1, "123 Main St, White Plains, NY, 10601, US"), defaultTimeout);
        String pick_up_location_detail1_text = pick_up_location_detail1.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(pick_up_location_detail2, "Front Desk"), defaultTimeout);
        String pick_up_location_detail2_text = pick_up_location_detail2.getText();
        String deliver_speed_detail1_text = deliver_speed_detail1.getText();
        String deliver_speed_detail2_text = deliver_speed_detail2.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(laundry_care_detail1, "Hypoallergenic"), defaultTimeout);
        String laundry_care_detail1_text = laundry_care_detail1.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(laundry_care_detail2, "Delicate cycle items"), defaultTimeout);
        String laundry_care_detail2_text = laundry_care_detail2.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(laundry_care_detail3, "separate white clothes updated"), defaultTimeout);
        String laundry_care_detail3_text = laundry_care_detail3.getText();
        JavaScriptExecutorUtil.scrollIntoView(driver, bag_count_detail);
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(bag_count_detail, "2 Small"), defaultTimeout);
        String bag_count_detail_text = bag_count_detail.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(oversized_items_detail, "2 Oversized Items"), defaultTimeout);
        String oversized_items_detail_text = oversized_items_detail.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(preferred_laundry_detail, "No preferred Laundry Pros"), defaultTimeout);
        String preferred_laundry_detail_text = preferred_laundry_detail.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(coverage_detail1, "Covers $35/garment"), defaultTimeout);
        String coverage_detail1_text = coverage_detail1.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(coverage_detail2, "Maximum $200/order"), defaultTimeout);
        String coverage_detail2_text = coverage_detail2.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(coverage_detail3, "Included FREE"), defaultTimeout);
        String coverage_detail3_text = coverage_detail3.getText();
        JavaScriptExecutorUtil.scrollIntoView(driver, estimated_cost_text);
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(estimated_cost_text, "$41.00"), defaultTimeout);
        String estimated_cost = estimated_cost_text.getText();
        WaitUtil.waitForCondition(ExpectedConditions.textToBePresentInElement(preauthorized_amount_text, "$57.40"), defaultTimeout);
        String preauthorized_amount = preauthorized_amount_text.getText();
        Assert.assertEquals(pick_up_location_detail1_text, "123 Main St, White Plains, NY, 10601, US");
        Assert.assertEquals(pick_up_location_detail2_text, "Front Desk");
        Assert.assertNotNull(deliver_speed_detail1_text);
        Assert.assertNotNull(deliver_speed_detail2_text);
        Assert.assertEquals(laundry_care_detail1_text, "Hypoallergenic");
        Assert.assertEquals(laundry_care_detail2_text, "Delicate cycle items");
        Assert.assertEquals(laundry_care_detail3_text, "separate white clothes updated");
        Assert.assertEquals(bag_count_detail_text, "2 Small");
        Assert.assertEquals(oversized_items_detail_text, "2 Oversized Items");
        Assert.assertEquals(preferred_laundry_detail_text, "No preferred Laundry Pros");
        Assert.assertEquals(coverage_detail1_text, "Covers $35/garment");
        Assert.assertEquals(coverage_detail2_text, "Maximum $200/order");
        Assert.assertEquals(coverage_detail3_text, "Included FREE");
        Assert.assertEquals(estimated_cost, "$41.00");
        Assert.assertEquals(preauthorized_amount, "$57.40");
        SeleniumUtil.takeScreenshot(driver, scenario);
    }

    public void confirmOrder() {
        WebElement place_order_continue_button = SeleniumUtil.locateShadowRootElement(driver, place_order_continue_button_shadow_host_locator, place_order_continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, place_order_continue_button);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }

    public void payOrder() {
        WaitUtil.waitForElementVisible(payement_iframe, defaultTimeout);
        SeleniumUtil.switchFrame(driver, payement_iframe);
        WaitUtil.waitForElementVisible(card_number_field, defaultTimeout);
        card_number_field.sendKeys("2486 8569 9565 8965");
        expiration_date_field.sendKeys("04/27");
        cvc_field.sendKeys("123");
        SeleniumUtil.switchToMainFrame(driver);
        SeleniumUtil.takeScreenshot(driver, scenario);
        WebElement pay_button = SeleniumUtil.locateShadowRootElement(driver, pay_button_shadow_host_locator, pay_continue_button_shadow_root_locator);
        JavaScriptExecutorUtil.clickUsingJs(driver, pay_button);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }

    public void errorMessage() {
        WaitUtil.waitForElementVisible(error_message, defaultTimeout);
        boolean is_error_message_displayed = error_message.isDisplayed();
        Assert.assertTrue(is_error_message_displayed);
        SeleniumUtil.takeScreenshot(driver, scenario);
    }
}
