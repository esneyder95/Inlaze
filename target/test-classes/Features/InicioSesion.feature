@Pruebas_automatizadas_inlaze
Feature: Usuario inicia sesion

  @Pruebas_automatizadas_inlaze
  Scenario Outline: Usuario inicia sesion "Usuario registrado"
    Given Ingreso a la pagina de inlaze
    When Ingreso datos de usuario <Correo> <Contraseña>
    Then Validar inicio de sesion <Nombre>

    Examples:
      |                   Correo|   Contraseña|         Nombre|
      |esneider-2895@hotmail.com|Fabiangut199*|esneyder fabian|

  @Pruebas_automatizadas_inlaze
  Scenario Outline: Usuario inicia sesion "Usuario no registrado"
    Given Ingreso a la pagina de inlaze
    When Ingreso datos de usuario <Correo> <Contraseña>
    Then Validar no ingreso a la pagina

    Examples:
      |          Correo|   Contraseña|
      |hola@hotmail.com|Fabiangut199*|

  @Pruebas_automatizadas_inlaze
  Scenario Outline: Usuario inicia sesion "Contraseña errada"
    Given Ingreso a la pagina de inlaze
    When Ingreso datos de usuario <Correo> <Contraseña>
    Then Validar no ingreso a la pagina

    Examples:
      |                   Correo|   Contraseña|
      |esneider-2895@hotmail.com|Fabiangu1995*|