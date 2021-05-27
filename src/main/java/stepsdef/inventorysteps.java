package stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.inventorypage;
import pages.loginpage;


public class inventorysteps {

     WebDriver driver = loginsteps.driver;
    inventorypage inventorypage= new inventorypage(driver);




    @Given("user should be able to add to cart")
    public void user_should_be_able_to_add_to_cart() {
        inventorypage.cart();
  driver.navigate().back();
    }
    @Then("user should be able to select a product")
    public void user_should_be_able_to_select_a_product() {
        inventorypage = new inventorypage(driver);
        inventorypage.slectproduct();
driver.navigate().back();
    }
    @And("user should be able to select the products by name or price")
    public void user_should_be_able_to_select_the_products_by_name_or_price() {
        inventorypage.nameorprice();
        driver.navigate().back();
    }

    @Then("user should be able to navigate to the menu")
    public void userShouldBeAbleToNavigateToTheMenu() {
        inventorypage.Menu();
    }
}
