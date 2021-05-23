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
    @FindBy(id = "user-name")
    WebElement username ;

    @FindBy(id ="password")
   WebElement password;


    @FindBy(id="login-button")
    WebElement loginbutton;

   @FindBy(id= "add-to-cart-sauce-labs-backpack")
   WebElement addtocart ;

   @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
   WebElement slectaproduct;

   @FindBy(xpath = "//select[@class='product_sort_container']")
   WebElement nameorprice;

   public void typeusername(String user){
        username.sendKeys(user);
    }
    public void typpassword(String pass){
        password.sendKeys(pass);
    }
    public void login() {
        loginbutton.click();

    }
    public void cart(){
       addtocart.click();
        }
        public void slectproduct(){
       slectaproduct.click();
        }
        public void nameorprice(){
       nameorprice.click();
        }

    }