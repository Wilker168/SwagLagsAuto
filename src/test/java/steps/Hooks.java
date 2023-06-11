package steps;

import cucumber.api.java.After;
import util.DriverFactory;

public class Hooks {

    @After
    public static void quitDriver() {
        DriverFactory.quitDriver();
    }
}