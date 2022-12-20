@regression @cellPhonePurchase
Feature: Cell Phones Purchase
  Scenario: Guest User purchases a Phone cover
    Given Guest User is on the Homepage
    When Guest user buys a Phone cover
    Then Guest User gets the success message

  Scenario: Registered User purchases a Phone cover
    Given Registered User is on the Homepage
    When Registered user buys a Phone cover
    Then Registered User gets the success message
