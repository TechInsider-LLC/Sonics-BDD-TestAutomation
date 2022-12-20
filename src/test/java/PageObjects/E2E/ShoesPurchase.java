package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class ShoesPurchase {

    public String url = "https://demowebshop.tricentis.com/";

    @FindBy(css = ".top-menu [href=\"/apparel-shoes\"]")
    @CacheLookup
    WebElement apparelAndShoes;

    @FindBy(css = ".product-title [href=\"/blue-jeans\"]")
    @CacheLookup
    WebElement jeansImage;

    @FindBy(css = "#add-to-cart-button-36")
    @CacheLookup
    WebElement addToCartButton;

    public void webpage(){
        driver.get(url);
    }

    public void addToCartProcess() {
        apparelAndShoes.click();
        jeansImage.click();
        addToCartButton.click();

    }
}
