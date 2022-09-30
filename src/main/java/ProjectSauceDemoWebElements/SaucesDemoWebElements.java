package ProjectSauceDemoWebElements;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class SaucesDemoWebElements {

	WebDriver driver;

	public SaucesDemoWebElements(WebDriver driver)
	{
	this.driver=driver;
	}


	By UserName=By.id("user-name");
	public WebElement UserName()
	{
	return driver.findElement(UserName);

	}

	By PassWord= By.id("password");
	public WebElement Password()
	{
	return driver.findElement(PassWord);
	}

	By Login=By.id("login-button");
	public WebElement Login()
	{
	return driver.findElement(Login);
	}
	   

	}



