package com.carnival.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CruiseSearch {

    private CruiseSearch(){

    }
    public static final Target BTN_PRICING= Target.the("Button Pricing").locatedBy("//span[contains(text(),'Pricing')]");
    public static final Target BTN_SELECT_PRICING = Target.the("Button Select Pricing").locatedBy("//span[@aria-valuetext='$780']");
    public static final Target TXT_RESULTS = Target.the("Filter Results").locatedBy("//span[@class='sbsc-container__result-count ng-binding'][contains(text(),'1 results')]");

}
