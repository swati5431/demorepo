package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EligibiltystepDefinition {
	
	
	@Before
	public void setup()
	{
		System.out.print("kk");
	}
	
	@After
	public void quit()
	{
		System.out.print("yoyoyoyo");
	}
	
	@Given("^create eligibilty \"([^\"]*)\" and \"([^\"]*)\"$")
	public void create_eligibilty_and(String arg1, String arg2) throws Throwable {
	   
	    
	}

	@When("^user Run's MH Renewal Batch jobs in year \"([^\"]*)\"$")
	public void user_Run_s_MH_Renewal_Batch_jobs_in_year(String arg1) throws Throwable {
	   
	}

	@Then("^Veriy new eligibilty created for next year$")
	public void veriy_new_eligibilty_created_for_next_year() throws Throwable {
	   
	    
	}

	@Given("^USER ON LOGIN PAGE df$")
	public void user_ON_LOGIN_PAGE_df() {
	    
	}

	@When("^i dnt knw$")
	public void i_dnt_knw()  {
	   
	}

	@Given("^USER ON LOGIN PAGE dfee$")
	public void user_ON_LOGIN_PAGE_dfee()  {
	   
	}

	@When("^i dnt knweee$")
	public void i_dnt_knweee()  {
	    
	}

	@Given("^USER ON LOGIN PAGE dfeeee$")
	public void user_ON_LOGIN_PAGE_dfeeee()  {
	   
	}

	@When("^i dnt knweeeeeee$")
	public void i_dnt_knweeeeeee()  {
	    
	}


	}


