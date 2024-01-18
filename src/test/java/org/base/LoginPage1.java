package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 extends BaseClass1 {
	public LoginPage1() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement btn;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtn() {
		return btn;
	}
	

}
