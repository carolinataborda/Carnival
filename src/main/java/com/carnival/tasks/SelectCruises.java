package com.carnival.tasks;

;
import com.carnival.interactions.Alerts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.carnival.userinterfaces.MainPage.*;

public class SelectCruises implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BNR_COOKIES));
        actor.attemptsTo(Alerts.accept());
        actor.attemptsTo(Click.on(BTN_SAIL_TO));
        actor.attemptsTo(Click.on(BTN_CHOOSE_DESTINATION));
        actor.attemptsTo(Click.on(BTN_DURATION));
        actor.attemptsTo(Click.on(BTN_DAYS));
        actor.attemptsTo(Click.on(BTN_SEARCH_CRUISES));





    }

    public static SelectCruises betweenSixAndNineDays() {
        return Tasks.instrumented(SelectCruises.class);
    }
}

