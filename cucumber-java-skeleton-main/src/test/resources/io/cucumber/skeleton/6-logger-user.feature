Feature: Registrarse como usuario en la tienda
  Para evaluar Selenium Framework
  Nos registraremos como usuario para iniciar sesión

  Scenario: Registramos usuario que ya existe y lo comprobamos
    Given Vamos a la página de inicio
    When Cambiamos a la página "login"
    When Clicamos en "New User"
    When Yo escribo "Tom"
    When Yo escribo "Anderson"
    When Yo escribo "tomanderson"
    When Yo escribo "Tomanderson1993*"
    Then Haremos clic en el boton "Register"
    Then Deberia ver un apartado "User exists!"
    
  Scenario: Iniciamos sesión con usuario y contraseña válidos y cerramos session
    Given Vamos a la página de inicio
    When Cambiamos a la página "login"
    When Yo escribo "username"
    When Yo escribo "password"
    When Clicamos en "Login"
    When Clicamos en "Logout"

  Scenario: Iniciamos sesión con usuario y contraseña incorrectos
    Given Vamos a la página de inicio
    When Cambiamos a la página "login"
    When Yo escribo "usernameFalso"
    When Yo escribo "password"
    When Clicamos en "Login"
    Then Deberia ver un apartado "Invalid username or password!"