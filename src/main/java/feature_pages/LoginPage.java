package main.java.feature_pages;

import main.java.utility.PagesHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.base.BaseUtil;

public class LoginPage extends BaseUtil {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    @CacheLookup
    WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    @CacheLookup
    WebElement passWord;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    @CacheLookup
    WebElement loginButton;

    @FindBy(xpath = "//h1[contains(text(),'Supply Chain')]")
    @CacheLookup
    WebElement verifyHomePage;

    @FindBy(xpath = "//html//body//div//div//div//header//div//div//*[local-name()='svg']")
    @CacheLookup
    WebElement user;


    public void setUserName(String setUName) {
        PagesHelper.clearText(userName);
        PagesHelper.sendKeys(userName, setUName);
    }

    public void setPassWord(String enterPassword) {
        PagesHelper.clearText(passWord);
        PagesHelper.sendKeys(passWord, enterPassword);
    }

    public void clickLogin() {
        PagesHelper.click(loginButton);
    }

    public boolean verifyLogo() {
        return PagesHelper.isDisplayed(verifyHomePage);
    }

}





