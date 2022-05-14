package alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlerts {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        String getTitleRegister= driver.getTitle();
        System.out.println("homePageTitle"+ getTitleRegister);
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        /*driver.findElement(By.xpath("//button['text()= Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        String ResultText= driver.findElement(By.id("result")).getText();
        System.out.println("Result Text :"+ ResultText);*/

       /* driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String TextforJsConfirm= driver.findElement(By.id("result")).getText();
        System.out.println("Result Text is:"+ TextforJsConfirm);*/
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Shweta Pandey");
        driver.switchTo().alert().accept();
        String Textfor= driver.findElement(By.id("result")).getText();
        System.out.println("Result Text is:"+ Textfor);
    }
}
