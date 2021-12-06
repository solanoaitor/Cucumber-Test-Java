Feature: Text Box
  Para evaluar Selenium Framework
  Escribimos en texto y realizaremos todo el Text Box

  Scenario: En mi web se puede mostrar Elementos
    When Vamos a la página de inicio
    Then Deberia ver un apartado "Elements"

  Scenario: En mi web se puede escribir un un campo
    Given Vamos a la página de inicio
    When Deberia escribir "Aitor"
    Then Hago click en el siguiente apartado

  Scenario: En mi web se puede escribir en un campo el email y borrarlo
    Given Vamos a la página de inicio
    When Deberia escribir "aitor@aitor.com"
    Then Borro "email"
    And Hago una captura de pantalla con el filename "Captura"
