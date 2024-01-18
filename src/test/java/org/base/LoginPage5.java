package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage5 extends BaseClass1 {
	public LoginPage5() {
		PageFactory.initElements(driver,this);
	}
    @FindBy(id="my_itinerary")
    private WebElement history;
    @FindBy(xpath="(//input[@name='ids[]'])[7]")
    private WebElement lastorder;
    @FindBy(name="cancelall")
    private WebElement cancel;
	public WebElement getHistory() {
		return history;
	}
	public WebElement getLastorder() {
		return lastorder;
	}
	public WebElement getCancel() {
		return cancel;
	}
    
}
