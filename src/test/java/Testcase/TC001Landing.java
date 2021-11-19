package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;

import Base.Browser;


public class TC001Landing extends Browser {
	@Test//(testName="test1")
		public static void Homepage() throws Exception {
		
	logger.info("Getting actual name of page");
	String Actualpage = driver.getTitle();	
	
	String Expectedpage = "Kitchen Stuff Plus | Houseware & Home Decor Retailer";	
	Assert.assertEquals(Actualpage, Expectedpage);	
	
	logger.info("Matching Actual page name and expected page name");
	
	//test.log(LogStatus.PASS, "Passed");
	
	

}}
