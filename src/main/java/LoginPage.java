import Variables.configProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    By username =By.id("loginusername");
    By password  =By.id("loginpassword");

    By loginButton=By.xpath( "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

WebDriver driver ;

        LoginPage(WebDriver d){
            driver =d;

    }

    public void performlogin() {
        configProperties Prob = new configProperties();
        Prob.Properties();

        driver.findElement( username).sendKeys((Prob.propertiry.getProperty("UserName")));
        driver.findElement(password).sendKeys((Prob.propertiry.getProperty("Password")));
        driver.findElement(loginButton).click();


    }
}