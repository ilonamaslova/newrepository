import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon {
   @Test
    public void checkJava(){
       //System.out.println("sup!!!");
       System.setProperty("webdriver.chrome.driver", "src/test/resurces/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.com/");
       driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
       int size = driver.findElements(By.xpath("//div[contains(text(), 'Software')]")).size();
       Assert.assertEquals(size, 2);
       ////a[@id='nav-hamburger-menu']
       driver.quit();
    }
}
