package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FilterPage {

    ElementHelper elementHelper;

    By filterItem = By.id("");
    By listProductsButton = By.id("");



    public FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkSeeFilterItem() {
        elementHelper.checkElement(filterItem);
    }
    public void clickFilterItem(String item) {
        elementHelper.click(filterItem);
    }
    public void clickListProductsButton(String button){
        elementHelper.click(listProductsButton);
    }


}