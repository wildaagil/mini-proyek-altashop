@Orders
Feature: Order
  As a user
  I want to order
  So I can order

  @Order
  Scenario: Order with one phone
    Given I have logged in
    When I click add button
    And I click order button
    And I click bayar button
    Then i on the transaction page

  Scenario: Order with add qty
    Given I have logged in
    When I click add button
    And I click order button
    And I click add qty
    And I click bayar button
    Then i on the transaction page

  Scenario: Order with reduce qty
    Given I have logged in
    When I click add button
    And I click order button
    And I click reduce qty
    Then i get message order is empty!

  Scenario: Order without add product
    Given I have logged in
    When I just click order button
    Then i get message order is empty!