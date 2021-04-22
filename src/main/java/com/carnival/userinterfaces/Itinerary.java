package com.carnival.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Itinerary {

    public Itinerary() {
    }

    public static final Target LBL_ITINERARY= Target.the("Label Itinerary").locatedBy("(//span[contains(text(),'Itinerary')])[2]");
    public static final Target LBL_DAY_INFORMATION= Target.the("Information about each day").locatedBy("//p[contains(text(),' Day 1 Baltimore depart 5:00 PM')]");
    public static final Target LBL_BOOK_NOW= Target.the("BOOK NOW").locatedBy("(//span[contains(text(),'Book Now')])[2]");

}
