package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class ShoppingCart {

    PageObjects.BarNotification notification = PageFactory.initElements(driver, PageObjects.BarNotification.class);

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
