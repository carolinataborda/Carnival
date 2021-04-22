package com.carnival.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/booking_cruises.feature",
        glue = {"com.carnival.stepdefinitions", "com.carnival.hook"},
        snippets = SnippetType.CAMELCASE
)
public class BookingCruises {
}
