package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utilities.RandomGmail;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class Register {

    PageObjects.Register register = PageFactory.initElements(driver, PageObjects.Register.class);

    @Given("Customer has valid credentials")
    public void customer_has_valid_credentials() {
        register.visit();
    }

    @When("Customer registers or signs up")
    public void customer_registers_or_signs_up() throws InterruptedException {
        register.process("Diora","John", RandomGmail.getRandomGmail(6),"Sonics1234","Sonics1234");
        }


    @Then("Customer should get success message")
    public void customer_should_get_success_message() throws InterruptedException {
        assertTrue(register.isSuccessMessagePresent());
    }



    @Given("Customer has invalid credentials")
    public void customer_has_invalid_credentials() {
        register.visit();
    }

    @When("Customer tries to signs in with invalid email")
    public void customer_tries_to_signs_in_with_invalid_email() {
        register.process("Diora","John","adcdef","Sonics1234","Sonics1234");
    }
    @Then("Customer should get invalid email message")
    public void customer_should_get_invalid_email_message() {
        assertTrue(register.isInvalidEmailMessagePresent());
    }


    @Given("Go to register page")
    public void go_to_register_page() {
        register.visit();
    }
    @When("Click register button")
    public void enter_register_button_without_credentials() {
        register.process("","","","","");
    }
    @Then("Verify the first error message using")
    public void verify_error_message() throws InterruptedException {
        assertTrue(register.isFailureMessagePresent());
    }


    @Given("Customer enters different password")
    public void customer_enters_different_password() throws InterruptedException {
        register.visit();
    }
    @When("Customer enters not matching password")
    public void customer_enters_not_matching_password() throws InterruptedException {
        register.process("Diora","John",RandomGmail.getRandomGmail(6),"Sonics1234","sonics1234");
    }
    @Then("Customer should get invalid password message")
    public void customer_should_get_invalid_password_message() throws InterruptedException {
        assertTrue(register.isNotMatchingPasswordPresent());
    }




}

