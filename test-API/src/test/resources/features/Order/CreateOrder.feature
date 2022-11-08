
Feature: Create Order
  As a user
  I want to create order
  So I can create order

  Scenario: Create Order
    Given I set url for create order
    And I set body create order
    When I request body create order
    Then I get status code is 200