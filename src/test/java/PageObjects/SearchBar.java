package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import static utilities.Hooks.driver;
public class SearchBar {
  public  String url="https://demowebshop.tricentis.com/";
    @FindBy(css=".search-box #small-searchterms")
    @CacheLookup
    WebElement searchBar;

    @FindBy(css=".search-box-button ")
    @CacheLookup
    WebElement searchButton;

    @FindBy(css=".product-title [href=\"/health\"]")
    @CacheLookup
    WebElement isHealthBook;

  public void homepage(){
      driver.get(url);
  }
  public void searchProcess(String name){
      searchBar.sendKeys(name);
      searchButton.click();
  }
  public boolean isHealthBookFound(){
     String expected = "Health Book";
     String actual = driver.findElement(By.cssSelector(".product-title [href=\"/health\"]")).getText();
     return (expected.contains(actual));
  }
}
