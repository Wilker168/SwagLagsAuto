package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void informarDadosPessoais(){
        driver.findElement(By.id("first-name")).sendKeys("Wilker");
        driver.findElement(By.id("last-name")).sendKeys("Cavalcanti");
        driver.findElement(By.id("postal-code")).sendKeys("50721175");
        util.aguardarTempo(3);
        driver.findElement(By.cssSelector("[data-test='continue']")).click();
    }

    public void finalizarCompra(){
        driver.findElement(By.cssSelector("[data-test='finish']")).click();
        util.aguardarTempo(3);
    }

    public String getMensagemConfirmacao(){
        return driver.findElement((By.className("complete-header"))).getText();
    }
}
