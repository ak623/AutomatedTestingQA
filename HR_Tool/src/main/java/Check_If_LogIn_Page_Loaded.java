import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Check_If_LogIn_Page_Loaded {

    @FindBy(xpath = "//*[@id=\"dashboard-navbar\"]/nav/div/ul[1]/li") private WebElement loginDashBoard;

    public boolean checkIfLogInPageLoaded(){
        if(loginDashBoard != null){
            return true;
        }
        return false;
    }
}
