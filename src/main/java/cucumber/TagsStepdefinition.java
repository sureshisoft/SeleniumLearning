package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepdefinition {
	
	
	@Given("user enter username and password")
	public void user_enter_username_and_password() {
	   System.out.println(" user should be see username and password avaiable");
	}
	@When("After giving irctc url in browser and then username and password")
	public void after_giving_irctc_url_in_browser_and_then_username_and_password() {
		   System.out.println("Enter irctc username and Password");
	}
	@Then("login should be made sucessfull.")
	public void login_should_be_made_sucessfull() {
		System.out.println("Page should be loginned sucessfull");
	}
	
	@Given("user select the train Place Date of journey")
	public void user_select_the_train_place_date_of_journey() {
	   System.out.println(" user should be select the train and place");
	}

	@When("Click on Search button")
	public void click_on_search_button() {
	    System.out.println("Click on search button");
	}

	@Then("Seats avaialable should be shown")
	public void seats_avaialable_should_be_shown() {
		System.out.println("Seats are available in Room");
	}
	
	
}