Feature: Downloadable products
  Scenario:User should be able to download product
    Given When user is on the home page
    When User purchases downloadable product
    Then Verify the order number
