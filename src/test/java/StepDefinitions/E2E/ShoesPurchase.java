package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class ShoesPurchase {
    PageObjects.E2E.ShoesPurchase shoesPurchase = PageFactory.initElements(driver,PageObjects.E2E.ShoesPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver,PageObjects.ShoppingCart.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver, PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver, PageObjects.CheckOutAsGuest.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @When("Guest User purchase a Shoes")
    public void guest_user_purchase_a_shoes() {
        shoesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str","11218","3475612347");

    }

    @When("Registered User purchase a Shoes")
    public void registered_user_purchase_a_shoes() {
        logIn.with("inogomovam@gmail.com","Dina1234" );
        shoesPurchase.webpage();
        shoesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();

    }
}
