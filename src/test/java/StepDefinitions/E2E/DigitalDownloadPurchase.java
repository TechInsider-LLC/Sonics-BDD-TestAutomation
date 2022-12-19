package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class DigitalDownloadPurchase {
    PageObjects.E2E.DigitalDownloadPurchase digitalDownloadPurchase = PageFactory.initElements(driver, PageObjects.E2E.DigitalDownloadPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver, PageObjects.ShoppingCart.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver, PageObjects.CheckOutAsGuest.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);
    PageObjects.DigitalDownloadCheckout digitalDownloadCheckout = PageFactory.initElements(driver, PageObjects.DigitalDownloadCheckout.class);


    @When("User purchase a Digital Downloads")
    public void user_purchase_a_digital_downloads() {
        digitalDownloadPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        digitalDownloadCheckout.checkout("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str", "11218", "3475612347");
    }


    @When("Registered user purchase a Digital Downloads")
    public void registered_user_purchase_a_digital_downloads(){
        logIn.with("sayora.saadat@gmail.com", "Imona2580");
        digitalDownloadPurchase.homepage();
        digitalDownloadPurchase.addToCartProcess();
        shoppingCart.checkout();
        digitalDownloadCheckout.checkOut();
    }
}
