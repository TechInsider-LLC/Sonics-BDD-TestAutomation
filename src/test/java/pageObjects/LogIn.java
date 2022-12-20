package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class LogIn {
    public String url="https://demowebshop.tricentis.com/login";
    @FindBy(css = "#Email")
    @CacheLookup
    WebElement Email;

    @FindBy(css = "#Password")
    @CacheLookup
    WebElement Password;

    @FindBy(css = ".ico-logout")
    @CacheLookup
    WebElement LogOut;
    @FindBy(css = ".validation-summary-errors li")
    @CacheLookup
    WebElement WrongPasswordMessage;

    @FindBy(css = ".field-validation-error")
    @CacheLookup
    WebElement isPleaseEnterAValidEmailAddress;

    @FindBy(css = ".validation-summary-errors li")
    @CacheLookup
    WebElement isNoCustomerAccountFound;
    public void with(String username, String password){
        Email.sendKeys(username);
        Password.sendKeys(password,Keys.ENTER);

    }
    public void visit(){

        driver.get(url);
    }

    public boolean isSuccessMessagePresent(){

        return LogOut.isDisplayed();
    }
    public boolean isWrongPasswordMessagePresent(){

        String expected = "The credentials provided are incorrect";
        String actual = WrongPasswordMessage.getText();
        return expected.equals(actual);
    }
    public boolean isPleaseEnterAValidEmailAddress(){
        String expected = "Please enter a valid email address.";
        String actual = isPleaseEnterAValidEmailAddress.getText();
        return expected.equals(actual);
    }
    public boolean isNoCustomerAccountFound(){
        String expected = "No customer account found";
        String actual = isNoCustomerAccountFound.getText();
        return expected.equals(actual);
    }
}
