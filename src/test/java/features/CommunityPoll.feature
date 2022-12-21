@regression
Feature: Vote for Community Poll
  Scenario: Unregistered user should get error message on Community Poll
    Given Unregistered user is on Community Poll page
    When Unregistered user tries to vote
    Then Error message shown to voter