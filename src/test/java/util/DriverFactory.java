package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
            ChromeOptions ops=new ChromeOptions();
            ops.addArguments("--disable-blink-features=AutomationControlled");
            driver = new ChromeDriver(ops);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            wait = null;
            driver = null;
        }
    }
}