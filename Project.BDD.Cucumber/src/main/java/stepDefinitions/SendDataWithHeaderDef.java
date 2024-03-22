package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendDataWithHeaderDef {
	
	WebDriver driver;
	@Given("Login to the OrangeHRM page")
	public void login_to_the_orange_hrm_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	 
	}
	@When("Enter the credentials below")
	public void enter_the_credentials_below(DataTable dataTable) {
		
		//Since username and password are stored in key and value pair combination
		//Here we are using asMaps to get the details from feature file
		// And stoting it in List<Map<S,S>> format
		 List<Map<String,String>> credentialsPair = 	dataTable.asMaps(String.class, String.class);
	   
		 //From credentialsPair variable, getting value from column and its key
		String username =  credentialsPair.get(0).get("UserName");
		String pwd = credentialsPair.get(0).get("Password");
	    
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
	
	}
	@When("user click the Login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
