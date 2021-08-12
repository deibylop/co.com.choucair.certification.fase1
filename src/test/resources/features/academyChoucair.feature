# Autor: Deiby Lopez
@stories
Feature: Academy choucair
  As as user, I want to learn how to automate in screenlay at the choucair academy with the automation course
  @scenario1
  Scenario Outline: Seach for a automation course
    Given : Than brandom wants to learn automation at the academy choucair
    | strUser  | strPassword   |
    | <strUser>| <strPassword> |
    When  : he search for the course Recusos Automatizacion Bancolombia on the choucair acadey platform
      | strCourse  |
      | <strCourse>|
    Then : he find the course called resources Recusos Automatizacion Bancolombia
      | strCourse  |
      | <strCourse>|

    Examples:
    | strUser  | strPassword   || strCourse  |
    | brandom| Febrero.2020 || Recusos Automatizacion Bancolombia|