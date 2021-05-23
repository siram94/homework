package stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.inventorypage;


public class inventorysteps {

     WebDriver driver = loginsteps.driver;
    inventorypage inventorypage= new inventorypage(driver);

    /*@Given("user is on the {string} url")
    public void user_is_on_the_url(String url) {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));

    }
    @Given("And User logs in with {string}, {string}")
    public void and_user_logs_in_with(String username, String password) {
        inventorypage = new inventorypage(driver);
        inventorypage.typeusername(username);
        inventorypage.typpassword(password);
        inventorypage.login();
    }*/
    @Given("user should be able to add to cart")
    public void user_should_be_able_to_add_to_cart() {
    inventorypage.cart();

    }
    @Given("user should be able to select a product")
    public void user_should_be_able_to_select_a_product() {
     inventorypage.slectproduct();

    }
    @Then("user should be able to select the products by name or price")
    public void user_should_be_able_to_select_the_products_by_name_or_price() {
   inventorypage.nameorprice();
    }

}
