package Utlities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.Browser;

public class Screenshot extends Browser {
	public String screenshotPath;
	public static String screenshotName;

	public static String getscreenshort() throws Exception {

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName+ "testfailur.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
		
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		// Date d = new Date();
		// screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		// FileUtils.copyFile(scrFile, new
		// File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));

	}
}
