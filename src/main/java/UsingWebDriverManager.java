import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebDriverManager {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().fullscreen();
        String getTitleRegister= driver.getTitle();
        System.out.println("homePageTitle"+ getTitleRegister);
       /* String getText= driver.findElement(By.cssSelector("div[class='topic-block-body']")).getText();
        System.out.println("text is"+ getText );
       driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mac");
       // driver.findElement(By.cssSelector("")).sendKeys("mac");*/
        //JavascriptExecutor js=(JavascriptExecutor)driver;
       // js.executeScript("arguments[0].ScrollIntoView(true);",




       // driver.quit();
    }
    }
