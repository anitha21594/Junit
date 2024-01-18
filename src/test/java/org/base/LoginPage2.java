package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BaseClass1 {
	public LoginPage2() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement no;
	@FindBy(xpath="//input[@class='date_pick']")
	private WebElement dateIn;
    @FindBy(id="datepick_out")
    private WebElement dateOut;
    @FindBy(id="adult_room")
    private WebElement adult;
    @FindBy(id="child_room")
    private WebElement child;
    @FindBy(id="Submit")
    private WebElement srch;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNo() {
		return no;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSrch() {
		return srch;
	}
    
}
