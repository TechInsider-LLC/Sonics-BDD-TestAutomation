package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class NewsLetter {

    public String url = "https://demowebshop.tricentis.com/";

    @FindBy(css = "#newsletter-email")
    @CacheLookup
    WebElement email;

    @FindBy(css = "#newsletter-subscribe-button")
    @CacheLookup
    WebElement subscribeButton;


    public void homepage() {

        driver.get(url);
    }

    public void signUpProcess(String Email) {
        email.sendKeys(Email);
        subscribeButton.click();
    }

    public boolean isSuccessMessagePresent() {
        String expected = "Thank you for signing up!";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".newsletter-result-block")));
        String actual = driver.findElement(By.cssSelector(".newsletter-result-block")).getText();
        return (expected.contains(actual));
    }

    public boolean isFailureMessagePresent() {
        String expected = "Enter valid email";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".newsletter-result-block")));
        String actual = driver.findElement(By.cssSelector(".newsletter-result-block")).getText();
        return (expected.contains(actual));
    }
}