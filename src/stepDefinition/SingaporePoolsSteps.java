package stepDefinition;

import actionObjects.ActionObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.SingaporePoolsUtility;
import utility.Utility;

public class SingaporePoolsSteps extends ActionObjects{

	@Given("^User is on Singapore Pools game$")
	public void User_is_on_Singapore_Pools_game() throws Throwable {
		//Check the current market is Singapore
		//Utility.reportInvoke();
		SingaporePoolsUtility.CheckCurrentURL();
		
	}

	@Given("^User open fourD threeD twoD game and apply bet$")
	public void User_open_fourD_threeD_twoD_game_and_apply_bet() throws Throwable {
		
		SingaporePoolsUtility.singapore4dgame();
		String singapore4d_url = "https://www-dev.aqtogel.com/super-4d";
		
	}

	@Then("^User enter transaction page to check amount calculations$")
	public void User_enter_transaction_page_to_check_amount_calculations() throws Throwable {
	
		Utility.getReport();
		
	}

}
