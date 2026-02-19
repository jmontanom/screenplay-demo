Feature: Busqueda en Google

  Scenario: login en startsharp
    Given el usuario abre la pagina y se loguea
    When hace clic en el boton "sign in"
    Then debería loguearse
