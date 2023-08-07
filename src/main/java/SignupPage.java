import Variables.configProperties;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public  class SignupPage {
    WebDriver driver;


  By userName =By.id("sign-username");
    By password  =By.id("sign-password");

  By SignupButton =By.xpath( "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");


    SignupPage(WebDriver d) {

        driver = d;
    }
    public void Registration (){

        configProperties Prob = new configProperties();
        Prob.Properties();

driver.findElement (userName).sendKeys((Prob.propertiry.getProperty("UserName")));
        driver.findElement(password).sendKeys((Prob.propertiry.getProperty("Password")));
        driver.findElement(SignupButton).click();

    }}