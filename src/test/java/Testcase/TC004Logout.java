package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Browser;
import PageObjectM.Sign_out_PageObj;

public class TC004Logout extends Browser
{
	@Test//(testName="test4")
	public static void Loggingout() throws Exception {	
		
		TC003SignIn sn = new TC003SignIn();
		sn.singin();
		Sign_out_PageObj snobj = new Sign_out_PageObj(driver);
		String acttext =snobj.PullingText().getText();
		System.out.println("Successfully logged in So now we are on -->"+acttext +" page");		
		snobj.AccountIcon().click();
		logger.info("Click on Account button");		
		snobj.Signout().click();
		logger.info("Successfully Signout ");	
		Assert.assertEquals(snobj.Myaccount().getText(), "Customer2 Login");
	}
}
