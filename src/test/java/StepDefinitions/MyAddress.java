package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.RandomGmail;

import static org.junit.Assert.assertTrue;
import static utilities.Hooks.driver;

public class MyAddress {

    PageObjects.MyAddress myAddress = PageFactory.initElements(driver, PageObjects.MyAddress.class);
    PageObjects.LogIn logIn = PageFactory.initElements(driver, PageObjects.LogIn.class);

    @Given("User logs in")
    public void user_logs_in() {
       logIn.visit();
       logIn.with("ergwef@gmail.com","Dina1234");
    }

    @When("User creates a new address")
    public void user_creates_a_new_address()  {
        myAddress.homepage();
        myAddress.changeProcess();
        myAddress.addNewAddress();
        myAddress.createNewAccount("Liza","Sankovsky", RandomGmail.getRandomGmail(4),"United States","Alabama","KDnfd","12344","1234567890");
    }

    @Then("User gets the message")
    public void user_gets_the_message()  {
        assertTrue(myAddress.isCustomerNamePresent());
    }

    @When("User edits the address")
    public void user_edits_the_address() {
        myAddress.homepage();
        myAddress.changeProcess();
        myAddress.editAddress();
        myAddress.editToMyAddress("Lala Island","1234567890");

    }
    @Then("User gets the edit message")
    public void user_gets_the_edit_message() {
        assertTrue(myAddress.areChangesPresent());
    }


    @When("User deletes the address")
    public void user_deletes_the_address() {
        myAddress.homepage();
        myAddress.changeProcess();
        myAddress.deleteAddress();
    }
    @Then("User gets the delete message")
    public void user_gets_the_delete_message() {
        assertTrue(myAddress.isTheNewAddressIsDeleted());
    }

}
