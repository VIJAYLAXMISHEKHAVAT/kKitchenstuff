package PageObjectM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Browser;

public class Sign_out_PageObj extends Browser {
	public WebDriver driver;

	public Sign_out_PageObj(WebDriver driver) {
		this.driver = driver;
	}

	By accounticon = By.xpath("//header/div[1]/div[1]/li[1]/div[1]");
	By Text = By.cssSelector("span.base");

	By signout = By.xpath("//header/div[1]/div[1]/li[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");
	By myacctitle =	By.cssSelector("span.base");
	

	public WebElement AccountIcon() {
		return driver.findElement(accounticon);
	}
	public WebElement PullingText() {
		return driver.findElement(Text);}

    public WebElement Signout() {
	return driver.findElement(signout);
}
    public WebElement Myaccount() {
		return  driver.findElement(myacctitle);
	}
}
