Feature: Orders
  Scenario: Customer should be able purchase Jewelry and check the order number from Orders
    Given Registered Customer should be able to login in webpage
    When Customer can  purchase jewelry
    Then Customer should verify order number