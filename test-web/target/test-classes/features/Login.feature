@Logins
Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  @Login
  Scenario Outline: Login account
    Given I am on the website page
    When I clik sigin button
    And I input valid "<email>" email and "<password>" password
    And I click Login button
    Then I will get the "<result>"
    Examples:
    | email | password | result |
    | aaa   | Pasword!123 | i can login |
    |       | Pasword!123 | i cant login |
    | aaa   |             | i cant login |
    |       |             | i cant login |
    | aaa   | aaa         | i cant login |
