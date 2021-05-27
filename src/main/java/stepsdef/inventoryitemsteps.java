package stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.inventoryitemspage;
import pages.inventorypage;

public class inventoryitemsteps {

    WebDriver driver = loginsteps.driver;
   pages.inventoryitemspage inventoryitemspage= new inventoryitemspage(driver);

    @Given("user selects  the product")
    public void userSelectsTheProduct() {
        inventoryitemspage.setSelect();
    }

    @Given("the user should be able to get the information about the item")
    public void the_user_should_be_to_get_the_information_about_the_item() {
        inventoryitemspage = new inventoryitemspage(driver);

     Assert.assertTrue(inventoryitemspage.Information());

    }

    @Given("the user should see the price of the item")
    public void the_user_should_see_the_price_of_the_item() {
        Assert.assertTrue(inventoryitemspage.price());
    }

    @Then("the user should be able to see the picture of the item")
    public void the_user_should_be_able_to_see_the_picture_of_the_item() {
        Assert.assertTrue(inventoryitemspage.image());
    }

    @Then("the user should be able to remove the item")
    public void the_user_should_be_able_to_remove_the_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to add to cart the item")
    public void the_user_should_be_able_to_return_back_to_the_products() {
       inventoryitemspage.adtocart();
    }


    @Then("the user should be able to return back to the products")
    public void theUserShouldBeAbleToReturnBackToTheProducts() {
        inventoryitemspage.backtoproductes();
    }

}
