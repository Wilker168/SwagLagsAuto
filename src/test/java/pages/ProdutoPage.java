package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage extends BasePage {

    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    public void adicionarProdutoNoCarrinho(){
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        util.aguardarTempo(2);
    }
}
