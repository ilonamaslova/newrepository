import org.testng.Assert;
import org.testng.annotations.Test;

public class coffeTimeSearch extends coffeTimeUnit {


    @Test
    public void orderCoffe() {
        driver.get("https://www.coffeetimepdx.com/V");

        getElementByXpath("//button[@class='sqs-cookie-banner-v2-accept sqs-cookie-banner-v2-cta']").click();


        waitTillElementContainsText("//h2", "Join our list");

        Assert.assertTrue(getElementByXpath("//h2").getText().contains("Join our list"));
    }

}
