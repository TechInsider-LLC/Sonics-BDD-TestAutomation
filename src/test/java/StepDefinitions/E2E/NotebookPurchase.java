package StepDefinitions.E2E;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class NotebookPurchase {
    PageObjects.Checkout checkout = PageFactory.initElements(driver,PageObjects.Checkout.class);
    PageObjects.E2E.NotebookPurchase notebookPurchase= PageFactory.initElements(driver, PageObjects.E2E.NotebookPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver,PageObjects.ShoppingCart.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver,PageObjects.CheckOutAsGuest.class);

    @When("Guest user purchases Notebook")
    public void guest_user_purchases_notebook() {

        notebookPurchase.home();
        notebookPurchase.cart();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Teo","Aller","Teo@gmail.com","United States","Alexandria","2234 Pickett street","12345","1234567899");
    }
}
