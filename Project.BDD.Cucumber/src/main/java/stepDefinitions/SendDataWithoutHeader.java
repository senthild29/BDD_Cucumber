package stepDefinitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendDataWithoutHeader {

	WebDriver driver;

	@Given("Log on OrangeHRM login page")
	public void log_on_orange_hrm_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}

	@When("Enter the below credentials")//Since dataTable return type is used, regular expressions are not created in method()
	public void enter_the_below_credentials(DataTable dataTable) {
		//Getting row from dataTable arguments and stored the credentaisl in a variable "cred"
		 List<String> cred = dataTable.row(0);
		 
		 //Getting the value from index 0 and index 1 using get().
		 String username = cred.get(0);
		 String pwd = cred.get(1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
