package oldCodeNotUsingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseActionControl {

    @FindBy(id = "Im0ssipleEmpty") private WebElement empty;
    @FindBy(id = "menu-item-140") private WebElement Draggable;
    @FindBy(xpath = "//*[@id=\"post-22\"]/header/h1") private WebElement checkDraggable;
    @FindBy(id = "draggable") private  WebElement boxToDrag;

    // click on drag box
    public void clickOnDraggble(){
        Draggable.click();
    }

    public void dragAndDropBox(WebDriver driver){
        Actions action = new Actions(driver);
        action.dragAndDropBy((boxToDrag),300,200).perform();
    }

    // since it is private use get and set
    public WebElement getPrivateVariable(String elementName){

        if(elementName.equals("checkDraggable")){
            return Draggable;
        }
        else if(elementName.equals("boxToDrag")){
            return boxToDrag;
        }
        // should not hit but I will know why
        return empty;
    }

}
