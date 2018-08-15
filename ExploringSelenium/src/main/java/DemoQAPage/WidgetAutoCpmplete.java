package DemoQAPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class WidgetAutoCpmplete {
    @FindBy(id = "tagss") private WebElement automatedTextBox;

    public void EnterAndSelectPreSelectedList(WebDriver driver)
    {
        Actions action = new Actions(driver);
        automatedTextBox.click();
        automatedTextBox.sendKeys("a");
        // checks visible
        WebElement myDynamicElement = (new WebDriverWait(driver, 5)) .until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
    }

    // checkes if ActionScript has been selected
    public boolean testIfAutomatedItemHasBeenSelected(){
        if(automatedTextBox.getAttribute("value").equals("ActionScript")){
            return true;
        }
        else{
            return false;
        }
    }

}

