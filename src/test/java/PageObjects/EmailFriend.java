package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class EmailFriend {
    Actions action = new Actions(driver);

    @FindBy(css = "[href=\"/computers\"]")
    @CacheLookup
    WebElement computers;

    @FindBy(css = "[href=\"/notebooks\"]")
    @CacheLookup
    WebElement notebooks;


    @FindBy(css = "[href=\"/141-inch-laptop\"]")
    @CacheLookup
    WebElement notebook;


    @FindBy(css = ".email-a-friend-button")
    @CacheLookup
    WebElement getSendemailbutton;


    @FindBy(css = "#FriendEmail")
    @CacheLookup
    WebElement friendemail;


    @FindBy(css = "#YourEmailAddress")
    @CacheLookup
    WebElement YourEmailAddress;


    @FindBy(css = ".send-email-a-friend-button")
    @CacheLookup
    WebElement Sendemailbutton;






    public static String url = "https://demowebshop.tricentis.com/";


    public void home(){

        driver.get(url);


            action.moveToElement(computers).perform();
            notebooks.click();
            notebook.click();
            getSendemailbutton.click();
            friendemail.click();
            YourEmailAddress.click();
            Sendemailbutton.click();


        }


    public void getSendemailbutton() {


    }
    public boolean isSuccessMessagePresent(){
        return false;
    }
}





