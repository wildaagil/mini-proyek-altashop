@Login
Feature: Login
  As a user
  I want to login
  so I can on the dashboard

  Scenario: Login valid
    Given I on the page
    When I click login button
    And I input email
    And I input password
    And I clck button login
    Then I am on the dashboard

  Scenario: Login empty email
    Given I on the page
    When I click login button
    And I input password
    And I clck button login
    Then I am get email can not empty

  Scenario: Login empty password
    Given I on the page
    When I click login button
    And I input email
    And I clck button login
    Then I am get password can not empty