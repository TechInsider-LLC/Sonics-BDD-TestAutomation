package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class CommunityPoll {
    PageObjects.CommunityPoll communityPoll = PageFactory.initElements(driver, PageObjects.CommunityPoll.class);
    PageObjects.LogIn logIn= PageFactory.initElements(driver, PageObjects.LogIn.class);
    @Given("Unregistered user is on Community Poll page")
    public void unregistered_user_is_on_community_poll_page() {
        communityPoll.visit();
    }
    @When("Unregistered user tries to vote")
    public void unregistered_user_tries_to_vote() {
        communityPoll.vote();
    }
    @Then("Error message shown to voter")
    public void error_message_shown_to_voter() {
        assertTrue(communityPoll.isErrorMessageDisplayed());
    }



}
