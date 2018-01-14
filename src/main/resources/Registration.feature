Feature: Registration feature

  @register
  Scenario: User Registration
    Given I am on home page
    When I enter new user details
    Then I should log in sucessfully
    And I should logout sucessfully
Scenario: