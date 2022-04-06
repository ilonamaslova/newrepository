import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork1 extends TestInit {
    String searchEngine = "https://yandex.ru/";
    String getSearchEngine2 = "https://makeup.com.ua/ua/";


    @Test
    public void searchMouse(){
         driver.get("https://www.google.com.ua/");
         driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
         driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mouse\n");
//         driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();
         sleep(4);
         Assert.assertTrue(driver.getCurrentUrl().contains("mouse"));

    }
    @Test
    public void searchPen(){
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pen\n");
//         driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();
        sleep(4);
        Assert.assertTrue(driver.getCurrentUrl().contains("pen"));
    }
    @Test
    public void searchMakeUpUa(){
        driver.get("https://makeup.com.ua/ua/");
        driver.findElement(By.xpath("//a[contains(text(), 'Макіяж')]")).click();
        driver.findElement(By.xpath("//li[@data-id='166843']")).click();
        sleep(4);
        driver.findElement(By.xpath("//div[@class='product-item__button']")).click();
//        driver.findElement(By.xpath("//div[@class='variant checked']")).click();
        waitTillElementContainsText("//div[@class='product__header-desc']", "Матуюча");

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='product__header-desc']")).getText().contains("Матуюча"));
    }

    @Test
    public void searchGamburger(){
        String searchWord = "Gamburger";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }
    @Test
    public void searchMakeUp2(){
        searchElement(getSearchEngine2, "//a[@href='/ua/categorys/20273/']" );
        waitTillElementContainsText("//h1", "Косметика");
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Косметика"));

    }
}

