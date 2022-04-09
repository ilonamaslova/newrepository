import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork1 extends TestInit {
    String searchEngine = "https://yandex.ru/";
    String getSearchEngine2 = "https://makeup.com.ua/ua/";


    @Test
    public void searchMouse() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mouse\n");
//         driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();
        sleep(4);
        Assert.assertTrue(driver.getCurrentUrl().contains("mouse"));

    }

    @Test
    public void searchPen() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pen\n");
//         driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();
        sleep(4);
        Assert.assertTrue(driver.getCurrentUrl().contains("pen"));
    }

    @Test
    public void searchMakeUpUa() {
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
    public void searchGamburger() {
        String searchWord = "Gamburger";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }

    @Test
    public void searchMakeUp2() {
        searchElement(getSearchEngine2, "//a[@href='/ua/categorys/20273/']");
        waitTillElementContainsText("//h1", "Косметика");
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Косметика"));

    }

    @Test
    public void searchYandex() {
        String googleWord = "humster";
        search(googleWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(googleWord));
    }

    @Test
    public void searchBeer() {
        String googleWord = "Beer";
        search(googleWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(googleWord));
    }

    @Test
    public void searchTablet() {
        String googleWord = "Tablet";
        search(googleWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(googleWord));
    }

    @Test
    public void searchEvian() {
        String googleWord = "Evian";
        search(googleWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(googleWord));
    }

    @Test
    public void searchMask() {
        String googleWord = "Mask";
        search(googleWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(googleWord));
    }

    @Test
    public void libraryPay() {
        searchBook("The word");
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='disabled checked']")).isDisplayed());

    }

    @Test
    public void libraryPay2() {
        searchBook("Garry Potter");

        driver.findElement(By.xpath("//a[@href='https://www.loc.gov/item/sn83030313/1860-03-29/ed-1/']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/logo-loc-new-branding.svg']")).isDisplayed());
    }

    @Test
    public void libraryPay3() {
        searchBook("psychology");
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='label_expand_1']")).isDisplayed());
    }

    @Test
    public void libraryPay4() {
        searchBook("psychology");
        driver.findElement(By.xpath("//a[@href='https://www.loc.gov/search/?fa=original-format:web+page&q=psychology']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(), 'View')]")).isDisplayed());
    }

    @Test
    public void libraryPay5() {
        searchBook("Physics");
        getElementByXpath("//button[@id='label_expand_1']").click();

        Assert.assertTrue(getElementByXpath("//button[@id='label_expand_2']").isDisplayed());
    }
    @Test
    public void libraryPay6(){
        searchBook("homework");
        Assert.assertTrue(getElementByXpath("//select[@id='view-options']").isDisplayed());

    }
    @Test
    public void findClothes(){
        String Clothes = "t-shirt";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));

    }
    @Test
    public void findShirt(){
        String Clothes = "shirt";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findTrousers(){
        String Clothes = "trousers";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findDress(){
        String Clothes = "dress";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findJaket(){
        String Clothes = "Jaket";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
        sleep(7);
    }
    @Test
    public void findSocks(){
        String Clothes = "Socks";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findPanama(){
        String Clothes = "panama";
        search(Clothes, searchEngine);
        getElementByXpath("//button[@data-id='button-all']").click();
//        sleep(4);
        Assert.assertTrue(getElementByXpath("//button[@title='Голосовой поиск']").isDisplayed());

    }
    @Test
    public void findStone(){
        String Clothes = "Stone";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findPizza(){
        String Clothes = "Pizza";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findCinema(){
        String Clothes = "Cinema";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findGloves(){
        String Clothes = "Gloves";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));

    }
    @Test
    public void findDecirations(){
        String Clothes = "Decirations";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
    }
    @Test
    public void findKitten(){
        String Clothes = "Kitten";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
        waitTillElementContainsText("//span[contains(text(), 'Видео')]", "Видео");
        Assert.assertTrue(getElementByXpath("//span[contains(text(), 'Видео')]").getText().contains("Видео"));
    }
    @Test
    public void findMarket(){
        String Clothes = "Market";
        search(Clothes, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(Clothes));
        waitTillElementContainsText("//span[contains(text(), 'Новости')]", "Новости");
        Assert.assertTrue(getElementByXpath("//span[contains(text(), 'Новости')]").getText().contains("Новости"));
    }
}

