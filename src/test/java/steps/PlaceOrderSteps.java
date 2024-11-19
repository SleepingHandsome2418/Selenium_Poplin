package steps;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import pages.PlaceAnOrderPage;

public class PlaceOrderSteps extends BaseTest {
    PlaceAnOrderPage placeorderpage = new PlaceAnOrderPage();

    @Before
    public void before(Scenario scenario) {
        beforeScenario(scenario);
    }

    @After
    public void after() {
        afterScenario();
    }

    @When("^user places new order$")
    public void userPlacesNewOrder() throws InterruptedException {
        placeorderpage.placeAnOrder();
    }

    @When("^user reviews the order$")
    public void userReviewsTheOrder() throws InterruptedException {
        placeorderpage.reviewOrder();
    }

    @When("^user confirms the order$")
    public void userConfirmsTheOrder() throws InterruptedException {
        placeorderpage.confirmOrder();
    }

    @When("^user pays the order$")
    public void userPaysTheOrder() throws InterruptedException {
        placeorderpage.payOrder();
    }

    @When("^error message should be displayed$")
    public void isErrorMessageDisplayed() throws InterruptedException {
        placeorderpage.errorMessage();
    }
}
