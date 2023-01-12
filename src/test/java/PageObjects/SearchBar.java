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

    @FindBy(css= ".product-title [href=\"/health\"]")
    @CacheLookup
    WebElement healthBookActualResult;

  public void homepage(){
      driver.get(url);
  }
  public void searchProcess(String name){
      searchBar.sendKeys(name);
      searchButton.click();
  }
  public boolean isHealthBookFound(){
     String expected = "Health Book";
     String actual = healthBookActualResult.getText();
      if (actual.equals("")){
          return false;
      }else{
          return expected.contains(actual);
      }
  }
}
