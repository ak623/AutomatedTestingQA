import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HR_Tool_Login_Action {

    @FindBy(id = "logInPanelHeading") private  WebElement LoginPage;
    @FindBy(id = "txtUsername") private WebElement userTextBox;
    @FindBy(id = "txtPassword") private WebElement passwordTextBox;
    @FindBy(id = "btnLogin") private WebElement logInBtn;
    @FindBy(xpath = "//*[@id=\"dashboard-navbar\"]/nav/div/ul[1]/li") private WebElement loginDashBoard;


    public void login(){
        userTextBox.sendKeys("Admin");
        passwordTextBox.sendKeys("AdminAdmin");
        logInBtn.click();
    }

    public boolean checkIfUserLoggedIn(){
        if(loginDashBoard.getText().equals("Dashboard")){
            return true;
        }
        return false;
    }
}
