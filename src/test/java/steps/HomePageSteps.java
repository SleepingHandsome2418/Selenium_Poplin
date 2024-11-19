package steps;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps extends BaseTest {

    HomePage homepage = new HomePage();

    @Before
    public void before(Scenario scenario) {
        beforeScenario(scenario);
    }

    @After
    public void after() {
        afterScenario();
    }

    @Given("^verify that user should be redirected to homepage$")
    public void verifyUserInOnHomePage() {
        homepage.isHomePageDisplayed();
    }

    @Given("^user is on Poplin home page$")
    public void verifyUserInPoplinOnHomePage() {
        homepage.isHomePageDisplayed();
    }

    @When("^user starts new order$")
    public void userStartsNewOrder() throws InterruptedException {
        homepage.startNewOrder();
    }
}
