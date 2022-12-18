Feature: Jewelry Purchase
  Scenario: User buys Jewelry
    Given Guest User is on the Homepage
    When User buys Jewelry
    Then  Guest User gets the success message

    Scenario: Registered user buys Jewelry
      Given Registered User is on the Homepage
      When  Registered user buys Jewelry
      Then  Registered User gets the success message
