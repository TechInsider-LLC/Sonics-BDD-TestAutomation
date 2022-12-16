Feature: Camera Purchase
  Scenario: User Purchases a Camera
    Given Guest User is on the Homepage
    When User purchase a camera
    Then Guest User gets the success message

  Scenario: Registered user Purchases a Camera
    Given Registered User is on the Homepage
    When Registered user purchase a camera
    Then Registered User gets the success message