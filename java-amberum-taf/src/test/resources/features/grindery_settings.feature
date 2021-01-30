Feature: Change of production settings

  Background:
    Given User is logged in
    And User is in Production Settings section

  Scenario: User changes grindery settings, providing correct values
    Given User reads current value for gridery working time card is expired
    And Stores this value for refence
    When User enters 5 days for gridery working time card is expired
    Then After page reload the value is different from reference value


  Scenario: User changes grindery settings - material loss percentage, providing correct values

  Scenario: User changes grindery settings - material loss percentage, providing more than 100% loss

