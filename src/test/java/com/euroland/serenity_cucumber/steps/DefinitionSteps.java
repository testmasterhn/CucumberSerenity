package com.euroland.serenity_cucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.euroland.serenity_cucumber.steps.serenity.LoginSteps;

public class DefinitionSteps {

    @Steps
    LoginSteps anna;
    
    @Given("^the user is on the Login page$")
    public void the_user_is_on_the_Login_page() throws Exception {
        anna.is_the_login_page();
    }

    @When("^the user login in with right username and wrong password$")
    public void the_user_login_in_with_right_username_and_wrong_password() throws Exception {
        anna.login_with("khanh.tx@live.com", "abc12345");
    }

    @Then("^they should see the popup message \"([^\"]*)\"$")
    public void they_should_see_the_popup_message(String content) throws Exception {
        anna.should_see_the_popup(content);
    }
}
