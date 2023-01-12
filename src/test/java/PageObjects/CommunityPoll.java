package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.Hooks.driver;
import static utilities.Hooks.wait;

public class CommunityPoll {
    public String url = "https://demowebshop.tricentis.com/";
    public void visit(){
        driver.get(url);}
    @FindBy(css = "#pollanswers-1")
    @CacheLookup
    WebElement excellent;

    @FindBy(css = "#pollanswers-2")
    @CacheLookup
    WebElement good;

    @FindBy(css = "#pollanswers-3")
    @CacheLookup
    WebElement poor;

    @FindBy(css = "#pollanswers-4")
    @CacheLookup
    WebElement veryBad;

    @FindBy(css = ".vote-poll-button")
    @CacheLookup
    WebElement voteButton;

    @FindBy(css = ".poll-vote-error")
    @CacheLookup
    WebElement actualResult;

    public void vote(){
        excellent.click();
        voteButton.click();
    }
    public boolean isErrorMessageDisplayed(){
        String expected= "Only registered users can vote.";
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".poll-vote-error"),expected));
        String actual= actualResult.getText();
        return (expected.equals(actual));
    }


}
