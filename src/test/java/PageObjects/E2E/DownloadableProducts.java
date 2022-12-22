package PageObjects.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class DownloadableProducts {
    Actions action  = new Actions(driver);


    @FindBy(css = ".top-menu [href=\"/digital-downloads\"]")
    @CacheLookup
    WebElement digitalDownloads;

    @FindBy(css = ".product-title [href=\"/music-2\"]")
    @CacheLookup
    WebElement productTitle;

    @FindBy(css = "#add-to-cart-button-52")
    @CacheLookup
    WebElement addToCartButton;


    String orderNumber;

    @FindBy(css = ".header-links [href=\"/customer/info\"]")
    //@CacheLookup
    WebElement myAccount;

    @FindBy(css = ".list [href=\"/customer/downloadableproducts\"]")
    @CacheLookup
    WebElement downloadableProduct;

    @FindBy(css = ".new-address-next-step-button")
    @CacheLookup
    WebElement billingContinue;

    @FindBy(css = ".payment-method-next-step-button")
    @CacheLookup
    WebElement paymentMethod;

    @FindBy(css = ".payment-info-next-step-button")
    @CacheLookup
    WebElement paymentInfo;

    @FindBy(css = ".confirm-order-next-step-button")
    @CacheLookup
    WebElement confirm;

    @FindBy(css = ".details")
    @CacheLookup
    WebElement orderNumbers;

    public void addToCartProcess(){
        digitalDownloads.click();
        productTitle.click();
        addToCartButton.click();
    }
    public void myAccount(){
        WebElement doubleclick = driver.findElement(By.cssSelector(".header-links [href=\"/customer/info\"]"));
        action.contextClick(doubleclick).perform();


        // myAccount.click(); //replace with
        downloadableProduct.click();
    }
    public void checkout(){
        billingContinue.click();
        paymentMethod.click();
        paymentInfo.click();
        confirm.click();
        orderNumber = extractOrderNumber();
    }

    private String extractOrderNumber() {
        //1. find an element and call getText()
        orderNumbers.getText();
        //you should have this text -> Order number: 1340627

        //2. get the numbers out

        return extractOrderNumber();
        //3. return the order number


    }

    public boolean isExpectedOrderNumberPresent(){
        String expected = orderNumber;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='title']/*[contains(text(),'')]")));
        String actual = driver.findElement(By.xpath("//*[@class='title']/*[contains(text(),'')]")).getText();
        return (expected.contains(actual));
        ////*[@class='page-body']/*[contains(text(),'')]
    }
}
