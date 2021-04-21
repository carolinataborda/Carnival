package com.carnival.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

    public class Alerts {

        private Alerts() {
        }

        public static Performable accept() {
            return new DriverTask(driver -> driver.switchTo().alert().accept());
        }

        public static Performable cancel() {
            return new DriverTask(driver -> driver.switchTo().alert().dismiss());
        }

}
