@Add
Feature: Add Product
  As a user
  I want to Add product
  so I can product to my cart

  Scenario: Add Product
    Given I have logged in
    When I click buy button
    Then The product is added to the cart