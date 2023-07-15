package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilterPage;
import utils.DriverManager;

public class FilterPageSteps {
    FilterPage filterPage = new FilterPage(DriverManager.getDriver());


    @Then("should see the Filter Page")
    public void shouldSeeTheFilterPage() {
        filterPage.checkSeeFilterItem();
    }

    @When("taps Filter {string} on Filter Page")
    public void tapsFilterOnFilterPage(String item) {
        filterPage.clickFilterItem(item);
    }

    @When("taps List Products {string} on Filter Page")
    public void tapsListProductsOnFilterPage(String button) {
        filterPage.clickListProductsButton(button);
    }
}