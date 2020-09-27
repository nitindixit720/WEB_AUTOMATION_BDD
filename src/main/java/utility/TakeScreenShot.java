package main.java.utility;


import main.java.constants.Constant;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import test.java.base.BaseUtil;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenShot extends BaseUtil {

    public static String[] takeScreenShot() {
        String[] filePaths = new String[3];
        Date dateObj = new Date();
        String fileName = dateObj.toString().replace(":", "_").replace(" ", "_") +
                Thread.currentThread().getStackTrace()[2].getMethodName() + ".png";
        filePaths[0] = Constant.TakeScreenShotConstant.SCREENSHOTPATH + fileName;
        filePaths[2]= fileName;

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);

        try {
            //FileUtils.copyFile(scrFile, new File(filePath));
            ImageIO.write(screenshot.getImage(), "png",
                    new File(filePaths[0]));
        } catch (IOException e) {

        }
        return filePaths;
    }
}