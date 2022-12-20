package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class AddressChange {

    PageObjects.AddressChange addressChange = PageFactory.initElements(driver, PageObjects.AddressChange.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);
    PageObjects.MyAccountEditAddress myAccountEditAddress = PageFactory.initElements(driver, PageObjects.MyAccountEditAddress.class);
    PageObjects.MyAccountAddress myAccountAddress = PageFactory.initElements(driver, PageObjects.MyAccountAddress.class);

    @Given("User logs in")
    public void user_logs_in() {
       logIn.visit();
       logIn.with("ergwef@gmail.com","Dina1234");
    }

    @When("User changes the address")
    public void user_changes_the_address() {
        addressChange.homepage();
        addressChange.changeProcess();
        myAccountAddress.changeProcess();
        myAccountEditAddress.editProcess("Liza","Sankovsky");

    }

    @Then("User saves the changed address")
    public void user_saves_the_changed_address() {
        addressChange.saveChanges();
    }
}
