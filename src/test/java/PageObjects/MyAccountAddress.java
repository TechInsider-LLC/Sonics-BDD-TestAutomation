package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountAddress {
    @FindBy(css = ".footer-menu-wrapper [href=\"/customer/addresses\"]")
    @CacheLookup
    WebElement address;

    @FindBy(css = ".buttons .edit-address-button")
    @CacheLookup
    WebElement editButton;

public void changeProcess(){
    address.click();
    editButton.click();

}

}
