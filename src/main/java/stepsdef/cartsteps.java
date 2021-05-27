package stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.cartpage;

public class cartsteps {

    WebDriver driver = loginsteps.driver;
    pages.cartpage cartpage = new cartpage(driver);


    @Given("user navigate to the cart")
    public void user_navigate_to_the_cart() {
        cartpage.cart();
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }

    @Then("user should be able to continue  shopping")
    public void user_should_be_able_to_continue_shopping() {
        cartpage.Continueshopping();
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
        driver.navigate().back();
    }

    @Then("user should be able to checkout")
    public void user_should_be_able_to_checkout() {
        cartpage.Checkout();
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));

    }


}
