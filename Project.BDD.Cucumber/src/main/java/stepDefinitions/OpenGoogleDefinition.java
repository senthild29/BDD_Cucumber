package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinition {
	
WebDriver driver;
	ChromeDriverService service;
	
	@Given("User opened the Google site")
	public void user_opened_the_google_site() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver-win32\\chromedriver.exe");
	    driver =  new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.google.co.in/");
	    
	}
	@When("User is searching for term as {string}")
	public void user_is_searching_for_term_as(String SrchTerm) {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(SrchTerm);
        
	}
	@When("click on the enter button")
	public void click_on_the_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("User should see the serach results")
	public void user_should_see_the_serach_results_for_chennai() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("chennai")).isDisplayed();
	  //Assert.assertEquals("chennai",status);
	  if (status) {
		  System.out.println("Results Verified");
		
	}
	  driver.close();
	  
	}

}
