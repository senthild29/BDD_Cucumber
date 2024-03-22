package stepDefinitions;

import io.cucumber.java.en.Given;

public class TaggedHooksDefinitions {
	
	@Given("I play cricket")
	public void i_play_cricket() {
	    System.out.println("My 1st hobby is to play Cricket");
	}

	@Given("I play Badminton")
	public void i_play_badminton() {
		 System.out.println("My 2nd hobby is to play Badminton");
	}

	@Given("Learning BO Staff")
	public void learning_bo_staff() {
		 System.out.println("As a 3rd hobby learning BO Staff");
	}

}
