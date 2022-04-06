import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchEatstreet {
    WebDriver driver;

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @BeforeMethod

    public void beforeMytest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMytest(){
//        driver.quit();

    }
    @Test
    public void SearchMadison(){
        driver.get("https://qa2.eatstreet.com");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Madison");
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//h2")).getText().contains("Order"));
    }
}
