import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "loginusername")
    public WebElement username;
    @FindBy(id = "loginpassword")
    public WebElement password;
    @FindBy(className = "btn-primary")
    public WebElement loginButton;
WebDriver driver ;

        LoginPage(WebDriver d){
            driver =d;

    }

    public void performlogin() {
        username.sendKeys("Neveen");
        password.sendKeys("Neveen123");
        loginButton.click();
    }
}