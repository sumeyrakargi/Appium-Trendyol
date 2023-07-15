package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultPage {

    ElementHelper elementHelper;

    By siralaButton = By.id("");
    By filtrele = By.id("");
    By order = By.id("");
    By secondProduct = By.id("");


    public ResultPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void chechkResult() {
        elementHelper.checkElement(siralaButton);
    }
    public void clickFilter() {
        elementHelper.checkElement(filtrele);
    }

    public void clickOrderButton() {
        elementHelper.checkElement(order);
    }

    public void clickSecondProduct() {
        elementHelper.checkElement(secondProduct);
    }

}