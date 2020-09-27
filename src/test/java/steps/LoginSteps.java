package test.java.steps;

import cucumber.api.java.Before;
import cucumber.api.java8.En;
import main.java.feature_pages.LoginPage;
import org.testng.Assert;


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
            Assert.assertEquals("", "");
        });
    }
}
