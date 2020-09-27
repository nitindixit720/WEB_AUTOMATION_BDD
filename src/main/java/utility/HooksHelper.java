package main.java.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.common.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test.java.base.BaseUtil;

public class HooksHelper extends BaseUtil {

    public static WebDriver openChromeDriver() {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().clearCache();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver openFirefoxDriver() {
        WebDriverManager.firefoxdriver().clearPreferences();
        WebDriverManager.firefoxdriver().clearCache();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public static void onFinish() {
        System.out.println("PASS---" + Common.TestCount.PASSCOUNT);
        System.out.println("FAIL---" + Common.TestCount.FAILCOUNT);
        System.out.println("SKIP---" + Common.TestCount.SKIPCOUNT);
        driver.quit();
    }
}


