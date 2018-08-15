package DemoQAPageTest;

import DemoQAPage.GotSelectablePage;
import TestFolder.TestingFunctions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

public class GotSelectablePageTest {
    public ExtentReports report;
    public ExtentTest test;

    WebDriver driver;
    String url = "";


    @Before
    public void setup() throws Exception{
        driver = TestingFunctions.setUp();
    }

    // Test to click and load the draggable page
    @Test
    public void loadAndThenClickOnSelectable() {
        report = new ExtentReports("C:/Development/BasicReport.html", true);
        test = report.startTest("Verify application Title");

        url = "http://demoqa.com/";
        driver.manage().window().maximize();

        test.log(LogStatus.INFO, "Browser started");

        driver.get(url);
        GotSelectablePage page = PageFactory.initElements(driver, GotSelectablePage.class);
        page.clickOnSelectable();

        if (page.getPageTitle().getText().equals("Selectable")) {
            // report the test as a pass
            test.log(LogStatus.PASS, "The page sucessfully visited the Selectable page");
        } else {
            test.log(LogStatus.FAIL, "Unable to select correct page");
        }
        assertEquals("The correct page has not been accessed", "Selectable", page.getPageTitle().getText());
    }

    @After
    public void stop(){
        driver.quit();
        report.endTest(test);
        report.flush();
    }
}
