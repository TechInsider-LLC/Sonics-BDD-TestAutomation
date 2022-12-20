Feature: Login
  Scenario: Login with valid credentials
    Given User has valid credentials
    When User logs in with valid credentials
    Then User verifies log out button


  Scenario: Invalid Email
    Given User has invalid credentials
    When User tries to login with invalid email address
    Then User gets failure message
