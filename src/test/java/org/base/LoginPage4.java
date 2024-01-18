package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage4 extends BaseClass1 {
	public LoginPage4() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="first_name")
	private WebElement name1;
	@FindBy(name="last_name")
	private WebElement name2;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement cardno;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	@FindBy(id="order_no")
	private WebElement orderno;
	
	
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getName1() {
		return name1;
	}
	public WebElement getName2() {
		return name2;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	

}
