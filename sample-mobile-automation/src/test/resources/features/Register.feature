@Register
Feature: Register
  As a user
  I want to create account
  so I can succes create account

  Scenario Outline: Register
    Given I on the page
    When I click login button
    And I click register
    And I input "<fullname>" fullname
    And I input "<email>" email
    And I input "<password>" password
    And I clck button register
    Then I am get "<result>" result
    Examples:
    | fullname | email | password | result |
    | agil | agil@gmail.com | Agil!123 | succes |
    |  | cipung@gmail.com | Cipung12345! | errorFn|
    | cipung |  | Cipung12345! | errorEmail |
    | cipung | cipung@gmail.com | | errorPass |
    |  |  |  | allError |