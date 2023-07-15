package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import utils.DriverManager;

public class BasketPageSteps {
    BasketPage basketPage = new BasketPage(DriverManager.getDriver());



    @Then("should see the Basket Page")
    public void shouldSeeTheBasketPage() {
    }

    @And("should see Same Product Name on Basket Page")
    public void shouldSeeSameProductNameOnBasketPage() {
    }

    @When("taps Delete Button on Basket Page")
    public void tapsDeleteButtonOnBasketPage() {
    }

    @And("taps Delete Popup on Basket Page")
    public void tapsDeletePopupOnBasketPage() {
    }

    @Then("should see Empty Message {string} on Basket Page")
    public void shouldSeeEmptyMessageOnBasketPage(String arg0) {
    }
}