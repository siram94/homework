package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Brokenlinks {
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        //find out all the links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total links is " + links.size());


        int n = 0;
        for(int i = 0; i < links.size(); i++) ;

        if (links.equals(404) ){
            n= n+1;
            System.out.println("there is  broken links");
        }else{
            System.out.println("there is no broken links");
        }

    }
}
