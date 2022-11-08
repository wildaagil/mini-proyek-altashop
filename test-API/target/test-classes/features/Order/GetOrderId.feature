@Orid
Feature: Get Order Id
  As a user
  I want to get order by id
  So I can get order by id

  Scenario: Get All Order
    Given I set url for get order id
    When I request body get order id
    Then I get status code is 200