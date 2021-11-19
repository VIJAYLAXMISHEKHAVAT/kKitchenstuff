package PageObjectM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Browser;

public class Signinpageobj extends Browser {
	public WebDriver driver;

	public Signinpageobj(WebDriver driver) {
		this.driver = driver;
	}
	By signbtn = By.xpath("//header/div[1]/div[1]/li[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");	
	By email = By.id("email");
	By passwd = By.id("pass");
	By Submit = By.cssSelector("button#send2.action.login.primary");
	By navbar =  By.xpath("//header/div[1]/div[1]/div[3]");
    By text =By.cssSelector("span.base");
    
	public WebElement Siginbtn() {
		return driver.findElement(signbtn);
	}

	public WebElement Emailtext() {
		return driver.findElement(email);
	}

	public WebElement Passtext() {
		return driver.findElement(passwd);
	}

	public WebElement Submitbtn() {
		return driver.findElement(Submit);
	}
	public WebElement getnavbar() {
		return driver.findElement(navbar);
		
	}
	public WebElement gettext() {
		return driver.findElement(text);
		
	}
}