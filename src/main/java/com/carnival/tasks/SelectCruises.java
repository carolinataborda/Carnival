package com.carnival.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.carnival.userinterfaces.CruiseSearch.*;

public class SelectCruises implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LBL_SELECT_CRUISES));


    }

    public static SelectCruises byPricing() {
        return Tasks.instrumented(SelectCruises.class);
    }
}

