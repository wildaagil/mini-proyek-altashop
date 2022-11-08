@Logout
Feature: Logout
  As a user
  I want to logout account
  so I can success to logout

  Scenario: Logout success
    Given I have logged in
    When I click logout button
    Then I will go back to home page