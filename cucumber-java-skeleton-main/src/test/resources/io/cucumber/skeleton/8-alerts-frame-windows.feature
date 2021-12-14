Feature: Alerts, frame y ventanas
  Para evaluar Selenium Framework
  Interactuaremos con todos los elementos

  Scenario: Clicamos todos los botones y aceptamos los alerts
    Given Vamos a la página de inicio
    When Cambiamos a la página "alerts"
    When Clicamos en "boton alert"
    When Clicamos en "boton segundos"
    When Clicamos en "boton ok"
    When Clicamos en "boton box"
    Then Deberia ver un apartado "Ok"
    
  Scenario: Vemos que los tamaños de los dos frames son mayores a 0 y cambiamos tamaño de pantalla
    Given Vamos a la página de inicio
    When Cambiamos a la página "frames"
    Then Deberia ver un apartado "DosFrames"
    Then Cambio tamaño de pantalla
    And Hago una captura de pantalla con el filename "CapturaTamañoPantalla"

  Scenario: Abrimos y comprobamos el contenidos de los dos dialogos
    Given Vamos a la página de inicio
    When Cambiamos a la página "modal-dialogs"
    When Clicamos en "Small modal"
    Then Deberia ver un apartado "Small Modal"
    When Clicamos en "Close Small"
    When Clicamos en "Large modal"
    Then Deberia ver un apartado "Large Modal"
    When Clicamos en "Close Large"