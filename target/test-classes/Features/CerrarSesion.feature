@Pruebas_automatizadas_inlaze
Feature: Cerrar sesion

  @Pruebas_automatizadas_inlaze
  Scenario Outline: Usuario cierra sesion
    Given Ingreso a la pagina de inlaze
    When Inicio sesion <Correo> <Contraseña>
    Then Cierro Sesion

    Examples:
      |                   Correo|   Contraseña|
      |esneider-2895@hotmail.com|Fabiangut199*|
