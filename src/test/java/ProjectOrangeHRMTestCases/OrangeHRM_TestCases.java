package ProjectOrangeHRMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ProjectOrangeHRMWebElements.OrangeHRMWebElements;

public class OrangeHRM_TestCases {
	@Test(priority = 1)
	public void OpenWebPage(OrangeHRMWebElements Web, WebDriver driver) {

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	void TestCaseTwo(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {

		Web.UserName().sendKeys("Admin");
		Web.pass().sendKeys("admin123");
		Web.Login().click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	void TestCaseThree(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {

		Web.UserName().sendKeys("Admina");
		Web.pass().sendKeys("admin1234");
		Web.Login().click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	void TestCaseFour(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {

		Web.UserName().sendKeys("Admina");
		Web.pass().sendKeys("admin1234");
		Web.Login().click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	void TestCaseFive(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {

		Web.UserName().sendKeys("");
		Web.pass().sendKeys("admin123");
		Web.Login().click();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	void TestCaseSix(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {

		Web.UserName().sendKeys("Admin");
		Web.pass().sendKeys("");
		Web.Login().click();
		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);

	}

	void TestCaseSeven(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {

		Web.UserName().sendKeys("");
		Web.pass().sendKeys("");
		Web.Login().click();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	void TestCaseEight(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {
		try {
			Web.LinkedIn().click();
			Thread.sleep(3000);
			driver.navigate().back();

			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {

		}

	}

	void TestCaseNine(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {
		try {

			Web.LinkedIn().click();
			Thread.sleep(3000);
			driver.navigate().back();

			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {

		}

	}

	void TestCaseTen(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {
		try {
			Web.FaceBook().click();
			Thread.sleep(3000);
			driver.navigate().back();

			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {

		}

	}

	void TestCase11(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {
		try {
			Web.Twitter().click();
			Thread.sleep(3000);
			driver.navigate().back();

			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {

		}

	}

	void TestCase12(OrangeHRMWebElements Web, WebDriver driver) throws InterruptedException {
		try {
			Web.YouTube().click();
			Thread.sleep(3000);
			driver.navigate().back();

			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		OrangeHRMWebElements Web = new OrangeHRMWebElements(driver);
		OrangeHRM_TestCases obj = new OrangeHRM_TestCases();
		obj.OpenWebPage(Web, driver);
		obj.TestCaseTwo(Web, driver);
		obj.TestCaseThree(Web, driver);
		

	}

}
