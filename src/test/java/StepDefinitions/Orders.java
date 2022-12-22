package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;



    public class Orders {
        PageObjects.Orders orders = PageFactory.initElements(driver,PageObjects.Orders.class);


        PageObjects.LogIn logIn= PageFactory.initElements(driver, PageObjects.LogIn.class);
        @Given("Registered Customer should be able to login in webpage")
        public void registered_customer_should_be_able_to_login_in_webpage() {
            logIn.visit();
            logIn.with("diora555@gmail.com","Sonics123");

        }
        @When("Customer can  purchase jewelry")
        public void customer_can_purchase_jewelry(){
            orders.ordersCheckout();

            orders.checkout();
            orders.ordersCheck();



        }
        @Then("Customer should verify order number")
        public void customer_should_verify_order_number() {

        }

    }
