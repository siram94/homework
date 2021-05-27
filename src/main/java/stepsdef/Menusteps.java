package stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MenuPage;


public class Menusteps {

    WebDriver driver = loginsteps.driver;
   MenuPage MenuPage = new MenuPage(driver);




    @Given("the user opens the menu")
    public void the_user_opens_the_menu() {
        MenuPage.Menu();
    }

    @And("the user select {string} in the menu")
    public void the_user_select_in_the_menu(String element) {
        MenuPage.Elements(element);

    }
    @Then("user should be able to land in saucelabs page")
    public void user_should_be_able_to_land_in_saucelabs_page() {
      MenuPage.Saucelabs();
        Assert.assertTrue(driver.getTitle().contains(" Sauce Labs"));
    }
}


