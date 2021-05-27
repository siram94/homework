package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {


    public WebDriver driver;
    public checkoutpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
}
@FindBy(id = "first-name")
    WebElement firstname;
    public void setFirstname(String firstname1){
        firstname.sendKeys(firstname1);
    }
    @FindBy(id = "last-name")
    WebElement lastname;
    public void setLastname(String lastname1){
        lastname.sendKeys(lastname1);
    }
    @FindBy(id ="postal-code")
    WebElement zipcode;
    public void setZipcode(String zipcode1){
        zipcode.sendKeys(zipcode1);
    }
    @FindBy(id = "cancel")
    WebElement cancel;
    public void cancel(){
        cancel.click();

    }
    @FindBy(id = "continue")
    WebElement Continue;
    public void Continuee(){
        Continue.click();
    }
@FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement messageerror;
    public boolean messageerrror(){
        return messageerror.isDisplayed();

    }
}
