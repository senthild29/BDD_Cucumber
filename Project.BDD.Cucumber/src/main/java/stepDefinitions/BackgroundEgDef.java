package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundEgDef {
	
	@Given("I am looking to buy a land")
	public void i_am_looking_to_buy_a_land() {
	  System.out.println("I have plans to buy a Land"); 
	}

	@When("I have to approach land promoters")
	public void i_have_to_approach_land_promoters() {
		System.out.println("I have to approach a land promoter"); 
	}

	@Then("I can buy a land")
	public void i_can_buy_a_land() {
		System.out.println("So that I can purchase a land \n"); 
	}

	@Given("I am looking to buy a House")
	public void i_am_looking_to_buy_a_house() {
		 System.out.println("I have plans to buy a House"); 
	}

	@When("I have to approach real estate agent")
	public void i_have_to_approach_real_estate_agent() {
		System.out.println("I have to approach a real estate agent"); 
	}

	@Then("I can buy a Home")
	public void i_can_buy_a_home() {
		System.out.println("So that I can purchase a House\n"); 
	}
	
	// Steps definition related to background
	@Given("You have savings")
	public void you_have_savings() {
	    System.out.println("You have savings in your bank account");
	}

	@When("you can go for an EMI")
	public void you_can_go_for_an_emi() {
		System.out.println("Go for an EMI");
	}

	@Then("To invest in property")
	public void to_invest_in_property() {
		System.out.println("to Invest in a property \n");
	}

}
