@regression
Feature: Address Change
  Scenario: User creates a new Address
    Given User logs in
    When User creates a new address
    Then User gets the message

  Scenario: User edits the address
      Given User logs in
      When User edits the address
      Then User gets the edit message

  Scenario: User deletes the address
    Given User logs in
    When User deletes the address
    Then User gets the delete message