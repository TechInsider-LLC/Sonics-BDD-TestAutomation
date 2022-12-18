package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class DigitalDownloadPurchase {
    @FindBy(css = ".top-menu [href=\"/digital-downloads\"]")
    @CacheLookup
    WebElement digitalDownloads;

    @FindBy(css = ".product-title [href=\"/music-2\"]")
    @CacheLookup
    WebElement productTitle;

    @FindBy(css = "#add-to-cart-button-52")
    @CacheLookup
    WebElement addToCartButton;

    public String url = "https://demowebshop.tricentis.com/";

    public void homepage(){
        driver.get(url);
    }



    public void addToCartProcess(){
       digitalDownloads.click();
       productTitle.click();
       addToCartButton.click();
    }
}
