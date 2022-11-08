Feature: Get Rating
  As a user
  I want to get rating product
  So I can get rating product

  Scenario: Get Rating Product
    Given I set url for get rating product
    When I request rating product
    Then I get status code is 200
    And I get rating product