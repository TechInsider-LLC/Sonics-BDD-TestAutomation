Feature: Purchase Desktop as a Guest
  Scenario: Guest User can purchase a Desktop
    Given Guest User is on the Homepage
    When Guest User tries to purchase a Desktop
    Then Guest User gets the success message