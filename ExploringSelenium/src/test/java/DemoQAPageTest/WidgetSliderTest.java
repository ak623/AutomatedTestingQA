package DemoQAPageTest;

import DemoQAPage.DragAndDropAction;
import DemoQAPage.WidgetSlider;
import TestFolder.TestingFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class WidgetSliderTest {

    WebDriver driver;
    String url;

    @Before
    public void setup() throws Exception{
        driver = TestingFunctions.setUp();
    }

    @Test
    public void dragHandleTest(){
        url = "http://demoqa.com/slider/";
        driver.manage().window().maximize();
        driver.get(url);
        WidgetSlider page = PageFactory.initElements(driver, WidgetSlider.class);
    }

    @After
    public void stop(){
        driver.quit();
    }
}
