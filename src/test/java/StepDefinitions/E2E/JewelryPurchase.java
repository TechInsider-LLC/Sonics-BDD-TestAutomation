package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class JewelryPurchase {
    PageObjects.E2E.JewelryPurchase jewelryPurchase = PageFactory.initElements(driver, PageObjects.E2E.JewelryPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver, PageObjects.ShoppingCart.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver, PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver, PageObjects.CheckOutAsGuest.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @When("User buys Jewelry")
    public void user_buys_jewelry() {
        jewelryPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str", "11218", "3475612347");
    }


    @When("Registered user buys Jewelry")
    public void registered_user_buys_jewelry() {
        logIn.with("sayora.saadat@gmail.com", "Imona2580");
        jewelryPurchase.homepage();
        jewelryPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();
}}


