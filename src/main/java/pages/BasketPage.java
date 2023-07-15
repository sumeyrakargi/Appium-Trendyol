package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BasketPage {

    ElementHelper elementHelper;

    By tabs = By.id("");
    By closeButton = By.xpath("");


    public BasketPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickTab(String tab) {
        elementHelper.clickElementWithText(tabs, tab);
    }

    }