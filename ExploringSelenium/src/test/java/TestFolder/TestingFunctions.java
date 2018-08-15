package TestFolder;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestingFunctions {

    public ExtentTest test;
    // sets up the enviroment
    public static WebDriver setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static ExtentReports getReportAndTest(ExtentReports report, ExtentTest test)
    {
        report = new ExtentReports("C:/Development/BasicReport.html", false);
        test = report.startTest("Verify application Title");
        //return
        return  report;
    }



//    // Exits the script
//    public void stop(){
//        driver.quit();
//    }
}
