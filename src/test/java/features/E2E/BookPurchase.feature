Feature: Book Purchase
  Scenario: User purchase a Book
    Given User is on Homepage
    When User user buys a book
    Then User user should get success message
