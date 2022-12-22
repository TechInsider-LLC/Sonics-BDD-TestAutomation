package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class MyAddress {

    public String url = "https://demowebshop.tricentis.com/";

    @FindBy(css = ".footer-menu-wrapper [href=\"/customer/addresses\"]")
    @CacheLookup
    WebElement addresss;

    @FindBy(css = ".add-button .add-address-button")
    @CacheLookup
    WebElement addNewButton;

    @FindBy(xpath = "//*[@class='title']/*[contains(text(),'Liza')]/../..//*[@class='buttons']/*[@value='Edit']")
    @CacheLookup
    WebElement editButton;
    @FindBy(xpath = "//*[@class='title']/*[contains(text(),'Liza')]/../..//*[@class='buttons']/*[@value='Delete']")
    @CacheLookup
    WebElement deleteButton;


    @FindBy(css = "#Address_FirstName")
    @CacheLookup
    WebElement firstName;

    @FindBy(css = "#Address_LastName")
    @CacheLookup
    WebElement lastName;

    @FindBy(css = "#Address_Email")
    @CacheLookup
    WebElement email;

    @FindBy(css = "#Address_CountryId")
    @CacheLookup
    WebElement country;

    @FindBy(css = "#Address_City")
    @CacheLookup
    WebElement city;

    @FindBy(css = "#Address_Address1")
    @CacheLookup
    WebElement address;

    @FindBy(css = "#Address_ZipPostalCode")
    @CacheLookup
    WebElement zipCode;

    @FindBy(css = "#Address_PhoneNumber")
    @CacheLookup
    WebElement phoneNumber;

    @FindBy(css = ".buttons .save-address-button")
    @CacheLookup
    WebElement saveButton;

    @FindBy(css = "#Address_Company")
    @CacheLookup
    WebElement company;

    @FindBy(css = "#Address_FaxNumber")
    @CacheLookup
    WebElement faxNumber;

    @FindBy(xpath = "//*[@class='title']/*[contains(text(),'Liza Sankovsky')]")
    @CacheLookup
    WebElement customerNameActualResult;

    @FindBy(xpath = "//*[@class='company']/..//*[contains(text(),'Lala Island')]")
    @CacheLookup
    WebElement presentChangesActualResult;

    @FindBy(xpath = "//*[@class='title']/*[contains(text(),'Eduard W4RRGDGS')]")
    @CacheLookup
    WebElement newAddressDeletedActualResult;

    public void homepage() {
        driver.get(url);
    }

    public void changeProcess(){
        addresss.click();
    }

    public void addNewAddress(){
        addNewButton.click();
    }
    public void editAddress(){
        editButton.click();
    }
    public void deleteAddress(){
        deleteButton.click();
    }

    public void createNewAccount(String FirstName, String LastName, String Email, String Country, String City, String Address, String ZipCode, String PhoneNumber) {
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        email.sendKeys(Email);
        country.sendKeys(Country);
        city.sendKeys(City);
        address.sendKeys(Address);
        zipCode.sendKeys(ZipCode);
        phoneNumber.sendKeys(PhoneNumber);
        saveButton.click();
    }

    public void editToMyAddress(String Company, String FaxNumber){
        company.sendKeys(Company);
        faxNumber.sendKeys(FaxNumber);
        saveButton.click();
    }

    public boolean isCustomerNamePresent(){
        String expected = "Liza Sankovsky";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='title']/*[contains(text(),'Liza Sankovsky')]")));
        String actual = customerNameActualResult.getText();

        if (actual.equals("")){
            return false;
        }else{
            return expected.contains(actual);
        }
    }

 public boolean areChangesPresent(){
        String expected = "Lala Island";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='company']/..//*[contains(text(),'Lala Island')]")));
        String actual = presentChangesActualResult.getText();
     if (actual.equals("")){
         return false;
     }else{
         return expected.contains(actual);
     }
    }

 public boolean isTheNewAddressIsDeleted(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String expected = "Eduard W4RRGDGS";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='title']/*[contains(text(),'Eduard W4RRGDGS')]")));
        String actual = newAddressDeletedActualResult.getText();
     if (actual.equals("")){
         return false;
     }else{
         return expected.contains(actual);
     }
    }


}


