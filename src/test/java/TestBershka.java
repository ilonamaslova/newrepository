import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBershka {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test

    public void number() {
        Assert.assertTrue(3 == 3);

    }

    @Test

    public void RunBuy(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bershka.com/ru/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        sleep(4);
        driver.findElement(By.xpath("//li[@class='gender-wrapper is-active']")).click();
        sleep(4);
        driver.findElement(By.xpath("//span[contains(text(), 'Платья')]")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@class='ui--dot-item is-dot is-small has-shadow is-selected is-naked']")).click();
        sleep(1);
        driver.findElement(By.xpath("//img[@data-original='https://static.bershka.net/4/photos2/2022/V/0/1/p/0841/810/626/f79db903f2dd59df06e4c7a70ebd1e27-0841810626_2_3_0.jpg?imwidth=1080&impolicy=bershka-itxmedium']")).click();
        sleep(2);
        driver.findElement(By.xpath("//li[@class='is-last-units']")).click();
        driver.findElement(By.xpath("//button[@class='button is-black']")).click();
        sleep(4);
        driver.findElement(By.xpath("//img[@src='data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iNDBweCIgaGVpZ2h0PSI0MHB4IiB2aWV3Qm94PSIwIDAgNDAgNDAiIHZlcnNpb249IjEuMSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayI+CiAgICA8IS0tIEdlbmVyYXRvcjogU2tldGNoIDU5LjEgKDg2MTQ0KSAtIGh0dHBzOi8vc2tldGNoLmNvbSAtLT4KICAgIDx0aXRsZT4wMS5GcmFnbWVudHMvSWNvbi8yNHB4L05hdmlnYXRpb24vY2FydC1idWJibGUtMTwvdGl0bGU+CiAgICA8ZGVzYz5DcmVhdGVkIHdpdGggU2tldGNoLjwvZGVzYz4KICAgIDxnIGlkPSIwMS5GcmFnbWVudHMvSWNvbi8yNHB4L05hdmlnYXRpb24vY2FydC1idWJibGUtMSIgc3Ryb2tlPSJub25lIiBzdHJva2Utd2lkdGg9IjEiIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPGNpcmNsZSBpZD0iT3ZhbCIgZmlsbD0iIzE2QzY5MSIgY3g9IjI5LjY0MzgwODQiIGN5PSIxMy4wMTI5NTAyIiByPSI3LjMwNzIwMDM0Ij48L2NpcmNsZT4KICAgICAgICA8cG9seWdvbiBpZD0iMSIgZmlsbD0iI0ZGRkZGRiIgZmlsbC1ydWxlPSJub256ZXJvIiBwb2ludHM9IjI4LjgyNjQ1OTkgMTEuNjMxMjQ4NSAyNy40MTg0NTk5IDEyLjQ2NzI0ODUgMjcuNDE4NDU5OSAxMC41MDkyNDg1IDI5LjYyOTQ1OTkgOS4yMzMyNDg0NiAzMC42MDg0NTk5IDkuMjMzMjQ4NDYgMzAuNjA4NDU5OSAxNi45MzMyNDg1IDI4LjgyNjQ1OTkgMTYuOTMzMjQ4NSI+PC9wb2x5Z29uPgogICAgPC9nPgo8L3N2Zz4=']")).click();
        sleep(2);

        int size = driver.findElements(By.xpath("//div[@class='product-card-wrapper']")).size();
        Assert.assertEquals(size, 1);




    }
}
