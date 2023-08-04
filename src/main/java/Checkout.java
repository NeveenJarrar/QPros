import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

By PlaceOrder= By.className("btn-success");
    By FirstName = By.id("name");
    By Country= By.id("country");
    By City= By.id("city");
    By CreditCard= By.id("card");
    By Month= By.id("month");
    By Year= By.id("year");
    By Purchase = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
WebDriver driver;
        Checkout(WebDriver d){
            driver =d;
    }
    public void CheckoutSteps(){
        driver.findElement(PlaceOrder).click();
            driver.findElement(FirstName).sendKeys("Neveen");
        driver.findElement(Country).sendKeys("Jordan");
            driver.findElement(City).sendKeys("amman");
        driver.findElement(CreditCard).sendKeys("88436");
            driver.findElement(Month).sendKeys("July");
                driver.findElement(Year).sendKeys("2023");
        driver.findElement(Purchase).click();}}

