package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.wait;

public class DigitalDownloadCheckout {
    @FindBy(css ="#BillingNewAddress_FirstName")
    @CacheLookup
    WebElement firstName;

    @FindBy(css ="#BillingNewAddress_LastName")
    @CacheLookup
    WebElement lastName;

    @FindBy(css ="#BillingNewAddress_Email")
    @CacheLookup
    WebElement email;

    @FindBy(css ="#BillingNewAddress_CountryId")
    @CacheLookup
    WebElement country;

    @FindBy(css ="#BillingNewAddress_City")
    @CacheLookup
    WebElement city;

    @FindBy(css ="#BillingNewAddress_Address1")
    @CacheLookup
    WebElement address;

    @FindBy(css ="#BillingNewAddress_ZipPostalCode")
    @CacheLookup
    WebElement zipCode;

    @FindBy(css ="#BillingNewAddress_PhoneNumber")
    @CacheLookup
    WebElement phoneNum;

    @FindBy(css = ".title")
    @CacheLookup
    WebElement successMessage;

    @FindBy(css=".new-address-next-step-button")
    @CacheLookup
    WebElement billingAddress;

    @FindBy(css="#shipping-buttons-container .button-1")
    @CacheLookup
    WebElement shippingAddress;

    @FindBy(css = ".shipping-method-next-step-button")
    @CacheLookup
    WebElement shippingMethod;

    @FindBy(css = ".payment-method-next-step-button")
    @CacheLookup
    WebElement paymentMethod;

    @FindBy(css=".payment-info-next-step-button")
    @CacheLookup
    WebElement paymentInfo;

    @FindBy(css=".confirm-order-next-step-button")
    @CacheLookup
    WebElement orderNumber;

    public void checkout(String FirstName, String LastName, String Email, String Country, String City, String Address, String ZipCode, String PhoneNum) {
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        email.sendKeys(Email);
        country.sendKeys(Country, Keys.ENTER);
        city.sendKeys(City);
        address.sendKeys(Address);
        zipCode.sendKeys(ZipCode);
        phoneNum.sendKeys(PhoneNum);


        billingAddress.click();
       /* shippingAddress.click();
        shippingMethod.click();*/
        paymentMethod.click();
        paymentInfo.click();
        orderNumber.click();
    }

    public void checkOut() {
        billingAddress.click();
        /*shippingAddress.click();
        shippingMethod.click();*/
        paymentMethod.click();
        paymentInfo.click();
        orderNumber.click();
    }

    public boolean isSuccessMessagePresent(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".order-completed-continue-button"))).getText();
        String expected = "Your order has been successfully processed!";
        String actual = successMessage.getText();
        return expected.equals(actual);
    }
}
