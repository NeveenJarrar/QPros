import Variables.configProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Random;

public class Base {
    WebDriver driver = new ChromeDriver();
    @BeforeTest()
    void BeforeTheTest() throws InterruptedException {
      //  driver.get("https://www.demoblaze.com/");
        configProperties Prob = new configProperties();
        Prob.Properties();
        driver.get(Prob.propertiry.getProperty("url"));

        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(3000)));
        Random rand = new Random();
        SoftAssert Assert =new SoftAssert();


    }



}
