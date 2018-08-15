package oldCodeWithNoPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertEquals;

public class mouseControlTest {
    WebDriver driver;
    String url = "http://demoqa.com";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void mthodTest() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.id("menu-item-140")).click();



        // DRAG ITEM action
        driver.findElement(By.id("draggable")).click();
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.id("draggable")), 300, 200).perform();

        // select action task
        driver.findElement(By.id("menu-item-142")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).click();

        // widget task
        driver.findElement(By.id("menu-item-144")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]")).click();
        driver.findElement(By.id("menu-item-145")).click();

        // I think this needs to be in the mian folder... outside the test file...
        // more effiicent
        // thisIsAvariable is a variable can be reused
        WebElement thisIsAvariable = driver.findElement(By.id("thisIsAnExample"));;

    }
    // finding an element search box by id s
    @FindBy(id = "s") private WebElement searchBox;

    // to get the findBY to work you need to initElements

    @After
    public void stop(){
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
