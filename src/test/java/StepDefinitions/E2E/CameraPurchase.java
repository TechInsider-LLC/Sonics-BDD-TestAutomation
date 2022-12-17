package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class CameraPurchase {
    PageObjects.E2E.CameraPurchase cameraPurchase = PageFactory.initElements(driver, PageObjects.E2E.CameraPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver, PageObjects.ShoppingCart.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver, PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver, PageObjects.CheckOutAsGuest.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);


    @When("User purchase a camera")
    public void user_purchase_a_camera() {
        cameraPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str", "11218", "3475612347");
    }


    @When("Registered user purchase a camera")
    public void registered_user_purchase_a_camera() {
        logIn.with("sayora.saadat@gmail.com", "Imona2580");
        cameraPurchase.homepage();
        cameraPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();

    }
}