package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class CameraPurchase {

        Actions action = new Actions(driver);
        @FindBy(css = ".top-menu [href=\"/electronics\"]")
        @CacheLookup
        WebElement electronics;

        @FindBy(css = ".top-menu [href=\"/camera-photo\"]")
        @CacheLookup
        WebElement camera;

        @FindBy(xpath = "//*[@class=\"product-title\"]//*[text()=\"Digital SLR Camera 12.2 Mpixel\"]")
        @CacheLookup
        WebElement cameraImage;

        @FindBy(css = "#add-to-cart-button-18")
        @CacheLookup
        WebElement addToCartButton;

        public String url = "https://demowebshop.tricentis.com/";

        public void homepage(){
            driver.get(url);
        }
        public void addToCartProcess()  {
            action.moveToElement(electronics).perform();
            camera.click();
            cameraImage.click();
            addToCartButton.click();
        }
    }





