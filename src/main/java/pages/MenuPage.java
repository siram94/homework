package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    public WebDriver driver;
    public MenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement menu;
   public void Menu(){
       menu.click();
    }
    @FindBy(xpath = "//a[text()='About']")
    WebElement elements;

    public void link(String element) {
        elements.click();
    }
    @FindBy(linkText = "https://saucelabs.com/")
    WebElement saucelabs;

    public boolean Saucelabs() {
       return saucelabs.isDisplayed();
    }


}
