package stepDefinitions;

import io.cucumber.java.en.Given;

public class RegularExpressionDef {
	
	@Given("I am {int} years old")
	public void i_am_years_old(Integer age) {
		System.out.println("My age => "+age);
	  
	}
	@Given("I am {double} inches tall")
	public void i_am_inches_tall(Double height) {
		System.out.println("My Height => "+height);
	  
	}
	@Given("I am inerested in sports like {string} and {string}")
	public void i_am_inerested_in_sports_like_and(String sport, String sport2) {
		System.out.println("I am interested in sports like "+sport+ " and "+sport2);
	   
	}
	
	

}
