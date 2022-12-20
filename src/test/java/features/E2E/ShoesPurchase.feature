@regression
Feature: Shoes Purchase
  Scenario: User Purchases a Shoes
    Given  Guest User is on the Homepage
    When Guest User purchase a Shoes
    Then Guest User gets the success message

  Scenario: Registered user Purchases a Shoes
    Given  Registered User is on the Homepage
    When Registered User purchase a Shoes
    Then Registered User gets the success message