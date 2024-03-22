package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendDataWithExamplesDef {

	WebDriver driver;

	@Given("Open the OrangeHRM web page")
	public void open_the_orange_hrm_web_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}
	@When("User enter the credentials {string} and {string}")
	public void user_enter_the_credentials_and(String username, String pwd) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	@When("Clicked Login button")
	public void clicked_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}


}
