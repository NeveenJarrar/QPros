import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.font.FontRenderContext;
import java.util.List;
import java.util.Random;

public class Home {

    WebDriver driver;
 By Categories= By.id("itemc");
 By categoryContainer=By.id("col-lg-3");
 By Container=By.id("tbodyid");
 By Items= By.className("mb-4");
 By itemNo=By.className("hrefch");
 By Addbtn=By.className("btn-success");



By DeleteItems =By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");

   Home(WebDriver d){
    driver=d;
   }
   public void checklistcategoryHasitem() {
       List<WebElement>categories =driver.findElements(Categories);
       for (int i=0;i<categories.size();i++) {
           categories.get(i).click();

           WebElement ProductContainer= driver.findElement(Container);
           List<WebElement> ItemNo= ProductContainer.findElements(Items);

           System.out.println("The Number of" + categories.get(i).getText() + " is " +  ItemNo.size());
       }}
public void AddRandomItem(){

    Random rand = new Random();
    List<WebElement>categories =driver.findElements(Categories);
    int index = rand.nextInt(categories.size());
    categories.get(index).click();
    List<WebElement>ItemNo=driver.findElements(itemNo);
    int randomitem=rand.nextInt(ItemNo.size());
    ItemNo.get(randomitem).click();
    System.out.println(ItemNo.size());
    driver.findElement(Addbtn).click();

}
       public void DeleteItems() {
           driver.findElement(DeleteItems).click();

       }}


