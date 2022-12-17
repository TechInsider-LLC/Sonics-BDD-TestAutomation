package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class CheckOutAsGuest {
    @FindBy (css =".checkout-as-guest-button")
    @CacheLookup
    WebElement checkOutAsGuest;
    public void checkOut(){
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".cart-qty"), "(1)"));
        checkOutAsGuest.click();
    }
}
