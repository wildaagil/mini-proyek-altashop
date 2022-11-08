@Register
Feature: Register
  As a user
  I want to regist account
  So I can create new account

  Scenario Outline: Create Account Product
    Given I set url for create account
    When I set body "<email>" email account
    And I set body "<password>" password account
    And I set body "<fullname>" fullname account
    Then I request account
    And I will get status code is "<result>"
    Examples:
    | email| password| fullname| result|
    | ahha1@gmail.com| 123123| agil| succes|
    | ahha@gmail.com| 231233| ahha aja| error|
    | | 231233| ahha aja| error|
    | ahha@mail.com| | ahha aja| error|
    | ahha@mail.com| 231233| | error|
    | | | | error|