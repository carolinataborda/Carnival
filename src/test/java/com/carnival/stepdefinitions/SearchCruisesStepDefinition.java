package com.carnival.stepdefinitions;

import com.carnival.exceptions.GeneralExceptions;
import com.carnival.models.CruiseInformation;
import com.carnival.questions.ResultsSearch;
import com.carnival.tasks.FilterByPrice;
import com.carnival.tasks.SelectCruises;

import com.carnival.utils.enums.Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.util.List;

import static com.carnival.utils.Constants.MESSAGE_ERROR_FILTERED_BY_PRICE;

public class SearchCruisesStepDefinition {

    @Managed(driver = "chrome")
    public static WebDriver navegador;
    public static Actor actorNamed = Actor.named("Carolina");

    @Given("^i enter the url \"([^\"]*)\"$")
    public void iEnterTheUrl(String carnival) {

        actorNamed.can(BrowseTheWeb.with(navegador));
        actorNamed.wasAbleTo(Open.url(Page.getUrl(carnival)));
    }


    @When("^select sail to the Bahamas and duration between six and nine days$")
    public void selectSailToTheBahamasAndDurationBetweenSixAndNineDays(List<CruiseInformation> cruiseInformation) {
        actorNamed.attemptsTo(SelectCruises.betweenSixAndNineDays(cruiseInformation));
    }

    @And("^I select a price range using the slide bar$")
    public void iSelectAPriceRangeUsingTheSlideBar() {
        actorNamed.attemptsTo(FilterByPrice.byPricing());
    }

    @Then("^I can see the results for the assigned price$")
    public void iCanSeeTheResultsForTheAssignedPrice() {
        actorNamed.should(GivenWhenThen.seeThat(ResultsSearch.toPricing(), Matchers.equalTo("1 results")).orComplainWith(GeneralExceptions.class, MESSAGE_ERROR_FILTERED_BY_PRICE));
    }


}
