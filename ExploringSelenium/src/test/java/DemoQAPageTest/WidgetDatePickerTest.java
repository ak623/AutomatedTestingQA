package DemoQAPageTest;

import DemoQAPage.WidgetAutoCpmplete;
import DemoQAPage.WidgetDatePicker;
import TestFolder.TestingFunctions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class WidgetDatePickerTest {
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
        report = new ExtentReports("C:/Development/BasicReport.html", false);
        test = report.startTest("Verify application Title");


        url = "http://demoqa.com/datepicker/";
        driver.manage().window().maximize();

        test.log(LogStatus.INFO, "Browser started");


        driver.get(url);
        WidgetDatePicker page = PageFactory.initElements(driver, WidgetDatePicker.class);

//        HelperMethod.screenshot(driver);
        if (page.perfromDatePickingAction(driver)) {
            // report the test as a pass
            test.log(LogStatus.PASS, "Date has been picked");
        } else {
            test.log(LogStatus.FAIL, "Date could not be picked");
        }

        assertTrue("Failed test", page.perfromDatePickingAction(driver));
    }

    @After
    public void stop(){
        driver.quit();
        report.endTest(test);
        report.flush();

    }
}
