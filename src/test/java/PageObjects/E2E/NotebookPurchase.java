package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class NotebookPurchase {
    Actions action = new Actions(driver);
    @FindBy(css = "[href=\"/computers\"]")
    @CacheLookup
    WebElement computers;


    @FindBy(css = "[href=\"/notebooks\"]")
    @CacheLookup
    WebElement notebooks;

    @FindBy(css = ".product-box-add-to-cart-button")
    @CacheLookup
    WebElement addtocart;

    public static String url = "https://demowebshop.tricentis.com/";

    public void home(){

        driver.get(url);
    }


    public void cart(){

        action.moveToElement(computers).perform();
        notebooks.click();
        addtocart.click();
    }

}
