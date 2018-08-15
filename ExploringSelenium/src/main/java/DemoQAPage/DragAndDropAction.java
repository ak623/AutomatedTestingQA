package DemoQAPage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropAction {
    @FindBy(id = "draggable") private  WebElement boxToDrag;
    private Point before;
    private Point after;

    public void dragAndDropBox(WebDriver driver){
        Actions action = new Actions(driver);
        before = boxToDrag.getLocation();
        action.dragAndDropBy((boxToDrag),300,200).perform();
        after = boxToDrag.getLocation();
    }

    public boolean checkIfBoxhasMoved(){
        if(before.equals(after)){
            return false;
        }
        else{
            return true;
        }
    }


}
