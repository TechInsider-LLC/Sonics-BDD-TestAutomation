package StepDefinitions.E2E;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;
import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class Wishlist {
    @When("User click on the Wishlist")
    public void user_click_on_the_wishlist() {
        driver.findElement(By.cssSelector(".header-links .ico-wishlist")).click();
    }
    @Then("User gets a message")
    public void user_gets_a_message() {
        String expected ="The wishlist is empty!";
        By locator = By.cssSelector(".wishlist-content");
        wait.until(ExpectedConditions.textToBe(locator, expected));
        String actual = driver.findElement(locator).getText();
        assertEquals(expected,actual);

    }


}

