package PageObjects.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class JewelryPurchase {
    Actions action = new Actions(driver);
    @FindBy(css = "[href=\"/jewelry\"]")
    @CacheLookup
    WebElement jewelry;

    @FindBy(xpath = "//*[@class=\"details\"]//*[text()=\"Black & White Diamond Heart\"]")
    @CacheLookup
    WebElement jewelyImage;

    @FindBy(css = "#add-to-cart-button-14")
    @CacheLookup
    WebElement addToCartButton;

    public String url = "https://demowebshop.tricentis.com/";

    public void homepage(){
        driver.get(url);
    }
    public void addToCartProcess() {
        action.moveToElement(jewelry).perform();
        jewelry.click();
        jewelyImage.click();
        addToCartButton.click();
    }
}
