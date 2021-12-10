Feature: Modificar y borrar usuario en tabla
  Para evaluar Selenium Framework
  Modificamos y borramos a diferentes usuarios con diferentes campos

  Scenario: Modificar nombre de usuario
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    When Clicamos en "Editar"
    When Yo escribo "Andres"
    Then Hago una captura de pantalla con el filename "CapturaNombre"

  Scenario: Modificar apellido de usuario
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    When Clicamos en "Editar"
    When Yo escribo "Garcia"
    Then Hago una captura de pantalla con el filename "CapturaApellido"

  Scenario: Borrar usuario Alden
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    Then Deberia ver un apartado "Alden"
    When Clicamos en "BorrarAlden"
    Then No debería ver "Alden"

  Scenario: Borrar usuario Kierra
    Given Vamos a la página de inicio
    When Clicamos en "Elements"
    Then Hago click en el siguiente apartado "Web Tables"
    Then Deberia ver un apartado "Kierra"
    When Clicamos en "BorrarKierra"
    Then No debería ver "Kierra"