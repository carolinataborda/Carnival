package com.carnival.questions;

import com.carnival.userinterfaces.Itinerary;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class InformationActivities implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
 return Itinerary.LBL_DAY_INFORMATION.resolveFor(actor).getText();
}

    public static InformationActivities eachDay() {
        return new InformationActivities();
    }
}
