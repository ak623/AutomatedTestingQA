package DemoQAPageTest;

import DemoQAPage.GotToDraggablePage;
import org.junit.After;
import org.junit.Before;
import TestFolder.TestingFunctions;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static junit.framework.TestCase.assertEquals;


public class GotToDraggableTest {

    WebDriver driver;
    String url = "";


    @Before
    public void setup() throws Exception{
        driver = TestingFunctions.setUp();
    }

    // Test to click and load the draggable page
    @Test
    public void loadAndThenClickOnDraggable() {
        url = "http://demoqa.com/draggable/";
        driver.manage().window().maximize();
        driver.get(url);
        GotToDraggablePage page = PageFactory.initElements(driver, GotToDraggablePage.class);
        page.clickOnDraggble();
        assertEquals("The correct page has not been accessed", "Draggable", page.getDraggableWebElement().getText());
    }

    @After
    public void stop(){
        driver.quit();
    }

}
