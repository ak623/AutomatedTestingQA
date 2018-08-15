package DemoQAPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetDatePicker {

    @FindBy(id = "datepicker1") private WebElement datePickerText;
    @FindBy(id = "ui-datepicker-div") private WebElement datePicker;
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a") private WebElement pickDate18;
    // pick 18

    // split it up is better apprently but keeping it to ask Matt
    public boolean perfromDatePickingAction(WebDriver driver){
        datePickerText.click();
        WebElement myDynamicElement = (new WebDriverWait(driver, 5)) .until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
        pickDate18.click();
        if(datePickerText.getAttribute("value").equals("")){
            return false;
        }
        else{
            return true;
        }
    }

}
