package actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String getTitleRegister = driver.getTitle();
        System.out.println("homePageTitle:" + getTitleRegister);

        /*WebElement electronics = driver.findElement(By.linkText("Electronics"));
        Actions actions= new Actions(driver);
        actions.moveToElement(electronics).perform();
        driver.findElement(By.linkText("Others")).click();
        String otherPageTitle= driver.getTitle();
        System.out.println("Other Page Title:"+ otherPageTitle);
        driver.findElement(By.linkText("awesome")).click();
        String tagAwesomeTitle= driver.getTitle();
        System.out.println("Tag AwesomePage Title Is:"+ tagAwesomeTitle);*/

       /* WebElement apparel= driver.findElement(By.linkText("Apparel"));
        Actions actions= new Actions(driver);
        actions.moveToElement(apparel).perform();
        driver.findElement(By.linkText("Clothing")).click();
        String ClothingPageTitle= driver.getTitle();
        System.out.println("Clothing Page Title:"+ ClothingPageTitle);*/

        WebElement electronics= driver.findElement(By.linkText("Electronics"));
        Actions actions= new Actions(driver);
        actions.moveToElement(electronics).perform();
        driver.findElement(By.linkText("Camera & photo")).click();
        String CamAndPho = driver.getTitle();
        System.out.println("Camera and Photo Page Title is :"+ CamAndPho);


    }}

