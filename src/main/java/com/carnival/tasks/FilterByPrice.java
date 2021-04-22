package com.carnival.tasks;

import com.carnival.interactions.Alerts;
import com.carnival.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.carnival.userinterfaces.CruiseSearch.BTN_PRICING;
import static com.carnival.userinterfaces.CruiseSearch.BTN_SELECT_PRICING;


public class FilterByPrice implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PRICING));
        actor.attemptsTo(Click.on(BTN_SELECT_PRICING));


    }

    public static FilterByPrice byPricing() {
        return Tasks.instrumented(FilterByPrice.class);
    }
}
