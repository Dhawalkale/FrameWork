package ProjectAutoITTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ProjectAutoITWebElements.AutoITWebElement;

public class AutoITTestCases {

	void OpenWebPage(AutoITWebElement web, WebDriver driver) {
		String url = "https://demo.automationtesting.in/Register.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	void Fullname(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.FullName().sendKeys("");

	}

	void LastName(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.LastName().sendKeys("");

	}

	void Address(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.Add().sendKeys("");

	}

	void EmailAddress(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.EmailAdd().sendKeys("");

	}

	void Phone(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.Phone().sendKeys("");

	}

	void Gender(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.Gender().click();

	}

	void Hobbies(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.HobbiesOne().click();
		Thread.sleep(1000);
		web.HobbiesTwo().click();
		Thread.sleep(1000);
		web.HobbiesThree().click();
		Thread.sleep(1000);
	}

	void Password(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.Password().sendKeys("");
		Thread.sleep(1000);

	}

	void ConformPass(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		web.ConformPassword().sendKeys("");
		Thread.sleep(1000);
	}

	void Year(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		WebElement yr = driver.findElement(By.id(""));
		yr.click();
		Select sel = new Select(yr);
		sel.selectByValue("");
		yr.click();
		Thread.sleep(1000);

	}

	void Month(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		WebElement month = driver.findElement(By.xpath(""));
		month.click();
		Select sel = new Select(month);
		sel.selectByValue("");
		month.click();
		Thread.sleep(1000);

	}

	void Day(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		WebElement day = driver.findElement(By.id(""));
		day.click();
		Select sel = new Select(day);
		sel.selectByValue("");
		day.click();
		Thread.sleep(1000);

	}

	void Skill(AutoITWebElement web, WebDriver driver) throws InterruptedException {
		WebElement skill = driver.findElement(By.id(""));
		skill.click();
		Select sel = new Select(skill);
		sel.selectByValue("");
		skill.click();
		Thread.sleep(1000);

	}

	void Country(AutoITWebElement web, WebDriver driver) {
		WebElement country = driver.findElement(By.xpath(""));
		country.click();
		country.sendKeys("");
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		AutoITWebElement Web = new AutoITWebElement(driver);
		AutoITTestCase Test = new AutoITTestCase();

	}
}
