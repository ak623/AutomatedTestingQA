package DemoQAPageTest;

import DemoQAPage.SelectableAction;
import TestFolder.TestingFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class SelectableTest {

    WebDriver driver;
    String url;

    @Before
    public void setup() throws Exception{
        driver = TestingFunctions.setUp();
    }

    @Test
    public void selectItems(){
        url = "http://demoqa.com/selectable/";
        driver.manage().window().maximize();
        driver.get(url);
        SelectableAction page = PageFactory.initElements(driver, SelectableAction.class);
        page.selectElements(driver);
        assertTrue("has not been selected",page.checkIfHasBeenSelected());
    }

    @After
    public void stop(){
        driver.quit();
    }
}
