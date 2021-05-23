package stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginpage;

public class loginsteps {


    public static  WebDriver driver;
    loginpage loginpage;
    @Given("User is on the {string} url")
    public void user_is_on_the_url(String url) {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }

    /* @Given("User logs in with username, password")
    public void user_logs_is_with_username_password() {
        /*driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();*/
        //login.username.sendKeys("standard_user");
        //login.typeusername("standard_user");
        //login.password.sendKeys("secret_sauce");
        //login.loginbutton.click();*/

        @Given("User logs in with {string}, {string}")
        public void user_logs_in_with(String username, String password) {
            loginpage = new loginpage(driver);
            loginpage.typeusername(username);
            loginpage.typpassword(password);


    }
    @Then("User clicks login")
    public void user_clicks_login() {
            loginpage.login();

    }
    @Then("user is on inventory page")
    public void user_is_on_inventory_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html"));
    }

    @Given("User logs in with invalid {string}, {string}")
    public void user_logs_in_with_invalid(String user, String pass) {
        loginpage = new loginpage(driver);
        loginpage.typeusername(user);
        loginpage.typpassword(pass);

    }

    @Then("user clicks login")
    public void userClicksLogin() {
        loginpage.login();
    }

    @Then("User should see a message error")
    public void user_should_see_a_message_error() {
          Assert.assertTrue(loginpage.messegeerror());
        }



}
