package DemoQAPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SelectableAction {

    // global web element variables
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[1]") private WebElement item1;
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[2]") private WebElement item2;
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[3]") private WebElement item3;
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[4]") private WebElement item4;
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[5]") private WebElement item5;
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[6]") private WebElement item6;
    @FindBy(xpath = "//*[@id=\"selectable\"]/li[7]") private WebElement item7;


    public void selectElements(WebDriver driver){
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(item1).perform();
        action.keyDown(Keys.CONTROL).click(item2).perform();
        action.keyDown(Keys.CONTROL).click(item3).perform();


    }

    public boolean checkIfHasBeenSelected(){

        System.out.println(item1.getAttribute("class"));

        if(item3.getAttribute("class").contains("selected")){
         return true;
        }
        else
        {
            return false;
        }
    }

//    public boolean checkIfBoxhasMoved(){
//        Point postionBeforeDrageAndDrop = boxToDrag.getLocation();
//        Point postionAfterDrageAndDrop = boxToDrag.getLocation();
//        if(postionBeforeDrageAndDrop.equals(postionAfterDrageAndDrop)){
//            return false;
//        }
//        else{
//            return true;
//        }
//    }
}
