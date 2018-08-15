package DemoQAPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WidgetSlider {
    @FindBy(id = "//*[@id=\"slider-range-max\"]/span") private WebElement sliderButton;

    public void slideTheButton(WebDriver driver){
        Actions action = new Actions(driver);
        action.dragAndDropBy((sliderButton),300,200).perform();
    }
}
