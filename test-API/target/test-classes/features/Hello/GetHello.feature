@Hello
Feature: Get Hello
  As a user
  I want to get data hello
  So I can get my account

  Scenario: Get hello
    Given I set url for get hello
    When I request body get hello
    Then I get status code is 200
    And I get respons data hellot
