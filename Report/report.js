$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "This feature deals with login functionality",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8043236080,
  "status": "passed"
});
formatter.before({
  "duration": 35011520,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To verify user is able to login with valid data",
  "description": "",
  "id": "login-page;to-verify-user-is-able-to-login-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "A user \"test@vegrow.in\" with password \"test123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the username \"test@vegrow.in\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the password \"test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the supply chain logo on the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test@vegrow.in",
      "offset": 8
    },
    {
      "val": "test123",
      "offset": 39
    }
  ],
  "location": "LoginSteps.java:20"
});
formatter.result({
  "duration": 214551377,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@vegrow.in",
      "offset": 22
    }
  ],
  "location": "LoginSteps.java:22"
});
formatter.result({
  "duration": 680553592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 22
    }
  ],
  "location": "LoginSteps.java:25"
});
formatter.result({
  "duration": 380749080,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:28"
});
formatter.result({
  "duration": 186051510,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:31"
});
formatter.result({
  "duration": 743160991,
  "status": "passed"
});
formatter.after({
  "duration": 2687085,
  "status": "passed"
});
formatter.before({
  "duration": 84571,
  "status": "passed"
});
formatter.before({
  "duration": 296763,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To verify user is able to logout",
  "description": "",
  "id": "login-page;to-verify-user-is-able-to-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "A user \"test@vegrow.in\" with password \"test123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the user button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click logout button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be able to see the login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test@vegrow.in",
      "offset": 8
    },
    {
      "val": "test123",
      "offset": 39
    }
  ],
  "location": "LoginSteps.java:20"
});
formatter.result({
  "duration": 130227,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:34"
});
formatter.result({
  "duration": 35747,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:37"
});
formatter.result({
  "duration": 441742,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:39"
});
formatter.result({
  "duration": 87416,
  "status": "passed"
});
formatter.after({
  "duration": 98220,
  "status": "passed"
});
});