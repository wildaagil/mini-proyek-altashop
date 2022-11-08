Feature: Create Product
  As a user
  I want to new product
  So I can create new product

  Scenario: Create Valid Product
    Given I set url for create products
    When I set body product
    Then I request product
    And I will get status code is 200
