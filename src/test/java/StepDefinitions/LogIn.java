package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class LogIn {

    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @Given("User has valid credentials")
    public void user_has_valid_credentials() {


        logIn.visit();
    }
    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {

        logIn.visit();
        logIn.with("Katerina@gmail.com","Kate20");
    }
    @Then("User verifies log out button")
    public void user_verifies_log_out_button() {

        assertTrue(logIn.isSuccessMessagePresent());

    }

    @Given("User has invalid credentials")
    public void user_has_invalid_credentials() {

    }
    @When("User tries to login with invalid email address")
    public void user_tries_to_login_with_invalid_email_address() {
        logIn.visit();
        logIn.with("Katerinagmail.com","Kate20");
    }
    @Then("User gets failure message")
    public void user_gets_failure_message() {

        assertTrue(logIn.isPleaseEnterAValidEmailAddress());
    }

}
