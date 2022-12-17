package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class DesktopPurchase {
    Actions action = new Actions(driver);
    @FindBy(css = "[href=\"/computers\"]")
    @CacheLookup
    WebElement computers;

    @FindBy(css = "[href=\"/desktops\"]")
    @CacheLookup
    WebElement desktops;

    @FindBy(xpath = "//*[@class=\"details\"]//*[text()=\"Build your own expensive computer\"]")
    @CacheLookup
    WebElement desktopImage;


    @FindBy(css = "#product_attribute_74_5_26_82")
    @CacheLookup
    WebElement processor;

    @FindBy(css = "#product_attribute_74_6_27_85")
    @CacheLookup
    WebElement ram;

    @FindBy(css = "#product_attribute_74_3_28_87")
    @CacheLookup
    WebElement hdd;

    @FindBy(css = "#add-to-cart-button-74")
    @CacheLookup
    WebElement addToCartButton;

    //public String url= "https://demowebshop.tricentis.com/";



    public void addToCartProcess(){
        action.moveToElement(computers).perform();
        desktops.click();
        desktopImage.click();
        processor.click();
        ram.click();
        hdd.click();
        addToCartButton.click();



    }
}
