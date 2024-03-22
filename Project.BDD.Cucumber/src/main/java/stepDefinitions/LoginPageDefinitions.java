package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {

	WebDriver driver;

	@Given("User is on OrangeHRM login page")
	public void user_is_on_orange_hrm_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);


	}

	@When("User enters the valid username as {string} and password as {string}")
	public void user_enters_the_valid_username_as_and_password_as(String username, String pwd) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("User should navigate to home page of OrangeHRM")
	public void user_should_navigate_to_home_page_of_orange_hrm() {
		driver.quit();

	}


}
