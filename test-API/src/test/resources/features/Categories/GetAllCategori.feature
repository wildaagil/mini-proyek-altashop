Feature: Get All Categories
  As a user
  I want to get all categories
  So I can manage all categories

  Scenario: Get All Categories
    Given I set url for get all categories
    When I request list categories
    Then I will get status code is 200