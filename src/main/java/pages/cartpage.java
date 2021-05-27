package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {


    public WebDriver driver;

    public cartpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;
    public void cart () {
        cart.click();
    }

    @FindBy(id = "continue-shopping")
    WebElement continueshopping;
    public void Continueshopping(){
        continueshopping.click();
    }

    @FindBy(id = "checkout")
    WebElement checkout;
    public void Checkout(){
        checkout.click();
    }
}