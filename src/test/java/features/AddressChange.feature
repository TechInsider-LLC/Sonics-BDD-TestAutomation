@regression
Feature: Address Change
  Scenario: User changes the address
    Given User logs in
    When User changes the address
    Then User saves the changed address