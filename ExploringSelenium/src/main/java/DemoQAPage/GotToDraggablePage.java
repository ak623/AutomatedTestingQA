package DemoQAPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GotToDraggablePage {
    @FindBy(id = "menu-item-140") private WebElement Draggable;
    @FindBy(xpath = "//*[@id=\"post-22\"]/header/h1") private WebElement pageTitle;

    // click on drag box
    public void clickOnDraggble(){
        Draggable.click();
    }

    // gets dragable
    public WebElement getDraggableWebElement(){
            return pageTitle;
    }


}
