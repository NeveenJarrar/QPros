import com.fasterxml.jackson.databind.JsonSerializable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {
    WebDriver driver;


  By Username =By.id("sign-username");
    By Password  =By.id("sign-password");

  By SignupButton =By.xpath( "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");


    SignupPage(WebDriver d) {

        driver = d;
    }
    public void Registration() {


            driver.findElement(Username).sendKeys("Neveenn");


        driver.findElement(Password).sendKeys("8yu");


        driver.findElement(SignupButton).click();

    }}