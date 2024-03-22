package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundHooks {
	
	@Before
	public void before_FirstScenario() {
		System.out.println("This statement will be executed before background\n");
	}
	
	@After
public void after_SecondScenario() {
		System.out.println("This statement will be executed after every scenario\n");
	}

}
