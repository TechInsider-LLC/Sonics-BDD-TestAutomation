package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.wait;

public class ReorderProduct {
    public String url = "https://demowebshop.tricentis.com/";
    String name;
    @FindBy(css = ".footer-menu-wrapper [href=\"/customer/orders\"]")
    @CacheLookup
    WebElement orders;

    @FindBy(css = ".order-details-button")
    @CacheLookup
    WebElement getOrders;


    @FindBy(css = ".re-order-button")
    @CacheLookup
    WebElement reorder;

    @FindBy(css ="#termsofservice")
    @CacheLookup
    WebElement termOfService;

    @FindBy(css =".checkout-button")
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

    @FindBy(css = ".title")
    @CacheLookup
    WebElement OrderMessage;


    public void checkout(){
        orders.click();
        getOrders.click();
        reorder.click();
        termOfService.click();
        checkout.click();
        billingButtons.click();
        shippingButtons.click();
        shippingMethodButtons.click();
        paymentMethodButton.click();
        paymentInfoButton.click();
        confirmOrderButton.click();

    }
    public boolean isOrderMessagePresent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".order-completed-continue-button"))).getText();
        String expected = "Your order has been successfully processed!";
        String actual = OrderMessage.getText();
        return expected.equals(actual);


    }



}











