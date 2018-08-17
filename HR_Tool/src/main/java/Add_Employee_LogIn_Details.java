import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Add_Employee_LogIn_Details {

    @FindBy(id = "username") private WebElement username;
    @FindBy(id = "password") private WebElement password;
    @FindBy(id = "essRoleId_inputfileddiv") private WebElement role;
    @FindBy(id = "status_inputfileddiv") private WebElement status;
    @FindBy(id = "confirmPassword") private WebElement confirmPassword;
    @FindBy(id = "supervisorRoleId_inputfileddiv") private WebElement supervisor;


    public void addEmployeeUserDetails(WebDriver driver){
        // add employee login details

        username.sendKeys("ladokha22232");
        password.sendKeys("Ashok123!!");
        confirmPassword.sendKeys("Ashok123!!");
        role.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
        status.click();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
        supervisor.click();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkIfLogInDetailsHaveBeenEntered(){
        if(username.getAttribute("value") != ""){
            return true;
        }
        return false;
    }
}
