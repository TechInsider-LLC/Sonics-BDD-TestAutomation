@regression
Feature: Email Friend
  Scenario:User emails a friend
    Given User Logs in
    When  User Emails a Friend
    Then  User gets message sent
