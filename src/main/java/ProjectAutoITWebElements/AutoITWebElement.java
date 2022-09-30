package ProjectAutoITWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutoITWebElement {

	WebDriver driver;

	public AutoITWebElement(WebDriver driver) {
		this.driver = driver;
	}

	By FullName = By.xpath("");

	public WebElement FullName() {
		return driver.findElement(FullName);
	}

	By LastName = By.xpath("");

	public WebElement LastName() {
		return driver.findElement(LastName);
	}

	By Address = By.xpath("");

	public WebElement Add() {
		return driver.findElement(Address);
	}

	By EmailAddress = By.xpath("");

	public WebElement EmailAdd() {
		return driver.findElement(EmailAddress);
	}

	By Phone = By.xpath("");

	public WebElement Phone() {
		return driver.findElement(Phone);
	}

	By Gender = By.xpath("");

	public WebElement Gender() {
		return driver.findElement(Gender);
	}

	By HobbiesOne = By.id("");

	public WebElement HobbiesOne() {
		return driver.findElement(HobbiesOne);
	}

	By HobbiesTwo = By.id("");

	public WebElement HobbiesTwo() {
		return driver.findElement(HobbiesTwo);
	}

	By HobbiesThree = By.id("");

	public WebElement HobbiesThree() {
		return driver.findElement(HobbiesThree);
	}

	By Password = By.id("");

	public WebElement Password() {
		return driver.findElement(Password);
	}

	By ConformPassword = By.id("");

	public WebElement ConformPassword() {
		return driver.findElement(ConformPassword);
	}
}
