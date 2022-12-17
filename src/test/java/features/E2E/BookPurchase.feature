@regression
Feature: Check out a Book
  Scenario: Guest User user buys a book
    Given Guest User is on the Homepage
    When Guest User buys a book
    Then Guest User gets the success message

  Scenario: Registered User Purchases a Book
    Given Registered User is on the Homepage
    When Registered User purchases a book
    Then Registered User gets the success message
