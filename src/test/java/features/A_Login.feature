Feature: Login Page
  This feature deals with login functionality

  @sanity @regression
  Scenario: To verify user is able to login with valid data
    Given A user "<User Name>" with password "<Password>"
    When  I enter the username "<User Name>"
    And   I enter the password "<Password>"
    And   I click on the login button
    Then  I should see the supply chain logo on the home page
