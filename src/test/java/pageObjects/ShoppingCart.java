package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utility.Hooks.driver;
import static utility.Hooks.wait;

public class ShoppingCart {

    pageObjects.BarNotification notification = PageFactory.initElements(driver, pageObjects.BarNotification.class);

    @FindBy(xpath ="//*[contains(text(),'Shopping')]" )
    @CacheLookup
    WebElement cart;

    @FindBy(css ="#termsofservice")
    @CacheLookup
    WebElement termOfService;

    @FindBy(css =".checkout-buttons #checkout")
    @CacheLookup
    WebElement checkout;



    public void checkout(){
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".cart-qty"), "(1)"));
        notification.close();
        cart.click();
        termOfService.click();
        checkout.click();
    }

}
