package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;



import Base.Browser;
import PageObjectM.CreatingaccountPageO;
import PageObjectM.Signinpageobj;

public class TC003SignIn extends Browser{
	
     	@Test//(testName="test3")
			public  void singin() throws Exception {
			
     		CreatingaccountPageO crt= new CreatingaccountPageO(driver);		
     		crt.Accountbutton().click();	     		
			Signinpageobj sb = new Signinpageobj(driver);			
			sb.Siginbtn().click();			
			logger.info("Clicked on Sigin button");	
			
			sb.Emailtext().sendKeys("email");
			logger.info("Entered email");
		
			sb.Passtext().sendKeys("password");
			logger.info("Entered Password");
		
			sb.Submitbtn().click();
			logger.info("Clicked on Submit button");		
			
			logger.info("Getting actual name of page ");
			
			Assert.assertTrue(sb.getnavbar().isDisplayed());
			Assert.assertEquals(sb.gettext().getText(), "Customer Login");
			
		}
		
}