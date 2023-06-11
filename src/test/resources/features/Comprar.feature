Feature: Comprar test

  Background: Acessar site da SauceDemo e logar no sistema
    Given que o site do SauceDemo é acessado
    And que o usuario loga no sistema

  Scenario: Comprar uma camisa vermelha
    Given a camisa vermelha é adicionada ao carrinho
    When os produtos do carrinho são confirmados
    And os dados pessoais são informados
    And a compra é finalizada
    Then a mensagem de confirmação da compra é exibida

  Scenario: Comprar uma bolsa
    Given a bolsa é selecionada
    When o produto é adicionado ao carrinho
    And os dados pessoais são informados
    And a compra é finalizada
    Then a mensagem de confirmação da compra é exibida

  Scenario: Comprar dois produtos menor preço
    Given o filtro de menor preço é selecionado
    And os dois produtos mais baratos são adicionados ao carrinho
    When os produtos do carrinho são confirmados
    And os dados pessoais são informados
    And a compra é finalizada
    Then a mensagem de confirmação da compra é exibida
