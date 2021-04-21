package com.carnival.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

    private MainPage(){

    }
    public static final Target CLOSE= Target.the("Close Notice").locatedBy("//*[@class=\"vifp-close\"]");
    public static final Target BNR_COOKIES= Target.the("Banner cookies").locatedBy("//*[@class=\"cp-banner__icon-close--com\"]");
    public static final Target BTN_SAIL_TO = Target.the("Destination").locatedBy("//a[@id=\"cdc-destinations\"]");
    public static final Target BTN_CHOOSE_DESTINATION = Target.the("Destination The Bahamas").locatedBy("//button[contains(text(),'The Bahamas')]");
    public static final Target BTN_DURATION = Target.the("Duration").locatedBy("//a[@id=\"cdc-durations\"]");
    public static final Target BTN_DAYS= Target.the("Days").locatedBy("//button[contains(text(),'6 - 9 Days')]");
    public static final Target BTN_SEARCH_CRUISES= Target.the("Search Cruises").locatedBy("//a[@class='cdc-filters-search-cta']");

}
