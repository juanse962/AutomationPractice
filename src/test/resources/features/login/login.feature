Feature: Automation of web shopping
  @smoke
  Scenario Outline: Enter the website and fill in the form
    Given the user wishes to create an account on the website
    When the user enters his or her data for the creation of a new system
      | email    | firstname   | lastname | pwd           | day | month   | year | addressname | addresslast | company     | address1 | address2 | city     | state         | postlcod | comment | mobile    | home   | alias   |
      | jsgprueb | <firtsname> | Gomez    | <pwdgenerate> | 5   | October | 1996 | luiz        | lopez       | devbrothers | calle11  | tower 14 | medallin | Massachusetts | 05501    | prueba  | 323564565 | 323212 | <alias> |
    Then he must display a message MY ACCOUNT
    Examples:
      | firtsname | pwdgenerate | alias     |
      | Camilo    | 123456      | luis      |
      | Cristian  | 65432       | Jose      |
      | Jose      | 92189282    | Juan      |
