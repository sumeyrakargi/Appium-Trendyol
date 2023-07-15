package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {

    ElementHelper elementHelper;

    By popupClose = By.id("");
    By searchArea = By.id("");



    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void closePopup(){
        elementHelper.checkElement(popupClose);
    }
    public void checkHomepage(){
        elementHelper.checkElement(searchArea);
    }
    public void tapsSearchArea() {
        elementHelper.click(searchArea);
    }

}