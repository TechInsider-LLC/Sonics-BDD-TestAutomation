package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BarNotification {
    @FindBy(css="#bar-notification .close")
    @CacheLookup
    WebElement notification;

    public void close(){
        notification.click();
    }
}
