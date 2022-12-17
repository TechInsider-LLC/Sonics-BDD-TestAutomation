package StepDefinitions.E2E;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import static utilities.Hooks.driver;


public class accessories {
    PageObjects.E2E.AccessoriesPurchase accessoriesPurchase = PageFactory.initElements(driver,PageObjects.E2E.AccessoriesPurchase.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver,PageObjects.ShoppingCart.class);
    PageObjects.Checkout checkout = PageFactory.initElements(driver, PageObjects.Checkout.class);
    PageObjects.CheckOutAsGuest checkOutAsGuest = PageFactory.initElements(driver, PageObjects.CheckOutAsGuest.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @When("User buys accessories")
    public void user_buys_accessories() {
        accessoriesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkOutAsGuest.checkOut();
        checkout.checkoutAsGuest("Alisa", "Li", "Smart123@gmail.com", "United States", "Brooklyn", "531E7th str","11218","3475612347");

    }

    @When("Registered user buys accessories")
    public void registered_user_buys_accessories() {
        logIn.with("Smart123@gmail.com","Kim123" );
        accessoriesPurchase.webpage();
        accessoriesPurchase.addToCartProcess();
        shoppingCart.checkout();
        checkout.checkout();

    }
}
