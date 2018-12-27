package com.euroland.serenity_cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://testmaster.vn/Account/Login?ReturnUrl=%2fadmin")
public class LoginPage extends PageObject {
	@FindBy(css="div.login-form input[type=email]")
	private WebElementFacade username;
	@FindBy(css="div.login-form input[type=password]")
	private WebElementFacade password;
	@FindBy(css="div.login-form button.btn-login")
	private WebElementFacade loginButton;
	
	public void enter_Email(String email) {
		username.type(email);
	}
	
	public void enter_Password(String password) {
		this.password.type(password);
	}
	
	public void Sign_in() {
		this.loginButton.click();
	}
	
	public String getPopupMessage() {
		WebElementFacade popup = find(By.cssSelector("div.popover-dialog"));
		return popup.findElement(By.cssSelector("b")).getText();
	}
}