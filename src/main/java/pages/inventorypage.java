package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inventorypage {

    public WebDriver driver;
    public inventorypage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;
    public void Cart () {
        cart.click();
    }
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement select;
    public void setSelect() {
        select.click();

    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
        WebElement nameorprice;

    public void nameorprice(){
        nameorprice.click();
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement menu;
    public void Menu(){
        menu.click();
    }

    }




