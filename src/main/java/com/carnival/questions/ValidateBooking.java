package com.carnival.questions;

import com.carnival.userinterfaces.Itinerary;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateBooking implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Itinerary.LBL_BOOK_NOW.resolveFor(actor).getText();
    }

    public static ValidateBooking button() {
        return new ValidateBooking();
    }
}


