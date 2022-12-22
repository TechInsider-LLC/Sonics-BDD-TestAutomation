package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class Register {


    public String url = "https://demowebshop.tricentis.com/register";

    public void visit() {
        driver.get(url);
    }

    @FindBy(css = ".ico-register")
    @CacheLookup
    WebElement register;

    @FindBy(css = "#gender-female")
    @CacheLookup
    WebElement genderFemale;

    @FindBy(css = "#FirstName")
    @CacheLookup
    WebElement firstName;

    @FindBy(css = ".input-validation-error")
    @CacheLookup
    WebElement firstNameRequired;


    @FindBy(css = "#LastName")
    @CacheLookup
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    @CacheLookup
    WebElement lastNameRequired;


    @FindBy(css = "#Email")
    @CacheLookup
    WebElement email;

    @FindBy(css = "#Password")
    @CacheLookup
    WebElement password;

    @FindBy(css = "#ConfirmPassword")
    @CacheLookup
    WebElement confirmPassword;

    @FindBy(css = "#register-button")
    @CacheLookup
    WebElement registerButton;

    @FindBy(css = ".result")
    @CacheLookup
    WebElement successMessagePresentResult;

    @FindBy(css = ".field-validation-error")
    @CacheLookup
    WebElement invalidEmailMessagePresentResult;


    public void process(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        register.click();
        genderFemale.click();
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        email.sendKeys(Email);
        password.sendKeys(Password);
        confirmPassword.sendKeys(ConfirmPassword);
        registerButton.click();
    }

    public boolean isSuccessMessagePresent() {
        String expected = "Your registration completed";
        String actual = successMessagePresentResult.getText();
        if (actual.equals("")) {
            return false;
        } else {
            return expected.contains(actual);
        }
    }

    public boolean isInvalidEmailMessagePresent() {
        String expected = "Wrong email";
        String actual = invalidEmailMessagePresentResult.getText();
        if (actual.equals("")) {
            return false;
        } else {
            return expected.contains(actual);
        }
    }

    public boolean isFailureMessagePresent() {
        String expected = "First name is required.";
        String actual = invalidEmailMessagePresentResult.getText();
        if (actual.equals("")) {
            return false;
        } else {
            return expected.contains(actual);
        }
    }

    public boolean isNotMatchingPasswordPresent() {
        String expected = "The password and confirmation password do not match.";
        String actual = driver.findElement(By.cssSelector(".field-validation-error")).findElement(By.tagName("span")).getText();
        if (actual.equals("")) {
            return false;
        } else {
            return expected.contains(actual);
        }
    }
}


