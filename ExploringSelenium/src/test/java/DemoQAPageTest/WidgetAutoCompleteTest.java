package DemoQAPageTest;

import DemoQAPage.GotSelectablePage;
import DemoQAPage.WidgetAutoCpmplete;
import TestFolder.TestingFunctions;
import TestFolder.HelperMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class WidgetAutoCompleteTest {
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


        url = "http://demoqa.com/autocomplete/";
        driver.manage().window().maximize();

        test.log(LogStatus.INFO, "Browser started");


        driver.get(url);
        WidgetAutoCpmplete page = PageFactory.initElements(driver, WidgetAutoCpmplete.class);
        page.EnterAndSelectPreSelectedList(driver);

//        HelperMethod.screenshot(driver);
        if (page.testIfAutomatedItemHasBeenSelected()) {
            // report the test as a pass
            test.log(LogStatus.PASS, "Action Script has been selected");
        } else {
            test.log(LogStatus.FAIL, "Unable to select item");
        }

        assertTrue("Unable to select item", page.testIfAutomatedItemHasBeenSelected());
    }

    @After
    public void stop(){
        driver.quit();
        report.endTest(test);
        report.flush();

    }
}
