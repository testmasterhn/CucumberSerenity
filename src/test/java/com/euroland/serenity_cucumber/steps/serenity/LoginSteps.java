package com.euroland.serenity_cucumber.steps.serenity;

import com.euroland.serenity_cucumber.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {

    LoginPage loginPage;

    @Step
    public void is_the_login_page() {
    	loginPage.open();
    }
    
    @Step
    public void enters_userName(String userName) {
        loginPage.enter_Email(userName);
    }
    
    @Step
    public void enters_passWord(String password) {
        loginPage.enter_Password(password);
    }

    @Step
    public void starts_login() {
    	loginPage.Sign_in();
    }
    
    @Step
    public void should_see_the_popup(String content)
    {
    	assertThat(loginPage.getPopupMessage().equals(content), is(true));
    }

    @Step
    public void login_with(String username, String password) {
        enters_userName(username);
        enters_passWord(password);
        starts_login();
    }
}