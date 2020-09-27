package main.java.constants;

public class Constant {

    public static final String PROJECTPATH = System.getProperty("user.dir");


    public static class PagesHelperConstants {
        public static final String VISIBILITYOF = "visibilityof";
        public static final String VISIBILITYOFALLELEMENTS = "visibilityOfAllElements";
        public static final String ELEMENTTOBECLICKABLE = "elementtobeclickable";
        public static final String ELEMENTTOBESELECTED = "elementtobeselected";
        public static final String INVISIBILITYOF = "invisibilityof";
        public static final String INVISIBILITYOFALLELEMENTS = "invisibilityOfAllElements";
        public static final String STALENESSOF = "stalenessOf";
        public static final int TIME = 20;
    }

    public static class ExtentManagerConstant {
        public static final String TESTCASENAME = "WEB_AUTOMATION_BDD";
        public static final String REPORTSPATH = PROJECTPATH + java.io.File.separatorChar + "Reports" + java.io.File.separatorChar;
    }

    public static class TakeScreenShotConstant {
        public static final String SCREENSHOTPATH = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "ScreenShots" + java.io.File.separatorChar;
    }

    public static class ExtentTestResult {
        public static final String PASSTEST = "passed";
        public static final String FAILTEST = "failed";
        public static final String SKIPTEST = "skiped";
    }

}


