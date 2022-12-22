package PageObjects;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.RandomName;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class UpdateCustomerInfo {
    String name;

    public String url = "https://demowebshop.tricentis.com/";
    @FindBy(css = ".footer-menu-wrapper [href=\"/customer/info\"]")
    @CacheLookup
    WebElement myAccount;

    @FindBy(css = "#FirstName")
    WebElement firstName;

    @FindBy(css = "#LastName")
    @CacheLookup
    WebElement lastName;

    @FindBy(css = ".buttons")
    @CacheLookup
    WebElement saveButton;

   /* @FindBy(css = "#FirstName")
    @CacheLookup
    WebElement actualResult;
*/
    public void homepage() {

        driver.get(url);
    }

    public void with(String FirstName, String LastName) {
        name = String.valueOf(firstName);
        myAccount.click();
        firstName.clear();
        firstName.sendKeys(FirstName);
        lastName.clear();
        lastName.sendKeys(LastName);
        saveButton.click();
    }

    public boolean isFirstNameUpdated() {
        String expected = name;
     //   wait.until(ExpectedConditions.textToBe(By.cssSelector("#FirstName"),expected));
        String actual = firstName.getText();
        return (expected.equals(actual));
    }

}
