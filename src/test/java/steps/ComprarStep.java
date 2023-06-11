package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.DriverFactory;

public class ComprarStep {
    private WebDriver driver = DriverFactory.getDriver();
    private LoginPage loginPage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);
    private ProdutoPage produtoPage = new ProdutoPage(driver);
    private CarrinhoPage carrinhoPage = new CarrinhoPage(driver);
    private CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Given("que o site do SauceDemo é acessado")
    public void siteSauceDemoAcessado() {
        loginPage.acessarSite();
    }

    @Given("que o usuario loga no sistema")
    public void usuarioLogaNoSistema(){
        loginPage.loginUsuarioNoSistema();
    }

    @Given("a camisa vermelha é adicionada ao carrinho")
    public  void camisaVermelhaAdicionadaAoCarrinho(){
        homePage.adicionarCamisaVermelhaAoCarriho();
    }

    @When("os produtos do carrinho são confirmados")
    public void produtoCarrinhoConfirmados(){
        homePage.acessarCarrinho();
        carrinhoPage.clicarBotaoCheckout();
    }

    @When("os dados pessoais são informados")
    public void dadosPessoaisInformados(){
        checkoutPage.informarDadosPessoais();
    }

    @When("a compra é finalizada")
    public void compraFinalizada(){
        checkoutPage.finalizarCompra();
    }

    @Then("a mensagem de confirmação da compra é exibida")
    public void mensagemConfirmacaoCompraExibida(){
        String mensagemConfirmacao = checkoutPage.getMensagemConfirmacao();
        Assert.assertEquals("Thank you for your order!", mensagemConfirmacao);
    }

    @Given("a bolsa é selecionada")
    public  void bolsaSelecionada(){
        homePage.selecionarBolsa();
    }

    @When("o produto é adicionado ao carrinho")
    public void produtoAdicionadoAoCarrinho(){
        produtoPage.adicionarProdutoNoCarrinho();
        produtoPage.acessarCarrinho();
        carrinhoPage.clicarBotaoCheckout();
    }

    @Given("o filtro de menor preço é selecionado")
    public  void filtroMenorPrecoSelecionado(){
        homePage.selecionarFiltroMaisBaratos();
    }

    @Given("os dois produtos mais baratos são adicionados ao carrinho")
    public void doisProdutoMaisBaratosAdicionadosAoCarrinho(){
        homePage.adicionarProdutosMaisBaratosAoCarrinho(2);
    }
}
