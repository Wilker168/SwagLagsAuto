package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends BasePage{

    public CarrinhoPage(WebDriver driver) {
        super(driver);
    }

    public void clicarBotaoCheckout(){
        driver.findElement(By.cssSelector("[data-test='checkout']")).click();
        util.aguardarTempo(2);
    }
}
