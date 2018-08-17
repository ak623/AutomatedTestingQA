import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Get_To_Employee_Tab_Action {
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a") private WebElement PIM_Tab;
    @FindBy(xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]") private  WebElement EmployeeListTab;
    @FindBy(xpath = "//*[@id=\"right-side\"]/header/div/nav/div/div/ul[1]/li") private WebElement EmployyeTitlePage;

    public void loadEmployeeList(){
        PIM_Tab.click();
        EmployeeListTab.click();

    }

    public boolean checkIfPmTabOpens(){
        if(EmployeeListTab != null){
            return true;
        }
        return false;
    }

    public boolean checkIfEmoloyeeListLoaded(){
        if(EmployyeTitlePage.getText().equals("Employee List")){
            return true;
        }
        return false;
    }


}
