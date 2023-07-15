package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ResultPage;
import utils.DriverManager;

public class ResultPageSteps {
    ResultPage resultPage = new ResultPage(DriverManager.getDriver());


    @Then("should see the Result Page")
    public void shouldSeeTheResultPage() {
        resultPage.chechkResult();
    }

    @When("taps Filter on Result Page")
    public void tapsFilterOnResultPage() {
        resultPage.clickFilter();
    }

    @When("taps Order on Result Page")
    public void tapsOrderOnResultPage() {
       resultPage.clickOrderButton();
    }

    @When("taps second Product on Result Page")
    public void tapsSecondProductOnResultPage() {
        resultPage.clickSecondProduct();
    }
}