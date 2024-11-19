package steps;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import pages.LoginPage;

import java.io.IOException;

public class LoginPageSteps extends BaseTest {
    private LoginPage loginpage = new LoginPage();

    @Before
    public void before(Scenario scenario) {
        beforeScenario(scenario);
    }

    @After
    public void after() {
        afterScenario();
    }

    @Given("^user opens Poplin site on browser$")
    public void openPoplinOnBrowser() {
        loginpage.openPage();
    }

    @Given("^user logs in to Poplin using valid credentials$")
    public void loginUsingValidCredentials() throws InterruptedException, IOException {
        loginpage.login();
    }

    @Given("^user logs in to Poplin$")
    public void loginToPoplin() throws InterruptedException, IOException {
        loginpage.openPoplinAndLogin();
    }
}
