package PageObjects.E2E;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utility.Hooks.driver;
import static utility.Hooks.wait;

public class AccessoriesPurchase {

    public String url = "https://demowebshop.tricentis.com/";
    Actions action = new Actions(driver);
    @FindBy(css = "[href=\"/computers\"]")
    @CacheLookup
    WebElement computers;
    @FindBy(css = "[href=\"/accessories\"]")
    @CacheLookup
    WebElement accessories;
    @FindBy(css = ".product-title [href=\"/copy-of-tcp-self-paced-training-2\"]")
    @CacheLookup
    WebElement accessoriesImage;
    @FindBy(css = "#add-to-cart-button-66")
    @CacheLookup
    WebElement addToCartButton;
    public void webpage(){
        driver.get(url);
    }
    public void addToCartProcess() {
        action.moveToElement(computers).perform();
        accessories.click();
        accessoriesImage.click();
        addToCartButton.click();



    }
}

