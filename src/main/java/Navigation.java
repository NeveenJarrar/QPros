import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation {
By signupMenuItem = By.id("signin2");
By loginMenuItem= By.id("login2");
By cartMenuItem= By.xpath("//*[@id=\"cartur\"]");
    WebDriver driver;
    Navigation(WebDriver d)
    {
        driver =d;
    }
public void NavigateToSignup(){
       driver.findElement(signupMenuItem).click();}
    public void NavigateTologin(){
        driver.findElement(loginMenuItem).click();}
    public void NavigateToCart(){
        driver.findElement(cartMenuItem).click();


}
}
