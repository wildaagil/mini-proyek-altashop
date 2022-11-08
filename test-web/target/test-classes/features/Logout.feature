@Logouts
Feature: Logout
  As a user
  I want to logout
  So I can logout for my account

  @Logout
  Scenario: Success logout
    Given I have logged in
    When I click profile menu
    And I click logout button
    Then I will go back to login page