package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utility.Hooks.driver;

public class GiftCardPurchase {

    PageObjects.E2E.GiftCardPurchase giftCardPurchase = PageFactory.initElements(driver,PageObjects.E2E.GiftCardPurchase.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver,PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver,PageObjects.CheckOutAsGuest.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver,PageObjects.ShoppingCart.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver,PageObjects.LogIn.class);

    @When("User buys Gift Card")
    public void user_buys_gift_card() {
        giftCardPurchase.homepage();
        giftCardPurchase.cart("Anna", "Liza");
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Teo","Aller","Teo@gmail.com","United States","Alexandria","2234 Pickett street","12345","1234567899");
    }


    @When("Registered User buys Gift Card")
    public void registered_user_buys_gift_card() {

        logIn.with("Katerina@gmail.com", "Kate20");
        giftCardPurchase.homepage();
        giftCardPurchase.cart("Anna", "Katerina");
        shoppingCart.checkout();
        checkout.checkout();
    }

}
