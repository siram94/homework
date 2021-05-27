package stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.checkoutpage;
import pages.inventoryitemspage;

public class checkoutsteps {

    WebDriver driver = loginsteps.driver;
    pages.checkoutpage checkoutpage =new checkoutpage(driver);

    @Given("user insert {string} {string} {string}")
    public void user_insert(String firstname1, String lastname1, String zipcode1) {
     checkoutpage.setFirstname(firstname1);
     checkoutpage.setLastname(lastname1);
     checkoutpage.setZipcode(zipcode1);
    }
    @Given("user should be able to cancel")
    public void user_should_be_able_to_cancel() {
     checkoutpage.cancel();
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
        driver.navigate().back();
    }
    @Then("user should be able to continue")
    public void user_should_be_able_to_continue() {
    checkoutpage.Continuee();
    Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }


    @Given("user click continue")
    public void user_click_continue() {
        checkoutpage.Continuee();
    }
    @Then("user should see a message error")
    public void user_should_see_a_message_error() {
 Assert.assertTrue(checkoutpage.messageerrror());
    }


}
