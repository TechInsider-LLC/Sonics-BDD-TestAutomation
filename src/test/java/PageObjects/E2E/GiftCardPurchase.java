package PageObjects.E2E;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utility.Hooks.driver;

public class GiftCardPurchase {


    @FindBy(css= "[href=\"/gift-cards\"]")
    @CacheLookup
    WebElement giftcards;

    @FindBy(css = "[href=\"/100-physical-gift-card\"]")
    @CacheLookup
    WebElement giftcard;

    @FindBy(css = "#giftcard_4_RecipientName")
    @CacheLookup
    WebElement recipientsName;

    @FindBy(css = "#giftcard_4_SenderName")
    @CacheLookup
    WebElement yourName;

    @FindBy(css = "#add-to-cart-button-4")
    @CacheLookup
    WebElement addtocart;


    public String url = "https://demowebshop.tricentis.com/";

    public void homepage(){

        driver.get(url);
    }

    public void cart(String RecipientsName, String SendersName){


        giftcards.click();
        giftcard.click();
        recipientsName.sendKeys(RecipientsName);
        yourName.sendKeys(SendersName);
        addtocart.click();

    }
}


