package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil {
	public static String captureScreenshot(String testName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMddHHmmss")
                        .format(new Date());

        String path =
                "test-output/screenshots/"
                        + testName + "_" + timestamp + ".png";

        TakesScreenshot ts =
                (TakesScreenshot) DriverFactory.getDriver();

        File source =
                ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(path);

        try {

            FileUtils.copyFile(source, destination);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return destination.getAbsolutePath();
    }
}
