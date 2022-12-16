Feature: Accessories
  Scenario: User buys accessories
    Given User is on the web page
    When User buys accessories
    Then User gets order message

  Scenario: Registered user buys accessories
    Given Registered user on web page
    When Registered user buys accessories
    Then Registered user gets order message