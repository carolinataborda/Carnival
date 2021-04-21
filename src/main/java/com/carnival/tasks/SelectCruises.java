package com.carnival.tasks;

;
import com.carnival.interactions.Alerts;
import com.carnival.models.CruiseInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.carnival.userinterfaces.MainPage.*;

public class SelectCruises implements Task{

    private List<CruiseInformation> cruiseInformation;

    public SelectCruises(List<CruiseInformation> cruiseInformation) {
        this.cruiseInformation = cruiseInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BNR_COOKIES));
        actor.attemptsTo(Alerts.accept());
        actor.attemptsTo(Click.on(BTN_SAIL_TO));
        actor.attemptsTo(Click.on(BTN_CHOOSE_DESTINATION.of(cruiseInformation.get(0).getSail())));
        actor.attemptsTo(Click.on(BTN_DURATION.of(cruiseInformation.get(0).getDuration())));
        actor.attemptsTo(Click.on(BTN_DAYS));
        actor.attemptsTo(Click.on(BTN_SEARCH_CRUISES));





    }

    public static SelectCruises betweenSixAndNineDays(List<CruiseInformation> cruiseInformation) {
        return Tasks.instrumented(SelectCruises.class, cruiseInformation);
    }
}

