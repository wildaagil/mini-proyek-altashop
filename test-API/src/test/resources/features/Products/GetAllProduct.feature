Feature: Get All Product
  As a user
  I want to get all my product
  So I can manage my product

  Scenario: Get All Products
    Given I set url api for get all products
    When I request list product
    Then I will get status code is 200