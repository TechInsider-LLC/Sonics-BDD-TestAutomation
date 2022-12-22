package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class ReorderProduct {
    PageObjects.ReorderProduct reorderProduct =  PageFactory.initElements(driver, PageObjects.ReorderProduct.class);


    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);
    @Given("Customer Logging in")
    public void customer_logging_in() {
        logIn.visit();
        logIn.with("sayora.saadat@gmail.com","Imona2580");
    }
    @When("Customer Reorder Product")
    public void customer_reorder_product() {
        reorderProduct.checkout();


    }
    @Then("Customer Should get Successful message")
    public void customer_should_get_successful_message() {
        reorderProduct.isOrderMessagePresent();


    }
}
