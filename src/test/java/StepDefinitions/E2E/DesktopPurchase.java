package StepDefinitions.E2E;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import static utilities.Hooks.driver;


public class DesktopPurchase {
    PageObjects.E2E.DesktopPurchase desktopPurchase = PageFactory.initElements(driver,PageObjects.E2E.DesktopPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver,PageObjects.ShoppingCart.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver,PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest= PageFactory.initElements(driver, PageObjects.CheckOutAsGuest.class);



    @When("Guest User tries to purchase a Desktop")
    public void guest_user_tries_to_purchase_a_desktop()  {

        desktopPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Diana","Winter","asd@gmail.com","United States","Absdf","qwerty 22","123456","1234567890");







    }




}



