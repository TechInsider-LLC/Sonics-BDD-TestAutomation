package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import static utilities.Hooks.driver;

public class Emailfriend {
     PageObjects.EmailFriend emailFriend =  PageFactory.initElements(driver, PageObjects.EmailFriend.class);

     PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @Given("User Logs in")
    public void user_logs_in() {
        logIn.visit();
        logIn.with("sayora.saadat@gmail.com","Imona2580");
    }

     @When("User Emails a Friend")
    public void user_emails_a_friend() {
        emailFriend.home();
        emailFriend.getSendemailbutton();



    }
    @Then("User gets message sent")
    public void user_gets_message_sent() {
        emailFriend.isSuccessMessagePresent();

    }



}
