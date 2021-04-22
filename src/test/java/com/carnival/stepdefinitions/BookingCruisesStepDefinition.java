package com.carnival.stepdefinitions;

import com.carnival.exceptions.GeneralExceptions;
import com.carnival.questions.InformationActivities;
import com.carnival.questions.ResultsSearch;
import com.carnival.questions.ValidateBooking;
import com.carnival.questions.ValidateItinerary;
import com.carnival.tasks.SelectCruises;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.carnival.stepdefinitions.SearchCruisesStepDefinition.actorNamed;
import static com.carnival.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BookingCruisesStepDefinition {

    @And("I select any result")
    public void iSelectAnyResult() {
        actorNamed.attemptsTo(SelectCruises.byPricing());

    }

    @Then("I should the itinerary page of the selected cruise")
    public void iShouldTheItineraryPageOfTheSelectedCruise() {
        actorNamed.should(seeThat(ValidateItinerary.page(), Matchers.equalTo("Itinerary")).orComplainWith(GeneralExceptions.class, MESSAGE_ERROR_ITINERATY_PAGE));

    }
    @And("^I should see information about each (.*)$")
    public void iShouldSeeInformationAboutEachDay(String day) {
        actorNamed.should(seeThat(InformationActivities.eachDay(), Matchers.equalTo(day)).orComplainWith(GeneralExceptions.class, MESSAGE_ERROR_ITINERATY_DAYS));

    }


    @And("I should see a BOOK NOW button")
    public void iShouldSeeABOOKNOWButton() {
        actorNamed.should(seeThat(ValidateBooking.button(), Matchers.equalTo("Book Now")).orComplainWith(GeneralExceptions.class, MESSAGE_ERROR_BOOK_NOW));

    }


}
