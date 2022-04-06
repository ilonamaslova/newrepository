import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchBing extends TestInit {
    String searchEngine = "https://yandex.ru/";




    @Test
    public void googleDogs(){
        String searchWord = "dogs";

        search(searchWord, searchEngine);
        sleep(4);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }
    @Test
    public void googleCats(){
        String searchWord = "cats";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public void googleStraus(){
        String searchWord = "straus";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public  void googlehorse(){
        String searchWord = "horse";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }


}
