package ProjectSauceDemoTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectSauceDemoWebElements.SaucesDemoWebElements;

public class SaucesDemoTestCases {
	void OpenWebPage(WebDriver driver, SaucesDemoWebElements Web) {
		String url = "https://www.saucedemo.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	void TestCaseOne(WebDriver driver, SaucesDemoWebElements Web) {
		Web.UserName().sendKeys("standard_user");
		Web.Password().sendKeys("secret_sauce");
		Web.Login().click();
	}

	void TestCaseTwo(WebDriver driver, SaucesDemoWebElements Web) {
		Web.UserName().sendKeys("locked_out_user");
		Web.Password().sendKeys("Dhawal");
		Web.Password().submit();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucesDemoWebElements Web = new SaucesDemoWebElements(driver);
		SaucesDemoTestCases obj = new SaucesDemoTestCases();
		obj.OpenWebPage(driver, Web);
		obj.TestCaseOne(driver, Web);
		obj.TestCaseTwo(driver, Web);

	}

}
