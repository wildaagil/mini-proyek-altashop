@Registers
Feature: Register
  As a user
  I want to regis account
  So I can create account

  @Register
  Scenario Outline: Login account
    Given I am on the register page
    When I input "<fullname>" fullname "<email>" email and "<password>" password
    And I click register button
    Then I can "<result>" regist account
    Examples:
      | fullname | email | password | result |
      | wilda    | aaa   | Pasword!123 | succes |
      |  wilda   | aaa   | Pasword123! | error |
      |          |       |             | error |
      |          | aaa   | Cobadlu123@ | error |
      | aaa      |       | Asecdq!123  | error |
      | agil     | aaa   |             | error |