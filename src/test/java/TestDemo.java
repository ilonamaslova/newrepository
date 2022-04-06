import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void dell(){
        Assert.assertTrue(1 == 2);
    }
    @Test
    public void runbrowser(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://eatstreet.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//a[@href='/create-account?next=~2F']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("4ilonamaslova269@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("13dikapo1");
        driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("13dikapo1");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        sleep(3);
        driver.findElement(By.xpath("//button[@id='signup']")).click();
        sleep(5);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed());

        driver.quit();

    }

}
