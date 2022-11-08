Feature: Get Id Product
  As a user
  I want to get my product by id
  So I can get my id product

  Scenario: Get Valid Id Products
    Given I set url for get id products
    When I request id product
    Then I will get status code is 200
    And I get of my id product

  Scenario: Get Invalid Id Products
    Given I set url for get invalid id products
    When I request invalid id product
    Then I will get status code is 404
    And I get error message record not found

#  Scenario: Get a project with valid ID
#    Given I set url to get a project
#    And I get ID project
#    When I request get detail project
#    Then I get status code 200