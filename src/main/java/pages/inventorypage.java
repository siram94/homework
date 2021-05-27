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
@FindBy(id = "react-burger-menu-btn")
WebElement menu;

    public void setMenu() {
       menu.click();


    }

    @FindBy(id= "add-to-cart-sauce-labs-backpack")
    WebElement addtocart ;
    public void cart(){
        addtocart.click();
    }

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement slectaproduct;
    public void slectproduct() {
        slectaproduct.click();
    }
        @FindBy(xpath = "//select[@class='product_sort_container']")
        WebElement nameorprice;

    public void nameorprice(){
        nameorprice.click();
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement Menu;
    public void Menu (){
        Menu.click();
    }




    }