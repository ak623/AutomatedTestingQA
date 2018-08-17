import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Save_And_Confirm_Adding_Action {

    @FindBy(id = "systemUserSaveBtn") private WebElement saveBtn;
    @FindBy(id = "personal_details_tab") private WebElement details;

    public void saveUserDetails(WebDriver driver){
        saveBtn.click();
        WebElement myDynamicElement = (new WebDriverWait(driver, 30)) .until(ExpectedConditions.elementToBeClickable(details));
    }

    public boolean checkIfUserDetailsSaved(){
        if(details != null){
            return true;
        }
        return false;
    }
}
