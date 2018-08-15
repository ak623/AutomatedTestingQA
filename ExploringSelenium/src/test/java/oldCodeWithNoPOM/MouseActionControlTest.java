//package oldCodeWithNoPOM;
//
//import junit.framework.TestCase;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import static junit.framework.TestCase.assertEquals;
//
//public class MouseActionControlTest {
//    WebDriver driver;
//    String url = "";
//
//
//    @Before
//    public void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    // test that the draggable page is loaded
//    public void loadAndThenClickOnDraggable() {
//        url = "http://demoqa.com";
//        driver.manage().window().maximize();
//        driver.get(url);
//        MouseActionControl page = PageFactory.initElements(driver, MouseActionControl.class);
//        page.clickOnDraggble();
//        TestCase.assertEquals("The correct page has not been accessed", "Draggable",page.getPrivateVariable("checkDraggable").getText());
//    }
//
//    @Test
//    // Test that item has been dragged and moved
//    public void dragAndDropBox(){
//        MouseActionControl page = PageFactory.initElements(driver, MouseActionControl.class);
//        Point postionBeforeDrageAndDrop = page.getPrivateVariable("boxToDrag").getLocation();
//        page.dragAndDropBox(driver);
//        Point postionAfterDrageAndDrop = page.getPrivateVariable("boxToDrag").getLocation();
//
//
//        //page.clickOnDraggble();
//    }
//
//    @After
//    public void stop(){
//        driver.quit();
//    }
//}
