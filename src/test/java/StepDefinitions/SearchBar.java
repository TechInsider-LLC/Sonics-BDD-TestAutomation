package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class SearchBar {
    PageObjects.SearchBar searchBar= PageFactory.initElements(driver,PageObjects.SearchBar.class);
    PageObjects.LogIn logIn=PageFactory.initElements(driver,PageObjects.LogIn.class);
    @Given("Guest customer is on the Homepage")
    public void guest_customer_is_on_the_homepage() {
    searchBar.homepage();
    }
    @When("Guest customer searches a Health book")
    public void guest_customer_searches_a_health_book() {
       searchBar.searchProcess("Health Book");
    }
    @Then("Guest customer successfully see a Health book")
    public void guest_customer_successfully_see_a_health_book() {
    assertTrue(searchBar.isHealthBookFound());

    }
    @Given("Registered customer is on the Homepage")
    public void registered_customer_is_on_the_homepage() {
        searchBar.homepage();
    }
    @When("Registered customer searches a Health book")
    public void registered_customer_searches_a_health_book() {
        logIn.visit();
        logIn.with("Smart123@gmail.com" ,"Kim123");
        searchBar.searchProcess("Health Book");
    }
    @Then("Registered customer successfully see a Health book")
    public void registered_customer_successfully_see_a_health_book() {
        assertTrue(searchBar.isHealthBookFound());
    }

}
