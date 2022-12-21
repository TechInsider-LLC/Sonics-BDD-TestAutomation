package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static utilities.Hooks.driver;

public class CompareTwoProducts {


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

    @FindBy(css = ".side-2 [href=\"/desktops\"]")
    @CacheLookup
    WebElement desktop;
    @FindBy(css = ".side-2 [href=\"/computers\"]")
    @CacheLookup
    WebElement categoryComputers;


    @FindBy(css = "[href=\"/build-your-own-computer\"]")
    @CacheLookup
    WebElement computer;



    @FindBy(css = ".add-to-compare-list-button")
    WebElement addToCompare;



    @FindBy(css = ".clear-list")
    @CacheLookup
    WebElement clearList;




    public static String url = "https://demowebshop.tricentis.com/";

    public void home(){

        driver.get(url);
    }

    public void addToCompare(){
        action.moveToElement(computers).perform();
        notebooks.click();
        notebook.click();
        addToCompare.click();
        categoryComputers.click();
        desktop.click();

        computer.click();
        addToCompare.click();
    }
    public boolean isSuccessMessagePresent(){

        return clearList.isDisplayed(); }
}
