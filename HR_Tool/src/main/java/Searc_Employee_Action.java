import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searc_Employee_Action {

    @FindBy(xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]") private WebElement employeeList;
    @FindBy(id = "employee_name_quick_filter_employee_list_value") private  WebElement search;
    @FindBy(id = "quick_search_icon") private WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ui-view/div[1]/div/div/div/ohrm-pagination/ul/li[3]") private WebElement searchedEmpolyee;

    public void searchEmployee(WebDriver driver){
        WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.elementToBeClickable(employeeList));
        employeeList.click();
        search.sendKeys("Ashok");
        searchBtn.click();

    }

    public boolean confirmeEmployeeHasLoaded(){
        if(searchedEmpolyee.getText().equals("1-1 of 1")){
            return true;
        }
        return false;
    }
}
