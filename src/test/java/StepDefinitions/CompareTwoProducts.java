package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class CompareTwoProducts {
    PageObjects.CompareTwoProducts compareTwoProducts = PageFactory.initElements(driver, PageObjects.CompareTwoProducts.class);

    @Given("When user is on the home page")
    public void when_user_is_on_the_home_page() {

    }

    @When("User compares two products")
    public void user_compares_two_products() {
        compareTwoProducts.home();
        compareTwoProducts.addToCompare();

    }

    @Then("Verify the Clear list button")
    public void verify_the_clear_list_button() {


        compareTwoProducts.isSuccessMessagePresent();
    }
}
