@regression
Feature: User Registration

  Scenario: User registers successfully
    Given User has valid credentials
    When User registers or signs up
    Then User should get success message

  Scenario: Invalid email
    Given user has invalid credentials
    When User tries to signs in with invalid email
    Then User should get invalid email message

  Scenario: All Empty Error messages
    Given  Go to register page
    When Click register button
    Then Verify the first error message using

  Scenario: Not matching password
    Given User enters different password
    When User enters not matching password
    Then User should get invalid password message