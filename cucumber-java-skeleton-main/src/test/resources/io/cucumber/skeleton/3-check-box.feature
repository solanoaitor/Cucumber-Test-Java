Feature: Check Box
  Para evaluar Selenium Framework
  Clicaremos en los diferentes apartados y seleccionaremos apartados diferentes

  Scenario: En mi web podemos clicar en Elements y después en Check-Box
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Check-Box"
    Then Deberia ver un apartado "Home"
    Then No debería ver "Documents"

  Scenario: Clicamos en el deplegable de Home
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Check-Box"
    When Clicamos en "Flecha-Home"
    
  Scenario: Clicamos en el desplegable de Home y selecionamos todo
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Check-Box"
    When Clicamos en "Flecha-Home"
    When Clicamos en "Home"
    Then Deberia ver un apartado "Home"

  Scenario: Clicamos en el desplegable Home y solo seleccionamos Documents
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    When Clicamos en "Check-Box"
    When Clicamos en "Flecha-Home"
    When Clicamos en "Documents"
    And Hago una captura de pantalla con el filename "CapturaCheckBox"
