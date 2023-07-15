package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());


    @Then("should Popup Close Button on Home Page")
    public void shouldPopupCloseButtonOnHomePage() {
        homePage.closePopup();
    }

    @Then("should see the Home Page")
    public void shouldSeeTheHomePage() {
        homePage.checkHomepage();
    }

    @When("taps Search Area on Home Page")
    public void tapsSearchAreaOnHomePage() {
        homePage.tapsSearchArea();
    }
}