package main.java.utility;

import com.github.javafaker.Faker;
import main.java.constants.Constant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.base.BaseUtil;

import java.util.List;
import java.util.Random;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PagesHelper extends BaseUtil {

    public static void clearText(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        element.clear();
    }

    //get text.
    public static String getText(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        String value = element.getText().toLowerCase();
        return value;
    }

    //click element.
    public static void click(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        element.click();
    }

    public static void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String genarateRandomName() {
        Faker faker = new Faker();
        Random rand = new Random();
        return faker.name().fullName() + " " + rand.nextInt(100);
    }

    //Using java script click on element.
    public static void javaScriptClick(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    //Send data.
    public static void sendKeys(WebElement element, String text) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        element.sendKeys(text);
    }

    //Wait explicit for single element the element to load.
    public static void waitExplicit(WebElement element, String type, long waittime) {
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        System.out.println("Inside WaitExplicit " + element);
        WebDriverWait wait = new WebDriverWait(driver, waittime);
        String CaseType = type;
        switch (CaseType.toLowerCase()) {
            case Constant.PagesHelperConstants.VISIBILITYOF:
                wait.until(ExpectedConditions.visibilityOf(element));
                break;
            case Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(element));
                break;
            case Constant.PagesHelperConstants.ELEMENTTOBESELECTED:
                wait.until(ExpectedConditions.elementToBeSelected(element));
                break;
            case Constant.PagesHelperConstants.INVISIBILITYOF:
                wait.until(ExpectedConditions.invisibilityOf(element));
                break;
            case Constant.PagesHelperConstants.STALENESSOF:
                wait.until(ExpectedConditions.stalenessOf(element));
                break;
            default:
                System.out.println("Method Name: waitexplicit-->Wrong Method Passed");
                break;
        }
    }

    //Wait explicit for more than one element.
    public static void waitExplicitElements(List<WebElement> elements, String type, long waittime) {
        driver.manage().timeouts().implicitlyWait(0, SECONDS);
        System.out.println("Inside waitExplicitElements ");
        WebDriverWait wait = new WebDriverWait(driver, waittime);
        String CaseType = type;
        switch (CaseType.toLowerCase()) {

            case Constant.PagesHelperConstants.VISIBILITYOFALLELEMENTS:
                wait.until(ExpectedConditions.visibilityOfAllElements(elements));
                break;
            case Constant.PagesHelperConstants.INVISIBILITYOFALLELEMENTS:
                wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
                break;


            default:
                System.out.println("Method Name: waitExplicitElements-->Wrong Method Passed");
                break;
        }
    }

    //Is element displayed.
    public static boolean isDisplayed(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        boolean flag = element.isDisplayed();
        return flag;
    }
}
