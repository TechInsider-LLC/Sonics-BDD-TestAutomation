package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class AddressChange {

    public String url = "https://demowebshop.tricentis.com/";

    @FindBy(css = ".footer-menu-wrapper [href=\"/customer/addresses\"]")
    @CacheLookup
    WebElement address;

    @FindBy(css = ".buttons .save-address-button")
    @CacheLookup
    WebElement saveButton;


    public void homepage() {
        driver.get(url);
    }

    public void changeProcess(){
        address.click();
    }

    public void saveChanges(){
        saveButton.click();
    }

}


