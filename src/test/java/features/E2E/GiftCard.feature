@regression
Feature: Gift Card
  Scenario: User buys Gift Card
    Given Guest User is on the Homepage
    When User buys Gift Card
    Then Guest User gets the success message

  Scenario: Registered User buys Gift Card
    Given Registered User is on the Homepage
    When Registered User buys Gift Card
    Then Registered User gets the success message