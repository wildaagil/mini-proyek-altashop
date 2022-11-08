@Orders
Feature: Get All Order
  As a user
  I want to get all order
  So I can get all order

  Scenario: Get All Order
    Given I set url for get all order
    When I request body get all order
    Then I get status code is 200