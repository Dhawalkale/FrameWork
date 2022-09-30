package ProjectOrangeHRMWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMWebElements {

	WebDriver driver;

	public OrangeHRMWebElements(WebDriver driver) {
		this.driver = driver;
	}

	By UserName = By.id("txtUsername");

	public WebElement UserName() {
		return driver.findElement(UserName);
	}

	By Pass = By.id("txtPassword");

	public WebElement pass() {
		return driver.findElement(Pass);
	}

	By Login = By.id("btnLogin");

	public WebElement Login() {
		return driver.findElement(Login);
	}

	By LinkedIn = By.xpath("//*[contains(@alt,'LinkedIn OrangeHRM group')]");

	public WebElement LinkedIn() {
		return driver.findElement(LinkedIn);
	}

	By FaceBook = By.xpath("//*[contains(@alt,'OrangeHRM on Facebook')]");

	public WebElement FaceBook() {
		return driver.findElement(FaceBook);
	}

	By Twitter = By.xpath("//*[contains(@alt,'OrangeHRM on twitter')]");

	public WebElement Twitter() {
		return driver.findElement(Twitter);
	}

	By YouTube = By.xpath("//*[contains(@alt,'OrangeHRM on youtube')]");

	public WebElement YouTube() {
		return driver.findElement(YouTube);
	}
}
