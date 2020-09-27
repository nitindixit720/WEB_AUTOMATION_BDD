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

    @FindBy(xpath = "")
    @CacheLookup
    WebElement userName;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement passWord;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement loginButton;

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


}





