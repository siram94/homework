package pages;

import io.restassured.RestAssured;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Brokenlinks {
   public static void main (String [] args) {
       System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.demoblaze.com/index.html");



      List<WebElement> links = driver.findElements(By.tagName("a"));
       System.out.println("total links is " +links.size());
int n =0;
       for (int i=0; i <=links.size(); i++) {

           /*String href = links.get(i).getAttribute("href");

       if (href.isEmpty()){
           n = n+1;

       System.out.println("there is a broken link " );
           String name = links.get(i).getText();
           System.out.println("the broken link is  " +name);

           } }
       System.out.print("the is " +n+ "broken links " );*/

           String href = links.get(i).getAttribute("href");
           int statuscode = given().when().get(href).then().extract().statusCode();
           String name = links.get(i).getText();
           if(statuscode==200){

               System.out.println(" the link " +name+ "is working");
           }else {

               System.out.println(" the link " +name+ "is not working");

       }}
}}





