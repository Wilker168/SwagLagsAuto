package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage{

    private ISelect select;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void adicionarCamisaVermelhaAoCarriho(){

        driver.findElement(By.cssSelector("[data-test='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
        util.aguardarTempo(2);
    }

    public void selecionarBolsa(){
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        for (WebElement product: products)
        {
            if (product.getText().contains("Backpack")){
                product.click();
                break;
            }
        }
        util.aguardarTempo(2);
    }

    public void selecionarFiltroMaisBaratos(){
        WebElement selectElement = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Price (low to high)");
    }

    public void adicionarProdutosMaisBaratosAoCarrinho(int quantidadeProdutos){
        for (int i = 0; i < quantidadeProdutos; i++){
            driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
            util.aguardarTempo(2);
        }
    }
}
