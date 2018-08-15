package DemoQAPageTest;

import DemoQAPage.DragAndDropAction;
import TestFolder.TestingFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static junit.framework.TestCase.assertTrue;

public class DragAndDropActionTest {

    WebDriver driver;
    String url;

    @Before
    public void setup() throws Exception{
        driver = TestingFunctions.setUp();
    }

    @Test
    public void dragAndDropBoxTest(){
        url = "http://demoqa.com/draggable/";
        driver.manage().window().maximize();
        driver.get(url);
        DragAndDropAction page = PageFactory.initElements(driver, DragAndDropAction.class);
        page.dragAndDropBox(driver);
        assertTrue("The box has not been moved",page.checkIfBoxhasMoved());
    }

    @After
    public void stop(){
        driver.quit();
    }

}
