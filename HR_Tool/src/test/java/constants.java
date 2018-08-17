import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class constants {

    public static WebDriver setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static String reportPath = "C:/Development/BasicReport.html";

}
