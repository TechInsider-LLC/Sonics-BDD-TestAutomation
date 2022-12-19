package StepDefinitions.E2E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;


public class BookPurchase {
    PageObjects.E2E.BookPurchase bookPurchase = PageFactory.initElements(driver, PageObjects.E2E.BookPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver, PageObjects.ShoppingCart.class);
    PageObjects.SecondShoppingCart secondShoppingCart = PageFactory.initElements(driver,PageObjects.SecondShoppingCart.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver,PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver,PageObjects.CheckOutAsGuest.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver,PageObjects.LogIn.class);

    @Given("Guest User is on the Homepage")
    public void guest_user_is_on_the_homepage() {
        bookPurchase.homepage();
    }
    @When("Guest User buys a book")
    public void guest_user_buys_a_book() {
            bookPurchase.addToCartProcess();
            shoppingCart.checkout();
            checkOutAsGuest.checkOut();
            checkout.checkoutAsGuest("Diane","Clark","kdb@gmail.com","United States","Gfed","vjh dv dv","12345","1234567890");

    }
    @Then("Guest User gets the success message")
    public void guest_user_gets_the_success_message() {
        assertTrue(checkout.isOrderMessagePresent());
    }



    @Given("Registered User is on the Homepage")
    public void registered_user_is_on_the_homepage() {
        logIn.visit();
    }

    @When("Registered User purchases a book")
    public void registered_user_purchases_a_book() {
        logIn.with("inogomovam@gmail.com","Dina1234");
        bookPurchase.homepage();
        bookPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();
    }

    @Then("Registered User gets the success message")
    public void registered_user_gets_the_success_message() {
        assertTrue(checkout.isOrderMessagePresent());
    }

}
