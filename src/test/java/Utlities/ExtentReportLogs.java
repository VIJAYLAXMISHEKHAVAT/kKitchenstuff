package Utlities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Base.Browser;

public class ExtentReportLogs extends Browser {

	public static ExtentReports extent;
	public static ExtentSparkReporter Repoter;	
	public static ExtentTest test ;
	@Test
	public static ExtentReports Config() {
		String filepath = System.getProperty("user.dir")+"\\reports\\index.html";
	      ExtentSparkReporter repoter = new ExtentSparkReporter(filepath);
	      repoter.config().setTheme(Theme.DARK);
	      repoter.config().setDocumentTitle("Test Reports");	     
	      repoter.config().setReportName("Web Autometion Reports");
	      extent = new ExtentReports(); 
	      extent.attachReporter( repoter);
	      extent.setSystemInfo("Tester", "VijayLaxmi Shekhavat");
		return extent;	
	}
	public static void GetReportLog() {
		
	 test = extent.createTest("Loggin Test");			
		test.log(Status.INFO, "Pass");
		extent.flush();
	
		 }
	}