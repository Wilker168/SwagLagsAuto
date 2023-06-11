package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WebDriverUtils;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverUtils util;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        util = new WebDriverUtils(driver);
    }

    public void acessarCarrinho(){
        driver.findElement(By.className("shopping_cart_link")).click();
        util.aguardarTempo(2);
    }
}
