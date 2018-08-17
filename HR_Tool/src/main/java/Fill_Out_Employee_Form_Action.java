import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Fill_Out_Employee_Form_Action {

    @FindBy(id = "firstName") private WebElement firstName;
    @FindBy(id = "middleName") private WebElement middleName;
    @FindBy(id = "lastName") private WebElement lastName;
    @FindBy(id = "employeeId") private WebElement employeeId;
    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input") private WebElement location;
    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label") private WebElement checBox;

    public void fillOutForm(WebDriver driver){
        WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys("Ashok");
        middleName.sendKeys("Naruto");
        lastName.sendKeys("Kerung");
        employeeId.sendKeys("032210");
        location.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions action = new Actions(driver);
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
        // DID not work
//        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")));
//        dropdown.selectByVisibleText("Canadian Regional HQ");
        checBox.click();



    }

    // just to long as if statement checks all webelements attribute
    public boolean checkIfFormIsFilledOut(){
        if(firstName.getAttribute("value") != "" && middleName.getAttribute("value") != "" && lastName.getAttribute("value") != "" && employeeId.getAttribute("value") != "" && location.getAttribute("value") != ""){
            return true;
        }
        return false;
    }
}
