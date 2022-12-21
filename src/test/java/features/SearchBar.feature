@regression
Feature: Search bar
  Scenario: Guest customer able to search a Health book
    Given Guest customer is on the Homepage
    When Guest customer searches a Health book
    Then Guest customer successfully see a Health book

    Scenario: Registered customer able to search a Health book
      Given Registered customer is on the Homepage
      When Registered customer searches a Health book
     Then Registered customer successfully see a Health book
