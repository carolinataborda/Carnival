package com.carnival.questions;

import com.carnival.userinterfaces.CruiseSearch;
import com.carnival.userinterfaces.Itinerary;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateItinerary  implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Itinerary.LBL_ITINERARY.resolveFor(actor).getText();
    }

    public static ValidateItinerary page() {
        return new ValidateItinerary();
    }
}

