Feature: Get Id Categori
  As a user
  I want to get my categori by id
  So I can get my id categori

  Scenario: Get Valid Id Categori
    Given I set url for get id categori
    When I request id categori
    Then I will get status code is 200
    And I get of my id categori

  Scenario: Get Invalid Id Products
    Given I set url for get invalid id categori
    When I request invalid id categori
    Then I will get status code is 404
    And I get error message record not found