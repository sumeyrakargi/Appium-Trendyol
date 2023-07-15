package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchPage {

    ElementHelper elementHelper;

    By backButton = By.id("");
    By searchArea = By.id("");

    public SearchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkBackIcon(){
    elementHelper.checkElement(backButton);
    }
    public void sendKeysSearchArea(String text){
     elementHelper.sendKeys(searchArea,text);
     elementHelper.pressEnter();

    }
}