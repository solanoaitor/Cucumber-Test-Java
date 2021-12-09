Feature: Radio Button y pruebas
  Para evaluar Selenium Framework
  Pulsaremos botones tipo radio y interactuamos con una tabla de una web
  
  Scenario: Comprobamos texto de la opción Radio Button
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Radio-Button"
    Then Deberia ver un apartado "Do you like the site?"
    Then No debería ver "DO YOU LIKE"

  Scenario: Realizamos click y comprobamos texto
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Radio-Button"
    When Clicamos en "Yes"
    Then Deberia ver un apartado "You have selected"
    Then Deberia ver un apartado "Yes"

  Scenario: Realizamos click y comprobamos texto
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Radio-Button"
    When Clicamos en "No"
    Then No debería ver "You have selected"