package PageObjects.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class BookPurchase{
        @FindBy(css = "[href=\"/books\"]")
        @CacheLookup
        WebElement book;

        @FindBy(css = ".product-title [href=\"/computing-and-internet\"]")
        @CacheLookup
        WebElement bookImage;

        @FindBy(css = ".add-to-cart-panel #add-to-cart-button-13")
        @CacheLookup
        WebElement addToCartButton;

        public String url = "https://demowebshop.tricentis.com/";

        public void homepage(){
            driver.get(url);
        }

        public void addToCartProcess() {
            book.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".product-title [href=\"/computing-and-internet\"]")));
            bookImage.click();
            addToCartButton.click();
        }
    }




