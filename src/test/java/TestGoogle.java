import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle extends TestInit {
    String searchEngine = "https://www.bing.com/";



    @Test
    public void googleDogs(){
        String searchWord = "dogs";

        search(searchWord, searchEngine);
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

