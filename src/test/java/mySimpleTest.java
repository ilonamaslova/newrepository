import org.testng.Assert;
import org.testng.annotations.Test;

public class mySimpleTest {

    @Test
    public void checkNumber() {
        Assert.assertTrue(1 == 1);
    }
}
