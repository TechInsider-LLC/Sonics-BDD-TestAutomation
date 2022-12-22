
@regression
Feature: Update Customer Info
  Scenario: Registered User should be able to update Customer Info
    Given Registered User is on the Homepage
    When Registered User changes the Customer Info
    Then Registered User gets Customer Info Changed

