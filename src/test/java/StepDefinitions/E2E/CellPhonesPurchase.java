package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class CellPhonesPurchase {
    PageObjects.E2E.CellPhonesPurchase cellPhonesPurchase= PageFactory.initElements(driver,PageObjects.E2E.CellPhonesPurchase.class);
    PageObjects.Checkout checkout=PageFactory.initElements(driver,PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest=PageFactory.initElements(driver,PageObjects.CheckOutAsGuest.class);
    PageObjects.ShoppingCart shoppingCart=PageFactory.initElements(driver,PageObjects.ShoppingCart.class);
    PageObjects.LogIn logIn=PageFactory.initElements(driver,PageObjects.LogIn.class);
    @When("Guest user buys a Phone cover")
    public void guest_user_buys_a_phone_cover() {
        cellPhonesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str","11218","3475612347");
    }
    @When("Registered user buys a Phone cover")
    public void registered_user_buys_a_phone_cover() {
        logIn.with("Smart123@gmail.com","Kim123" );
        cellPhonesPurchase.homePage();
        cellPhonesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();
    }
}
