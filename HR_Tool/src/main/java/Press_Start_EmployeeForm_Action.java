import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Press_Start_EmployeeForm_Action {
    @FindBy(id = "addEmployeeButton") private WebElement addButton;
    @FindBy(id = "addEmployeeModal") private  WebElement employeeForm;
    public void clickAddEmployee(WebDriver driver){
        WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.visibilityOf(addButton));
        addButton.click();
    }

    public boolean checkIfAddEmployeePromptOpens(WebDriver driver){
        if(employeeForm != null){
            return true;
        }
        return false;
    }
}
