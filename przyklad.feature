Feature: Change of production settings

Scenario: User changes grindery settings, providing correct values
    Given User checks current value for gridery working time card is expired
      And Stores this value for refence
     When User enters 5 days for gridery working time card is expired
      And Save them
     Then After page reload the value is different from reference value


Scenario: User changes grindery settings - material loss percentage, providing correct values

Scenario: User changes grindery settings - material loss percentage, providing more than 100% loss

Scenario: User changes grindery settings - material loss percentage, providing correct values
    Given User reads current matrial loss percentage value for grindery
      And Stories this value for references
     When User enters 3 for grindery matrial loss percentage value
      And Saves them
     Then After page reload the value is different from reference value

Scenario Outline: User changes grindery settings - material loss percentage, providing correct values 
    When User enters <number> for grindery matrial loss percentage value 
    And Saves them 
    Then After page reload the value is <number> 

    Examples:
    | number |
    | 0      |
    | 5      |
    | 100    |

Scenario Outline: User changes grindery settings - material loss percentage, providing incorrect values 
    When User enters <number> for grindery matrial loss percentage value 
    And Saves them 
    Then After page reload the value is unchanged 

    Examples:
    | number |
    | -1     |
    | -15    |
    | 101    |
    | 150    |


Scenario: User changes grindery settings - material loss percentage, providing more than 100%
    Given User reads current matrial loss percentage value for grindery
      And Stories this value for references
     When User enters 103 for grindery matrial loss percentage value
      And Saves them
     Then User get warning that loss percentage value should be lower than 100%
      And change is not saved
