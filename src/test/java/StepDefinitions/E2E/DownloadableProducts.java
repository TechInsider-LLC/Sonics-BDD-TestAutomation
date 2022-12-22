package StepDefinitions.E2E;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static utilities.Hooks.driver;

public class DownloadableProducts {
    PageObjects.E2E.DownloadableProducts downloadableProducts = PageFactory.initElements(driver, PageObjects.E2E.DownloadableProducts.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);
    PageObjects.ShoppingCart shoppingCart = PageFactory.initElements(driver, PageObjects.ShoppingCart.class);

    @When("User purchases downloadable product")
    public void user_purchases_downloadable_product() {
        logIn.visit();
        logIn.with("Katerina@gmail.com","Kate20");
        downloadableProducts.addToCartProcess();
        shoppingCart.checkout();
        downloadableProducts.checkout();
        downloadableProducts.myAccount();
    }
    @Then("Verify the order number")
    public void verify_the_order_number() {
       
    }
}
