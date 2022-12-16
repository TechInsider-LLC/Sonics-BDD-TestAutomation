package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CheckOutAsGuest;
import pageObjects.Checkout;
import static org.junit.Assert.assertTrue;
import static utility.Hooks.driver;


public class accessories {
    pageObjects.AccessoriesPurchase accessoriesPurchase = PageFactory.initElements(driver,pageObjects.AccessoriesPurchase.class);
    pageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver,pageObjects.ShoppingCart.class);
    pageObjects.Checkout checkout = PageFactory.initElements(driver, pageObjects.Checkout.class);
    pageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver, pageObjects.CheckOutAsGuest.class);
    pageObjects.LogIn logIn = PageFactory.initElements(driver, pageObjects.LogIn.class);
    @Given("User is on the web page")
    public void user_is_on_the_web_page() {

    }
    @When("User buys accessories")
    public void user_buys_accessories() {
        accessoriesPurchase.webpage();
        accessoriesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str","11218","3475612347");
    }
    @Then("User gets order message")
    public void user_gets_order_message() {
        assertTrue(checkout.isOrderMessagePresent());
    }

    @Given("Registered user on web page")
    public void registered_user_on_web_page() {

    }
    @When("Registered user buys accessories")
    public void registered_user_buys_accessories() {
        logIn.visit();
        logIn.with("Smart123@gmail.com","Kim123" );
        accessoriesPurchase.webpage();
        accessoriesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();

    }
    @Then("Registered user gets order message")
    public void registered_user_gets_order_message() {
        assertTrue(checkout.isOrderMessagePresent());
    }
}
