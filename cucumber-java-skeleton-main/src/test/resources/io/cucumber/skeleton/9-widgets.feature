Feature: Widgets
  Para evaluar Selenium Framework
  Interaccionaremos con los diferentes widgets encontrados

  Scenario: Clicamos en las diferentes preguntas y buscamos palabra
    Given Vamos a la página de inicio
    When Cambiamos a la página "accordian"
    When Clicamos en "What"
    Then Deberia ver un apartado "Lorem"
    When Clicamos en "Where"
    Then Deberia ver un apartado "Contrary"
    When Clicamos en "Why"
    Then Deberia ver un apartado "English"

  Scenario: Autocompletamos inputs con inicial de palabra y botón enter
    Given Vamos a la página de inicio
    When Cambiamos a la página "auto-complete"
    When Clicamos en "multiple"
    When Yo escribo "R"
    When Clicamos en "single"
    When Yo escribo "B"
    And Hago una captura de pantalla con el filename "CapturaColoresTipo"

  Scenario: Clicamos Start y esperamos 2 segundos después clicamos Stop y esperamos 5 segundos y volvemos a realizar la acción
    Given Vamos a la página de inicio
    When Cambiamos a la página "progress-bar"
    When Clicamos en "Start"
    When Clicamos en "Stop"
    When Clicamos en "Start"
    When Clicamos en "Stop"
    And Hago una captura de pantalla con el filename "CapturaStartStop"