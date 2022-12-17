package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class Checkout {
    @FindBy(css = ".title")
    @CacheLookup
    WebElement OrderMessage;
    @FindBy(css = "#BillingNewAddress_FirstName")
    @CacheLookup
    WebElement firstname;

    @FindBy(css = "#BillingNewAddress_LastName")
    @CacheLookup
    WebElement lastName;

    @FindBy(css = "#BillingNewAddress_Email")
    @CacheLookup
    WebElement email;

    @FindBy(css = "#BillingNewAddress_CountryId")
    @CacheLookup
    WebElement country;

    @FindBy(css = "#BillingNewAddress_City")
    @CacheLookup
    WebElement city;

    @FindBy(css = "#BillingNewAddress_Address1")
    @CacheLookup
    WebElement address;

    @FindBy(css = "#BillingNewAddress_ZipPostalCode")
    @CacheLookup
    WebElement zipCode;
    @FindBy(css = "#BillingNewAddress_PhoneNumber")
    @CacheLookup
    WebElement phoneNumber;
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

    public void checkoutAsGuest(String FirstName, String LastName, String Email, String Country, String City, String Address, String ZipCode, String PhoneNumber) {

        firstname.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        email.sendKeys(Email);
        country.sendKeys(Country, Keys.ENTER);
        city.sendKeys(City);
        address.sendKeys(Address);
        zipCode.sendKeys(ZipCode);
        phoneNumber.sendKeys(PhoneNumber);
        billingButtons.click();
        shippingButtons.click();
        shippingMethodButtons.click();
        paymentMethodButton.click();
        paymentInfoButton.click();
        confirmOrderButton.click();

    }
    public void checkout(){
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
