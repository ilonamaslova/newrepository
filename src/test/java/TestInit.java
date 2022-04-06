import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void afterMyTest(){
//        driver.quit();
    }


    public void search(String googleWord, String searchUrl){
        driver.get(searchUrl);
//        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
//        sleep(2);
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys(googleWord + "\n");
    }

    public void searchElement(String site, String locator){
        driver.get(site);
        driver.findElement(By.xpath(locator)).click();

    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitTillElementContainsText(String locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(locator), text));
    }
    //expliced wait
     public WebElement getElementByXpath(String locator){
         WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
     }
}
