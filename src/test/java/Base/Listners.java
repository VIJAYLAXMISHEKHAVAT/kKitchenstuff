package Base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import Utlities.ExtentReportLogs;
import Utlities.Screenshot;

public class Listners extends Browser implements ITestListener {
	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent = ExtentReportLogs.Config();
	
	//ThreadLocal<ExtentTest> extentlocal = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Pass");
		//test.log(LogStatus.INFO, "pass");
	}

	public void onTestFailure(ITestResult result) {
		//test.fail(result.getThrowable());		
		 try {
			Screenshot.getscreenshort();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		 test.log(Status.FAIL,result.getName().toUpperCase()+" Failed with exception : "+ result.getThrowable());
		 
			//test.log(Status.INFO,(Markup) test.addScreenCaptureFromPath(Screenshot.screenshotName));
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

		extent.flush();

	}
}
