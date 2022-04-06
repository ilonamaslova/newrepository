import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EatStreetSearch extends TestInit {


    @Test
    public void searchMadison(){


        driver.get("https://eatstreet.com/");
        sleep(2);
        getElementByXpath("//button[@class='btn']").click();
        sleep(1);
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Madison WI\n");
        sleep(1);
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTillElementContainsText("//h1", "Madison");

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));

        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Free Delivery']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Open Now']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Specials']/..").isDisplayed());

    }



}
