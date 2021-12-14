Feature: Iniciar sesión y añadir libros al carrito
  Para evaluar Selenium Framework
  Primero iniciaremos sesión con un usuario válido y añadiremos
  libros a nuestro carro de la compra, después los borraremos

  Scenario: Iniciamos sesión con usuario válido y buscamos libro
    Given Vamos a la página de inicio
    When Cambiamos a la página "login"
    When Yo escribo "username"
    When Yo escribo "password"
    When Clicamos en "Login"
    When Clicamos en "Book_Store"
    Then Hago click en el siguiente apartado "Type to search"
    When Yo escribo "Speaking JavaScript"
    Then Deberia ver un apartado "Speaking JavaScript"
    Then Hacemos log out del usuario

  Scenario: Iniciamos sesión y añadimos libro
    Given Vamos a la página de inicio
    When Cambiamos a la página "login"
    When Yo escribo "username"
    When Yo escribo "password"
    When Clicamos en "Login"
    When Clicamos en "Book_Store"
    When Clicamos en "Git_Pocket_Guide"
    When Clicamos en "Add_To_Your_Collection"
    When Cambiamos a la página "profile"
    Then Hacemos log out del usuario

  Scenario: Iniciamos sesión y borramos libro
    Given Vamos a la página de inicio
    When Cambiamos a la página "login"
    When Yo escribo "username"
    When Yo escribo "password"
    When Clicamos en "Login"
    When Clicamos en "Book_Store"
    When Clicamos en "Git_Pocket_Guide"
    When Clicamos en "Add_To_Your_Collection"
    When Cambiamos a la página "profile"
    When Clicamos en "BorrarLibro"
    When Clicamos en "OK"
    Then Hacemos log out del usuario