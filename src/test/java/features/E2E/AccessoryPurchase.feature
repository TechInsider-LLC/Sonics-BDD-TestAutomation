@regression
Feature: Accessories
  Scenario: User buys accessories
    Given  Guest User is on the Homepage
    When User buys accessories
    Then Guest User gets the success message

  Scenario: Registered user buys accessories
    Given Registered User is on the Homepage
    When Registered user buys accessories
    Then Registered User gets the success message