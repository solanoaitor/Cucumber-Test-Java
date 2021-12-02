Feature: Prueba una página usando Selenium WebDriver
  Para evaluar Selenium Framework
  Como desarrollador
  Quiero interactuar con mi web

  Scenario: En mi sitio web se puede mostrar listas
    When Vamos a la página de inicio
    Then Deberia ver un apartado "middle-navigation__item m" text

  Scenario: Mi sitio web se puede navegar y buscar boton
    When Vamos a la página de inicio
    Then Deberia ver un "user-options__button js-register" button

  Scenario: Mi sitio web tiene un boton
    Given Vamos a la página de inicio
    When Hago click en button
    #Then Deberia ver un " Actualidad " text
    #And Hago una captura de pantalla con el filename "POWERED BY"
