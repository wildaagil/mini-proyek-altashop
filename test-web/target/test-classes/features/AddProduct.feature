@AddProducts
Feature: Add product
  As a user
  I want to add product
  So I can add my product

  @AddProduct
  Scenario: Add Product with index one
    Given I have logged in
    When I click add button
    And I click order button
    Then i on the order page