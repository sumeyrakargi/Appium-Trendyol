package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductPage {

    ElementHelper elementHelper;

    By beden = By.id("");
    By likeButton = By.id("");
    By addToBasket = By.id("");
    By productName = By.id("");


    public ProductPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLikeButton() {
        elementHelper.click(likeButton);
    }

    public void addToBasket(String button) {
        elementHelper.click(addToBasket);
    }

    public void clickSize(String size) {
        elementHelper.clickElementWithText(beden,size);
    }

    public void addToBasket() {
        elementHelper.checkElement(addToBasket);
    }
    public void checkProductName() {
        elementHelper.checkElement(productName);
    }
}