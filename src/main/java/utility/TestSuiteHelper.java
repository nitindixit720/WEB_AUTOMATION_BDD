package main.java.utility;

import com.cucumber.listener.Reporter;
import main.java.common.Common;
import main.java.constants.Constant;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.testng.Assert;

import java.io.IOException;
import java.util.Date;

public class TestSuiteHelper {

    public static String fileName = "";

    public static void takeScreenShotHelper() {
        try {
            String[] filePaths = TakeScreenShot.takeScreenShot();
            Reporter.addScreenCaptureFromPath(filePaths[1]);
        } catch (IOException ex) {
            Reporter.addStepLog("Exception:->" + ex);
        }
    }

    public static void extractLogs(LogEntries logEntries) {
        for (LogEntry entry : logEntries) {
            Reporter.addStepLog("Console Logs:  " + "<p> Level:->" + entry.getLevel() + "<p> Messages:->" + entry.getMessage());
        }
    }

    public static void verifyTrueBooleanValue(boolean value) {
        if (value) {
            Reporter.addStepLog("--------------------Test Passed ---------------------------------------");
        } else {
            Reporter.addStepLog("--------------------Test Failed ---------------------------------------");
            Assert.fail("--------------------Test Failed ---------------------------------------");
        }
    }

    public static void updateCount(String status) {
        if (status.equalsIgnoreCase(Constant.ExtentTestResult.PASSTEST)) {
            Common.TestCount.PASSCOUNT++;
        } else if (status.equalsIgnoreCase(Constant.ExtentTestResult.FAILTEST)) {
            Common.TestCount.FAILCOUNT++;
        } else if (status.equalsIgnoreCase(Constant.ExtentTestResult.SKIPTEST)) {
            Common.TestCount.SKIPCOUNT++;
        }
    }

    public static String getReportPath() {
        String testName = Constant.ExtentManagerConstant.TESTCASENAME;
        Date date = new Date();
        fileName = date.toString().replace(":", "_").replace(" ", "_") + "_" +
                testName + "_" + ".html";
        String reportPath = Constant.ExtentManagerConstant.REPORTSPATH + fileName;
        return reportPath;
    }

    public static String getFileName() {
        return fileName;
    }

}
