package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.RandomName;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class UpdateCustomerInfo {
    public String url = "https://demowebshop.tricentis.com/";
    String name;
    @FindBy(css = ".header-links [href=\"/customer/info\"]")
    @CacheLookup
    WebElement myAccount;

    @FindBy(css = "#FirstName")
   // @CacheLookup
    WebElement firstName;

    @FindBy(css = "#LastName")
    @CacheLookup
    WebElement lastName;


    @FindBy(css = ".buttons")
    @CacheLookup
    WebElement saveButton;
    @FindBy(css="#FirstName")
   // @CacheLookup
    WebElement updateName;


    public void homepage() {
        driver.get(url);
    }
    public void with(String FirstName, String LastName) {
        name = FirstName;
        myAccount.click();
        firstName.clear();
        firstName.sendKeys(FirstName);
        lastName.clear();
        lastName.sendKeys(LastName);
        saveButton.click();
    }

    public  boolean isNameUpdated() {
        String expected = name;
        String actual = updateName.getText();
        if (actual.equals("")){
            return false;
        }else{
            return expected.contains(actual);
        }
    }

}


