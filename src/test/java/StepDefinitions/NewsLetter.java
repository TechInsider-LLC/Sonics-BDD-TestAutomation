package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class NewsLetter {

    PageObjects.NewsLetter newsLetter = PageFactory.initElements(driver, PageObjects.NewsLetter.class);

    @Given("User is on the Homepage")
    public void user_is_on_the_homepage() {
        newsLetter.homepage();
    }
    @When("User signs in to NewsLetter")
    public void user_signs_in_to_news_letter() {

        newsLetter.signUpProcess("ergwef@gmail.com");
    }
    @Then("User gets success message")
    public void user_gets_success_message() {
        assertTrue(newsLetter.isSuccessMessagePresent());
    }



    @When("User tires to sign with invalid username")
    public void user_tires_to_sign_with_invalid_username() {

        newsLetter.signUpProcess("dj@gmail.com");
    }
    @Then("User gets the failure message")
    public void user_gets_the_failure_message() {
        assertTrue(newsLetter.isFailureMessagePresent());
    }
}
