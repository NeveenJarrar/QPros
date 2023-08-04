import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class TestCases extends Base {

    @Test()
    public void SignUp() throws InterruptedException {
        SignupPage RegistrationPage = new SignupPage(driver);
Navigation NavigateTo = new Navigation(driver);

NavigateTo.NavigateToSignup();

RegistrationPage.Registration();

   }

    @Test()
    public void Login() {
        LoginPage loginprocess = new LoginPage(driver);
        loginprocess.performlogin();


    }

   @Test()
   public void verifyCategoriesHaveItems() {
       Home homePage = new Home(driver);
    homePage.checklistcategoryHasitem();
   }

    @Test()
    public void AddRandomItem() {
        Home homePage= new Home(driver);
      homePage.AddRandomItem();

    }

    @Test(dependsOnMethods = "AddRandomItem")
    public void checkout()  {
Navigation NavigatetoCart = new Navigation(driver);
NavigatetoCart.NavigateToCart();
        Checkout checkoutStep= new Checkout(driver);
        checkoutStep.CheckoutSteps();


    }

    @Test(dependsOnMethods = "AddRandomItem")
    public void RemoveItems() {

        Random rand = new Random();
        Navigation NavigatetoCart = new Navigation(driver);
        NavigatetoCart.NavigateToCart();
        Home deleteOption = new Home(driver);
        deleteOption.DeleteItems();

    }
    }



