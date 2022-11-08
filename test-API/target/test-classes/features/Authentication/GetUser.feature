@User
Feature: Get User
  As a user
  I want to get account
  So I can get my account

  Scenario: Get User Information
    Given I set url for get user
    When I request body get user
    Then I get status code is 200
#    Then I get user information