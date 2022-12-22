package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class Orders {
    public String url= "https://demowebshop.tricentis.com/";

    public void homepage() {
        driver.get(url);
    }



    //Actions action = new Actions(driver);
    @FindBy(css = "[href=\"/jewelry\"]")
    @CacheLookup
    WebElement jewelry;

    @FindBy(xpath = "//*[@class=\"details\"]//*[text()=\"Black & White Diamond Heart\"]")
    @CacheLookup
    WebElement jewelyImage;

    @FindBy(css = "#add-to-cart-button-14")
    @CacheLookup
    WebElement addToCartButton;

 @FindBy(css = "#topcartlink ")
 @CacheLookup
 WebElement cart;

 @FindBy(css = "#termsofservice")
 @CacheLookup
 WebElement termsOfService;

 @FindBy(css = ".checkout-buttons #checkout")
 @CacheLookup
 WebElement checkout;
    @FindBy(css = "#billing-buttons-container .new-address-next-step-button")
    @CacheLookup
    WebElement billingButtons;
    @FindBy(css = "#shipping-buttons-container .new-address-next-step-button")
    @CacheLookup
    WebElement shippingButtons;
    @FindBy(css = ".shipping-method-next-step-button")
    @CacheLookup
    WebElement shippingMethodButtons;
    @FindBy(css = ".payment-method-next-step-button")
    @CacheLookup
    WebElement paymentMethodButton;
    @FindBy(css = ".payment-info-next-step-button")
    @CacheLookup
    WebElement paymentInfoButton;
    @FindBy(css = ".confirm-order-next-step-button")
    @CacheLookup
    WebElement confirmOrderButton;

    @FindBy(css = ".column my-account[href=\"/customer/orders\"]")
    @CacheLookup
    WebElement customerOrders;

    String orderNumber;

      public void ordersCheckout() {
         // action.moveToElement(jewelry).perform();
          jewelry.click();
          jewelyImage.click();
          addToCartButton.click();
          cart.click();
          termsOfService.click();
          checkout.click();
      }
    public void checkout(){
        billingButtons.click();
        shippingButtons.click();
        shippingMethodButtons.click();
        paymentMethodButton.click();
        paymentInfoButton.click();
        confirmOrderButton.click();
        
    }
    public void ordersCheck(){
       // action.moveToElement(customerOrders).perform();
        customerOrders.click();
    }
   /* public boolean isOrderNumberPresentOrders(){
          String expected=orderNumber;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".))).getText();
    }*/
}
