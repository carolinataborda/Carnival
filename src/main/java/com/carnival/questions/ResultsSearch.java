package com.carnival.questions;

import com.carnival.userinterfaces.CruiseSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResultsSearch implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return CruiseSearch.TXT_RESULTS.resolveFor(actor).getText();
    }

    public static ResultsSearch toPricing() {
        return new ResultsSearch();
    }
}
