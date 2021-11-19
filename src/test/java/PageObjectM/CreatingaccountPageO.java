package PageObjectM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Browser;

public class CreatingaccountPageO extends Browser {
	public WebDriver driver;
	
	public CreatingaccountPageO(WebDriver driver) {
		this.driver = driver;
	}

	By accountbtn = By.cssSelector("li.customer-welcome");
	By creataccount = By.xpath("//header/div[1]/div[1]/li[1]/div[2]/div[1]/ul[1]/li[2]/a[1]");
	By click = By.cssSelector("from.needsclick.klaviyo-form.klaviyo-form-version-cid_1.kl-private-reset-css-Xuajs1");
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By email = By.id("email_address");
	By pword = By.id("password");
	By cnfpword = By.id("password-confirmation");
	By submitbtn = By.cssSelector("button.action.submit.primary");
	By title = By.cssSelector("span.base");

	public WebElement Accountbutton() {
		return driver.findElement(accountbtn);
	}

	public WebElement Creatingact() {
		return driver.findElement(creataccount);
	}

	public WebElement firstname() {
		return driver.findElement(fname);
	}

	public WebElement Lasrtname() {
		return driver.findElement(lname);
	}

	public WebElement emailid() {
		return driver.findElement(email);
	}

	public WebElement password() {
		return driver.findElement(pword);
	}

	public WebElement Confirmpassword() {
		return driver.findElement(cnfpword);
	}

	public WebElement submit() {
		return driver.findElement(submitbtn);
	}

	public WebElement GetingTitle() {
		return driver.findElement(title);
	}

}