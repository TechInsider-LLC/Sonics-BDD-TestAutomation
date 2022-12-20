@regression
Feature: NewsLetter
  Scenario: User signs in to NewsLetter
    Given User is on the Homepage
    When User signs in to NewsLetter
    Then User gets success message

  Scenario: User tries to sign in to NewsLetter
    Given User is on the Homepage
    When User tires to sign with invalid username
    Then User gets the failure message
