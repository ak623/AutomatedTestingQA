package DemoQAPageTest;

import DemoQAPage.DDTaddUserAndSignUp;
import DemoQAPage.WidgetAutoCpmplete;
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

public class DDTaddUserAndSignUpTest {
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
        test = report.startTest("Test");


        url = "http://thedemosite.co.uk/index.php";
        driver.manage().window().maximize();

        test.log(LogStatus.INFO, "Browser started");


        driver.get(url);
        DDTaddUserAndSignUp page = PageFactory.initElements(driver, DDTaddUserAndSignUp.class);
        page.getUserNameAndPasswordFromExcel();

//        HelperMethod.screenshot(driver);
        if (page.checkIfLogInSuccessful()) {
            // report the test as a pass
            test.log(LogStatus.PASS, "User has been added");
        } else {
            test.log(LogStatus.FAIL, "User was not added");
        }

        assertTrue(page.checkIfLogInSuccessful());
    }

    @After
    public void stop(){
        driver.quit();
        report.endTest(test);
        report.flush();

    }
}
