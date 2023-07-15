package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class GenderPage {

    ElementHelper elementHelper;

    By erkek = By.id("");
    By image = By.id("");


    public GenderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkImage(){
        elementHelper.checkElement(image);
    }
    public void clickButton(String button){
        elementHelper.clickElementWithText(erkek,button);
    }
}