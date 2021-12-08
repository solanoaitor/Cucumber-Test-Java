Feature: Text Box
  Para evaluar Selenium Framework
  Escribimos texto en campos para después borrarlo  el Text Box

  Scenario: En mi web se puede interactuar con la página principal
    Given Vamos a la página de inicio
    Then Deberia ver un apartado "Elements"
    Then Deberia ver un apartado "Forms"
    Then Deberia ver un apartado "Alerts, Frame & Windows"
    Then Deberia ver un apartado "Widgets"
    Then Deberia ver un apartado "Interactions"

  Scenario: En mi web se puede escribir en un campo Full Name y clico el siguiente apartado
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Text-Box"
    When Yo escribo "Aitor"
    Then Hago click en el siguiente apartado "Email"

  Scenario: En mi web se puede escribir en un campo el email y después borrarlo
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Text-Box"
    When Yo escribo "aitor@aitor.com"
    Then Borro "email"
    
  Scenario: En mi web puedo tener el Text-Box seleccionado y hago una captura de pantalla
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Text-Box"
    Then Hago click en el siguiente apartado "Text-Box"
    And Hago una captura de pantalla con el filename "CapturaTextBox"


