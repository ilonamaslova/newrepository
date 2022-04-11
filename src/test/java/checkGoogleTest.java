import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkGoogleTest {

    @Test
    public void checkGoogleSearch() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.fr/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cookie\n");

        Assert.assertTrue(driver.getCurrentUrl().contains("cookie"));
        driver.quit();

    }
}
