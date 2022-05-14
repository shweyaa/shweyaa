package actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyboards { public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    String getTitleRegister = driver.getTitle();
    System.out.println("homePageTitle:" + getTitleRegister);
  /* driver.findElement(By.id("small-searchterms")).sendKeys("phone");
   WebElement search= driver.findElement(By.id("small-searchterms"));
   Actions act= new Actions(driver);
   act.sendKeys(search, Keys.ENTER).build().perform();*/



   driver.findElement(By.id("newsletter-email")).sendKeys("shweya@gmail.com");
   WebElement newsletterEmail= driver.findElement(By.id("newsletter-email"));
   Actions actions= new Actions(driver);
   actions.sendKeys(newsletterEmail,Keys.ENTER).build().perform();




   WebElement Text= driver.findElement(By.className("newsletter-result"));
    String texDetails= Text.getText();
    System.out.println("Text is:"+ texDetails);
   /* WebDriverWait wait= new WebDriverWait(driver,30);
    wait.until(ExpectedCondition.*/

}
}
