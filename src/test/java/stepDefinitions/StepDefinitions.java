package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	@Given("Add Place Payload with {string}  {string} {string}")
	public void add_place_payload_with(String string1, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string1+", "+string2+", "+string3);
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string1+", "+string2);
	}
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(int1);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string1+", "+string2);
	}
	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string1+", "+string2);
	}




}
