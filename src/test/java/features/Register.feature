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
    Given Customer enters different password
    When Customer enters not matching password
    Then Customer should get invalid password message