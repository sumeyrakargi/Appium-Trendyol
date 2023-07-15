package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import utils.DriverManager;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage(DriverManager.getDriver());


    @Then("should see the Product Page")
    public void shouldSeeTheProductPage() {
        productPage.checkLikeButton();
    }

    @When("save Product Name on Product Page")
    public void saveProductNameOnProductPage() {

        productPage.checkProductName();
    }

    @And("taps Add To Basket {string} on Product Page")
    public void tapsAddToBasketOnProductPage(String button) {

        productPage.addToBasket(button);
    }

    @And("taps Size {string} on Product Page")
    public void tapsSizeOnProductPage(String size) {

        productPage.clickSize(size);
    }

    @And("taps Size Add to Basket on Product Page")
    public void tapsSizeAddToBasketOnProductPage() {
        productPage.addToBasket();
    }
}