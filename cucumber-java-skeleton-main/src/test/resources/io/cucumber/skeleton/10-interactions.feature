Feature: Interactions
  Para evaluar Selenium Framework
  Selecionaremos e interactuaremos con varios elementos
  
  Scenario: Seleccionamos dos elementos de List y tres elementos de Grid
    Given Vamos a la página de inicio
    When Cambiamos a la página "selectable"
    When Clicamos en "Dapibus"
    When Clicamos en "Porta"
    When Clicamos en "Grid"
    When Clicamos en "One"
    When Clicamos en "Five"
    When Clicamos en "Seven"
    And Hago una captura de pantalla con el filename "CapturaListGrid"
    
  Scenario: Movemos un elemento simple
    Given Vamos a la página de inicio
    When Cambiamos a la página "droppable"
    Then Deberia ver un apartado "Drag me"
    When Clicamos en "Drag"
    And Hago una captura de pantalla con el filename "CapturaElementoSimpleMovido"

  Scenario: Movemos el único elemento que se puede mover en la posición correcta
    Given Vamos a la página de inicio
    When Cambiamos a la página "droppable"
    When Clicamos en "Prevent Propogation"
    When Clicamos en "Drag Me"
    And Hago una captura de pantalla con el filename "CapturaElementoMovido"