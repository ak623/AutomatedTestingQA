package oldCodeWithNoPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SignUpAndLoginUserTest {

    WebDriver driver;
    String url = "http://thedemosite.co.uk";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();

    }


//    @Test
//    public void mthodTest(){
//        driver.manage().window().maximize();
//        driver.get(url);
//        // sign up testing
//        // clicks on sign up link
//        driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
//        // sends the string to the text bx or element inside the doc
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")).sendKeys("ashTest2");
//        // sends the string to the text bx or element inside the doc
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")).sendKeys("ashTest2");
//        // save function is clicked
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")).click();
//
//        // login testing
//        driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")).sendKeys("ashTest2");
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")).sendKeys("ashTest2");
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")).click();
//    }

    // Using POM
//    @Test
//    public void signUpTest(){
//        driver.manage().window().maximize();
//        driver.get(url);
//        SignUpAndLogin page = PageFactory.initElements(driver, SignUpAndLogin.class);
//        page.signUp("ashTest2", "ashTest2");
//    }

    @After
    public void stop(){
        driver.quit();
    }

}
