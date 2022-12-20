package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class MyAccountEditAddress {
    Actions action = new Actions(driver);

    @FindBy(css = "#Address_FirstName")
    @CacheLookup
    WebElement firstName;

    @FindBy(css = "#Address_LastName")
    @CacheLookup
    WebElement lastName;

    public void editProcess(String FirstName, String LastName) {
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
    }
}
