package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inventoryitemspage {

    public WebDriver driver;
    public inventoryitemspage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement select;
    public void setSelect(){
        select.click();
    }

    @FindBy(xpath = "//div[contains(@class,'inventory_details_desc large_size') ]")
    WebElement information ;
    public boolean Information(){
       return information.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class,'inventory_details_price') ]")
    WebElement price;

    public boolean price() {
       return price.isDisplayed();

    }
    @FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")
    WebElement image;
    public boolean image (){
        return image.isDisplayed();
    }
    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addtocart;
    public void adtocart(){
        addtocart.click();
    }
    @FindBy(id = "back-to-products")
    WebElement returnto;
    public void backtoproductes(){
        returnto.click();
    }
}
