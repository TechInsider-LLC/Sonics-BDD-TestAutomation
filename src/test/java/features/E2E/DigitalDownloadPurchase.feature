@regression
Feature: Digital Downloads
  Scenario: User Purchases a Digital Downloads
    Given Guest User is on the Homepage
    When User purchase a Digital Downloads
    Then Guest User gets the success message

  Scenario: Registered user a Digital Downloads
    Given Registered User is on the Homepage
    When Registered user purchase a Digital Downloads
    Then Registered User gets the success message