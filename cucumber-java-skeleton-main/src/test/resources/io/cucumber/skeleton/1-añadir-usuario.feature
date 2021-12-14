Feature: Añadir usuarios a tablas
  Para evaluar Selenium Framework
  Añadimos varias veces usuario y comprobamos los diferentes campos

  Scenario: Añadimos usuario y comprobamos departamento
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    When Clicamos en "Add"
    When Yo escribo "Pol"
    When Yo escribo "Lopez"
    When Yo escribo "p@p.com"
    When Yo escribo "22"
    When Yo escribo "2000"
    When Yo escribo "Informática"
    Then Hago click en el siguiente apartado "Submit"
    Then Deberia ver un apartado "Informática"

  Scenario: Añadimos usuario y comprobamos apellido
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    When Clicamos en "Add"
    When Yo escribo "Pol"
    When Yo escribo "Lopez"
    When Yo escribo "p@p.com"
    When Yo escribo "22"
    When Yo escribo "2000"
    When Yo escribo "Informática"
    Then Hago click en el siguiente apartado "Submit"
    Then Deberia ver un apartado "Lopez"

  Scenario: Añadimos usuario, comprobamos nombre y realizamos captura de pantalla
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    When Clicamos en "Add"
    When Yo escribo "Pol"
    When Yo escribo "Lopez"
    When Yo escribo "p@p.com"
    When Yo escribo "22"
    When Yo escribo "2000"
    When Yo escribo "Informática"
    Then Hago click en el siguiente apartado "Submit"
    Then Deberia ver un apartado "Pol"
    And Hago una captura de pantalla con el filename "CapturaUsuario"