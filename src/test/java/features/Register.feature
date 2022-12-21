@regression
Feature: User Registration

  Scenario: User registers successfully
    Given Customer has valid credentials
    When Customer registers or signs up
    Then Customer should get success message

  Scenario: Invalid email
    Given Customer has invalid credentials
    When Customer tries to signs in with invalid email
    Then Customer should get invalid email message

  Scenario: All Empty Error messages
    Given  Go to register page
    When Click register button
    Then Verify the first error message using

  Scenario: Not matching password
    Given User enters different password
    When User enters not matching password
    Then User should get invalid password message