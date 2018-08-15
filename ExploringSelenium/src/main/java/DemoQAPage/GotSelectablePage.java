package DemoQAPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GotSelectablePage {
    // ohhh select while pressing shift
    @FindBy(id = "menu-item-142") private WebElement selectablePage;
    @FindBy(xpath = "//*[@id=\"post-41\"]/header/h1") private WebElement pageTitle;

    // click on drag box
    public void clickOnSelectable(){
        selectablePage.click();
    }

    // gets dragable
    public WebElement getPageTitle(){
        return selectablePage;
    }

}
