package test.java.steps;

import cucumber.api.java.Before;
import cucumber.api.java8.En;

import main.java.feature_pages.LoginPage;

import static main.java.utility.TestSuiteHelper.verifyTrueBooleanValue;


public class LoginSteps implements En {
    LoginPage loginObj;

    @Before
    public void before() {
        loginObj = new LoginPage();
    }

    public LoginSteps() {
        Given("^A user \"([^\"]*)\" with password \"([^\"]*)\"$", (String userName, String password) -> {
        });
        When("^I enter the username \"([^\"]*)\"$", (String userName) -> {
            loginObj.setUserName(userName);
        });
        And("^I enter the password \"([^\"]*)\"$", (String password) -> {
            loginObj.setPassWord(password);
        });
        And("^I click on the login button$", () -> {
            loginObj.clickLogin();
        });
        Then("^I should see the supply chain logo on the home page$", () -> {
            verifyTrueBooleanValue(loginObj.verifyLogo());
        });
        When("^I click on the user button$", () -> {

        });
        And("^I click logout button$", () -> {
        });
        Then("^I should be able to see the login page$", () -> {
        });
    }
}
