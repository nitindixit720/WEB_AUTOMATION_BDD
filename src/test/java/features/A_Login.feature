Feature: Login Page
  This feature deals with login functionality

  @sanity @regression
  Scenario: To verify user is able to login with valid data
    Given A user "test@vegrow.in" with password "test123"
    When  I enter the username "test@vegrow.in"
    And   I enter the password "test123"
    And   I click on the login button
    Then  I should see the supply chain logo on the home page

  @sanity @regression
  Scenario: To verify user is able to logout
    Given A user "test@vegrow.in" with password "test123"
    When  I click on the user button
    And   I click logout button
    Then  I should be able to see the login page


