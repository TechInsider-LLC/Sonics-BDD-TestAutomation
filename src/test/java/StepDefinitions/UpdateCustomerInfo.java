package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utilities.RandomName;

import static utilities.Hooks.driver;

public class UpdateCustomerInfo {
    PageObjects.UpdateCustomerInfo updateCustomerInfo = PageFactory.initElements(driver, PageObjects.UpdateCustomerInfo.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @When("Registered User changes the Customer Info")
    public void registered_user_changes_the_customer_info() {
        logIn.visit();
        logIn.with("Smart123@gmail.com","Kim123");
        updateCustomerInfo.homepage();
       // updateCustomerInfo.with(RandomName,"Liza");
    }
    @Then("Registered User gets Customer Info Changed")
    public void registered_user_gets_customer_info_changed() {

    }

}
