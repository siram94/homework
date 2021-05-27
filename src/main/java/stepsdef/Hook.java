package stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hook {
    private Scenario myScenario;
    @Before
    public void takescreenshotbefore(Scenario scenario){
        myScenario = scenario;
    }
    @After
    public void takscreenshot(){
        WebDriver driver = loginsteps.driver;
        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        myScenario.attach(screenshot,"image/png", "image");
        loginsteps.driver.close();
    }
    //@After
    //public void Teardomn(){
        //loginsteps.driver.close();

}

