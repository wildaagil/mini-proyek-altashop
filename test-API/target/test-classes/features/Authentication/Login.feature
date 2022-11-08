@Login
Feature: Login
  As a user
  I want to login
  So I can on the dashboar

  Scenario Outline: Login
    Given I set url for login
    And I set body "<email>" email and "<password>" password login
    When I request login
    Then I will get status code is "<result>"
    And I get token
    Examples:
      | email| password| result|
      | someone@mail.com| 123123| succes|
      | | 123123| error|
      | someone@mail.com| | error|
      | | | error|
