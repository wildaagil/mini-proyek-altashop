Feature: Create Categori
  As a user
  I want to create categori
  So I can create new categori

  Scenario: Create valid categori
    Given I set a url api for create categori
    And I set body name and description
    When I request categori
    Then I will get status code is 200

  Scenario: Create invalid categori name
    Given I set a url api for create categori
    And I set body empty name and description
    When I request categori
    Then I will get status code is 500

  Scenario: Create invalid categori description
    Given I set a url api for create categori
    And I set body name and empty description
    When I request categori
    Then I will get status code is 200
