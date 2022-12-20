package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SecondShoppingCart {

    @FindBy (xpath = "//*[contains(text(),'Shopping')]")
    @CacheLookup
    WebElement shoppingCartLink;

    @FindBy(css = "#termsofservice")
    @CacheLookup
    WebElement termsOfServices;

    @FindBy(css = "#checkout" )
    @CacheLookup
    WebElement checkoutButton;
    public void checkout() {//verb
        shoppingCartLink.click();
        termsOfServices.click();
        checkoutButton.click();
    }
}
