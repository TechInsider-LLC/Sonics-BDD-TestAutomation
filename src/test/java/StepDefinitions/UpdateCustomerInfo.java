package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.RandomName;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class UpdateCustomerInfo {
    PageObjects.UpdateCustomerInfo updateCustomerInfo = PageFactory.initElements(driver, PageObjects.UpdateCustomerInfo.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @Given("Registered User should be able to update Customer Info")
    public void registered_user_should_be_able_to_update_customer_info(){
        updateCustomerInfo.homepage();
    }
    @When("Registered User changes the Customer Info")
    public void registered_user_changes_the_customer_info() {
        logIn.visit();
        logIn.with("Smart123@gmail.com","Kim123");
        updateCustomerInfo.with(RandomName.getRandomName(5),"John");
    }
    @Then("Registered User gets Customer Info Changed")
    public void registered_user_gets_customer_info_changed() {
        assertTrue(updateCustomerInfo.isFirstNameUpdated());
    }

}
