package util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    private JavascriptExecutor js;

    public WebDriverUtils(WebDriver driver) {
        this.driver = driver;
        wait = DriverFactory.getWait();
        js = (JavascriptExecutor) driver;
    }

    public void aguardarParaClicar(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public void aguardarTempo(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void scrollLow() {
        js.executeScript("window.scrollTo(0,500)", "");
    }
}
