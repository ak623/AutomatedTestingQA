package oldCodeWithNoPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static junit.framework.TestCase.assertEquals;

public class searchForItemOfClothing {

    WebDriver driver;
    String url = "http://automationpractice.com/index.php";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void mthodTest() {
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        assertEquals("Dress was not entered", "dress", driver.findElement(By.id("search_query_top")).getText());
    }

    @After
    public void stop(){
        driver.quit();
    }

}
