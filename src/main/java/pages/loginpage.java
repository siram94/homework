package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

   public WebDriver driver;
    public loginpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


   // public WebElement username = driver.findElement(By.id("user-name"));
   @FindBy(id="user-name")
   WebElement username;

    public void typeusername(String user) {
        username.sendKeys(user);
    }
    @FindBy(id="password")
    WebElement password ;

    public void typpassword(String pass){
        password.sendKeys(pass);
    }

    @FindBy(id="login-button")
       WebElement loginbutton ;

    public void login(){
        loginbutton.click();
    }
 @FindBy(xpath = "//div[@class='error-message-container error']")
  WebElement messageerror;

 public boolean messegeerror(){
     return messageerror.isDisplayed();
    }

}
