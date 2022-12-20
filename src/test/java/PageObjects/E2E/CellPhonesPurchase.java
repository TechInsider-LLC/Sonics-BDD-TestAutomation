package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

import static utilities.Hooks.driver;

public class CellPhonesPurchase {
    public String url="https://demowebshop.tricentis.com/login";
    Actions action = new Actions(driver);
    @FindBy(css=".top-menu [href=\"/electronics\"]")
    @CacheLookup
    WebElement electronics;
    @FindBy(css=".top-menu [href=\"/cell-phones\"]")
    @CacheLookup
    WebElement cellPhones;
    @FindBy(css=".picture [href=\"/phone-cover\"]")
    @CacheLookup
    WebElement phoneCover;
    @FindBy(css=".attributes #product_attribute_80_2_37")
    @CacheLookup
    WebElement samsung;

    @FindBy(css=".attributes #product_attribute_80_1_38")
    @CacheLookup
    WebElement blackColor;
    @FindBy(css=".add-to-cart #add-to-cart-button-80")
    @CacheLookup
    WebElement addToCartButton;
    public void homePage(){
        driver.get(url);
    }
    public void addToCartProcess(){
        action.moveToElement(electronics).perform();
        cellPhones.click();
        phoneCover.click();
        samsung.click();
        blackColor.click();
        addToCartButton.click();
    }
}
