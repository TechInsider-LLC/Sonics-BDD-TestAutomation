Feature: Notebook Purchase
  Scenario: Guest user buys Notebook
    Given Guest User is on the Homepage
    When  Guest user purchases Notebook
    Then  Guest User gets the success message