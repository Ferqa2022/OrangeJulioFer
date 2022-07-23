#Proyecto de pruebas y cargado en Github
#16/07/2022
#Fernando Castellanos
@Regresion
Feature: Login orange

@login
@Sprint1
  Scenario Outline: Login with Admin
    Given abrir el navegador
    And diligenciar usuario <userName> y password <pass>

    Examples: 
      | userName | pass     |
      | Admin    | admin123 |
